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

public class NonEmployedKiwiSaver {
	WebDriver driver = null;
	KiwiSaverCalculatorPage KiwiSaverCalculatorPage;

	@Given("user has navigated to WP KiwiSaver calculator page")
	public void user_has_navigated_to_WP_KiwiSaver_calculator_page() {
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// switch to Frame
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='calculator-embed']/iframe[1]")));
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

	@And("current age of user is 55 years")
	public void current_age_of_user_is_years() {
		KiwiSaverCalculatorPage = new KiwiSaverCalculatorPage(driver);
		KiwiSaverCalculatorPage.TypeCurrentAge("55");
	}

	@And("Employment status of user is Non-employed")
	public void employment_status_of_user_is_Non_employed() {
		KiwiSaverCalculatorPage.clickEmploymentStatus();
		KiwiSaverCalculatorPage.chooseEmploymentStausbyText("Not employed");
	}

	@And("Non-employed current KiwiSaver balance is $140000")
	public void non_employed_current_KiwiSaver_balance_is_$140000() {

		KiwiSaverCalculatorPage.typeCurrentKSBalance("140000");
	}

	@And("Non-employedvoluntary contributes $10 Annually")
	public void non_employedvoluntary_contributes_$10_Anually() throws InterruptedException {
		KiwiSaverCalculatorPage.entervoluntarycontribution("10");
		Thread.sleep(3000);
		KiwiSaverCalculatorPage.selectFrequencyDD("Annually");
	}

	@And("Non-employed chooses a balanced risk profile")
	public void non_employed_chooses_a_balanced_risk_profile() {
		KiwiSaverCalculatorPage.selectBalancedProfile();
	}

	@And("Non-employed saving goals requirement of $200000")
	public void non_employed_saving_goals_requirement_of_$200000() {
		KiwiSaverCalculatorPage.TypeSavingsGoal("200000");
	}
	@When("Non-employed user clicks on view Kiwisaver Retirement Projections")
	public void non_employed_user_clicks_on_view_Kiwisaver_Retirement_Projections() {
		KiwiSaverCalculatorPage.ClickOnKiwiSaverProjectionButton();  
	}

	@Then("Non-employed user can see projected Kiwisaver balance details")
	public void non_employed_user_can_see_projected_Kiwisaver_balance_details() {
		KiwiSaverCalculatorPage.viewKiwiSaverBalanceEstimate();
		KiwiSaverCalculatorPage.ViewKiwiSaverEstimateAmout();
		KiwiSaverCalculatorPage.viewKiwiSaverBalanceSummary();
		driver.close();
	}

}
