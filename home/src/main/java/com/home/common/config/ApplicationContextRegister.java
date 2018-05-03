package com.home.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRegister implements ApplicationContextAware {

	private static Logger logger = LoggerFactory
			.getLogger(ApplicationContextRegister.class);

	private static ApplicationContext APPLICATION_CONTEXT;

	public ApplicationContext getApplicationContext() {
		return APPLICATION_CONTEXT;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		logger.debug("ApplicationContext Register--->{}",applicationContext);
		APPLICATION_CONTEXT = applicationContext;
	}
	
	public static <T> T getBean(Class<T> type){
		System.out.println(APPLICATION_CONTEXT.getBean(type));
		return APPLICATION_CONTEXT.getBean(type);
	}
}
