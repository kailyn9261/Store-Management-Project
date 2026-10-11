public class Bread extends BakeryItem{
  private boolean isGlutenFree;   // Whether or not the bread is gluten free

  // no argument constructor
  public Bread() {
    super("Pumpkin", 1.00, 1);
    isGlutenFree = false;
  }

  /* 
  parameterized constructor 
  (flavor, price, amount, isGlutenFree)
  */
  public Bread(String flavor, double price, int amount, boolean isGlutenFree) {
    super(flavor, price, amount);
    this.isGlutenFree = isGlutenFree;
  }

  /* 
  parameterized constructor 
  (flavor, price, amount)
  */
  public Bread(String flavor, double price, int amount) {
    super(flavor, price, amount);
    isGlutenFree = false;
  }

  public boolean getIsGlutenFree() {  // get whether the bread is gluten free
    return isGlutenFree;
  }

  public void setIsGlutenFree(boolean newIsGlutenFree) {  // set new value to isGlutenFree
    isGlutenFree = newIsGlutenFree;
  }

  /* 
  toString method returns:
  flavor, price, amount, and if its has gluten
  */
  public String toString() {
  return super.toString() + "\nGluten Free?: " + isGlutenFree;
}
  
}