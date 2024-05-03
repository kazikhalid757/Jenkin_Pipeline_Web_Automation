Feature: Verify FLIPBOARD works properly

  @Release
  Scenario: Check Home page  properly
    Given Check homepage is available on display


  @Release
  Scenario: Check the signup  button work properly
    Given Check signup is available on display
    When  Click on  singup button
    Then Show the signup information page is available in Display
    When Enter Email in email field
    And Enter name in name text field
    And Input The Password in Password field
    And Click on Continue  button



  @Release
  Scenario: Check Newsletters page properly
    Given Check Newsletters page properly
    When Click on Newsletters  button
    Then Check Email box  and Subscribe button  is available
    When Click checkbox
    When Enter mail
    And Click Subscribe button

  @Release
  Scenario: Verify that Search bar is visible and work
    Given Check Search bar is available in display
    When Click on Search bar and Search some think
  @Release
  Scenario: Verify that like button
    Given Check like button is available
    When Click like button


  @Release
  Scenario: Verify  Share Button
  Given Check Share button is available
  When Click Share button
  Then Check Share page is show in display
  And Share on Facebook option is available
  And hare on Twitter option is available
  And Check Cancel button is available
  When Click Cancel button


  @Release
  Scenario: Verify  Home page news category
  Then Check NEWS tab available
  And Check ENTERTAINMENT tab available
  And Check TECHNOLOGY tab available
  And Check TRAVEL tab available
  And Check FOOD tab available
  And Check SPORTS tab available
  And Check FLIPBOARD TV tab available
