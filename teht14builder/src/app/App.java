package app;

public class App {
    public static void main(String[] args) throws Exception {
        Waiter waiter = new Waiter();
        BurgerBuilder hesburger_builder = new
            HesburgerBuilder();
        BurgerBuilder mcdonalds_builder = new
            McdonaldsBuilder();
        
        waiter.setBurgerBuilder(hesburger_builder);
        waiter.constructBurger();

        Object hesburger = waiter.getBurger();
        System.out.println(hesburger.toString());

        waiter.setBurgerBuilder(mcdonalds_builder);
        waiter.constructBurger();

        Object mcdonalds = waiter.getBurger();
        System.out.println(mcdonalds.toString());
    }
}