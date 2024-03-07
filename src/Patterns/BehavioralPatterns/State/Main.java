package Patterns.BehavioralPatterns.State;

/**
 * State - позволяет объекту изменять свое поведение в зависимости от своего состояния.
 * Это достигается путем переключения между различными объектами-состояниями,
 * каждый из которых инкапсулирует конкретное поведение.
 * Извне создаётся впечатление, что изменился класс объекта.
 */

public class Main {
    public static void main(String[] args) {
        DrinkMachine machine = new DrinkMachine();

        machine.selectDrink();
        machine.dispenseDrink();

        machine.dispenseDrink();
    }
}
