package academy.devonline.java.basic.section10_practics;

import java.util.Arrays;

public class BubbleSortHome {
    public static void main(String[] args) {
        // read source data
        //int[] numsArray = {1, 11, 2, 33, 22, 1, 5};
        int[] numsArray = {1, 11, 2, 3, 3, 3, 33, 22, 1, 5};
        System.out.println(Arrays.toString(numsArray));

        //processing
        for (int i = 0; i < numsArray.length ; i++) {
            for (int j = 1 + i; j < numsArray.length; j++) {

                var temp = numsArray[i];
                if (temp > numsArray[j]) {
                    numsArray[i] = numsArray[j];
                    numsArray[j] = temp;
                }
            }
        }

        //display results
        System.out.println(Arrays.toString(numsArray));

    }
}
