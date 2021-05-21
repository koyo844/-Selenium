package exercise0521;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Chrome制御のためChromeDriverのパスを指定
				System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
				
				//Chromeを起動する
			    WebDriver driver = new ChromeDriver();
			    
			    //指定したURLに遷移する
			    driver.get("https://hr-dash.tech/session/new");
			    
			    //検索ボックスを指定
			    WebElement element1 = driver.findElement(By.name("email2"));
			    WebElement element2 = driver.findElement(By.name("password2"));

			    element1.sendKeys("koyo.mizutani@rakus-partners.co.jp");
			    element2.sendKeys("Ky29298961234");
			    
			  //検索
			    element1.submit();
			    
//			    // ページタイトルが変わるまで待つ。10 秒待っても変わらない場合、
//				// org.openqa.selenium.TimeoutException」が発生する。。
//			    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//					public Boolean apply(WebDriver d) {
//						return d.getTitle().toLowerCase().startsWith("koyo.mizutani@rakus-partners.co.jp");
//					}
//				});
			    
			    // スクリーンショットを取得し、ファイルを退避する。 ← ← ← ここを追加。
			    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(file.toPath(), new File("/Users/mizutanikoyo/Desktop/ラクスパートナーズ/教科書/" + file.getName()).toPath());

				// ブラウザを閉じる。（ここでは勝手に閉じないようにコメントにしてある）
				driver.quit();
				
	}

}
