package com.gradeadminsystrem.dao.impl;

import org.springframework.stereotype.Component;

import com.gradeadminsystrem.dao.UserDao;
@Component
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	@Override
	public String getNamespace() {
		return "gas_user";
	}
	
}
