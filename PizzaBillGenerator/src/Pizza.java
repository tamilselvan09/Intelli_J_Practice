public class Pizza {
    private Integer price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private  int backPackPrice = 20;
    private  int basePizzaPrice ;
    private  boolean isExtraCheeseAdded = false;
    private  boolean isExtraToppingsAdded = false;
    private  boolean isTakeAway = false;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price =400;
        }
        basePizzaPrice = this.price;
    }
   public void addExtraCheese(){
        isExtraCheeseAdded = true;
      //  System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
   }

    public void addExtraTopping(){
        isExtraToppingsAdded = true;
      //  System.out.println("Extra toppings Added");
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        isTakeAway = true;
    //   System.out.println("Take Away ");
        this.price += backPackPrice;
    }

    public void getBill(){
        String bill ="";
       System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill +="Extra cheese added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded) {
            bill +="Extra Toppings added: "+extraToppingsPrice+ "\n";
        }
        if(isTakeAway) {
            bill +="Take away: "+backPackPrice+ "\n";
        }
        bill +="Bill: "+this.price + "\n";
        System.out.println(bill);
    }

}

/*
base pizza(veg) : 300
          (non) : 400
Toppings   : 150
cheese     : 100
Take Away  : 20
 */