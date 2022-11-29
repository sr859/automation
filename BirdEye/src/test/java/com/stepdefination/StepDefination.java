package com.stepdefination;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefination {

	WebDriver driver;

	@Given("user is on the birdeye home page")
	public void user_is_on_the_birdeye_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://birdeye.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	}

	@When("click review link")
	public void click_review_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[2]/a"))
				.click();

	}

	@Then("user should verify the review page title")
	public void user_should_verify_the_review_page_title() {
		WebElement reviewTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String reviewManagement = reviewTitle.getText();
		boolean review = reviewManagement.contains("Online Review Management Software");
		System.out.println(review);
		driver.navigate().back();

	}

	@Then("click listing link")
	public void click_listing_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[3]/a"))
				.click();

	}

	@Then("user should verify the listing page title")
	public void user_should_verify_the_listing_page_title() {
		WebElement listingTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1	"));
		String listingManagement = listingTitle.getText();
		boolean review = listingManagement.contains("Local Business Listing Management");
		System.out.println(review);
		driver.navigate().back();

	}

	@Then("click pages link")
	public void click_pages_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[4]/a"))
				.click();

	}

	@Then("user should verify the pages page title")
	public void user_should_verify_the_pages_page_title() {
		WebElement pagesTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String pagesManagement = pagesTitle.getText();
		boolean pages = pagesManagement.contains("Landing Page Software");
		System.out.println(pages);
		driver.navigate().back();

	}

	@Then("click webchat link")
	public void click_webchat_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[6]/a"))
				.click();
	}

	@Then("user should verify the webchat page title")
	public void user_should_verify_the_webchat_page_title() {
		WebElement webchatTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String webchatManagement = webchatTitle.getText();
		boolean webchat = webchatManagement.contains("WebChat Software for Business");
		System.out.println(webchat);
		driver.navigate().back();

	}

	@Then("click mass texting link")
	public void click_mass_texting_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[8]/a"))
				.click();

	}

	@Then("user should verify the mass texting page title")
	public void user_should_verify_the_mass_texting_page_title() {
		WebElement massttextingTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String massTextingManagement = massttextingTitle.getText();
		boolean massTexting = massTextingManagement.contains("Mass Text Messaging Platform for Business");
		System.out.println(massTexting);
		driver.navigate().back();

	}

	@Then("click survey link")
	public void click_survey_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[9]/a"))
				.click();

	}

	@Then("user should verify the survey page title")
	public void user_should_verify_the_survey_page_title() {
		WebElement surveyTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String surveyManagement = surveyTitle.getText();
		boolean survey = surveyManagement.contains("Best Customer Survey Software");
		System.out.println(survey);
		driver.navigate().back();
	}

	@Then("click ticketing link")
	public void click_ticketing_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[10]/a"))
				.click();
	}

	@Then("user should verify the ticketing page title")
	public void user_should_verify_the_ticketing_page_title() {
		WebElement ticketingTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String ticketingManagement = ticketingTitle.getText();
		boolean ticketing = ticketingManagement.contains("Customer Support Ticket Software");
		System.out.println(ticketing);
		driver.navigate().back();

	}

	@Then("click insights link")
	public void click_insights_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[11]/a"))
				.click();

	}

	@Then("user should verify the insights  page title")
	public void user_should_verify_the_insights_page_title() {
		WebElement insigtsTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String insightsManagement = insigtsTitle.getText();
		boolean insigts = insightsManagement.contains("Customer Feedback Analytics Software");
		System.out.println(insigts);
		driver.navigate().back();

	}

	@Then("click benchmarking link")
	public void click_benchmarking_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[1]/li[12]/a"))
				.click();

	}

	@Then("user should verify the benchmarking page title")
	public void user_should_verify_the_benchmarking_page_title() {
		WebElement benchmarkingTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String benchmarkingManagement = benchmarkingTitle.getText();
		boolean benchmarking = benchmarkingManagement.contains("Competitive Benchmarking Software");
		System.out.println(benchmarking);
		driver.navigate().back();

	}

	@When("click Google for local business link")
	public void click_Google_for_local_business_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[2]/a"))
				.click();
	}

	@Then("user should verify the Google for local business page title")
	public void user_should_verify_the_Google_for_local_business_page_title() {
		WebElement GoogleforlocalbusinessTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h1"));
		String GoogleforlocalbusinessManagement = GoogleforlocalbusinessTitle.getText();
		boolean Googleforlocalbusiness = GoogleforlocalbusinessManagement.contains("Birdeye x Google");
		System.out.println(Googleforlocalbusiness);
		driver.navigate().back();
	}

	@Then("click Review Management link")
	public void click_Review_Management_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[3]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[4]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[5]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[6]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[7]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[8]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[9]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[10]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[11]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[12]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[2]/li[13]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[7]/a"))
				.click();

		System.out.println(driver.getTitle());
		Set<String> h = driver.getWindowHandles();

		for (String i : h) {
			String s = driver.switchTo().window(i).getTitle();
			System.out.println(s);
			driver.close();

		}
	}

	@When("click Dental link")
	public void click_Dental_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[2]/a"))
				.click();

	}

	@Then("user should verify the Dental page title")
	public void user_should_verify_the_Dental_page_title() {
		WebElement dentalTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String dentalManagement = dentalTitle.getText();
		boolean dental = dentalManagement.contains("Get new patients through five-star reviews");
		System.out.println(dental);
		driver.navigate().back();

	}

	@When("click Healthcare link")
	public void click_Healthcare_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[3]/a"))
				.click();

	}

	@Then("user should verify the Healthcare page title")
	public void user_should_verify_the_Healthcare_page_title() {
		WebElement healthcareTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String healthcareManagement = healthcareTitle.getText();
		boolean healthcare = healthcareManagement
				.contains("Deliver great patient experience from one unified platform");
		System.out.println(healthcare);
		driver.navigate().back();

	}

	@When("click Real Estate link")
	public void click_Real_Estate_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[4]/a"))
				.click();
	}

	@Then("user should verify the Real Estate page title")
	public void user_should_verify_the_Real_Estate_page_title() {
		WebElement realEstateTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String realEstateManagement = realEstateTitle.getText();
		boolean realEstate = realEstateManagement.contains("Realtors - Your secret to winning? Customer experience");
		System.out.println(realEstate);
		driver.navigate().back();
	}

	@When("click Financial Services link")
	public void click_Financial_Services_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[5]/a"))
				.click();
	}

	@Then("user should verify the Financial Services page title")
	public void user_should_verify_the_Financial_Services_page_title() {
		WebElement financialServicesTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String financialServicesManagement = financialServicesTitle.getText();
		boolean financialServices = financialServicesManagement
				.contains("#1 most trusted reputation and customer experience platform for financial services");
		System.out.println(financialServices);
		driver.navigate().back();
	}

	@When("click Legal link")
	public void click_Legal_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[6]/a"))
				.click();

	}

	@Then("user should verify the Legal page title")
	public void user_should_verify_the_Legal_page_title() {
		WebElement legalTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String legalManagement = legalTitle.getText();
		boolean legal = legalManagement.contains("How lawyers boost reputation through unbeatable client experience");
		System.out.println(legal);
		driver.navigate().back();

	}

	@When("click Automotive link")
	public void click_Automotive_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[7]/a"))
				.click();
	}

	@Then("user should verify the Automotive page title")
	public void user_should_verify_the_Automotive_page_title() {
		WebElement AutomotiveTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String AutomotiveManagement = AutomotiveTitle.getText();
		boolean Automotive = AutomotiveManagement.contains("Drive your business to the top of search");
		System.out.println(Automotive);
		driver.navigate().back();
	}

	@When("click Retail link")
	public void click_Retail_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[8]/a"))
				.click();

	}

	@Then("user should verify the Retail page title")
	public void user_should_verify_the_Retail_page_title() {
		WebElement RetailTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String RetailManagement = RetailTitle.getText();
		boolean Retail = RetailManagement.contains("Rank higher and win more customers on Google");
		System.out.println(Retail);
		driver.navigate().back();

	}

	@When("click Hospitality link")
	public void click_Hospitality_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[9]/a"))
				.click();
	}

	@Then("user should verify the Hospitality page title")
	public void user_should_verify_the_Hospitality_page_title() {
		WebElement HospitalityTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String HospitalityManagement = HospitalityTitle.getText();
		boolean Hospitality = HospitalityManagement.contains("Put your online competition to bed");
		System.out.println(Hospitality);
		driver.navigate().back();
	}

	@When("click Insurance link")
	public void click_Insurance_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[10]/a"))
				.click();
	}

	@Then("user should verify the Insurance page title")
	public void user_should_verify_the_Insurance_page_title() {
		WebElement InsuranceTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String InsuranceManagement = InsuranceTitle.getText();
		boolean Insurance = InsuranceManagement.contains("Sell more policies with great customer experience");
		System.out.println(Insurance);
		driver.navigate().back();
	}

	@When("click Home Services link")
	public void click_Home_Services_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[11]/a"))
				.click();

	}

	@Then("user should verify the Home Services page title")
	public void user_should_verify_the_Home_Services_page_title() {
		WebElement HomeServicesTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String HomeServicesManagement = HomeServicesTitle.getText();
		boolean HomeServices = HomeServicesManagement.contains("How contractors can become customers' top pick");
		System.out.println(HomeServices);
		driver.navigate().back();

	}

	@When("click Restaurants link")
	public void click_Restaurants_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[12]/a"))
				.click();

	}

	@Then("user should verify the Restaurants page title")
	public void user_should_verify_the_Restaurants_page_title() {
		WebElement RestaurantsTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String RestaurantsManagement = RestaurantsTitle.getText();
		boolean Restaurants = RestaurantsManagement.contains("Effortless reputation management for restaurants");
		System.out.println(Restaurants);
		driver.navigate().back();

	}

	@When("click Personal Services link")
	public void click_Personal_Services_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[1]/div/div/ul[3]/li[13]/a"))
				.click();

	}

	@Then("user should verify the Personal Services page title")
	public void user_should_verify_the_Personal_Services_page_title() {
		WebElement PersonalServicesTitle = driver.findElement(By.xpath("//*[@id=\"content-banner\"]/h1"));
		String PersonalServicesManagement = PersonalServicesTitle.getText();
		boolean PersonalServices = PersonalServicesManagement
				.contains("Dominate local search. Deliver top-notch customer experience. Grow your business.");
		System.out.println(PersonalServices);
		driver.navigate().back();

	}

	@When("click About Us link")
	public void click_About_Us_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[2]/a"))
				.click();

	}

	@Then("user should verify the About Us page title")
	public void user_should_verify_the_About_Us_page_title() {
		WebElement aboutusTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/div/div/h1"));
		String aboutusManagement = aboutusTitle.getText();
		boolean aboutus = aboutusManagement.contains("Experience Marketing starts here");
		System.out.println(aboutus);
		driver.navigate().back();

	}

	@When("click Leadership Team link")
	public void click_Leadership_Team_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[3]/a"))
				.click();

	}

	@Then("user should verify the Leadership Team page title")
	public void user_should_verify_the_Leadership_Team_page_title() {
		WebElement aboutusTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/div/div/div/div[1]/h2"));
		String aboutusManagement = aboutusTitle.getText();
		boolean aboutus = aboutusManagement.contains("Our team");
		System.out.println(aboutus);
		driver.navigate().back();

	}

	@When("click Watch Demo link")
	public void click_Watch_Demo_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[4]/a"))
				.click();

	}

	@Then("user should verify the Watch Demo page title")
	public void user_should_verify_the_Watch_Demo_page_title() {
		WebElement watchdemoTitle = driver.findElement(By.xpath("//*[@id=\"scrollToTop\"]/div/p[1]/span"));
		String watchdemoManagement = watchdemoTitle.getText();
		boolean watchdemo = watchdemoManagement.contains("Get instant access to a Birdeye product demo");
		System.out.println(watchdemo);
		driver.navigate().back();

	}

	@When("click Book a time link")
	public void click_Book_a_time_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[5]/a"))
				.click();

	}

	@Then("user should verify the Book a time page title")
	public void user_should_verify_the_Book_a_time_page_title() {
		WebElement bookatimeTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div[2]/h1"));
		String bookatimeManagement = bookatimeTitle.getText();
		boolean bookatime = bookatimeManagement.contains("Schedule time with Birdeye");
		System.out.println(bookatime);
		driver.navigate().back();

	}

	@When("click Resources link")
	public void click_Resources_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[6]/a"))
				.click();

	}

	@Then("user should verify the Resources page title")
	public void user_should_verify_the_Resources_page_title() {
		WebElement ResourcesTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/section/div/div/div/h1"));
		String ResourcesManagement = ResourcesTitle.getText();
		boolean Resources = ResourcesManagement.contains("Resources");
		System.out.println(Resources);
		driver.navigate().back();

	}

	@When("click Press link")
	public void click_Press_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[8]/a"))
				.click();

	}

	@Then("user should verify the Press page title")
	public void user_should_verify_the_Press_page_title() {
		WebElement PressTitle = driver.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/div/div/div/h1"));
		String PressManagement = PressTitle.getText();
		boolean Press = PressManagement.contains("Birdeye Press");
		System.out.println(Press);
		driver.navigate().back();

	}

	@When("click Product Updates link")
	public void click_Product_Updates_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[9]/a"))
				.click();

	}

	@Then("user should verify the Product Updates page title")
	public void user_should_verify_the_Product_Updates_page_title() {
		WebElement ProductUpdatesTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div/span"));
		String ProductUpdatesManagement = ProductUpdatesTitle.getText();
		boolean ProductUpdates = ProductUpdatesManagement.contains("Updates");
		System.out.println(ProductUpdates);
		driver.navigate().back();

	}

	@When("click Careers link")
	public void click_Careers_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[10]/a"))
				.click();

	}

	@Then("user should verify the Careers page title")
	public void user_should_verify_the_Careers_page_title() {
		WebElement CareersTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/div/div/h1"));
		String CareersManagement = CareersTitle.getText();
		boolean Careers = CareersManagement.contains("HELP GREAT IDEAS TAKE FLIGHT");
		System.out.println(Careers);
		driver.navigate().back();
	}

	@When("click Success Stories link")
	public void click_Success_Stories_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[11]/a"))
				.click();

	}

	@Then("user should verify the Success Stories page title")
	public void user_should_verify_the_Success_Stories_page_title() {
		WebElement successstoriesTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/div/div/div/section/div[1]/h1"));
		String successstoriesManagement = successstoriesTitle.getText();
		boolean successstories = successstoriesManagement.contains("Case studies");
		System.out.println(successstories);
		driver.navigate().back();

	}

	@When("click Birdeye Reviews link")
	public void click_Birdeye_Reviews_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[12]/a"))
				.click();

	}

	@Then("user should verify the Birdeye Reviews page title")
	public void user_should_verify_the_Birdeye_Reviews_page_title() {
		WebElement BirdeyeReviewsTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/div[1]/div/h1"));
		String BirdeyeReviewsManagement = BirdeyeReviewsTitle.getText();
		boolean Reviews = BirdeyeReviewsManagement.contains("Our reviews");
		System.out.println(Reviews);
		driver.navigate().back();

	}

	@When("click Birdeye Results link")
	public void click_Birdeye_Results_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[13]/a"))
				.click();

	}

	@Then("user should verify the Birdeye Results page title")
	public void user_should_verify_the_Birdeye_Results_page_title() {
		WebElement BirdeyeResultsTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/div/div/div/div/h2"));
		String BirdeyeResultsManagement = BirdeyeResultsTitle.getText();
		boolean BirdeyeResults = BirdeyeResultsManagement
				.contains("Birdeye Effect on Businesses & Customer Success Results");
		System.out.println(BirdeyeResults);
		driver.navigate().back();

	}

	@When("click Contact Us link")
	public void click_Contact_Us_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[1]/li[14]/a"))
				.click();

	}

	@Then("user should verify the Contact Us page title")
	public void user_should_verify_the_Contact_Us_page_title() {
		WebElement contactusTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div[1]/div/div/h1"));
		String contactusManagement = contactusTitle.getText();
		boolean contactus = contactusManagement.contains("Get in touch");
		System.out.println(contactus);
		driver.navigate().back();

	}

	@When("click Managed Services link")
	public void click_Managed_Services_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[2]/li[2]/a"))
				.click();

	}

	@Then("user should verify the Managed Services page title")
	public void user_should_verify_the_Managed_Services_page_title() {
		WebElement ManagedServicesTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h2"));
		String ManagedServicesManagement = ManagedServicesTitle.getText();
		boolean ManagedServices = ManagedServicesManagement
				.contains("You focus on your core business. We'll take care of the rest.");
		System.out.println(ManagedServices);
		driver.navigate().back();

	}

	@When("click Professional Services link")
	public void click_Professional_Services_link() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div/nav[1]/section[2]/div/div/ul[2]/li[3]/a"))
				.click();

	}

	@Then("user should verify the Professional Services page title")
	public void user_should_verify_the_Professional_Services_page_title() {
		WebElement ProfessionalServicesTitle = driver
				.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div[1]/section/h2"));
		String ProfessionalServicesManagement = ProfessionalServicesTitle.getText();
		boolean ProfessionalServices = ProfessionalServicesManagement.contains("Let Birdeye do the heavy lifting.");
		System.out.println(ProfessionalServices);
		driver.navigate().back();
		
	}

	@When("click Scan Your Business link")
	public void click_Scan_Your_Business_link() {

	}

	@Then("user should verify the Scan Your Business page title")
	public void user_should_verify_the_Scan_Your_Business_page_title() {

	}

	@When("click Find a Business link")
	public void click_Find_a_Business_link() {

	}

	@Then("user should verify the Find a Business page title")
	public void user_should_verify_the_Find_a_Business_page_title() {

	}

	@When("click For Developers link")
	public void click_For_Developers_link() {

	}

	@Then("user should verify the For Developers page title")
	public void user_should_verify_the_For_Developers_page_title() {

	}

	@When("click Birdeye Support link")
	public void click_Birdeye_Support_link() {

	}

	@Then("user should verify the Birdeye Support page title")
	public void user_should_verify_the_Birdeye_Support_page_title() {

	}

	@When("click Refer a Business link")
	public void click_Refer_a_Business_link() {

	}

	@Then("user should verify the Refer a Businesst page title")
	public void user_should_verify_the_Refer_a_Businesst_page_title() {

	}

	@When("Verify All Headers Navigations are working fine")
	public void verifyAllHeaderNavigationisWorkingFine() throws InterruptedException {
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		List<WebElement> listOfMenus = driver.findElements(By.xpath("//ul[@class='css-cgayqz']/li/a"));
		System.out.println("List of Menus " + listOfMenus.size());
		for (int i = 0; i < listOfMenus.size(); i++) {
			List<WebElement> links = driver.findElements(By.xpath("//ul[@class='css-cgayqz']/li[" + (i + 1) + "]//a"));
			System.out.println("List of sub menu " + links.size());
			for (int j = 1; j < links.size(); j++) {

				ac.moveToElement(driver.findElement(By.xpath("//ul[@class='css-cgayqz']/li[" + (i + 1) + "]//a")))
						.perform();
				Thread.sleep(2000);
				WebElement Alllinks = driver
						.findElement(By.xpath("(//ul[@class='css-cgayqz']/li[" + (i + 1) + "]//a)[" + (j + 1) + "]"));
				String currentTitle = driver.getTitle();
				System.out.println("Current title "+ currentTitle + " clickable link "+ Alllinks.getText());
				js.executeScript("arguments[0].click();", Alllinks);
				Thread.sleep(2000);
				//
				String expectedTitle = driver.getTitle();
				System.out.println("Expected title "+ expectedTitle);
				boolean flag = !currentTitle.equals(expectedTitle);
				System.out.println(flag);
				driver.navigate().back();
				Thread.sleep(5000);

			}
		}

	}

}
