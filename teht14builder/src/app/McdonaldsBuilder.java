package app;

import java.util.ArrayList;
import java.util.List;

/**
 * HesburgerBuilder
 */
public class McdonaldsBuilder extends BurgerBuilder {
    private StringBuilder sb = new StringBuilder();
    @Override
    public void buildBread() {
        burger.setBread("garlic bread");
        sb.append(burger.getBread() + ", ");
    }
    @Override
    public void buildMeat() {
        burger.setMeat("beef");
        sb.append(burger.getMeat()+ ", ");
    }
    @Override
    public void buildSalad() {
        burger.setSalad("spinach");
        sb.append(burger.getSalad()+ ", ");
    }
    @Override
    public void buildSauce() {
        burger.setSauce("hot");
        sb.append(burger.getSauce());
    }
    @Override
    public StringBuilder getBurger() {
        return sb;
    }
    
}