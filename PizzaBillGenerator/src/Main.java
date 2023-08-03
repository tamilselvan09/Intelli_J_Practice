public class Main {
    public static void main(String[] args) {
       Pizza basePizza = new Pizza(false);
//      basePizza.addExtraTopping();
//      basePizza.addExtraCheese();
//      basePizza.takeAway();
//      basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.addExtraCheese();
        dp.addExtraTopping();
        dp.getBill();
        dp.takeAway();

        //getbill is the final one so dont wright anything after bill method
    }
}