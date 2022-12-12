Feature: WhenDo
  Scenario: Create Task

    Given jose have access to WhenDo app
    When he creates a new task
      | title | JBGroup        |
      | note  | this is a note |
    Then he expected the task "JBGroup" should be created
    
  Scenario: Create Task

    Given jose have access to WhenDo app
    When he creates a new task
      | title | JBGroup        |
      | note  | this is a note |
    Then he expected the task "JBGroup" should be created