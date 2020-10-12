import java.util.Scanner;
/**
 * Finds a specific number from the numbers that the user put
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input 10 different integers
    System.out.println("Please enter in 10 integers to put into the array");

    // sets the amount of array
    int[] num = new int[10];
    
    for(int i = 0; i < num.length; i++){
      num[i] = input.nextInt();
    }

    System.out.println("Please enter a number to find");

    int sameNum = input.nextInt();

    for(int i = 0; i < num.length; i++){
      if(num[i] == sameNum){
        System.out.println(sameNum + " is located at index " + (i + 1));
      }
    }
  }
}
