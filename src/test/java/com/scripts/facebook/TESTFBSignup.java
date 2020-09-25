package com.scripts.facebook;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.facebook.BaseTest;
import com.pages.facebook.FacebookSignupPage;

public class TESTFBSignup extends BaseTest
{
	@Test
	public void signup() throws IOException
	{
		FacebookSignupPage signup = new FacebookSignupPage(driver);
		signup.submitdetails();
		
	}

}
