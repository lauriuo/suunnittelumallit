package app;

interface PokemonType {
    void evolve(Pokemon p);
    String[] getAbilities(Pokemon p);
    void accept(PokemonVisitor pv);
}