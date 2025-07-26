//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pizza pz = new Pizza(false);
        pz.addExtraCheese();
        pz.addExtraToppings();
        pz.takeAway();
    pz.printBill();
    

    DeluxePizza dp = new DeluxePizza(true);
    dp.takeAway();
    dp.printBill();
    }
}