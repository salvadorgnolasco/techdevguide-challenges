/* ----------------------------------------------------------------------------
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * ----------------------------------------------------------------------------
 * File name: CanBalanceTest.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 27, 2018
 * ----------------------------------------------------------------------------
 */

package foundation.canBalance;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * <code>CanBalanceTest</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class CanBalanceTest {

  /** balancer. */
  CanBalance balancer = new CanBalance();

  /**
   * Should balance an array.
   */
  @Test
  public void shouldBalanceAnArray() {

    List<Integer> input = Arrays.asList(1, 1, 1, 2, 1);

    assertTrue(balancer.canBalance(input));
  }
}
