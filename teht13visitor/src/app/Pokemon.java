package app;

public class Pokemon {
    private PokemonType pt;
    public PokemonType getPt() {
        return pt;
    }
    public void setPt(PokemonType pt) {
        this.pt = pt;
    }
    public Pokemon(PokemonType pt) {
        this.pt = pt;
    }
    public void accept(PokemonVisitor pv) {
        pt.accept(pv);
    }
    protected void evolve() {
        pt.evolve(this);
    }
    public void showAbilities() {
        System.out.println("Pokemons abilities:");
        for (String s : pt.getAbilities(this)) {
           System.out.println(s); 
        }
    }
}