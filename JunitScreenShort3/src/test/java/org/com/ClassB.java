package org.com;

import org.test.BaseClass3;
import org.testng.annotations.Test;

public class ClassB extends BaseClass3 {
	
    @Test(priority=-2)
	private void test() {
getDriver();
loadUrl("https://web.whatsapp.com/");
maximize();
	}
}
