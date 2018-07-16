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

import foundation.hangman.domain.Word;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeSet;

/**
 * <code>HangmanLexicon</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class HangmanLexicon {

  /** The constant wordSet. */
  private final TreeSet<Word> wordSet = new TreeSet<>();

  /**
   * Creates a new instance of hangman lexicon.
   */
  public HangmanLexicon() {

    readWords();
  }

  /**
   * Checks for next.
   *
   * @return true, if the condition is satisfied.
   */
  public final boolean hasNext() {

    return wordSet.isEmpty();
  }

  /**
   * Read words.
   */
  private void readWords() {

    Path path = Paths.get("src/main/resources/HangmanLexicon.txt");
    List<String> lines = null;

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException("There was a problem reading the hangman dictionary");
    }

    for (String line : lines) {
      wordSet.add(new Word(line));
    }
  }

  /**
   * Gets the word.
   *
   * @return word
   */
  public final String getWord() {

    if (wordSet.isEmpty()) {
      throw new RuntimeException("The word set is empty");
    }

    Word word = wordSet.pollFirst();
    return word.getValue();
  }

  @Override
  public final String toString() {

    return "HangmanLexicon [wordSet=" + wordSet + "]";
  }
}
