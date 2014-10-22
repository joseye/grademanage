package com.gradeadminsystrem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gradeadminsystrem.bean.Role;
import com.gradeadminsystrem.dao.RoleDao;
@Component
public class RoleDaoImpl extends BaseDaoImpl implements RoleDao {

	@Override
	public String getNamespace() {
		return "gas_role";
	}

	public List<Role> getAllBaseRole(Long userid) {
		return getList("getRolelistbase", userid);
	}

	public List<Long> getParentRoleIds(List<Long> ids) {
		return getList("getRolelistparent", ids);
	}
	
}
