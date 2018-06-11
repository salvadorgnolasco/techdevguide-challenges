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
 * File name: MaxSpan.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 10, 2018
 * ----------------------------------------------------------------------------
 */

package foundation.maxspan;

/**
 * <code>MaxSpan</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class MaxSpan {

  /**
   * Calculate max span.
   *
   * @param arrayNumbers
   *          array numbers
   * @return int
   */
  public int calculateMaxSpan(int[] arrayNumbers) {

    int span = 0;
    int tempSpan = 0;

    if (arrayNumbers.length == 0) {
      return 0;
    }

    for (int firstIndex = 0; firstIndex < arrayNumbers.length; firstIndex++) {
      for (int lastIndex =
          arrayNumbers.length - 1; lastIndex > firstIndex; lastIndex--) {

        if (arrayNumbers[firstIndex] == arrayNumbers[lastIndex]) {
          tempSpan = lastIndex - firstIndex;
          break;
        }
      }

      if (tempSpan > span) {
        span = tempSpan;
      }
    }

    return ++span;
  }

}
