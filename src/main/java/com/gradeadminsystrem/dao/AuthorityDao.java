package com.gradeadminsystrem.dao;

import java.util.List;

import com.gradeadminsystrem.bean.Authority;

public interface AuthorityDao extends BaseDao {
	public List<Authority> getAuthorityListforRoles(List<Long> rolesids);
}
