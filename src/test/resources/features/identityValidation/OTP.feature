#Author
  # Mauricio Gavilan
  # quality engineer

Feature: identity validation flow by OTP

  As: a bank customer
  I want to: validate my identity
  To: know if I have a current offer

  @successfulOTP
  Scenario Outline: identity validation with offer
    Given I entered digital friend credit. <textOnboarding>
    When I fill in the document type, document number fields and select one verification field. <textLogin>, <idType>, <idNumber>
    Then I can see the identity validation screen and I click continue. <txtIdentityValidation>
    When I answer the questions well
    And I select the correct cell phone number90
    And I enter the correct OTP number
    Then I can see the offer customization screen


    Examples:
      | textOnboarding | textLogin | idType | idNumber | txtIdentityValidation |
            ##@externaldata@./src/test/resources/datadriven/identityValidation.xlsx@OTPWithOffer
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1030618791|validaremos su identidad|
