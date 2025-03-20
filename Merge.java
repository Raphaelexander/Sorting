import java.util.ArrayList;

class Merge {
    void mergeSort(ArrayList<Integer> list) {
        // Base case: If the list contains 1 or fewer elements, it's already sorted
        if (list.size() <= 1) {
            return;
        } //end of if
        
        // Split the list into two halves
        int mid = list.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));//creates list for 0 to midpoint range
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));//creates list for midpoint to max range

        // Recursively sort each half
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves back together
        merge(list, left, right);
        
        if (list.size() == 100){
            System.out.println(list); //prints list to the console if completely sorted
        }//end of if
    }//end of mergeSort

    void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right lists
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }//end of while loop

        // Copy remaining elements from left list
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        // Copy remaining elements from right list
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }//end of while loop
    }//end of merge method
}// end of Merge