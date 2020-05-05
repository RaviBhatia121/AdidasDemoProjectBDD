Feature: Buy Sony laptop 

Scenario: Add Sony and Dell laptop into the cart and delet dell and buy sony 
	Given I open demo blaze website 
	When I validate title and URL
	Then I add sony laptop and do the add to cart
	And I click on the confirmation alert
	And go to homepage
	And I add dell laptop and do the add to cart
	And I click on the confirmation alert
	And I click on place order
	And I remove dell laptop
	And I fill the form
	And I click on purchase
	And I Confirm purchase
	And I verify Log purchase ID and amount
	And I commplete the purchase
	And I Click on OK
	And  Close all open browsers
	
