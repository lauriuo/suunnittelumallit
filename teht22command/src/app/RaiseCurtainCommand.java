package app;

/**
 * LowerCurtainCommand
 */
public class RaiseCurtainCommand implements Command {
    private Curtain curtain;
    
    public RaiseCurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }
    @Override
    public void execute() {
        curtain.raise();
    }
}