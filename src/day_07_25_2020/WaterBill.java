package day_07_25_2020;

public class WaterBill {
    public static void main(String[] args) {


    }

    public double waterTax ( double units){
        double bill = 0.0;

        //your code here
        if (units<=50){
            bill = units * 0.6;
        }else if (units>50 || units<=100){
            bill = units * 0.9;
        }else if(units>100 || units<=150){
            bill = (units * 0.9) + 50;
        } else if (units > 150) {
            bill = (units * 0.9) + 100;
        }
        System.out.println();

        //end your code here

      return  bill;
    }

}