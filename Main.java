import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("input.txt");  // this is your problem input as a File object
    Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object


    int answer = 0;
    int dial = 50;
    while (sc.hasNext())  // as long as the Scanner has more lines to read from the file...
    {
      String line = sc.nextLine();  // gets the next line of input.  This is like "R802"

      // TODO: Write code that gets the turning direction from the line.  This should be "L" or "R"
      char direction = line.charAt(0);
      

      // TODO: Write code that gets a substring of the line that contains only the numbers
      // For R802, this would be a String variable with the value "802"
      int amount = Integer.parseInt(line.substring(1));

      // TODO: Using the parseInt method from the Integer class, convert the String "802" into an int
      if (direction == 'L')
      {
        dial = (dial - amount) % 100;
      }
      else
      {
        dial = (dial + amount) % 100;
      }

      if (dial == 0)
      {
        answer++;
      }

      // TODO: Now that you have the turning direction, and the turning amount, see if the turn results in a 0


    }

    System.out.println("The password is " + answer);
    sc.close();
  }
}
