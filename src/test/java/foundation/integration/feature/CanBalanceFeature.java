
package foundation.integration.feature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import foundation.canBalance.CanBalance;

public class CanBalanceFeature {

  private int[] arrayToTest;
  private Boolean result; 
  private CanBalance balancer = new CanBalance();

  @Given("^an array \"([^\"]*)\"$")
  public void anArray(String array) {
    List<Integer> numberList = 
        Arrays.asList(array.split(","))
              .stream()
              .map(s -> Integer.parseInt(s.trim()))
              .collect(Collectors.toList());
    arrayToTest = new int[numberList.size()];
    Stream
        .iterate(0, i-> i+1)
        .limit((long)numberList.size())
        .forEach(i -> arrayToTest[i] = numberList.get(i));
  }

  @When("^the balancer has been executed$")
  public void theBalancerHasBeenExecuted() {
    
    result = Boolean.valueOf(balancer.canBalance(arrayToTest));
  }

  @Then("^the balancer responses \"([^\"]*)\"$")
  public void theBalancerResponses(String canBalance) {

    assertEquals(result, Boolean.valueOf(canBalance));
  }
}
