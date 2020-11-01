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

public class SelfEmployedKiwiSaver {

	WebDriver driver = null;
	KiwiSaverCalculatorPage KiwiSaverCalculatorPage;

	@Given("user has navigated to KiwiSaver calculator page")
	public void user_has_navigated_to_KiwiSaver_calculator_page() {

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
	
	@And("current age of the user is 45 years")
	public void current_age_of_the_user_is_years() {
		KiwiSaverCalculatorPage= new KiwiSaverCalculatorPage(driver);
		KiwiSaverCalculatorPage.TypeCurrentAge("45");
	}
	
	@And("Employment status of the user is Self-employed")
	public void employment_status_of_the_user_is_Self_employed() {
		KiwiSaverCalculatorPage.clickEmploymentStatus();
		KiwiSaverCalculatorPage.chooseEmploymentStausbyText("Self-employed");
	}

	@And("current KiwiSaver balance is $100000")
	public void current_KiwiSaver_balance_is_$100000() {
		KiwiSaverCalculatorPage.typeCurrentKSBalance("100000");
	}

	@And("voluntary contributes $90 fortnightly")
	public void voluntary_contributes_$90_fortnightly() throws InterruptedException {
		KiwiSaverCalculatorPage.entervoluntarycontribution("90");
		Thread.sleep(3000);
		//KiwiSaverCalculatorPage.chooseVoluntaryContributionFrequency("Fortnightly");
		KiwiSaverCalculatorPage.selectFrequencyDD("Fortnightly");
	}

	@And("chooses a Conservative risk profile")
	public void chooses_a_Conservative_risk_profile() {
		KiwiSaverCalculatorPage.selectConservativeProfile();
	}

	@And("saving goals requirement of $290000")
	public void saving_goals_requirement_of_$290000() {
		KiwiSaverCalculatorPage.TypeSavingsGoal("290000");
	}
	@When("user clicks on view Kiwisaver Retirement Projections")
	public void user_clicks_on_view_Kiwisaver_Retirement_Projections() {
		KiwiSaverCalculatorPage.ClickOnKiwiSaverProjectionButton();
	}

	@Then("user can see projected Kiwisaver balance details")
	public void user_can_see_projected_Kiwisaver_balance_details() {
		KiwiSaverCalculatorPage.viewKiwiSaverBalanceEstimate();
		KiwiSaverCalculatorPage.ViewKiwiSaverEstimateAmout();
		KiwiSaverCalculatorPage.viewKiwiSaverBalanceSummary();
		driver.close();
	}
	
}

