package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KiwiSaverCalculatorPage;

public class KSCalculatorInfoIcons {
	WebDriver driver = null;
	KiwiSaverCalculatorPage KiwiSaverCalculatorPage;

	@Given("user is on the Kiwisaver Retirement Calculator")
	public void user_is_on_the_Kiwisaver_Retirement_Calculator() {
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

	@When("user clicks on Information icon besides Current Age field")
	
	public void user_clicks_on_Information_icon_besides_Current_Age_field() {
		KiwiSaverCalculatorPage = new KiwiSaverCalculatorPage(driver);
		KiwiSaverCalculatorPage.clickoncurrentAgeInfoIcon();

	}

	@Then("expected help message is displayed")
	public void expected_help_message_is_displayed() {
		String ExpectedCurrentAgehelpText = "This calculator has an age limit of 18 to 64 years old.";
		assertEquals(ExpectedCurrentAgehelpText, KiwiSaverCalculatorPage.currentAgeInfoTextDisplay());
	}
	
	@When("user clicks on Information icon besides Employment status")
	public void user_clicks_on_Information_icon_besides_Employment_status() {
		KiwiSaverCalculatorPage.clickonEmploymentStatusicon();
	}

	@Then("expeceted employment status help text is displayed")
	public void expeceted_employment_status_help_text_is_displayed() {
		//KiwiSaverCalculatorPage.KiwiSaverbalHelpText();
		String ExpectedEmpStatusText="If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.";
		assertEquals(ExpectedEmpStatusText,KiwiSaverCalculatorPage.EmploymentStatusHelpText());
	}

	@When("user clicks on Information icon besides Current KiwiSavebalance field")
	public void user_clicks_on_Information_icon_besides_Current_KiwiSavebalance_field() {
		KiwiSaverCalculatorPage.clickonKiwisaverbalicon();
	}

	@Then("expecetd kiwisaver balance help text is dispalyed")
	public void expecetd_kiwisaver_balance_help_text_is_dispalyed() {
		String ExpectedKiwiSaverBalHelpText="If you do not have a KiwiSaver account, then leave this field blank.";
		assertEquals(ExpectedKiwiSaverBalHelpText,KiwiSaverCalculatorPage.KiwiSaverbalHelpText());
	}

	@When("user clicks on Information icon besides voluntary contributions")
	public void user_clicks_on_Information_icon_besides_voluntary_contributions() {
		KiwiSaverCalculatorPage.clickonvolconticon();
	}

	@Then("expected volunatry contribution help text is displayed")
	public void expected_volunatry_contribution_help_text_is_displayed() {
		String ExpectedVoluntaryContriHelpText="If you are 'Self-Employed' or 'Not employed', you can make direct contributions to your KiwiSaver account. If you are 'Employed', you can make voluntary contributions in addition to your regular employee contributions.";
		assertEquals(ExpectedVoluntaryContriHelpText,KiwiSaverCalculatorPage.volContributionIconHelpText());
	}

	@When("user clicks on Information icon besides RiskProfile field")
	public void user_clicks_on_Information_icon_besides_RiskProfile_field() {
		KiwiSaverCalculatorPage.clickonRiskProfileIcon();
	}

	@Then("expected riskProfile help information is displayed")
	public void expected_riskProfile_help_information_is_displayed() {
		String ExpectedRiskProfileHelpText="The risk profile affects your potential investment returns:";
		assertEquals(ExpectedRiskProfileHelpText,KiwiSaverCalculatorPage.riskprofileconHelpText());
	}

	@When("user clicks on Information icon besides savings goal at retirement field")
	public void user_clicks_on_Information_icon_besides_savings_goal_at_retirement_field() {
		KiwiSaverCalculatorPage.clickonsavingsIcon();
	}

	@Then("expected savings goal at retirement help text is displayed")
	public void expected_savings_goal_at_retirement_help_text_is_displayed() {
		String ExpectedSavingsGoalHelpText ="Enter the amount you would like to have saved when you reach your intended retirement age. If you aren’t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner";
		assertEquals(ExpectedSavingsGoalHelpText,KiwiSaverCalculatorPage.savingsgoaliconhelptext());
		driver.close();
	}

}
