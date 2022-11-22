  #Author
  #Mauricio Gavilan
  #Quality Engineer

  Feature: Validate if there is any product pending payment

    As: a bank customer
    I want to: know if I have a product pending payment
    To: know if I can continue with the offer

    @pendingPayment
    Scenario Outline: pending Payment
      Given I enter the digital friend credit url. <textOnboarding>
      When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
      And I enter the correct password and click the start button. <textPassword>, <Password>
      And I wait for the page to load. <loader>
      Then I can see the product pending payment screen. <txtConsolidated>
      And I click the back to home button.

      Examples:
        | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | txtConsolidated |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@consolidated
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|94387989|Por su seguridad|ibcs0011|validando|pendiente el pago|
