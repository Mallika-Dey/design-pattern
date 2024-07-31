package secnariobased.creational.problem2.aesthetics;

public abstract class Aesthetics {
    private Color color;
    private Style style;
    private Font font;

    public Aesthetics(Color color, Style style, Font font) {
        this.color = color;
        this.style = style;
        this.font = font;
    }

    public Color getColor() {
        return color;
    }

    public Style getStyle() {
        return style;
    }

    public Font getFont() {
        return font;
    }
}
