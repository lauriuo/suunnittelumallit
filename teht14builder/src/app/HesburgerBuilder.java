package app;

import java.util.ArrayList;
import java.util.List;

/**
 * HesburgerBuilder
 */
public class HesburgerBuilder extends BurgerBuilder {
    private ArrayList<String> al = new ArrayList<>();

    @Override
    public void buildBread() {
        burger.setBread("rye bread");
        al.add(burger.getBread());
    }
    @Override
    public void buildMeat() {
        burger.setMeat("raw meat");
        al.add(burger.getMeat());
    }
    @Override
    public void buildSalad() {
        burger.setSalad("lettuce");
        al.add(burger.getSalad());
    }
    @Override
    public void buildSauce() {
        burger.setSauce("mild");
        al.add(burger.getSauce());
    }
    @Override
    public Object getBurger() {
        return al;
    }
    
}