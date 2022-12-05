#Author
#Mauricio Gavilan

Feature: login screen validations

  As: a bank customer
  I want: to be on the login screen
  To: perform all validations

  @successLogin @regressionTests
  Scenario Outline: Success login
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    And I wait for the page to load. <loader>
    Then I can see the offer customization screen. <textOffer>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | loader | textOffer |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@successLogin
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1013583153|Por su seguridad|ibcs0011|validando|Personalice su oferta|


  @validateMessages @regressionTests
  Scenario Outline: Validation messages for the document number
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number to validate messages. <textLogin>, <idType>, <idNumber>
    Then the different messages are validated <idType>, <message>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | message |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@validationsMessages
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|41|Mínimo 3 caracteres|
|Le damos la bienvenida a|Bienvenido a|Cédula de extranjería|41|Mínimo 3 caracteres|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauro28|Mínimo 8 caracteres|
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|12345678901|Máximo 10 caracteres permitidos|
|Le damos la bienvenida a|Bienvenido a|Cédula de extranjería|12345678901|Máximo 10 caracteres permitidos|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio23456789043|Máximo 18 caracteres permitidos|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio|Debe estar formado por mínimo 2 números|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio22|No se permiten caracteres repetidos|
|Le damos la bienvenida a|Bienvenido a|Usuario|mauricio23456$|No se permiten: ñ caracteres especiales ni espacios|


  @validateModal @regressionTests
  Scenario Outline: validate messages when they are bad data and blocking
    Given I enter the digital friend credit url. <textOnboarding>
    When  I select the type of document and the number. <textLogin>, <idType>, <idNumber>
    And I enter the correct password and click the start button. <textPassword>, <Password>
    Then I check if I have entered an incorrect data or I have the user blocked. <modal>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | textPassword | Password | modal |
    ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@validateModal
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|14509287|Por su seguridad|ibcs0011|Por favor verifique e intente de nuevo|
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|33152814|Por su seguridad|ibcs0011|Usuario bloqueado, por favor intente de nuevo en 24 horas|
