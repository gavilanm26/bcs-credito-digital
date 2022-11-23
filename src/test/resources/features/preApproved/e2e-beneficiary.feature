#Author
  # Mauricio Gavilan
  # quality engineer

Feature: validations on the beneficiary screen

  As: a bank customer
  I want to: register my beneficiaries
  To: continue the flow of credit

  @1Beneficiary
  Scenario Outline: Registration of 1 beneficiary
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    And I wait for the page to load. <loader>
    Then I can see the offer customization screen. <textOffer>
    When I click the continue button.
    Then I can see the select account screen. <txtAccount>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | textOffer | txtAccount |
            ##@externaldata@./src/test/resources/datadriven/preApproved.xlsx@accounts
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1013583153|Por su seguridad|ibcs0011|validando|Personalice su oferta|Seleccionar cuenta|Seguro de vida|
