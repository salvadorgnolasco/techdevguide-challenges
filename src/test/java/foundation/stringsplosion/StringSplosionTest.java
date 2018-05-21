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
 * File name: StringSplosionTest.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: 21/05/2018
 * ----------------------------------------------------------------------------
 */

package foundation.stringsplosion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * <code>StringSplosionTest</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class StringSplosionTest {

  /** string splosion. */
  StringSplosion stringSplosion = new StringSplosion();

  /**
   * Should expand word.
   */
  @Test
  public void shouldExpandWord() {

    assertEquals("CCoCodCode", stringSplosion.expand("Code"));
    assertEquals("aababc", stringSplosion.expand("abc"));
    assertEquals("aab", stringSplosion.expand("ab"));
  }

}
