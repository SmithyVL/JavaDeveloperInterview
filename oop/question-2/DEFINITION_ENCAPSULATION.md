<!--suppress ALL -->
Что такое "Инкапсуляция"?
========================
***

Инкапсуляция (сокрытие информации) – это свойство системы, позволяющее объединить данные и операции над ними в одном
классе или иерархии классов и сокрытие данных от внешнего вмешательства и злоупотреблений с помощью [**модификаторов
доступа**](#).

> Примером инкапсуляции может служить все что угодно. Возьмем некую "абстрактную" сущность "Существо" (Creature). Оно
> может выполнять различные действия, но остановимся только на передвижении (move). Когда существо перемещается, нам 
> не нужно знать какие процессы происходят или как меняется состояние внутри экземпляра класса "Существо" - мы просто
> видим как оно меняет свое местонахождение, перемещаясь из точки A в точку B.

**Основные особенности:**
1. Запрещение прямого доступа к полям экземпляра класса из других классов;
2. Взаимодействие с объектом только через его методы;
3. Обеспечение внутреннего поведения объектов для его повторного использования и надежности работы.

**Причины использования?**
1. Скрыть детали внутренней логики от программистов-клиентов класса;
2. Позволить разработчику класса изменить внутренние механизмы, не беспокоясь о том, как это отразится на 
программисте-клиенте.

<details>
  <summary><i>Источники</i></summary>
  <ul>
    <li>Хорстманн Кей - Java. Библиотека профессионала, том 1 - 2019;</li>
    <li>Герберт Шилдт. - Java. Полное руководство, 2018;</li>
    <li>Брюс Эккель - Философия Java, 2015;</li>
    <li>Сергей Немчинский - <a href="https://www.youtube.com/watch?v=EvGi6XDgV7w"><b>Youtube</b></a>.</li>
  </ul>
</details>

[![Обсуждение](../../docs/assets/other/discussions.png "Обсудить")](https://github.com/SmithyVL/JavaDeveloperInterview/discussions/2)

***
<div style="display: flex">
    <div style="width: 25%">
        <a href="../../oop/question-1/QUESTION1.md" style="text-decoration: none; color: mediumseagreen">
            <img alt="back" src="../../docs/assets/navigation/back.png"/>
            <span style="position: relative; top: -17px;">Что такое ООП?</span>
        </a>
    </div>
    <div align="center" style="width: 25%">
        <a href="../../README.md" style="text-decoration: none; color: mediumseagreen">
            <img alt="back" src="../../docs/assets/navigation/home.png"/>
            <span style="position: relative; top: -17px;">На главную</span>
        </a>
    </div>
    <div align="center" style="width: 25%">
        <a href="../OOP.md" style="text-decoration: none; color: mediumseagreen">
            <img alt="back" src="../../docs/assets/navigation/menu.png"/>
            <span style="position: relative; top: -17px;">В оглавление ООП</span>
        </a>
    </div>
    <div align="right" style="width: 25%">
        <a href="../../oop/question-3/QUESTION3.md" style="text-decoration: none; color: mediumseagreen">
            <span style="position: relative; top: -17px;">Что такое "Наследование"?</span>
            <img alt="back" src="../../docs/assets/navigation/forward.png"/>
        </a>
    </div>
</div>