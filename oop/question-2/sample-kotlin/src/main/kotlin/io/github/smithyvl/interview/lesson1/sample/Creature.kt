package io.github.smithyvl.interview.lesson1.sample

/**
 * Создание класса для представления любого живого существа.
 *
 * @author Владислав Кузнецов.
 */
class Creature(
    /**
     * Закрытое поле для доступа извне - расположение существа по оси X с начальным состоянием.
     */
    private var locationX: Int = 0,

    /**
     * Закрытое поле для доступа извне - расположение существа по оси Y с начальным состоянием.
     */
    private var locationY: Int = 0
) {
    /**
     * Открытый метод "интерфейса" класса "Существо" - перемещение.
     *
     * @param distanceX перемещение на число по оси X.
     * @param distanceY перемещение на число по оси Y.
     */
    fun move(distanceX: Int, distanceY: Int) {
        println("Creature from { x = $locationX, y = $locationY } move start:")
        println("Step by x = $distanceX, y = $distanceY")
        locationX += distanceX
        locationY += distanceY
        println("Creature move into { x = $locationX, y = $locationY } end!")
    }
}