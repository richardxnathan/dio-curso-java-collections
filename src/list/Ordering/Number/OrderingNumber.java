package src.list.Ordering.Number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingNumber {

    private List<Integer> intergers = new ArrayList<>();

    public void addNumber(int number){
        intergers.add(number);
    }

    public List<Integer> orderAsc(){
        List<Integer> integersAsc = new ArrayList<>(this.intergers);

        Collections.sort(integersAsc);

        return integersAsc;
    }

    public List<Integer> orderDesc(){
        List<Integer> integersDesc = new ArrayList<>(this.intergers);

        integersDesc.sort(Collections.reverseOrder());

        return integersDesc;
    }

    public void showNumbers(){
        System.out.println(this.intergers);
    }

}
