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

package foundation.hangman.game;

import foundation.hangman.lexicon.HangmanLexicon;

/**
 * <code>Hangman</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class Hangman {

  /** La constante MAX_TRIES. */
  private static final int MAX_TRIES = 6;

  /** lexicon. */
  private HangmanLexicon lexicon = null;

  /** word in game. */
  private String wordInGame = null;

  /** hints. */
  private String[] hints;

  /** failures. */
  private int failures = 0;
  
  /** solved. */
  private boolean solved = false;

  /**
   * Creates a new instance of hangman.
   */
  public Hangman() {

    this.lexicon = new HangmanLexicon();
    setUpNewWord();
  }
  
  /**
   * Verify if that solved is true.
   *
   * @return true, in case the condition is satisfied solved
   */
  public boolean isSolved() {
    return solved;
  }

  /**
   * Gets the hints.
   *
   * @return hints
   */
  public String[] getHints() {

    return hints;
  }
  
  /**
   * Creates a new game.
   */
  public void createNewGame() {
    setUpNewWord();
  }

  /**
   * Set up new word.
   */
  private void setUpNewWord() {

    if (!lexicon.hasNext()) {
      this.lexicon = new HangmanLexicon();
    }

    wordInGame = lexicon.getWord();
    hints = new String[wordInGame.length()];
    failures = 0;
    solved = false;

    for (int index = 0; index < wordInGame.length(); index++) {
      hints[index] = "_";
    }
  }

  /**
   * Try char.
   *
   * @param character character
   * @return true, if the condition is satisfied.
   */
  public boolean tryChar(char character) {

    if (!setCharacter(character)) {
      if (++this.failures == MAX_TRIES) {
        throw new RuntimeException(
          "The game has finished, no more attempts are allowed, the word was " + wordInGame);
      }
      return false;
    }
    
    verifyWord();
    return true;
  }
  
  private void verifyWord() {
    for (int index = 0; index < wordInGame.length(); index++) {
      if("_".equals(hints[index])) {
        return;
      }
    }
    
    this.solved = true;
  }

  /**
   * Sets the character.
   *
   * @param character character
   * @return true, if the condition is satisfied.
   */
  private boolean setCharacter(char character) {

    boolean isCharacterAcepted = false;

    if (!Character.isAlphabetic(character)) {
      throw new RuntimeException("Character not allowed, it must be an alphabetic character");
    }

    for (int index = 0; index < wordInGame.length(); index++) {
      if (wordInGame.charAt(index) == character) {
        hints[index] = String.valueOf(character);
        isCharacterAcepted = true;
      }
    }

    return isCharacterAcepted;
  }
}
