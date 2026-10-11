public class Muffin extends BakeryItem{
  private boolean hasNuts;   // Whether or not muffin has nuts

  // no argument constructor
  public Muffin() {
    this("sugar", 0.50, 1, false);
  }

/* 
  parameterized constructor 
  (flavor, price, amount, hasNuts)
  */
public Muffin(String flavor, double price, int amount, boolean hasNuts) {
  super(flavor, price, amount);
  this.hasNuts = hasNuts;
}

  /* 
  parameterized constructor 
  (flavor, price, amount)
  */
  public Muffin(String flavor, double price, int amount) {
    super(flavor, price, amount);
    hasNuts = false;
  }

  public boolean getHasNuts() {  // get whether muffin has nuts
    return hasNuts;
  }

  public void setHasNuts(boolean newHasNuts) {  // set new value for hasNuts
    hasNuts = newHasNuts;
  }

  /* 
  toString method returns:
  flavor, price, amount, and if its has nuts
  */
  public String toString() { 
    return super.toString() + "\nHas Nuts?: " + hasNuts;
  }
  
}