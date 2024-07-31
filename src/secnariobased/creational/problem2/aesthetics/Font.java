package secnariobased.creational.problem2.aesthetics;

public abstract class Font implements AestheticsElement {
    @Override
    public void aestheticsType() {
        System.out.println("font");
    }

    public abstract void fontType();
}
