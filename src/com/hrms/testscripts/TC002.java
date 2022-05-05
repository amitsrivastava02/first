package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002 {
	public static void main(String args[]) throws Exception {
        //Test Steps
        General  obj = new General();
        obj.openapplication();
        obj.login();
        Thread.sleep(2000);
        obj.enterFrame();
        obj.addEmp();
        obj.exitFrame();
        obj.logout();
        obj.closeApplication();
    	Thread.sleep(5000);
}
}
