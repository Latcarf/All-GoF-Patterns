package Patterns.StructuralPatterns.Flyweight;

public class TextFormatting {
    private String font;
    private int size;
    private String color;

    public TextFormatting(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public String getFont() { return font; }
    public int getSize() { return size; }
    public String getColor() { return color; }
}