public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 200;
    private int extraToppingPrice = 300;
    private int takeAwayCost = 50;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;
    private int basePizzaPrice;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 600;
        }
        else{
            this.price = 750;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingPrice;
    }
    public void takeAway(){
        isTakeAway = true;
        this.price += takeAwayCost;
    }
    public void printBill(){
        String bill = "";
        bill += "Base pizza : " + basePizzaPrice +"\n";
        if(isExtraCheeseAdded){
            bill += "Extra cheese : " + extraCheesePrice +  "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings : " + extraToppingPrice + "\n";
        }
        if(isTakeAway){
            bill += "Package Cost : " + takeAwayCost + "\n";
        }
        bill += ""+ this.price;
        System.out.println(bill);
    }


}
