package com.sowhat.shakes.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sowhat.shakes.admin.user.service.UserService;
import com.sowhat.shakes.base.mode.UserInfo;
@Service("userDetailsService")
public class SecurityUserService implements UserDetailsService {

	@Autowired
	private UserService userService;
	@Override
	public UserDetails loadUserByUsername(String userId)
			throws UsernameNotFoundException {
		UserInfo userInfo = userService.getUserByUserId(userId);
		if(userInfo == null){
			throw new UsernameNotFoundException("用户账号不存在！");
		}
		return new User(userInfo.getUserId(), userInfo.getPassword(), true, true, true, true, getGrantedAuthorities(userInfo));
	}
	
	private List<GrantedAuthority> getGrantedAuthorities(UserInfo userInfo){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for(U)
		return null;
	}

}
