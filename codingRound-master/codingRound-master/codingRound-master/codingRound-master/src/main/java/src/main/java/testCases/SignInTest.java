package src.main.java.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import src.main.java.generics.BaseClass;

public class SignInTest extends BaseClass {

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		driver.findElement(By.linkText("Your trips")).click();
		driver.findElement(By.id("SignIn")).click();
		
		  int size = driver.findElements(By.tagName("iframe")).size();
		  System.out.println(size);
		  for (int i = 0; i<=0; i++) {
			  driver.switchTo().frame(i);
			  int total = driver.findElements(By.id("SignIn")).size();
			  System.out.println(total);
			  driver.switchTo().defaultContent();
		  }
		 // System.out.println(size);
		 
		
		driver.switchTo().frame("ModalFrame");
		
	

		driver.findElement(By.id("SignIn")).click();
		driver.findElement(By.xpath("signInButton")).click();
		String errors1 = driver.findElement(By.id("errors1")).getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
	}

}
