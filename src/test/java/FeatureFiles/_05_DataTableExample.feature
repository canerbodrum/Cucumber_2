Feature: DataTable Example
  @SmokeTest
  Scenario: Users List
    When Write username "etka"
    And Write username and Password "etka" and "1234"
    And Write username as DataTable
    | etka |
    | emir |
    | enes |
    | erva |

    And Write username and Password as DataTable
      | etka | 1234 |
      | emir | 2345 |
      | enes | 3456 |
      | erva | 4567 |