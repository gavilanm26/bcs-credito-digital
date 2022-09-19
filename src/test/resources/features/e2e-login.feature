#Author
#Mauricio Gavilan

Feature: login screen validation Bank Caja Social - digital loan

  As: a bank customer
  I want: to be on the login screen
  To: perform all validations


  @loginValidationsButton @Regresion
  Scenario Outline: Disabled Button
    Given given i entered the login url <textOnboarding>
    When  I fill in the login fields <idType>, <idNumber>, <Password>, <textLogin>
    Then the continue button should not be activated

    Examples:
      | textOnboarding | textLogin | idType | idNumber | Password |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@loginValidationsButtonDisabled
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de ciudadanía|NA|NA|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de extranjería|NA|NA|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Usuario|NA|NA|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|NA|123456789|contra12|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de ciudadanía|NA|contra12|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de ciudadanía|123456789|NA|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de extranjería|NA|contra12|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de extranjería|1039458363|NA|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Usuario|NA|contra12|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Usuario|mauro123|NA|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de ciudadanía|mauro|contra12|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de extranjería|mauro|contra12|



  @loginValidationsMessages @Regresion
  Scenario Outline: Validation Messages
    Given given i entered the login url <textOnboarding>
    When  I fill in the login fields <idType>, <idNumber>, <Password>, <textLogin>
    Then the different messages are validated <message>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | Password | message |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@hoja1
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de ciudadanía|12|contra12|Mínimo 3 caracteres|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de extranjería|12|contra12|Mínimo 3 caracteres|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Usuario|mauro28|contra12|Mínimo 8 caracteres|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de ciudadanía|1039458363|contr|Mínimo 8 caracteres|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Cédula de extranjería|1039458363|contr|Mínimo 8 caracteres|
|Tiene un préstamo preaprobado de libre inversión|Iniciar sesión|Usuario|mauricio1234|contra1|Mínimo 8 caracteres|


