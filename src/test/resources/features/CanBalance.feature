Feature: Determine if there's a place to split a non-empty array so that 
         the sums of the numbers on both sides equal each other.
         
Scenario: It can balance an array
	Given an array "1, 1, 1, 2, 1"
	When the balancer has been executed
	Then the balancer responses "true"
