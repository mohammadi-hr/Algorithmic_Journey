import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
            int[] randomNumbers = {10,456,7,25,55,3,3,582,78};
            BubbleSort sort = new BubbleSort();
            int[] sortNumbers = sort.bubblesort(randomNumbers);

            Arrays.stream(sortNumbers).forEach(System.out::println);
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
