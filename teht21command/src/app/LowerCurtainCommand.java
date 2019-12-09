package app;

/**
 * LowerCurtainCommand
 */
public class LowerCurtainCommand implements Command {
    private Curtain curtain;
    
    public LowerCurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }
    @Override
    public void execute() {
        curtain.lower();
    }
}