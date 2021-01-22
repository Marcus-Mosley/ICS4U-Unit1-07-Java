import java.util.Scanner;

/**
* The Boards program implements an application that
* outputs the proper height for a board of specific
* length and width so that the resulting dimensions 
* give a volume of one board foot.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-22
*/
public class Boards {
  /**
  * The BoardFoot method returns the proper height.
  */
  public static double boardFoot(double length, double width) {
    double height = 144 / (length * width);
    return height;
    
  }

  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    double length = 0;
    double width = 0;
    double height = 0;

    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the board (in): ");
        length = input.nextDouble();
        if (length > 0) {
          break;
        } else {
          System.out.printf("That is not a valid input! \n");
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number! \n");
      }
    }
    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the board (in): ");
        width = input.nextDouble();
        if (width > 0) {
          break;
        } else {
          System.out.printf("That is not a valid input! \n");
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number! \n");
      }
    }

    height = boardFoot(length, width);
    System.out.printf("A height of %.2f inches will result ", height);
    System.out.printf("in a board that is exactly one board foot");
  }
}
