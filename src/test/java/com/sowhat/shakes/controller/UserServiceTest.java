package com.sowhat.shakes.controller;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sowhat.shakes.admin.user.service.UserService;
import com.sowhat.shakes.base.mode.RoleInfo;
import com.sowhat.shakes.base.mode.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-context.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getUserList() {
		UserInfo _user = userService.getUserByUserId("liuyp");
		List<UserInfo> userList =  userService.getUserList(_user);
		for(UserInfo user:userList){
			System.out.println(user);
		}
	}
	
	@Test
	public void getUserByUserId(){
		UserInfo user = userService.getUserByUserId("liuyp");
		System.out.println(user);
		if(user.getRoleInfos()!=null){
			for(RoleInfo roleInfo :user.getRoleInfos()){
				System.out.println(roleInfo);
			}
		}
	}
	@Test
	public void saveOrUpdateUser(){
		UserInfo userInfo = new UserInfo();
		userInfo.setName("乔峰");
		userInfo.setUserId("qiaof");
		userInfo.setPassword("123456");
		userInfo.setSeq("10003");
		userService.saveOrUpdateUser(userInfo);
	}

}
