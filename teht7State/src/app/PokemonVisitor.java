package app;

interface PokemonVisitor {
    void visit(Charmander c);
    void visit(Charmeleon c);
    void visit(Charizard c);
}