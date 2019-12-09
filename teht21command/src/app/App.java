package app;

public class App {
    public static void main(String[] args) throws Exception {
        Curtain curtain = new Curtain(true);
        WallButton lower = new WallButton(new LowerCurtainCommand(curtain));
        WallButton raise = new WallButton(new RaiseCurtainCommand(curtain));
        lower.push();
        raise.push();
        raise.push(); //does nothing
        lower.push();
    }
}