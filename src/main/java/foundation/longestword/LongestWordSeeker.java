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
 * File name: LongestWordSeeker.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jun 10, 2018
 * ----------------------------------------------------------------------------
 */

package foundation.longestword;

import java.util.Arrays;

/**
 * <code>LongestWordSeeker</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class LongestWordSeeker {

  /**
   * Look for.
   *
   * @param inputWord input word
   * @param dictionary dictionary
   * @return string
   */
  public String lookFor(String inputWord, String[] dictionary) {

    Arrays.sort(dictionary);

    for (int index = dictionary.length - 1; index > 0; index--) {
      if (isTheWordASubsequence(inputWord, dictionary[index]))
        return dictionary[index];
    }

    return null;
  }

  /**
   * Verify if that the word A subsequence is true.
   *
   * @param inputWord input word
   * @param dictionaryWord dictionary word
   * @return true, in case the condition is satisfied the word A subsequence
   */
  private boolean isTheWordASubsequence(String inputWord,
    String dictionaryWord) {

    int spot = 0;
    int offset = 0;

    for (char item : dictionaryWord.toCharArray()) {
      spot = (offset = inputWord.indexOf(item, spot)) >= spot ? offset : -1;
      if (spot < 0)
        return false;
    }

    return true;
  }
}
