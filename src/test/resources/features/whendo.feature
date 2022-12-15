Feature: WhenDo
  @WhenDo
  Scenario: Create Task

    Given jose have access to WhenDo app
    When he creates a new task
      | title | JBGroup        |
      | note  | this is a note |
    Then he expected the task "JBGroup" should be created

  @WhenDoCU
  Scenario: Create and Edit Task
    Given Cesar have access to WhenDo app
    When he creates a new task
      | title | Taller Final        |
      | note  | this is a note for taller final|
    Then he expected the task "Taller Final" should be created
    And he edit the new task
      | title | Taller Final Update       |
      | note  | this is a note for taller final update|
    Then he expected the task "Taller Final Update" should be edited