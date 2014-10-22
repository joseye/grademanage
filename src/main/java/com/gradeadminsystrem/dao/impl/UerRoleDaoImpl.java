package com.gradeadminsystrem.dao.impl;

import org.springframework.stereotype.Component;

import com.gradeadminsystrem.dao.UserRoleDao;
@Component
public class UerRoleDaoImpl extends BaseDaoImpl  implements UserRoleDao {

	@Override
	public String getNamespace() {
		return "gas_userrole";
	}
	
}
