import java.io.Console;
public class CodingPractice {
  public static void main(String[] args) {
    Console console = System.console();

    Integer totalHours = 0;
    String daysArray[] = {"today", "yesterday", "the day before yesterday"};
    for ( String day : daysArray){
      System.out.println("How many hours did you spend coding " + day + "?");
      String hoursString = console.readLine();
      Integer hours = Integer.parseInt(hoursString);
      totalHours += hours;
    }
    System.out.println("In the past three days, you have been coding a total of: " + totalHours + " hours");
    if (totalHours < 3) {
      System.out.println("Don't be a slacker! You should code more each day.");
    } else {
      System.out.println("Great! You are on track to be a good programmer.");

    }
  }
}
