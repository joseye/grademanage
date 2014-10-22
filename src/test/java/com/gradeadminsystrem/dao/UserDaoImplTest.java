package com.gradeadminsystrem.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.gradeadminsystrem.bean.User;
import com.gradeadminsystrem.util.EncryptionTool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback =false)
@Transactional
public class UserDaoImplTest {
	private UserDao userDao;
	//@Test
	public void testinsert(){
		String pwd=EncryptionTool.encryptionStr("123456");
		User u=new User();
		u.setId(2l);
		u.setAddby(2l);
		u.setUsername("admintest");
		u.setName("administrator");
		u.setIdcard("32783721398873213");
		u.setMobile("13532233");
		u.setPassword(pwd);
		u.setStatus(0);
		u.setEmail("abc@dsada.com");
		this.userDao.insert(u);
		
	}
	@Test
	public void testGetOne(){
		try {
			User u =new User();
			u.setId(2l);
			u.setModifytime(new Date());
			u.setModifyby(2l);
			u.setUsername("admintest");
			u.setPassword(EncryptionTool.encryptionStr("123456"));
			this.userDao.update(u);
			
			List<User> li=this.userDao.getList(u);
			for(User uu :li){
				System.out.println(uu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
