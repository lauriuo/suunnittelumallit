package app;

public class Charmander implements PokemonType {
    public Charmander() {
    }
    @Override
    public void evolve(Pokemon p) {
        p.setPt(new Charmeleon());
    };
    @Override
    public String[] getAbilities(Pokemon p) {
        String[] abilities = new String[1];
        abilities[0] = "tackle";
        return abilities;
    }
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}