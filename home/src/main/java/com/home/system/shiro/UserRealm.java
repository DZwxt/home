package com.home.system.shiro;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.home.common.config.ApplicationContextRegister;
import com.home.common.util.ShiroUtils;
import com.home.system.dao.MenuDao;
import com.home.system.dao.UserDao;
import com.home.system.domain.UserDO;

public class UserRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		Long userId = ShiroUtils.getUserId();
		MenuDao menuDao = ApplicationContextRegister.getBean(MenuDao.class);
		principals.getPrimaryPrincipal();
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		UserDao userMapper = ApplicationContextRegister.getBean(UserDao.class);
		UserDO user = userMapper.list(map).get(0);
		// 用户名不存在
		if (user == null) {
			throw new UnknownAccountException("用户名或密码错误");
		}
		if (!password.equals(user.getPassword())) {
			throw new IncorrectCredentialsException("用户名或密码不正确");
		}
		if (user.getStatus() == 0) {
			throw new LockedAccountException("该帐号暂停使用");
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
				password, user.getName());
		return info;
	}
}
