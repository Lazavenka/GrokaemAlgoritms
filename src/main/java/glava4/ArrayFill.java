package glava4;

import java.util.Random;

public class ArrayFill {
    public static void fillArray(int[] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10000);
        }
    }
}
