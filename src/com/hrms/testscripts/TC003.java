package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC003 {
	public static void main(String args[]) throws Exception {
        //Test Steps
        General  obj = new General();
        obj.openapplication();
        obj.login();
        obj.enterFrame();
        obj.delEmp();
        obj.exitFrame();
        obj.logout();
        obj.closeApplication();

}
}
