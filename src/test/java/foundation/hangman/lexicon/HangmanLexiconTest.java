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

package foundation.hangman.lexicon;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <code>HangmanLexiconTest</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class HangmanLexiconTest {

  /**
   * Should generate word.
   */
  @Test
  public void shouldGenerateWord() {

    HangmanLexicon lexicon = new HangmanLexicon();
    assertFalse(lexicon.hasNext());

    while (lexicon.hasNext()) {
      String word = lexicon.getWord();
      assertTrue(!word.isEmpty());
    }
  }
  
  /**
   * Should get one word.
   */
  @Test
  public void shouldGetOneWord() {
    HangmanLexicon lexicon = new HangmanLexicon();
    System.out.println(lexicon.getWord());
  }
}
