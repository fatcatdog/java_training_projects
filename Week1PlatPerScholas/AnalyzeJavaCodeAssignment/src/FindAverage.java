//Your Name: Jacob Duchen
//Today's Date: 4/26/18

/*
  Please comment above each line of code
  saying what you believe that line does.

  For an example, see line 24.
*/


//start of class
public class FindAverage {
//start of public method = can be used by other classes
// static = no object existing for the class but it is still allowed to be called (need to learn more about this)
    //void = returns an undetermined type
    //String[] args = accepts string args
    public static void main(String[] args) {
        //declares a list of doubles (really an array
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        //declares a double of 0
        double total = 0;
//start of a loop, starting at 0, +1 every iteration until reach end of arr .length
        for(int i=0; i<arr.length; i++){
            //addding value of each piece of array to total every iteration
            total = total + arr[i];
        }
        //end of loop
//dividing variable total by amount of arrs, and then saving it to double of average
        double average = total / arr.length;

        //Print out the average with 3 decimal places.
        System.out.format("The average is: %.3f", average);
    }
    //end of main method
}

//class ended