#Author
  # Mauricio Gavilan
  # quality engineer

Feature: account validation flow

  As: a bank customer
  I want to: validate if I have active accounts or not
  To: know if I have a current offer

  @noAccounts
  Scenario Outline: customer without active accounts
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    #qAAnd I wait for the page to load. <loader>
    Then I can see the screen that I have no active accounts. <txtAccounts>


    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | txtAccounts |
            ##@externaldata@./src/test/resources/datadriven/preApproved.xlsx@accounts
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1013604036|Por su seguridad|ibcs0011|validando|activar su cuenta|
