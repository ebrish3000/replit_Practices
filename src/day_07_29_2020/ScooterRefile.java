package day_07_29_2020;

import java.util.ArrayList;

public class ScooterRefile {

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {

        int res = 0;
        int total=0;
        int add=0;
        for(int each:deliveries){
            total+=each;
        }

        if(total%max_fuel==0){
            add=0;
        }else{
            add=1;
        }
        res= total/max_fuel+add;
        return res;


    }

    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}
