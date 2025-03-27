package ru.developer.job4j.array_second;

/**
 * Метод принимает двумерный массив объектов Place, в котором есть 2 поля:
 * 1. int row - ряд в кинотеатре;
 * 2. int cell - место в этом ряду.
 * Т.е. массив имитирует рассадку посетителей в кинотеатре. При этом если значение равно null - значит место свободно,
 * иначе - место зарезервировано.
 * При этом рассадить посетителей нужно так, чтобы рядом значения null могли быть только по диагонали.
 * Поясним на примере(X - занятое место, O - пустое место):
 *
 * 1 вариант
 * {X, O, X}
 * {O, X, O}   -   по такой схеме еще одного посетителя добавить нельзя.
 * {X, O, X}
 *
 * 2 вариант:
 * {O, O, X}
 * {O, X, O}   -   по такой схеме еще один посетитель может занять клетку с координатами 0, 0
 * {X, O, X}
 *
 * 3 вариант
 * {X, O, X}
 * {O, O, O}   -   по такой схеме еще один посетитель может занять клетку с координатами 1, 1
 * {X, O, X}
 *
 * Метод должен вернуть клетку в которую можно разместить нового посетителя, при этом если таких клеток будет
 * несколько - нужно вернуть первую из них. Метод должен работать с любым набором исходных данных.
 */
public class Cinema {
    public static int[] checkEmptyPlace(char[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if ((i + j) % 2 == 0 && places[i][j] == 'O') {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}