package autotest;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.qameta.allure.selenide.AllureSelenide;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}, monochrome = true)
public class RunCucumberTest {
	@BeforeClass
	public static void setUp() {
		Configuration.browser = WebDriverRunner.CHROME;

		// ブラウザサイズ指定
		Configuration.browserSize = "1024x768";

		// WebDriverのパス
//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		//テスト失敗時にスクリーンショットをレポートに添付する設定
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
	}
}
