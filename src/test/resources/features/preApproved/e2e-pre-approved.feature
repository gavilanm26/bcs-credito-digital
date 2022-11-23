#Author
#Mauricio Gavilan

Feature: complete process to acquire a digital loan

  As: a bank customer
  I want: have an offer
  To: get a digital loan

  Background:
    Given given the customer clicks on the link in the SMS

  @happyPath
  Scenario Outline: digital loan
    When I enter the digital friend credit url. <textOnboarding>
    And I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    And I wait for the page to load. <loader>
    And I can see the offer customization screen. <textOffer>
    And I click the continue button.
    And I can see the select account screen. <txtAccount>
    And I select one of the accounts and I click continue.
    And I can see the beneficiary screen <txtBeneficiary>

    Then

    Examples:
      | textOnboarding | textLogin | idType |  idNumber | Password | textOffer | textAccount | number | firstName | lastName | relation | percentage | textBeneficiaries | textSummary | textPromissoryNote | otp | textOtp | qualification | textQualify | textCongratulations |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@happyPathE2E
|Crédito Digital de Libre Inversión|Para comenzar ingrese su tipo y número de documento|Cédula de ciudadanía|41728985|ibcs0011|Personalice su oferta|Seleccionar cuenta|1|mauricio|gavilan|Hijo(a)|100|Seguro de vida|Verificación de información|Firma de pagaré|1234|Firma de pagaré|5|¿Cómo califica su experiencia adquiriendo el préstamo?|¡Felicitaciones!|















