#Author
#Mauricio Gavilan

Feature: login screen validation Bank Caja Social - digital loan

  As: a bank customer
  I want: to be on the login screen
  To: perform all validations

  @SuccessLogin
  Scenario Outline: Success login
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    Then I can see the offer customization screen. <textOffer>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | textOffer |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@SuccessfulLogin
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1026265690|Por su seguridad|ibcs0011|Monto|
|Le damos la bienvenida a|Bienvenido a|Cédula de extranjería|1026264954|Por su seguridad|ibcs0011|Monto|


  @ValidationDocumentNumber
  Scenario Outline: Validation messages for the document number
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number to validate messages. <textLogin>, <idType>, <idNumber>
    Then the different messages are validated <idType> <message>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | message |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@ValidationDocumentNumber
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|41|Mínimo 3 caracteres|
|Le damos la bienvenida a|Bienvenido a|Cédula de extranjería|41|Mínimo 3 caracteres|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauro28|Mínimo 8 caracteres|
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|12345678901|Máximo 10 caracteres permitidos|
|Le damos la bienvenida a|Bienvenido a|Cédula de extranjería|12345678901|Máximo 10 caracteres permitidos|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio23456789043|Máximo 18 caracteres permitidos|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio|Debe estar formado por mínimo 2 números|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio22|No se permiten caracteres repetidos|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio23456$|No se permiten: ñ caracteres especiales ni espacios|


