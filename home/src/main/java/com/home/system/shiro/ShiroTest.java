package com.home.system.shiro;

import junit.framework.Assert;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class ShiroTest {

	@Test
	public void test() {
		IniSecurityManagerFactory managerFactory = new IniSecurityManagerFactory(
				"classpath:shiro.ini");
		SecurityManager securityManager = managerFactory.createInstance();
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang","123456");
		try {
			System.out.println("登陆成功");
			subject.login(token);
		} catch (Exception e) {
			System.out.println("身份验证失败");
		}
		Assert.assertEquals(true, subject.isAuthenticated());
		subject.logout();
	}
}
