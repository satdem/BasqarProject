Feature: My subjectCat catagories
  Background:
    Given User on home page
    And   User login in to basqar

  Scenario: Create and delete My SubjectCat in the subject catagories
    Given User navigate to SubjectCategories page
    When User create a new SubjectCategories as "MyCat987" and code as "34Cat"
    And Success message should be displayed

  Scenario: Create  a new my Subject
    Given User navigate to Subjects page
    Then User create a new Subjects name as "Biologi" and code as "Blg4" subject catagory name "MyCat987" and style index 1
    And Success message should be displayed

  Scenario: Create and delete My SubjectCat in the subject catagories
    Given User navigate to SubjectCategories page
    Then User delete the SubjectCategories "MyCat987"
    And Error message should be displayed