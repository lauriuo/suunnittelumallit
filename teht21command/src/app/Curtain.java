package app;

/**
 * Curtain
 */
public class Curtain {
    boolean up;
    public Curtain(boolean up) {
        this.up = up;
    }
    public void lower() {
        if (up) {
            up = false;
            System.out.println("Curtain goes down");
        }
    }
    public void raise() {
        if (!up) {
            up = true;
            System.out.println("Curtain goes up");
        }
    }
}