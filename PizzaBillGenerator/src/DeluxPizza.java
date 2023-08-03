public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }
//These over ride method why we are adding na customer can't add any other topping and cheese because its already added
    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraTopping() {}
}
//Delux mean already added the cheese and Topping are added