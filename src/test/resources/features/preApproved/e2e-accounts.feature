#Author
  # Mauricio Gavilan
  # quality engineer

Feature: validations on the accounts screen

  As: a bank customer
  I want to: validate if I have active accounts or not
  To: know if I have a current offer

    @accounts
  Scenario Outline: customer without active accounts
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    And I wait for the page to load. <loader>
    Then I can see the offer customization screen. <textOffer>
    When I click the continue button.
    Then I can see the select account screen. <txtAccount>
    When I select an account and I accept the automatic debit.
    And  I click the continue button.
    Then I can see the beneficiary screen. <txtBeneficiary>


    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | textOffer | txtAccount | txtBeneficiary |
    ##@externaldata@./src/test/resources/datadriven/preApproved.xlsx@accounts
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1013583153|Por su seguridad|ibcs0011|validando|Personalice su oferta|Seleccionar cuenta|Seguro de vida|


  @noAccounts
  Scenario Outline: customer without active accounts
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    And I wait for the page to load. <loader>
    Then I can see the screen that I have no active accounts. <txtAccounts>


    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | txtAccounts |
    ##@externaldata@./src/test/resources/datadriven/preApproved.xlsx@noAccounts
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1013604036|Por su seguridad|ibcs0011|validando|activar su cuenta|
