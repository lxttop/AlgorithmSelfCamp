package org.example;

public class Utils {

    private void swap(char[] array, int i, int j) {
        //第1种交换方式
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        //第2种交换方式
//        array[i] = (char) (array[i] + array[j]);
//        array[j] = (char) (array[i] - array[j]);
//        array[i] = (char) (array[i] - array[j]);

        //第3种交换方式
//        array[i] = (char) (array[i] - array[j]);
//        array[j] = (char) (array[i] + array[j]);
//        array[i] = (char) (array[j] - array[i]);

        //第4种交换方式
//        array[i] ^= array[j];
//        array[j] ^= array[i];
//        array[i] ^= array[j];
    }

}
