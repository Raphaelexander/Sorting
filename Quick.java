import java.util.ArrayList;

class Quick {
     void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            // Partition the list and get the pivot index
            int pivotIndex = partition(list, low, high);

            // Recursively apply quick sort to the left and right partitions
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }//end of if
    }//end of quickSort

    // Partition method to rearrange elements based on the pivot
    private int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high); // Select the last element as the pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }//end of if
        }//end of for loop

        // Place the pivot element in its correct position
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1; // Return the pivot index
    }//end of partition
}//end of Quick