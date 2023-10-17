package session14.practice;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = InitialiseList();
        System.out.println(myList);

        List<Integer> updatedList = getUpdatedList(myList,1,10);
        System.out.println(updatedList);

        List<Integer> evenNumbers = getEvenNumbers(myList);
        System.out.println(evenNumbers);

        int maxValue = getMax(myList);
        System.out.printf("max value is : %d\n",maxValue);
        int minValue = getMin(myList);
        System.out.printf("min value is : %d\n",minValue);

    }

    public static int getMax(List<Integer> list){
        if(list.isEmpty()){
            throw new InvalidParameterException("list is empty");
        }
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if(max<num){
                max = num;
            }
        }
        return max;
    }


    public static int getMin(List<Integer> list){
        if(list.isEmpty()){
            throw new InvalidParameterException("list is empty");
        }
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if(min>num){
                min = num;
            }
        }
        return min;
    }

    public static List<Integer> getEvenNumbers (List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> getUpdatedList(List<Integer> list, int index, int value){
        if(index < 0 || index >= list.size()){
            return null;
        }
        List<Integer> result = new ArrayList<>(list);
        result.set(index,value);
        return result;
    }
    public static List<Integer> InitialiseList(){
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        return list;
    }



}
