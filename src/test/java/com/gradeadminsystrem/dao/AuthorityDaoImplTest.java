package com.gradeadminsystrem.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.gradeadminsystrem.bean.Authority;
import com.gradeadminsystrem.bean.Role;
import com.gradeadminsystrem.bean.UserRole;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback =false)
@Transactional
public class AuthorityDaoImplTest {
	private AuthorityDao authorityDao;
	private RoleDao roleDao;
	private UserRoleDao userRoleDao;
	private AuthorityRoleDao authorityRoleDao;

	public AuthorityDao getAuthorityDao() {
		return authorityDao;
	}
	
	@Autowired
	public void setAuthorityDao(AuthorityDao authorityDao) {
		this.authorityDao = authorityDao;
	}
	
	public RoleDao getRoleDao() {
		return roleDao;
	}
	@Autowired
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	public UserRoleDao getUserRoleDao() {
		return userRoleDao;
	}
	@Autowired
	public void setUserRoleDao(UserRoleDao userRoleDao) {
		this.userRoleDao = userRoleDao;
	}

	public AuthorityRoleDao getAuthorityRoleDao() {
		return authorityRoleDao;
	}
	@Autowired
	public void setAuthorityRoleDao(AuthorityRoleDao authorityRoleDao) {
		this.authorityRoleDao = authorityRoleDao;
	}

	//@Test
	public void testinsert(){
		Authority au=new Authority();
		au.setParentid(0l);
		au.setAddby(1l);
		au.setUrl("javascript:void(0)");
		au.setAuthorityname("系统管理");
		this.authorityDao.insert(au);
		Authority au2=new Authority();
		au2.setParentid(1l);
		au2.setAddby(1l);
		au2.setUrl("javascript:void(0)");
		au2.setAuthorityname("用户管理");
		this.authorityDao.insert(au2);
		Authority au3=new Authority();
		au3.setParentid(1l);
		au3.setAddby(1l);
		au3.setUrl("javascript:void(0)");
		au3.setAuthorityname("权限管理");
		this.authorityDao.insert(au3);
		Authority au4=new Authority();
		au4.setParentid(1l);
		au4.setAddby(1l);
		au4.setUrl("javascript:void(0)");
		au4.setAuthorityname("角色管理");
		this.authorityDao.insert(au4);
	}
	//@Test
	public void testRole(){
		Role r=new Role();
		r.setAddby(1l);
		r.setRolename("超级管理员");
		r.setStatus(0l);
		this.roleDao.insert(r);
	}
	@Test
	public void testUserRole(){
		UserRole ur= new UserRole();
		ur.setRoleid(1l);
		ur.setUserid(1l);
		this.userRoleDao.insert(ur);
	}
}
