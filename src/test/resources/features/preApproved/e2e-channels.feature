#Author
        #Mauricio Gavilan

Feature: Check if you have digital channels or not

  As: a bank customer
  I want to: know if I have digital channels
  To: know whether or not to perform the identity validation flow

  @withChannels1Check
  Scenario Outline: with digital channels 1 check
    Given I entered digital friend credit. <textOnboarding>
    When I fill in the document type, document number fields and select one verification field. <textLogin>, <idType>, <idNumber>
    Then I can see the field to enter the password. <txtPassword>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | txtPassword |
            ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@withChannels
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|41728985|Por su seguridad|

  @withChannels2Checks
  Scenario Outline: with digital channels 2 checks
    Given I entered digital friend credit. <textOnboarding>
    When I fill in the document type, document number fields and select two verification field. <textLogin>, <idType>, <idNumber>
    Then I can see the field to enter the password. <txtPassword>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | txtPassword |
            ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@withChannels
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|41728985|Por su seguridad|


  @noChannels
  Scenario Outline: no with digital channels
    Given I entered digital friend credit. <textOnboarding>
    When I fill in the document type, document number fields and select one verification field. <textLogin>, <idType>, <idNumber>
    Then I can see the identity validation screen. <txtIdentityValidation>

    Examples:
      | textOnboarding | textLogin | idType | idNumber | txtIdentityValidation |
            ##@externaldata@./src/test/resources/dataDriven/preApproved.xlsx@noChannels
|Le damos la bienvenida a|Bienvenido a|Cédula de ciudadanía|1030618791|validaremos su identidad|

