
class Main{
    public static void main(String[] args) {
        Test test = new Test();
        
        test.print();//print initial array
        
        System.out.print("\nArray List after Merge Sort: ");
        test.mergeTimer();//complete merge sort and merge timer
        
        test.shuffle();//reshuffle same array
        
        System.out.print("\nArray List after Quick Sort: ");
        test.quickTimer();//complete quick sort and quick timer
        
        test.fastestSort();//calculate the fastest sort for this instance
    }
}