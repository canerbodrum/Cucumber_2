Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create Country

      And Click on the element in LeftNav
          | setup      |
          | parameters |
          | countries  |

      And Click on the element in DialogContent
        | addButton      |

      And User sending the keys in Dialog Content
        | nameInput | Etk4e12   |
        | codeInput | e4532     |

      And Click on the element in DialogContent
        | saveButton |

      And User delete item from Dialog Content
        |Etk4e12|

      Then Success message should be displayed


@Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Etk4e12 |

    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      |Etk4e12|

    Then Success message should be displayed
  @Regression
    Scenario: Fee Functionality
      And Click on the element in LeftNav
        | setup         |
        | parameters    |
        | fees          |
      And Click on the element in DialogContent
        | addButton |

      And User sending the keys in Dialog Content
        | nameInput            | Etk412d |
        | codeInput            | 2etfd32 |
        | integrationCodeInput |  13243  |
        | priorityInput        |   312   |

      And Click on the element in DialogContent
        | toggleButton |
        |  saveButton  |

      Then Success message should be displayed

      And User delete item from Dialog Content
        | Etk412d |

      Then Success message should be displayed