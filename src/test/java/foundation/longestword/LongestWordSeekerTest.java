/* ----------------------------------------------------------------------------
 * All rights reserved © 2018 Softtek.
 *  
 * This software contains information that is exclusive property of Softtek,
 * this information is considered confidential.
 * It is strictly forbidden the copy or spreading of any part of this document 
 * in any format, whether mechanic or electronic.
 * ---------------------------------------------------------------------------
 * File name: LongestWordSeekerTest.java
 * Original Author: Softtek
 * Creation Date: 17/05/2018
 * ---------------------------------------------------------------------------
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
  
  /**
   * Should find the longest word in dictionary. 
   */
  @Test
  public void shouldFindTheLongestWordInDictionary() {

    String inputWord = "abppplee";
    String[] dictionary =
      new String[] {"able", "ale", "apple", "bale", "kangaroo"};
        
    assertEquals("apple", wordSeeker.lookFor(inputWord, dictionary));
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
