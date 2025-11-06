import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BubbleSort {

    public static void main(String[] args){
        int[] randomNumbers = {10,456,7,25,55,3,3,582,78};
        BubbleSort sort = new BubbleSort();
        int[] sortNumbers = sort.bubblesort(randomNumbers);

        Arrays.stream(sortNumbers).forEach(System.out::println);

    }

    @Test
    public void testBubbleSort(){
        int[] input = {-1, 10, 1, 0 , -20, 11};
        int[] output = {-20, -1 , 0, 1, 10, 11};

        int[] sorted = bubblesort(input);

        for(int i=0; i < input.length - 1; i++){
            assertEquals(sorted[i], output[i]);
        }

    }

    @Test
    public void testEmptyArray(){
        int[] input = new int[]{};
        int[] expected = new int[]{};

        BubbleSort bsrt = new BubbleSort();
        int[] result = bsrt.bubblesort(input);

        assertArrayEquals(result, expected);

    }


    public int[] bubblesort(int[] numbers){
        int[] clone = numbers.clone();
        for (int i=0; i < clone.length -1; i++){

            for(int j=i+1; j< clone.length; j++){

                if(clone[i] > clone[j]){
                    int temp = clone[i];
                    clone[i] = clone[j];
                    clone[j] = temp;
                }
            }

        }

        return clone;
    }
}
