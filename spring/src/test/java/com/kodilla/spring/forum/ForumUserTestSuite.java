package com.kodilla.spring.forum;

import static org.junit.Assert.*;
import com.kodilla.spring.forum.*;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {


	@Test
	public void testGetUserName() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		ForumUser user = context.getBean(ForumUser.class);
		
		//When
		String userName= user.getUsername();
		
		//Then
		Assert.assertEquals("John Smith", userName);
}
}
