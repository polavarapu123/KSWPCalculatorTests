package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KiwiSaverCalculatorPage;

public class KiwisaverBalance {
	WebDriver driver=null;
	KiwiSaverCalculatorPage KiwiSaverCalculatorPage;

@Given("user is on the Kiwisaver Retirement Calculator page")
public void user_is_on_the_Kiwisaver_Retirement_Calculator_page() {
	String projectPath=System.getProperty("user.dir");
	System.out.println(projectPath);
	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		
	driver.navigate().to("https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	
		//switch to Frame
	
	driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='calculator-embed']/iframe[1]")));
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

}

@And("current age of the user is 30 years")
public void current_age_of_the_user_is_years() {
	KiwiSaverCalculatorPage= new KiwiSaverCalculatorPage(driver);
	KiwiSaverCalculatorPage.TypeCurrentAge("30");
}

@And("Employment status of the user is Employed")
public void employment_status_of_the_user_is_Employed() {
	KiwiSaverCalculatorPage.clickEmploymentStatus();
	KiwiSaverCalculatorPage.chooseEmploymentStausbyText("Employed");
}

@And("user types salary of 82000")
public void user_types_salary_of() {
	KiwiSaverCalculatorPage.TypeSalary("82000");
    }

@And("selects 4 percentage Kiwisaver memeber contribution")
public void selects_percentage_Kiwisaver_memeber_contribution() {
	KiwiSaverCalculatorPage.clickFourPerKiwiSaver();
}

@And("chooses a Defensive risk profile")
public void chooses_a_Defensive_risk_profile() {
	KiwiSaverCalculatorPage.selectDefensiveProfile();;
}

@When("user clicks on view your Kiwisaver Retirement Projections")
public void user_clicks_on_view_your_Kiwisaver_Retirement_Projections() {
	KiwiSaverCalculatorPage.ClickOnKiwiSaverProjectionButton();
}

@Then("user can see estimated Kiwisaver balance details")
public void user_can_see_estimated_Kiwisaver_balance_details() {
	KiwiSaverCalculatorPage.viewKiwiSaverBalanceEstimate();
	KiwiSaverCalculatorPage.ViewKiwiSaverEstimateAmout();
	KiwiSaverCalculatorPage.viewKiwiSaverBalanceSummary();
	driver.close();
}

}
