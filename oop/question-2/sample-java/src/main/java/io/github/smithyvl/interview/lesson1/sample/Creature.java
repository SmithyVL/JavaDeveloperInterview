package io.github.smithyvl.interview.lesson1.sample;

/**
 * Создание класса для представления любого живого существа.
 *
 * @author Владислав Кузнецов.
 */
public class Creature {
    /**
     * Закрытое поле для доступа извне - расположение существа по оси X с начальным состоянием.
     */
    private int locationX = 0;

    /**
     * Закрытое поле для доступа извне - расположение существа по оси Y с начальным состоянием.
     */
    private int locationY = 0;

    /**
     * Открытый метод "интерфейса" класса "Существо" - перемещение.
     *
     * @param distanceX перемещение на число по оси X.
     * @param distanceY перемещение на число по оси Y.
     */
    public void move(int distanceX, int distanceY) {
        System.out.printf("Creature from { x = %d, y = %d } move start: %n", locationX, locationY);
        System.out.printf("Step by x = %d, y = %d %n", distanceX, distanceY);
        locationX += distanceX;
        locationY += distanceY;
        System.out.printf("Creature move into { x = %d, y = %d } end!%n", locationY, locationY);
    }
}