package src.list.Research.NumberSum;

import java.util.ArrayList;
import java.util.List;

public class NumbersSum {

    private List<Integer> inteiros = new ArrayList<>();

    public void addNumber(int number){
        inteiros.add(number);
    }

    public int sum(){
        int total = 0;

        for (int i : inteiros) {
            total += i;
        }

        return total;
    }

    public int findGreatestNumber(){
        int number = inteiros.get(0);

        for (int i : inteiros) {
            if (i > number){
                number = i;
            }
        }

        return number;
    }

    public int findSmallNumber(){
        int number = inteiros.get(0);

        for (int i : inteiros) {
            if (i < number){
                number = i;
            }
        }

        return number;
    }

    public void showNumbers(){
        System.out.println(inteiros);
    }

}
