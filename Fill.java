import java.util.ArrayList;

class Fill{
    private ArrayList<Integer> list = new ArrayList<>();
    
    ArrayList<Integer> fillList(){ //uses random method to generate a random decimal, mulitiply it by 101 so the number is between 0-100,
        
        for (int i = 0; i < 100;i++) { // then converts to an integer and stores it into ArrayList list for a total of 100 ints
            list.add((int) (Math.random() * 101)); 
        }//end of for loop
        
        return list;
    }//end of fillList
    
    ArrayList<Integer> getList(){
        return list;
    }
} //end of fill method