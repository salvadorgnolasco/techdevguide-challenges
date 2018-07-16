
package foundation.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import foundation.hangman.game.Hangman;

public class HangmanStarter {

  public static void main(String[] args) {

    Hangman hangman = new Hangman();

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    while (!hangman.isSolved()) {
      String character = null;
      try {
        displayHints(hangman.getHints());
        System.out.print("Enter a character: ");
        character = br.readLine();
      } catch (IOException e) {
      }
      
      hangman.tryChar(character.charAt(0));
      
    }
    
    displayHints(hangman.getHints());
    System.out.println("\n=== Game solved ===");
    
  }
  
  public static void displayHints(String[] hints) {
    System.out.println();
    for(String character : hints) {
      System.out.print(character + " ");
    }
    System.out.println();
  }
}
