package proxy;

/**
 * maintain reference & will load the real subject when necessary
 *
 * @author Mallika Dey
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    @Override
    public void drawImage() {
        if (realSubject == null) realSubject = new RealSubject();
        realSubject.drawImage();
    }
}
