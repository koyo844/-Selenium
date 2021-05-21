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
	   
	    //操作タブの情報を取得
	    String Handle = driver.getWindowHandle();
	    
	    //指定したURLに遷移する
	    driver.get("https://www.e-procurement.metro.tokyo.jp/index.jsp");
	   
	    //リンク対象の要素を取得しクリック
	    WebElement element1 = driver.findElement(By.linkText("入札情報サービス"));
	    element1.click();
	    
	    //ハンドルの内容を確認（もし古いタブの状態であれば新しいタブに変更する）
	    String newHandle = null;
	    for (String id : driver.getWindowHandles()) {
	    	if (!id.equals(Handle)) {
	    		newHandle = id;
	    	}
	    }
	    //newHandleにハンドルを移す
	    driver.switchTo().window(newHandle);
	    
	    //リンク対象の要素を取得しクリック2
	    element1 = driver.findElement(By.cssSelector("#topMenuBtn03 > a"));
	    element1.click();
	    
	    //期間を記入
	    WebElement nowYear = driver.findElement(By.name("StartDateYY")); 
	    nowYear.sendKeys("3");
	    WebElement nowMonth = driver.findElement(By.name("StartDateMM")); 
	    nowMonth.sendKeys("5");
	    WebElement nowDay = driver.findElement(By.name("StartDateDD")); 
	    nowDay.sendKeys("21");
	    
	    WebElement endYear = driver.findElement(By.name("EndDateYY")); 
	    endYear.sendKeys("3");
	    WebElement endMonth = driver.findElement(By.name("EndDateMM")); 
	    endMonth.sendKeys("6");
	    WebElement endDay = driver.findElement(By.name("EndDateDD")); 
	    endDay.sendKeys("30");

	    element1 = driver.findElement(By.linkText("検索"));
	    element1.click();
	}

}
