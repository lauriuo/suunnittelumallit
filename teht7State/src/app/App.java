package app;

public class App {
    public static void main(String[] args) throws Exception {
        Pokemon p = new Pokemon(new Charmander());
        BonusVisitor bv = new BonusVisitor();
        p.showAbilities();
        p.accept(bv);
        p.evolve();
        System.out.println("total: " + bv.getTotal());
        p.showAbilities();
        p.accept(bv);
        p.evolve();
        System.out.println("total: " + bv.getTotal());
        p.showAbilities();
        p.accept(bv);
        p.evolve();       
        System.out.println("total: " + bv.getTotal());
    }
}