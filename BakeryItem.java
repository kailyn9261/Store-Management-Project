public class BakeryItem {
  private String flavor; // flavor of bakery item
  private double price;  // price of bakery item
  private int amount;    // how much of that item

  // no argument constructor
  public BakeryItem() {
    flavor = "Sugar";
    price = 0.50;
    amount = 1;
  }

   /* 
   parameterized constructor
   (flavor, price)
   */
  public BakeryItem(String flavor, double price) {
    this.flavor = flavor;
    this.price = price;
    amount = 1;
  }

  /* 
  parameterized constructor 
  (flavor, price, amount)
  */
  public BakeryItem(String flavor, double price, int amount) {
    this.flavor = flavor;
    this.price = price;
    this.amount = amount;
  }


  public double getPrice() {    // get the price of the item
    return price;
  }

   public String getFlavor() {  // get the flavor of the item
    return flavor;
  }

  public int getAmount() {      // get the amount of the item
    return amount;
  }

   public void setFlavor(String newFlavor) {  // set new value to flavor
    flavor = newFlavor;
  }
  
  public void setPrice(double newPrice) {     // set new value to price
    price = newPrice;
  }

  public void setAmount(int newAmount) {      // set new value to amount
    amount = newAmount;
  }

  /* 
  toString method returns:
  flavor, price, and amount
  */
  public String toString() { 
    return flavor + " - Price: $" + price + " - " + "Amount: " + amount + "";
  }
  
}