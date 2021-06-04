Feature: Register
  I as a web user
  I want to register in advantage
  To be able to buy a product

  Scenario Outline: Register
    Given enter the page to register
    When full all the formulary
        #direct the form
    | firstName   | email   | lastName   | phoneNumber   | address  | city   | state   | postalCode | userName | password | confirmPassword |
    | <firstName> | <email> | <lastName> | <phoneNumber> | <address>| <city> | <state> |<postalCode>|<userName>|<password>|<confirmPassword>|
    Then you should to see your username in the portal
    | firstName   |
    | <firstName> |
    Examples:
    | firstName | email            | lastName    | phoneNumber | address        | city       | state    | postalCode | userName         | password    | confirmPassword |
    | Andrea   | andrea@gmail.com | Control123* | 5555555555  |94818 Ward Green | Ronnyhaven | bilzen   | 74171-5010 |  andrea@gmail.com| Control123* | Control123*     |
    | Andres   | andres@gmail.com | Control123* | 9999999999  |94583 Ward Red   | Washinton  | New York | 74171-5010 |  andres@gmail.com| Control123* | Control123*     |

