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
 * File name: WithoutStringTest.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: 25/05/2018
 * ----------------------------------------------------------------------------
 */

package foundation.withoutstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * <code>WithoutStringTest</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class WithoutStringTest {

  /** string functions. */
  WithoutString stringFunctions = new WithoutString();

  /**
   * Should remove string snippet.
   */
  @Test
  public void shouldRemoveStringSnippet() {

    assertEquals("He there", stringFunctions.remove("Hello there", "llo"));
    assertEquals("Hllo thr", stringFunctions.remove("Hello there", "e"));
    assertEquals("Hello there", stringFunctions.remove("Hello there", "x"));
  }

}
