package io.github.smithyvl.interview.lesson1.sample;

/**
 * Класс для запуска тестовых программ из метода main.
 *
 * @author Владислав Кузнецов.
 */
public class Question2 {
    /**
     * Метод запуска программы на Java.
     */
    public static void main(String[] args) {
        var human = new Creature();
        human.move(3, 5);
        human.move(1, -2);
    }
}