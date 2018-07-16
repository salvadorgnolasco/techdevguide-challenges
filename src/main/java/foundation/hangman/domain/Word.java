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

package foundation.hangman.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <code>Word</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class Word implements Comparable<Word> {

  /** The constant index. */
  private final Double index;

  /** The constant value. */
  private final String value;

  /**
   * Creates a new instance of word.
   *
   * @param value value
   */
  public Word(String value) {

    super();
    this.index = Double.valueOf(Math.random());
    this.value = value;
  }

  /**
   * Gets the index.
   *
   * @return index
   */
  public Double getIndex() {

    return index;
  }

  /**
   * Gets the value.
   *
   * @return value
   */
  public String getValue() {

    return value;
  }

  /* (non-Javadoc)
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  @Override
  public int compareTo(Word otherWord) {

    return this.index.compareTo(otherWord.getIndex());
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {

    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE); 
  }
  
}
