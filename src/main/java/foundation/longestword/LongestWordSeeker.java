/* ----------------------------------------------------------------------------
 * All rights reserved © 2018 Softtek.
 *  
 * This software contains information that is exclusive property of Softtek,
 * this information is considered confidential.
 * It is strictly forbidden the copy or spreading of any part of this document 
 * in any format, whether mechanic or electronic.
 * ----------------------------------------------------------------------------
 * File name: LongestWordSeeker.java
 * Original Author: Softtek
 * Creation Date: 17/05/2018
 * ----------------------------------------------------------------------------
 */

package foundation.longestword;

import java.util.Arrays;

/**
 * <code>LongestWordSeeker</code>.
 *
 * @author Salvador Gonzalez N
 * @version 1.0
 */
public class LongestWordSeeker {

  /**
   * Look for.
   * Given a string S and a set of words D, find the longest word in D that 
   * is a subsequence of S.
   * @param inputWord input word
   * @param dictionary dictionary
   * @return string
   */
  public String lookFor(String inputWord, String[] dictionary) {

    Arrays.sort(dictionary);
    
    for(int index=dictionary.length-1 ; index>0; index--) {
      if(isTheWordASubsequence(inputWord, dictionary[index]))
        return dictionary[index];
    }
    
    return null;
  }
  
  /**
   * Verify if the input word is a subsequence from a dictionaries word
   *
   * @param inputWord input word
   * @param dictionaryWord dictionary word
   * @return true, in case the condition is satisfied subsequence of
   */
  private boolean isTheWordASubsequence(String inputWord, 
      String dictionaryWord) {
    
    int index = 0;
    int offset = 0;
    
    for(char character : dictionaryWord.toCharArray()) {
      offset = inputWord.indexOf(character, index);
      
      if(offset >= index)
        index = offset;
      else
        return false;
    }
    
    return true;
  }
}
