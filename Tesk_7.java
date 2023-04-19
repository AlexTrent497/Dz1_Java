import java.util.ArrayList;
import java.util.Arrays;

public class Tesk_7 {
    public static void main(String[] args) {
        int aux = Integer.MIN_VALUE;
    ArrayList<Integer> list = new ArrayList<>();
    int [] arr = {2, 5, 14, 14, 2, 7, 5};
    Arrays.sort(arr);
    for (int i =0; i<arr.length; i++){
        if(list.isEmpty())
        {
           
            list.add(arr[i]);
            aux=list.get(list.size()-1);
        }
        else
        {
            if(aux == arr[i])
            {
                
                if(!list.isEmpty() && list.get(list.size()-1).equals(aux))
                {
                    list.remove(list.size()-1);
                }
            }
            else
            {
                
                list.add(arr[i]);
                aux=list.get(list.size()-1);
                
            }
        }
    }
    System.out.println(list);
}
        








        
    }
    

