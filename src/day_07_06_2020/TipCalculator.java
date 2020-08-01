package day_07_06_2020;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Split:");
        String answer = scan.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Number of people:");
            int people = scan.nextInt();
            System.out.println("Check amount:");
            double cheackAmount = scan.nextDouble();
            System.out.println("Service Quality:");
            String ServiceQuality = scan.next();
            double totalCheck;
            double totalTip;
            double totalPperson;
            double tipPperson;
            String people2="";
            for(int i=1; i<=people; i++){
                people2 += "&";
            }

            switch(ServiceQuality){
                case "Poor":
                    totalCheck =cheackAmount+(cheackAmount*0.05);
                    totalTip = (cheackAmount*0.05);
                    totalPperson = totalCheck/people;
                    tipPperson = totalTip/people;
                    break;

                case "Fair":
                    totalCheck =cheackAmount+(cheackAmount*0.10);
                    totalTip = (cheackAmount*0.10);
                    totalPperson = totalCheck/people;
                    tipPperson = totalTip/people;
                    break;

                case "Good":
                    totalCheck =cheackAmount+(cheackAmount*0.15);
                    totalTip = (cheackAmount*0.15);
                    totalPperson = totalCheck/people;
                    tipPperson = totalTip/people;
                    break;

                case "Great":
                    totalCheck =cheackAmount+(cheackAmount*0.20);
                    totalTip = (cheackAmount*0.20);
                    totalPperson = totalCheck/people;
                    tipPperson = totalTip/people;
                    break;

                default:
                    totalCheck =cheackAmount+(cheackAmount*0.25);
                    totalTip = (cheackAmount*0.25);
                    totalPperson = totalCheck/people;
                    tipPperson = totalTip/people;


            }
            System.out.println("Number of people entered: "+people2);
            System.out.println("Total to pay: "+totalCheck);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: "+totalPperson);
            System.out.println("Tip per person: "+tipPperson);

        }

    }
}
