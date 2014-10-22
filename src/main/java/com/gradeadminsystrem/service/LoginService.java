package com.gradeadminsystrem.service;

import java.util.Map;
import java.util.Set;

import com.gradeadminsystrem.bean.Authority;
import com.gradeadminsystrem.bean.User;


public interface LoginService {
	public User userLongin(User u) throws Exception;
	
	public Map<Authority, Set<Authority>> getAuthorityforUser(User u) throws Exception;
}
