package day_07_22_2020;

public class UtopianTree_123 {
    public static void main(String[] args) {

       int treeSize= 0;
        for (int i = 1; i < 11; i++) {
            if (i<4) { treeSize+=1;
            }else {
                treeSize += 2;
            }
            if (i < 4) {
                System.out.println("year " + i + " - growth 1 cm");
                System.out.println("tree size: " + treeSize + "cm");
            } else {
                System.out.println("year " + i + " - growth 2 cm");
                System.out.println("tree size: " + treeSize + "cm");
            }
        }


    }
}
