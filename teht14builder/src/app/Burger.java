package app;

public class Burger {
    private String salad = "";
    private String sauce = "";
    private String bread = "";
    private String meat = "";

    /**
     * @param bread the bread to set
     */
    public void setBread(String bread) {
        this.bread = bread;
    }
    /**
     * @param meat the meat to set
     */
    public void setMeat(String meat) {
        this.meat = meat;
    }
    /**
     * @param salad the salad to set
     */
    public void setSalad(String salad) {
        this.salad = salad;
    }
    /**
     * @param sauce the sauce to set
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    /**
     * @return the bread
     */
    public String getBread() {
        return bread;
    }
    /**
     * @return the meat
     */
    public String getMeat() {
        return meat;
    }
    /**
     * @return the salad
     */
    public String getSalad() {
        return salad;
    }
    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }
    
}