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
 * File name: StringSplosion.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 10, 2018
 * ----------------------------------------------------------------------------
 */

package foundation.stringsplosion;

/**
 * <code>StringSplosion</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class StringSplosion {

  /**
   * Expand.
   *
   * @param word word to expand
   * @return string
   */
  public String expand(String word) {

    StringBuilder buildWord = new StringBuilder();

    for (int i = 0; i < word.length() - 1; i++) {
      buildWord.append(word.charAt(i)).append(word.substring(0, i + 1));
    }

    buildWord.append(word.charAt(word.length() - 1));
    return buildWord.toString();
  }

}
