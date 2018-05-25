/* ----------------------------------------------------------------------------
 * All rights reserved © 2018 Salvador Gonzalez N.
 *  
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
 * File name: MaxSpanTest.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: 25/05/2018
 * ----------------------------------------------------------------------------
 */

package foundation.maxspan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSpanTest {

  private MaxSpan span = new MaxSpan();

  /**
   * Should get max span within two values.
   */
  @Test
  public void shouldGetMaxSpanWithinTwoValues() {

    int[] firstArray = new int[] {1, 2, 1, 1, 3};
    int[] secondArray = new int[] {1, 4, 2, 1, 4, 1, 4};
    int[] thirdArray = new int[] {1, 4, 2, 1, 4, 4, 4};

    assertEquals(4, span.calculateMaxSpan(firstArray));
    assertEquals(6, span.calculateMaxSpan(secondArray));
    assertEquals(6, span.calculateMaxSpan(thirdArray));
  }
}
