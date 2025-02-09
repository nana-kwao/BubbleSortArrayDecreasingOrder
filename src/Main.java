import java.util.Arrays;
// import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //get the array
        int[] ages = {45,76,23,87,43,12,34,33,9};

        //ages.length
        int n = ages.length;

        //rearrange to descending
        for (int x = 0; x < n-1; x++){
            for (int y = 0; y < n-1-x; y++){
                if(ages[y] < ages[y+1]){
                    int z = ages[y];
                    ages[y] = ages[y+1];
                    ages[y+1] = z;
                }
            }
        }
        //print sorted array
        System.out.println(Arrays.toString(ages));

        
        //ALternative to the above code is using Array.sort(ages, Collections.reverseOrder()) built-in method
        // Integer[] newAges = {45,76,23,87,43,12,34,33,9};   //using Integer[] since Collections does not support int[] 
        // Arrays.sort(newAges, Collections.reverseOrder());
        // System.out.println(Arrays.toString(newAges));
    }
}
