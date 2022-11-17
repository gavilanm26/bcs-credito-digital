#Author
#Mauricio Gavilan

Feature: onboarding screen validation Bank Caja Social - digital loan

  As: a bank customer
  I want: be on the onboarding screen
  To: perform all validations

  Background:
    Given I entered the onboarding url

  @landing
  Scenario Outline: Button 1
    When  I click the first button, I want my loan! <textOnboarding>
    Then I enter the login screen <textLogin>

    Examples:
      | textOnboarding | textLogin |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@landing
|Le damos la bienvenida a|Bienvenido a|


