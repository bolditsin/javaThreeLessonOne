package lessonOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //1.
        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        //2.
        ArrayList<Integer> arrList = toArrayList(intArr);

    }
    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void swap(Object[] arr, int value1, int value2) {
        Object x = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = x;
    }
    //2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

}
