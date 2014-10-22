package com.gradeadminsystrem.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.gradeadminsystrem.bean.Authority;
import com.gradeadminsystrem.bean.Role;
import com.gradeadminsystrem.bean.User;
import com.gradeadminsystrem.dao.AuthorityDao;
import com.gradeadminsystrem.dao.RoleDao;
import com.gradeadminsystrem.dao.UserDao;
import com.gradeadminsystrem.service.LoginService;
import com.gradeadminsystrem.util.CollectionUtil;
import com.gradeadminsystrem.util.EncryptionTool;
@Service
public class LoginServiceImpl implements LoginService {
	private static Logger logger=Logger.getLogger(LoginServiceImpl.class);
	@Resource
	private UserDao userDao;
	@Resource
	private RoleDao roleDao;
	@Resource
	private AuthorityDao authorityDao;

	public User userLongin(User u) throws Exception {
		String pwd=EncryptionTool.encryptionStr(u.getPassword());
		if(StringUtils.isEmpty(u.getUsername())){
			throw new RuntimeException("用户名不能为空");
		}
		List<User>ul=this.userDao.getList(u);
		if(null==ul ||Collections.EMPTY_LIST.equals(ul)){
			throw new RuntimeException("用户不存在");
		}
		User fromDB=ul.get(0);
		logger.info(fromDB);
		if(!pwd.equals(fromDB.getPassword())){
			throw new RuntimeException("密码不正确");
		}
		return fromDB;
	}

	public Map<Authority, Set<Authority>> getAuthorityforUser(User u) throws Exception {
		List<Role> baseroles=this.roleDao.getAllBaseRole(u.getId());
		List<Long>rls=new ArrayList<Long>();
		for(Role r: baseroles){
			rls.add(r.getId());
		}
		if(rls.size()==0){
			return null;
		}
		List<Authority>aulis=null;
		if(rls.contains(1l)){
			//has super admin
			aulis=this.authorityDao.getList(new Authority());
			logger.info("super admin");
		}else{
			List<Long>prs=null;
			while(true){
				prs=this.roleDao.getParentRoleIds(rls);
				if(null==prs||Collections.EMPTY_LIST.equals(prs)){
					break;
				}
				rls.addAll(prs);
			}
			
			aulis=this.authorityDao.getAuthorityListforRoles(rls);
		}
		if(null==aulis)
			return null;
		logger.info("aulis size"+aulis.size());
		Map<Authority, Set<Authority>>p=CollectionUtil.newInstance();
		for(Authority au:aulis){
			Authority parent=au.getParentau();
			logger.info(au.getParentid());
			if(null==parent){
				logger.info("au.getParentid()"+au.getParentid()+"parent is null");
				continue;
			}
			logger.info("parent.getId()"+parent.getId());
			Set<Authority>ss=p.get(parent);
			if(null==ss){
				ss=new HashSet<Authority>();
				p.put(parent, ss);
			}
			ss.add(au);
		}
		return p;
	}
	
}

