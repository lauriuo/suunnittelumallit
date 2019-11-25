package app;

abstract class BurgerBuilder {
    protected Burger burger;

    public void createNewBurgerProduct() {
        burger = new Burger();
    }
    public abstract void buildSauce();
    public abstract void buildBread();   
    public abstract void buildSalad();
    public abstract void buildMeat();
    public abstract Object getBurger();
}