package Patterns.StructuralPatterns.Flyweight;

class Character {
    private char letter;
    private TextFormatting formatting;

    public Character(char letter, TextFormatting formatting) {
        this.letter = letter;
        this.formatting = formatting;
    }

    public void print() {
        System.out.println("Letter: " + letter + " Font: " + formatting.getFont() +
                " Size: " + formatting.getSize() + " Color: " + formatting.getColor());
    }
}
