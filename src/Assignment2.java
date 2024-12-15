import java.util.Iterator;

import java.util.Set;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		//Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.className("frame-top")));
		driver.switchTo().frame(driver.findElement(By.className("frame-middle")));
//		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
//		Iterator<String>it = windows.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.id("content")).getText());

//		driver.switchTo().window(parentId);
//		System.out.println(driver.findElement(By.tagName("h3")).getText());

		driver.close();



	}

}
