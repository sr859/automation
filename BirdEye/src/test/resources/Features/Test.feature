Feature: Validation of Birdeye Homepage website

@BirdEyeLinks
Scenario: Verifying the birdeye footer part learn more links
Given user is on the birdeye home page
When Verify All Headers Navigations are working fine


  @sanity
  Scenario: Verifying the birdeye footer part learn more links
    Given user is on the birdeye home page
    When click review link
    Then user should verify the review page title
    And click listing link
    Then user should verify the listing page title
    And click pages link
    Then user should verify the pages page title
    And click webchat link
    Then user should verify the webchat page title
    And click survey link
    Then user should verify the survey page title
    And click ticketing link
    Then user should verify the ticketing page title
    And click insights link
    Then user should verify the insights  page title
    And click benchmarking link
    Then user should verify the benchmarking page title

  @sanity
  Scenario: Verifying the birdeye footer part Objectives links
    Given user is on the birdeye home page
    When click Google for local business link
    Then user should verify the Google for local business page title
    And click Review Management link

  @sanity
  Scenario: Verifying the birdeye footer part Industries links
    Given user is on the birdeye home page
    When click Dental link
    Then user should verify the Dental page title
    When click Healthcare link
    Then user should verify the Healthcare page title
    When click Real Estate link
    Then user should verify the Real Estate page title
    When click Financial Services link
    Then user should verify the Financial Services page title
    When click Legal link
    Then user should verify the Legal page title
    When click Automotive link
    Then user should verify the Automotive page title
    When click Retail link
    Then user should verify the Retail page title
    When click Hospitality link
    Then user should verify the Hospitality page title
    When click Insurance link
    Then user should verify the Insurance page title
    When click Home Services link
    Then user should verify the Home Services page title
    When click Restaurants link
    Then user should verify the Restaurants page title
    When click Personal Services link
    Then user should verify the Personal Services page title

  @reg
  Scenario: Verifying the birdeye footer part Company links
    Given user is on the birdeye home page
    When click About Us link
    Then user should verify the About Us page title
    When click Leadership Team link
    Then user should verify the Leadership Team page title
    When click Watch Demo link
    Then user should verify the Watch Demo page title
    When click Book a time link
    Then user should verify the Book a time page title
    When click Resources link
    Then user should verify the Resources page title
    When click Press link
    Then user should verify the Press page title
    When click Product Updates link
    Then user should verify the Product Updates page title
    When click Careers link
    Then user should verify the Careers page title
    When click Success Stories link
    Then user should verify the Success Stories page title
    When click Birdeye Reviews link
    Then user should verify the Birdeye Reviews page title
    When click Birdeye Results link
    Then user should verify the Birdeye Results page title
    When click Contact Us link
    Then user should verify the Contact Us page title

  Scenario: Verifying the birdeye footer part Services links
    Given user is on the birdeye home page
    When click Managed Services link
    Then user should verify the Managed Services page title
    When click Professional Services link
    Then user should verify the Professional Services page title

  Scenario: Verifying the birdeye footer part Support and Tools links
    When click Scan Your Business link
    Then user should verify the Scan Your Business page title
    When click Find a Business link
    Then user should verify the Find a Business page title
    When click For Developers link
    Then user should verify the For Developers page title
    When click Birdeye Support link
    Then user should verify the Birdeye Support page title
    When click Refer a Business link
    Then user should verify the Refer a Businesst page title
