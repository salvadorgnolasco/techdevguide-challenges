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
 * File name: WithoutString.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 10, 2018
 * ----------------------------------------------------------------------------
 */

package foundation.withoutstring;

/**
 * <code>WithoutString</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class WithoutString {

  /**
   * Remove.
   *
   * @param base base
   * @param remove remove
   * @return string
   */
  public String remove(String base, String remove) {

    return base.replaceAll(getRegExp(remove), "");
  }

  /**
   * Gets the reg exp.
   *
   * @param remove remove
   * @return reg exp
   */
  private String getRegExp(String remove) {

    StringBuilder regExp = new StringBuilder();

    for (Character caracter : remove.toCharArray()) {
      regExp.append("[").append(Character.toLowerCase(caracter))
        .append(Character.toUpperCase(caracter)).append("]");
    }

    return regExp.toString();
  }

}
