#Author
  #Mauricio Gavilan
  #Quality Engineer

Feature: offer validation flow

  As: a bank customer
  I want: validate if I have a current offer
  To: know if I can modify the offer

  @successOffer
  Scenario Outline: Success offer
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    And I wait for the page to load. <loader>
    Then I can see the offer customization screen. <textOffer>
    And I click the continue button.
    Then I can see the select account screen. <txtAccount>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | textOffer | txtAccount |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@offer
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|94387989|Por su seguridad|ibcs0011|validando|Personalice su oferta|Seleccionar cuenta|
