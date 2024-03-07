package Patterns.StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class FormattingFactory {
    private Map<String, TextFormatting> formattingMap = new HashMap<>();

    public TextFormatting getFormatting(String font, int size, String color) {
        String key = font + size + color;
        TextFormatting formatting = formattingMap.get(key);
        if (Objects.isNull(formatting)) {
            formatting = new TextFormatting(font, size, color);
            formattingMap.put(key, formatting);
        }
        return formatting;
    }
}
