package app;

public class BonusVisitor implements PokemonVisitor {
    int total = 0;

    public int getTotal() {
        return total;
    }
    @Override
    public void visit(Charmander c) {
        total += 1;
    }
    @Override
    public void visit(Charmeleon c) {
       total += 10;
    }
    @Override
    public void visit(Charizard c) {
       total += 100; 
    }
}