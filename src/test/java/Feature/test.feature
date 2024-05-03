Feature: Verify FLIPBOARD works properly


 Background:
   When Click On Login button
   And Enter Email in Email text field
   And Input The Password in Password field for log in
   And Click on Log in button for main

 @Release
 Scenario: Verify that CREATE A FLIP successfully
   #Given  Check CREATE A FLIP button is available
   When Click CREATE A FLIP button
   And Click text box and send some key
   Then Check next button
   When Click Next button


 @Release
   Scenario: Verify that Following  button work properly
   Given Show Following  button
   When Click Following button
   Then Check All  tab is work properly
   And Check  Videos  tab is work properly

  @Release
  Scenario: Verify that like button
    Given Check like button is available
    When Click like button


  @Release
  Scenario: Verify that a Comment  successfully
    Given Check Comment  button is available
    When Click Comment  button
    Then Check text box is available
    When Write something in  text box
    Then Check post button is available
    When Click post button


  @Release
  Scenario: Check Account page is available
    When Profile button is available
    Then Analytics  is available
    And Settings  is available
    And Dark mode  is available
    And Privacy policy  is available
    And Log out is available


  @Release
  Scenario: Verify that NOTIFICATIONS  button work properly
  Given Check NOTIFICATIONS  button is available
  When Click NOTIFICATIONS   button
  Then Social button  is available
  And Content button  is available
  When Click  Social button
  And Click  Content button
  Then Close button  is available
  When Click Close button

  @Release
  Scenario: Verify that Settings  button work properly
  Given Click Profile icon
  Then Check Settings option
  When Click Settings option
  Then Check Profile settings tab is available and click
  And Check  Social Settings  tab is available and click

#  @Release
#  Scenario: Verify that mobile app link work properly
#    Given Find Download with a QR Code button
#  Then Find Download on the App Store button
#  And Find GET IT ON Google Play button
#  When Click  GET IT ON Google Play button



  @Release
  Scenario: Verify that log out was successfully
  Given Click Profile icon
  Then Check Log out option
  When Click Log out option



  Scenario Outline:
    Examples:
      | value  |
      | mobile |
