package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC001 {
public static void main(String args[]) throws Exception {
	General obj = new General();
	obj.openapplication();
	Thread.sleep(1000);
	obj.login();
	obj.logout();
	obj.closeApplication();
	Thread.sleep(5000);
	
}
}
