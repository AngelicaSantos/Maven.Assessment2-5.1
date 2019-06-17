package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {


        return Arrays.copyOfRange(arrayToBeSpliced, startingIndex, endingIndex );
    }

    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        try {
            String[] ending = new String[arrayToBeSpliced.length - startingIndex];
            Integer counter = 0;
            Integer length = ending.length;
            if (startingIndex != 0)
                length++;
            for (int i = startingIndex; i < length; i++) {
                ending[counter] = arrayToBeSpliced[i];
                counter++;
            }
            return ending;
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException();
        }

    }
}