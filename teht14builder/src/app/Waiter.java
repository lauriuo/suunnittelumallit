package app;

class Waiter {
    private BurgerBuilder bb;

    public void setBurgerBuilder(BurgerBuilder bb) {
        this.bb = bb;
    }
    public Object getBurger() {
        return bb.getBurger();
    }
    public void constructBurger() {
        bb.createNewBurgerProduct();
        bb.buildBread();
        bb.buildMeat();
        bb.buildSalad();
        bb.buildSauce();
    }
}