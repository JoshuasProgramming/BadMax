import java.util.ArrayList;
import java.util.Random;
public class BadMax
{
    // a random generator
    Random rg;

    //call to badmax counter (including recursive)
    int badmaxCalls;
    
    public int[] randomArray(int length) {

        assert length>=1; // do not give me negative numbers or 0

        //result int array will store the integers with a fixed size of the length of the random array
        int res[] = new int[length];

        //loop for length of 'length' times. So if the user enters 5 as the size of the array, we will loop for 5 times.
        for (int i = 0; i < length; i++) {

            //Assigns a random number
            res[i] = rg.nextInt(2 * length) + 1;
        }

        return res;
    }
    
    /**
     * Constructor for objects of class BadMax
     */
    public BadMax()
    {
        rg=new Random();
    }

    
    public int max(int arr[]) {
        int res = badmax(arr, arr.length - 1 );
        System.out.println("Badmax was called: " + badmaxCalls + " times");
        return res;
    }
    
    public int badmax(int arr[], int lastpos) {

        //Increment the badmax calling varible
        badmaxCalls++;

        //base case
        if (lastpos==0) return arr[0];

        if (arr[lastpos] > badmax(arr, lastpos - 1)) {
            return arr[lastpos];
            
        } else {
            return badmax(arr, lastpos - 1);
        }
    }

    public int modifiedBadMax(int arr[], int lastpos){

        int highestNum = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > highestNum ){
                highestNum = arr[i];
            }
        }

        return highestNum;
    }
    
    //ordered array method 
    public ArrayList<Integer> orderedArray(int nums){

        //create arraylist data structure to store each item in the array
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //loop through for nums+1 times
        for(int i = 1; i < nums + 1; i++){
        
        //add each item to the array, list
        list.add(i);
        }
        
        //return the arrayList, list
        return list;
    }


    //reverse array method 
    public static ArrayList<Integer> reverseArray(Integer nums){
        
        //create arraylist, list
        ArrayList<Integer> list = new ArrayList<Integer>();
      
        //loop for length of nums times, but backwards
        for(int i = nums; i > 0; i--){
          
          //add each item to the list
        	list.add(i);
        }
    	  
        //print and return the list which contains the numbers in reverse order
        return list;  
    }

}