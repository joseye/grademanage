package com.gradeadminsystrem.dao.impl;

import org.springframework.stereotype.Component;

import com.gradeadminsystrem.dao.AuthorityRoleDao;

@Component
public class AuthorityRoleDaoImpl extends BaseDaoImpl implements AuthorityRoleDao {

	@Override
	public String getNamespace() {
		return "gas_authorityrole";
	}
	
}
