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
 * File name: SumNumbersTest.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 10, 2018
 * ----------------------------------------------------------------------------
 */
package foundation.sumnumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * <code>SumNumbersTest</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class SumNumbersTest {

  /** sum numbers. */
  private SumNumbers sumNumbers;

  /**
   * Creates a new instance of sum numbers test.
   */
  public SumNumbersTest() {

    super();
    this.sumNumbers = new SumNumbers();
  }

  /**
   * Should sum numbers.
   */
  @Test
  public void shouldSumNumbers() {
    
    assertEquals(123,sumNumbers.addUpNumbersWithinString("abc123xyz"));
    assertEquals(44, sumNumbers.addUpNumbersWithinString("aa11b33"));
    assertEquals(18, sumNumbers.addUpNumbersWithinString("7 11"));
    assertEquals(0, sumNumbers.addUpNumbersWithinString("Chocolate"));
  }
}
