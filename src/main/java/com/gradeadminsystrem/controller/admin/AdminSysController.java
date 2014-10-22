package com.gradeadminsystrem.controller.admin;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gradeadminsystrem.bean.Authority;
import com.gradeadminsystrem.bean.User;
import com.gradeadminsystrem.service.LoginService;
import com.gradeadminsystrem.util.SessionUtil;
@Controller()
public class AdminSysController {
	Logger logger=Logger.getLogger(AdminSysController.class);
	@RequestMapping(value="login.do")
	public String userLogin(HttpServletRequest request,User user){
		try {
			User u=loginService.userLongin(user);
			SessionUtil.clearSession(request);
			SessionUtil.addSessionUser(request, u);
		} catch (Exception e) {
			logger.error("login error", e);
			request.setAttribute("errormessage", e.getMessage());
			return "login";
		}
		return "redirect:welcome.do";
	}
	@RequestMapping(value="welcome.do")
	public String welcome(HttpServletRequest request){
		try {
			User user=SessionUtil.getSessionUser(request);
			if(null==user)
				return "login";
			
			Map<Authority, Set<Authority>> menu=SessionUtil.getSessionMenu(request);
			if(null==menu)
				menu=this.loginService.getAuthorityforUser(user);
			SessionUtil.addSessionMenu(request, menu);
			logger.info(menu+"menus");
			request.setAttribute("menus", menu);
		} catch (Exception e) {
			logger.error("login error", e);
			request.setAttribute("errormessage", e.getMessage());
			return "login";
		}
		return "index";
	}
	@Resource
	private LoginService loginService;
}
