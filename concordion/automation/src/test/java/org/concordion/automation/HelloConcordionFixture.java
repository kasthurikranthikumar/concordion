package org.concordion.automation;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class HelloConcordionFixture {

	public String getHomePageWelcomeMessage(String uname, String password) {
		System.out.println(uname);
		System.out.println(password);
		if (uname.contentEquals("KranthiBlogs") && password.contentEquals("PassWord123!"))
			return "Welcome " + uname + "!";
		else
			return "Failed to login " + uname + "  !  Try agin.";
	}
}