package exercise0521;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main(String[] args){
		//Chrome制御のためChromeDriverのパスを指定
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		
		//Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    
	    //指定したURLに遷移する
	    driver.get("https://www.google.co.jp");
	    
	    //検索テキストボックスを検索
	    WebElement element = driver.findElement(By.name("q"));
	    
	    //検索ボックスに入力する
	    element.sendKeys("オーディオインターフェース");
	    
	    //検索
	    element.submit();
	    
	    //取得（検索ページで一番上に出てくる内容を文字列で取得）
	    WebElement catchElement = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div.tF2Cxc > div.yuRUbf > a > h3"));

	    //
	    System.out.println(catchElement.getText());
	}

}
