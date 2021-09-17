/* Bank of America Points Calculator
  1. Assign awards to points
  2. Create calcPoints method to return the cash reward
  3. Use two parameters for calcPoints: int points and String reward
  4. Use if statments and reward input to return the appropriate reward
*/

import java.util.Scanner;

class boaCalc {
    private static double travelCredit = 2500;
    private static double giftCard = 3125;
    private static double money = 4166;
    private static double cash = 25;

    private static double points = 0;
    private static String type = "";
  
    public static double calcPoints(double points, String type) {
      //TODO Fix logic to return correct reward
      double reward = 0;
      if (type == "travel") {
        reward = (points/travelCredit) * cash;
      } else if (type == "gift card") {
        reward = (points/giftCard) * cash;
      } else if (type == "cash") {
        reward = (points/money) * cash;
      }
      return reward;
    }

    public static void collectInput() {
      Scanner pointInput = new Scanner(System.in);
      System.out.println("Enter your amount of redeemable points: ");
      points = pointInput.nextDouble();

      Scanner typeInput = new Scanner(System.in);
      System.out.println("Enter the type of award you want to receive: ");
      type = typeInput.nextLine();

      System.out.println("Your redeemable points: " + points);
      System.out.println("Your type of reward: " + type);
    }
  
    public static void main(String[] args) {
      // Collect points and type of award from user
      collectInput();
    
      System.out.println("Hang on, calculating your reward..");
      System.out.println("Your reward is: $" + calcPoints(points, type));
    }
  }