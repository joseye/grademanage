package com.gradeadminsystrem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gradeadminsystrem.bean.Authority;
import com.gradeadminsystrem.dao.AuthorityDao;
@Component
public class AuthorityDaoImpl extends BaseDaoImpl implements AuthorityDao {
	@Override
	public String getNamespace() {
		return "gas_authority";
	}

	public List<Authority> getAuthorityListforRoles(List<Long> rolesids) {
		return getList("getgauthorityforroles", rolesids);
	}
	
}
