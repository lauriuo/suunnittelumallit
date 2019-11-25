package app;

public class Charizard implements PokemonType {
    @Override
    public void evolve(Pokemon p) {
    };
    @Override
    public String[] getAbilities(Pokemon p) {
        String[] abilities = new String[3];
        abilities[0] = "tackle";
        abilities[1] = "fly";
        abilities[2] = "flamethrower";
        return abilities;
    }
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}