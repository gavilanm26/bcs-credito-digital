#Author
        #Mauricio Gavilan

Feature: screen to validate whether or not you have digital channels

  As: a bank customer
  I want to: know if I have digital channels
  To: know whether or not to perform the identity validation flow

  @withChannels
  Scenario Outline: with digital channels
    Given the client enters the main page. <textOnboarding>
    When you fill in the document type and document number fields. <textLogin>, <idType>, <idNumber>
    Then you can see the field to enter the password. <txtPassword>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | txtPassword |
            ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@withChannels
|Tiene un crédito preaprobado de libre inversión|Para comenzar ingrese su tipo y número de documento|Cédula de ciudadanía|41728985|Ingrese la contraseña|
