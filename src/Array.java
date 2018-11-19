/*
/* Вывести элемент массива в формате [<номер элемента> = <вызов метода toString()>]
/* Вывести массив, поменяв два элемента местами
/* Вывести перевернутый массив
*/

import java.util.Arrays;

public class Array {

    private static String[] array = {"Съешь", "еще", "этих",
            "мягких", "французских", "булок"}; /* инициализируем массив объектов */

    /** метод вывода массива. */
    private static <T> void arrayPrint(T[] tempArr) {

        for (Object i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /** метод вывода одного элемента в указанном формате. */
    public static <T> void elementPrint(T[] array, int index) {
        System.out.println(
                String.format("[%d-й элемент = %s]", index,
                        array[index].toString())
        );
    }

    /** метод перемены двух элементов массива местами. */
    private static <T> void elementsSwap(T[] array,
                                         int i, int j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }

    /** метод разворота массива. */
    private static <T> void arrayReverse(T[] array) {
        for (int i = 0, j = array.length - 1;
             i < array.length / 2; i++, j--) {
            elementsSwap(array, i, j);
        }
    }

    public static void main(String[] args) {
        arrayPrint(array);

        elementPrint(array, 0);

        elementsSwap(array, 3, 4);
        arrayPrint(array);

        arrayReverse(array);
        arrayPrint(array);
    }
}

