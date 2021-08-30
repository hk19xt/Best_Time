package Best_Time;

public class Best_Time {
    public static int bestProfit(int[] numbers) {

        int bestProfit = 0; // Initialize the best profit
        int startingValue = numbers[0]; // Initialize the first value in the input array.

        check(numbers); // Check whether the input array is larger and equal to 2

        for (int nextValue=1; nextValue<numbers.length; nextValue++){
            if(numbers[nextValue]<startingValue){ //If the starting point value is larger than the next value,
                startingValue=numbers[nextValue]; //starting point is changed.
            }
            if(numbers[nextValue]-startingValue>bestProfit && numbers[nextValue]-startingValue>0){ // Check if the new best profit is larger than the current best profit &&
                                                                                                   // Check if the best profit is larger than zero.
                bestProfit = numbers[nextValue] - startingValue;
            }
        }

        return bestProfit;
    }


    public static int check (int[] inputs){

        if (inputs.length <= 1){
            return 0;
        }
        return 0;
    }
}

