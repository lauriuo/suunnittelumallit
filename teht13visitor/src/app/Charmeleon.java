package app;

public class Charmeleon implements PokemonType {
    @Override
    public void evolve(Pokemon p) {
        p.setPt(new Charizard());
    }
    @Override
    public String[] getAbilities(Pokemon p) {
        String[] abilities = new String[2];
        abilities[0] = "tackle";
        abilities[1] = "fly";
        return abilities;
    }    
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}