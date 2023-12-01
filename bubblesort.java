import java.util.Arrays;

public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Hello World");
    int[] numbers = new int[]{2, 1, 10, 9, 11, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    System.out.println (Arrays.toString(numbers));
    bubble(numbers);
    System.out.println (Arrays.toString(numbers));
  }

  public static int[] bubble (int[]numbers)
  {
    // ex: [ 2 1 10 9 11 12]
    //get vector size
    int vectorLength = numbers.length;
    boolean swapped = false;
    
    do{
        swapped = false;
        for (int i = 0; i < vectorLength - 1; i++) {
            if (shouldSwap(numbers, i, i+1)){
        	    swap(numbers, i, i+1);
        	    swapped = true;
            }
        }
    }
    while(swapped);
    return numbers;
  }
    
    public static void swap(int[] numbers, int i, int j){
            int aux = numbers[i];
    	    numbers[i] = numbers[j];
    	    numbers[j] = aux;
    }
    
    public static boolean shouldSwap(int[] numbers, int position, int nextPosition){
        return numbers[position] > numbers[nextPosition];
    }
}
