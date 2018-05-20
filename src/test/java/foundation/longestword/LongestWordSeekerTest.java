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
 * File name: LongestWordSeekerTest.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: 18/05/2018
 * ----------------------------------------------------------------------------
 */

package foundation.longestword;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * <code>LongestWordSeekerTest</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class LongestWordSeekerTest {

  /** word seeker. */
  private LongestWordSeeker wordSeeker = new LongestWordSeeker(); 
  private LongestWordSeeker2 wordSeeker2 = new LongestWordSeeker2();
  
  /**
   * Should find the longest word in dictionary.
   */
  @Test
  public void shouldFindTheLongestWordInDictionary() {

    String inputWord = "abppplee";
    String[] dictionary =
      new String[] {"able", "ale", "apple", "bale", "kangaroo"
        ,"axxxxxxxxxxxxxx" , "bddddddddddddddd", "cccccccccccccccccc"
        ,"hxxxxxxxxxxxxxx" , "gbddddddddddddddd", "xccccccccccccccccc"};

    assertEquals("apple", wordSeeker.lookFor(inputWord, dictionary));
  }
  
  /**
   * Should find the longest word in dictionary.
   */
  @Test
  public void shouldFindTheLongestWordInDictionary2() {

    String inputWord = "abppplee";
    String[] dictionary =
      new String[] {"able", "ale", "apple", "bale", "kangaroo"
        ,"axxxxxxxxxxxxxx" , "bddddddddddddddd", "cccccccccccccccccc"
        ,"hxxxxxxxxxxxxxx" , "gbddddddddddddddd", "xccccccccccccccccc"};

    assertEquals("apple", wordSeeker2.lookFor(inputWord, dictionary));
  }
  
  
  /**
   * Should find one word at the end.
   */
  @Test 
  public void shouldFindOneWordAtTheEnd() {
    
    String inputWord = "bxxxxxxxe";
    String[] dictionary =
      new String[] {"able", "be", "ale", "apple", "bale", "kangaroo"};
        
    assertEquals("be", wordSeeker.lookFor(inputWord, dictionary));
  }
  
  /**
   * Should not find word into the dictionary.
   */
  @Test 
  public void shouldNotFindWordIntoTheDictionary() {
    String inputWord = "xxxxx";
    String[] dictionary =
      new String[] {"able", "ale", "apple", "bale", "kangaroo"};

    assertNull(wordSeeker.lookFor(inputWord, dictionary));
  }
}
