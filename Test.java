
import java.util.Collections;


class Test{
    
    Fill fill = new Fill();
    Merge merge = new Merge();
    Quick quick = new Quick();

    double mergeDuration;
    double quickDuration;

    void print(){
        System.out.println("Array List of 100 integers before sorting:\n");
        System.out.println(fill.fillList()); //initializes list and prints to console
    }//end of print
    
    void mergeTimer(){
        long startTime = System.nanoTime();//stores system time in nanoseconds after sort
       
        merge.mergeSort(fill.getList());//perform the merge sort
       
        long endTime = System.nanoTime();//stores system time in nanoseconds after sort

        mergeDuration = (endTime - startTime) / 1000000.0; // calculate total time sort took, and divide by one million to get milliseconds 

        System.out.println("\nMerge sorting took " + mergeDuration + " milliseconds");
    }//end of mergeTimer
    
    void quickTimer(){
        long startTime = System.nanoTime();//stores system time in nanoseconds before sort
        
        quick.quickSort(fill.getList(), 0, fill.getList().size() - 1);//perform the quick sort
        
        long endTime = System.nanoTime();//stores system time in nanoseconds after sort

        quickDuration = (endTime - startTime) / 1000000.0;// calculate total time sort took, and divide by one million to get milliseconds

        System.out.println(fill.getList());

        System.out.println("\nQuick sorting took " + quickDuration + " milliseconds");
    }//end of quickTimer

    void fastestSort(){ //method that determines which sorting method is the fastest for this instance
      if(quickDuration < mergeDuration) {
        System.out.println("For this array list, quick sorting is faster than merge sorting");
      } else if (mergeDuration < quickDuration) {
        System.out.println("For this array list, merge sorting is faster than quick sorting");
      }
    }//end of fastestSort

    void shuffle(){//uses collections API to easily reshuffle array list to sort again
      Collections.shuffle(fill.getList());
      System.out.println("\nReshuffled Array List: " + fill.getList());
    }//end of shuffle
}//end of Test