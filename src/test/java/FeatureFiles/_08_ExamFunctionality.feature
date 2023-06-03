#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız
Feature: Exam Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
@SmokeTest
  Scenario: Create New Exam

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupExams     |
      | entranceExamsTwo |

    And Click on the element in DialogContent
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Etka |

    And Click on the element in DialogContent
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLvl        |
      | gradeLvl3       |

    And Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | exams         |
      | setupExams    |
      | entranceExams |

    And User delete item from Dialog Content
      | Etka |

    Then Success message should be displayed