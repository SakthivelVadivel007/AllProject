package org.com;

import org.test.BaseClass3;
import org.testng.annotations.Test;

public class ClassA extends BaseClass3 {
@Test(enabled= true)
	private void test() {
	
getDriver();
loadUrl("https://twitter.com/i/flow/login");
maximize();
	}
}
