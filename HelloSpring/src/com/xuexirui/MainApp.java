package com.xuexirui;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
//		HelloWorld obj =(HelloWorld)context.getBean("helloWorld");
//		obj.getMessage();
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Bean.xml"));
		HelloWorld helloWorld = (HelloWorld)factory.getBean("helloWorld");
		helloWorld.getMessage();
	}

}
