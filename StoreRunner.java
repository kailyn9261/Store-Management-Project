import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object
    Scanner input = new Scanner(System.in);

  Muffin choc = new Muffin("Chocolate Chip Muffin", 0.50, 1, false);
    System.out.println(choc);

  Bread banana = new Bread("Banana Nut Bread", 1.00, 1, false);
    System.out.println(banana);

  Muffin order0 = new Muffin();
  Bread order1 = new Bread();

    System.out.print("Muffin or Bread?: ");
    String orderItem = input.nextLine();
    
    System.out.print("Enter the flavor: ");
    String orderFlavor = input.nextLine();

    System.out.print("Enter the amount: ");
    int orderAmount = input.nextInt();

    System.out.println("The item is " + orderItem + ". The flavor is "+ orderFlavor + " and the amount is " + orderAmount + ".");

    // Closes the Scanner object
    input.close();
    
  }
}