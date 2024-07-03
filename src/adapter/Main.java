package adapter;

public class Main {
    public static void main(String[] args) {
        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.methodA();
    }
}
