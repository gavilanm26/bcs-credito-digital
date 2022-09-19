#Author
#Mauricio Gavilan

Feature: onboarding screen validation Bank Caja Social - digital loan

  As: a bank customer
  I want: be on the onboarding screen
  To: perform all validations

  Background:
    Given given i entered the onboarding url

  @onboardingValidationsButoon1
  Scenario Outline: Button 1
    When  I click the first button, I want my loan! <textOnboarding>
    Then I enter the login screen <textLogin>

    Examples:
      | textOnboarding | textLogin |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@onboardingValidations
|Tiene un crédito preaprobado de libre inversión|Iniciar sesión|


  @onboardingValidationsButoon2
  Scenario Outline: Button 2
    When  I click the first button, I want my loan! <textOnboarding>
    Then I enter the login screen <textLogin>

    Examples:
      | textOnboarding | textLogin |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@onboardingValidations
|Tiene un crédito preaprobado de libre inversión|Iniciar sesión|

