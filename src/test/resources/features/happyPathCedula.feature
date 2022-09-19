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
    When I know the conditions and benefits of the offer and I click on Verifique aqui <textOnboarding>
    And I select id type <idType> and I enter the user name <idNumber>, I enter password <Password> I click the button I want it <textLogin>
    And being in the offer I click on the continue button <textOffer>
    And I select an account and click the continue button <textAccount>
    And I Select how many beneficiaries I want to enter <number>, I enter the first name <firstName>, last name <lastName>, relationship <relation>, percentage <percentage> and click continue <textBeneficiaries>
    And I verify the information <textSummary>
    And I read the promissory note and click on it promissory note signature button <textPromissoryNote>
    And I enter the number in the OTP <otp>, <textOtp>
    And I qualify the experience <qualification>, <textQualify>
    Then I can see the congratulations message <textCongratulations>

    Examples:
      | textOnboarding | textLogin | idType |  idNumber | Password | textOffer | textAccount | number | firstName | lastName | relation | percentage | textBeneficiaries | textSummary | textPromissoryNote | otp | textOtp | qualification | textQualify | textCongratulations |
    ##@externaldata@./src/test/resources/datadriven/login/testData.xlsx@happyPathCedula
|Tiene un crédito preaprobado de libre inversión|Para comenzar ingrese su tipo y número de documento|Cédula de ciudadanía|41728985|ibcs0011|Personalice su oferta|Seleccionar cuenta|1|mauricio|gavilan|Hijo(a)|100|Seguro de vida|Verificación de información|Firma de pagaré|1234|Firma de pagaré|5|¿Cómo califica su experiencia adquiriendo el préstamo?|¡Felicitaciones!|















