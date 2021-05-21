package exercise0521;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Chrome制御のためChromeDriverのパスを指定
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		
		//Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    
	    //指定したURLに遷移する
	    driver.get("https://www.e-procurement.metro.tokyo.jp/index.jsp");
	    
	    //リンク対象の要素を取得
	    WebElement element = driver.findElement(By.linkText("入札情報サービス"));

	    //クリック
	    element.click();
	}

}
