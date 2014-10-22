package com.gradeadminsystrem.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.gradeadminsystrem.bean.Authority;
import com.gradeadminsystrem.bean.User;

public class SessionUtil {
	final public static String SEESION_USER="sessionuser"; 
	final public static String SEESION_USER_MENU="httpsession.user.menu"; 
	public static User getSessionUser(HttpServletRequest request){
		return (User) request.getSession().getAttribute(SEESION_USER);
	}
	public static void  addSessionUser(HttpServletRequest request,User u){
		request.getSession().setAttribute(SEESION_USER, u);
	}
	@SuppressWarnings("unchecked")
	public static Map<Authority, Set<Authority>> getSessionMenu(HttpServletRequest request){
		return (Map<Authority, Set<Authority>>) request.getSession().getAttribute(SEESION_USER_MENU);
	}
	public static void  addSessionMenu(HttpServletRequest request,Map<Authority, Set<Authority>>menus){
		request.getSession().setAttribute(SEESION_USER_MENU, menus);
	}
	public static void clearSession(HttpServletRequest request){
		request.getSession().setAttribute(SEESION_USER_MENU, null);
		request.getSession().setAttribute(SEESION_USER, null);
		request.getSession().invalidate();
	}
}
