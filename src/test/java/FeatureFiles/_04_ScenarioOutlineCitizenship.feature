  #Senaryo
  #Citizenship sayfasına gidiniz.
  #Create işlemini doğrulayınız.
  #Daha sonra aynı bilgilerle tekrar create yapılamadığını doğrulayınız.

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
        | 61123 | r2E1  |
        | 61124 | r2E2  |
        | 41235 | r2E3  |

          #testNG dataProvide burada Scenario Outline olarak krşımıza çıkıyor.