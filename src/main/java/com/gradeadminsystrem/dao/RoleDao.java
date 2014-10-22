package com.gradeadminsystrem.dao;

import java.util.List;

import com.gradeadminsystrem.bean.Role;

public interface RoleDao extends BaseDao {
	public List<Role> getAllBaseRole(Long userid);
	public List<Long> getParentRoleIds(List<Long> ids);
}
