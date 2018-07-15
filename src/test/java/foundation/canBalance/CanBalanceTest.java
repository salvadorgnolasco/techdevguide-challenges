/* ------------------------------------------------------------------------------------------------
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
 * ------------------------------------------------------------------------------------------------
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jul 8, 2018
 * ------------------------------------------------------------------------------------------------
 */

package foundation.canBalance;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    assertTrue(balancer.canBalance(new int[] {1, 1, 1, 2, 1}));
    assertFalse(balancer.canBalance(new int[] {2, 1, 1, 2, 1}));
    assertTrue(balancer.canBalance(new int[] {10, 10}));
    assertFalse(balancer.canBalance(new int[] {11, 10}));
    assertFalse(balancer.canBalance(new int[] {7, 13}));
    assertFalse(balancer.canBalance(new int[] {2, 1, 1, 1, 4}));

  }
}
