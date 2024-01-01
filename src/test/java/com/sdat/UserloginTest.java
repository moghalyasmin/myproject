package com.sdat;

import org.junit.Test;

import junit.framework.Assert;

public class UserloginTest {
	
	@Test
	public void login1() {
		Userlogin u=new Userlogin();
		Assert.assertEquals(0, u.userlogin("abc", "abc123"));
	}
	
	@Test
	public void login2() {
		Userlogin u=new Userlogin();
		Assert.assertEquals(1, u.userlogin("abc", "abc@123"));
		
	}

}
