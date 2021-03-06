package com.hwi.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans_ex01.xml"));
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);
		bean.sayHello("Spring");
	}
}