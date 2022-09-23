import java.util.HashMap;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a[][] = new int[3][3];
        // //Row Major
        // for (int row = 0; row < 3; row++) {
        // for (int col = 0; col < 3; col++) {
        // a[row][col] = sc.nextInt();
        // }
        // }

        // Column Major
        // for (int col = 0; col < 3; col++) {
        // for (int row = 0; row < 3; row++) {
        // a[row][col] = sc.nextInt();
        // }
        // }
        // for (int row = 0; row < 3; row++) {
        // for (int col = 0; col < 3; col++) {
        // System.out.print(a[row][col] + " ");
        // }
        // System.out.println();
        // }
        sc.close();
        String s = "Deepak";
        s += " Sharma";
        int num = 20;
        StringBuffer sb1=new StringBuffer(20);
        sb1.append("Deepak Sharma");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<sb1.length();i++){
            char c = sb1.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for (Character c: map.keySet()) {
            System.out.println(c + "\t"+map.get(c));
        }

    }
}