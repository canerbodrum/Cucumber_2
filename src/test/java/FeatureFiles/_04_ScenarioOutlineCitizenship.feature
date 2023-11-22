  #Senaryo
  #Citizenship sayfasına gidiniz.
  #Create işlemini doğrulayınız.
  #Daha sonra aynı bilgilerle tekrar create yapılamadığını doğrulayınız.
@Smoke
  Feature: Citizenship Functionality

    Background: Before Scenario
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to Citizenship page

    Scenario Outline: Citizenship Create
      When Create a citizenship name as "<name>" short name as "<short>"
      Then Success message should be displayed

      When Create a citizenship name as "<name>" short name as "<short>"
      Then Already exist message should be displayed

      When User delete the "<name>"
      Then Success message should be displayed

      Examples:
        | name     | short |
        | Rndsm1 | r2E1  |
        | Rndsm2 | r2E2  |
        | Rndsm4 | r2E3  |

          #testNG dataProvide burada Scenario Outline olarak krşımıza çıkıyor.