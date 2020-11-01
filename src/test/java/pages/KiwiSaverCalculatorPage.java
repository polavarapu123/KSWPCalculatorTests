package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KiwiSaverCalculatorPage {
	WebDriver driver = null;
	KiwiSaverCalculatorPage KSCpage;

	// Initialize Page
	public KiwiSaverCalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Current Age Info Icon

	@FindBy(xpath = "//div[@help-id='CurrentAge']//div[@class='ng-isolate-scope']//button[@type='button']//i[@class='icon']")

	WebElement currentAgeInfoIcon;

	public void clickoncurrentAgeInfoIcon() {
		currentAgeInfoIcon.click();

	}
	// Current Age Icon Tooltip

	@FindBy(xpath = "//div[@class='field-message message-info ng-binding']/p")
	WebElement currentAgeInfoText;

	public String currentAgeInfoTextDisplay() {
		return currentAgeInfoText.getText();
	}

	// Employment Status Info Icon
	@FindBy(css = "[help-id='EmploymentStatus'][cl-help-toggle] .icon")
	WebElement EmploymentStatus_icon;

	public void clickonEmploymentStatusicon() {
		EmploymentStatus_icon.click();

	}

	// Employment Status Info Icon text
	@FindBy(css = "div.wpnib-field-employment-status p")
	WebElement EmploymentStatus_icontext;

	public String EmploymentStatusHelpText() {
		return EmploymentStatus_icontext.getText();
	}

	// Current Kiwi Saver Balance Icon
	@FindBy(css = "[help-id='KiwiSaverBalance'][cl-help-toggle] .icon")
	WebElement KiwiSaverBalanceIcon;

	public void clickonKiwisaverbalicon() {
		KiwiSaverBalanceIcon.click();

	}

	// Current Kiwi Saver Balance Icon HelpText
	@FindBy(css = "div.wpnib-field-kiwi-saver-balance p")
	WebElement KiwiSaverBalanceIcontext;

	public String KiwiSaverbalHelpText() {
		return KiwiSaverBalanceIcontext.getText();
	}

	// Voluntary Contributions Icon
	@FindBy(css = "[help-id='VoluntaryContributions'][cl-help-toggle] .icon")
	WebElement voluntaryContributionsIcon;

	public void clickonvolconticon() {
		voluntaryContributionsIcon.click();

	}

	// Voluntary contribution help text
	@FindBy(css = "div.wpnib-field-voluntary-contributions p")
	WebElement voluntaryContributionIcontext;

	public String volContributionIconHelpText() {
		return voluntaryContributionIcontext.getText();
	}

	// Risk Profile Icon
	@FindBy(css = "[help-id='RiskProfile'][cl-help-toggle] .icon")
	WebElement riskprofileIcon;

	public void clickonRiskProfileIcon() {
		riskprofileIcon.click();

	}

	// Risk Profile Icon Help Text
	@FindBy(css = "div.wpnib-field-risk-profile p:nth-of-type(1)")
	WebElement riskprofileIcontext;

	public String riskprofileconHelpText() {
		return riskprofileIcontext.getText();
	}

	// Savings Goal Icon
	@FindBy(css = "[help-id='SavingsGoal'][cl-help-toggle] .icon")
	WebElement savingsgoalicon;

	public void clickonsavingsIcon() {
		savingsgoalicon.click();

	}

	// Savings Goal Icon Help Text
	@FindBy(css = "div.wpnib-field-savings-goal p")
	WebElement savingsgoalicontext;

	public String savingsgoaliconhelptext() {
		return savingsgoalicontext.getText();
	}

	// CurrentAge TextBox

	@FindBy(css = "div[model='ctrl.data.CurrentAge'] [placeholder]")
	WebElement currentAgeTextBox;

	public void TypeCurrentAge(String age) {
		currentAgeTextBox.sendKeys(age);
	}

	// Employment Status Field

	@FindBy(xpath = "//div[@class='well-value ng-binding'][contains(.,'Select')]")
	WebElement click_EmploymentStatusSelectField;

	public void clickEmploymentStatus() {
		click_EmploymentStatusSelectField.click();
	}

	// Employment Status Drop down to pick based on the given value

	// method to choose EmploymentStatus
	public void chooseEmploymentStausbyText(String employstatustext) {
		java.util.List<WebElement> EmploymentStatus = driver
				.findElements(By.cssSelector("ul.option-list li div.label span"));
		for (int i = 0; i < EmploymentStatus.size(); i++) {
			System.out.println(EmploymentStatus.get(i).getText());
			if (EmploymentStatus.get(i).getText().contains(employstatustext)) {
				EmploymentStatus.get(i).click();
				break;
			}
		}
	}

	// Employee salary
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement employeeSalary;

	// Enter Salary
	public void TypeSalary(String sal) {
		employeeSalary.sendKeys(sal);
	}

	// KiwiSaver Member Contributions
	// 3% Contribution
	@FindBy(css = "[for='radio-option-04C']")
	WebElement ThreePercentContribution;

	public void clickThreePerKiwiSaver() {
		ThreePercentContribution.click();
	}

	// 4% Contribution
	@FindBy(css = "[for='radio-option-04F']")
	WebElement FourPercentContribution;

	public void clickFourPerKiwiSaver() {
		FourPercentContribution.click();
	}

	// 6% Contribution

	@FindBy(css = "[for='radio-option-04I']")
	WebElement SixPercentContribution;

	public void clickSixPerKiwiSaver() {
		SixPercentContribution.click();
	}

	// 8% Contribution
	@FindBy(css = "[for='radio-option-04L']")
	WebElement EightPercentContribution;

	public void clickEightPerKiwiSaver() {
		EightPercentContribution.click();
	}

	// 10% Contribution
	@FindBy(css = "[for='radio-option-04O']")
	WebElement TenPercentContribution;

	public void clickTenPerKiwiSaver() {
		TenPercentContribution.click();
	}

	// Current KiwiSaverBalance
	@FindBy(css = "div[model='ctrl.data.KiwiSaverBalance'] [placeholder='Optional']")
	WebElement input_CurrentKiwiSaverBalance;

	public void typeCurrentKSBalance(String balance) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		input_CurrentKiwiSaverBalance.sendKeys(balance);
	}

	// Voluntary Contribution
	@FindBy(css = "div.control-with-period [placeholder='Optional']")
	WebElement volountarycontribtutionfield;
	//Fortnightly
			@FindBy(xpath="//span[@class='ng-binding ng-scope' and contains(text(), 'Frequency')]")
			WebElement Freq;

	public void entervoluntarycontribution(String Amount) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(volountarycontribtutionfield).build().perform();

		volountarycontribtutionfield.click();
		volountarycontribtutionfield.sendKeys(Amount);
		//volountarycontribtutionfield.sendKeys(Keys.TAB);
		Freq.click();
		}
		
		//Frequency Selector method
	
		public void selectFrequencyDD(String Frequency)
		{
			
			By element = By.xpath("//span[@class='ng-binding ng-scope' and contains(text(), '"+Frequency+"')]");
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			driver.findElement(element).click();

		}
	

	// Voluntary Contribution frequency
	public void chooseVoluntaryContributionFrequency(String frequency) {
		java.util.List<WebElement> Frequencies = driver.findElements(By.xpath(
				"//div[contains(@class,'wpnib-field-voluntary-contributions field-group ng-isolate-scope')]//li"));
		//System.out.println("size:" + Frequencies.size());
		for (int i = 0; i < Frequencies.size(); i++) {
			//System.out.println(Frequencies.get(i).getText());
			if (Frequencies.get(i).getText().contains("frequency")) {
				System.out.println("matched");
				Frequencies.get(i).click();
				System.out.println("clicked");
				break;
			}
		}

	}
	
	// Defensive Profile
	@FindBy(xpath = "//span[@class='input-holder']//input[@id='radio-option-013']")
	WebElement defensiveProfile;
	// Conservative Profile
	@FindBy(xpath = "//span[@class='input-holder']//input[@id='radio-option-016']")

	WebElement conservativeProfile;
	// Balanced Profile
	@FindBy(xpath = "//span[@class='input-holder']//input[@id='radio-option-019']")

	WebElement balancedProfile;

	// Growth Profile
	@FindBy(xpath = "//span[@class='input-holder']//input[@id='radio-option-01C']")

	WebElement GrowthProfile;

	public void selectDefensiveProfile() {
		defensiveProfile.click();
	}

	// Select Conservative Profile
	public void selectConservativeProfile() {
		conservativeProfile.click();
	}

	// Select growth Profile
	public void selectGrowthProfile() {
		GrowthProfile.click();
	}
	// Select Balanced Profile
	public void selectBalancedProfile() {
		GrowthProfile.click();
		balancedProfile.click();}

	// Savings Goal at Retirement
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Savingsgoal;

	public void TypeSavingsGoal(String goalretireAmount) {
		Savingsgoal.sendKeys(goalretireAmount);
	}
	// KiwiSaver Retirement Projections

	// KiwiSaver retirement projection Button
	@FindBy(css = ".btn-results-reveal")
	WebElement KiwiSaverProjectionButton;

	// method to click on View Summary Projection button
	public void ClickOnKiwiSaverProjectionButton() {
		KiwiSaverProjectionButton.click();
	}

	// KiwiSaver estimate display text
	@FindBy(css = ".result-title")
	WebElement KiwiSaverEstimateText;

	public void viewKiwiSaverBalanceEstimate() {
		KiwiSaverEstimateText.getText();
	}

	// Summary estimate display text
	@FindBy(css = ".result-value")
	WebElement KiwiSaverEstimateAmout;

	public void ViewKiwiSaverEstimateAmout() {
		KiwiSaverEstimateAmout.getText();
	}

	// Summary estimate label
	@FindBy(css = ".result-label")
	WebElement KiwiSaverBalanceSummary;

	public void viewKiwiSaverBalanceSummary() {
		KiwiSaverBalanceSummary.getText();
	}

	}
