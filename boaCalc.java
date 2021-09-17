/* Bank of America Points Calculator
  1. Assign awards to points
  2. Create calcPoints method to return the cash reward
  3. Use two parameters for calcPoints: int points and String reward
  4. Use if statments and reward input to return the appropriate reward
*/

class boaCalc {
    private static double travelCredit = 2500;
    private static double giftCard = 3125;
    private static double money = 4166;
    private static double cash = 25;
  
    public static double calcPoints(double points, String type) {
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
  
    public static void main(String[] args) {
      System.out.println("Your reward is: $" + calcPoints(3666, "gift card"));
    }
  }