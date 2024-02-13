package proxy;

/**
 * real object that proxy will represent
 *
 * @author Mallika Dey
 */
public class RealSubject implements Subject {
    @Override
    public void drawImage() {
        System.out.println("Real subject image");
    }
}
