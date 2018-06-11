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
 * File name: SumNumbers.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 10, 2018
 * ----------------------------------------------------------------------------
 */
package foundation.sumnumbers;

/**
 * <code>SumNumbers</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class SumNumbers {

  /**
   * Adds the up numbers within string.
   *
   * @param str str
   * @return long
   */
  public int addUpNumbersWithinString(String str) {
    int sum = 0;    
    String streamOfNumbers = str.replaceAll("[^0-9]", " ").replaceAll("[ ]+", " ").trim();
    
    if(streamOfNumbers.isEmpty())
      return sum;
    
    for(String stringNumber : streamOfNumbers.split(" ")) {
      sum += Integer.parseInt(stringNumber);
    }
    
    return sum;
  }
}
