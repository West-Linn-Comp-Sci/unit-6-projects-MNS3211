

import java.util.ArrayList;
import java.util.Scanner;
public class frequencyChart {
    public static void main(String[] args) {
        System.out.println("Type anything other than 1-100 to stop");

        System.out.println("Type an integer from 1-100");

        Scanner scan = new Scanner(System.in);

        ArrayList<String > arr = new ArrayList<String>();
        ArrayList<String > arr1 = new ArrayList<String>();
        ArrayList<String > arr2 = new ArrayList<String>();
        ArrayList<String > arr3 = new ArrayList<String>();
        ArrayList<String > arr4 = new ArrayList<String>();
        ArrayList<String > arr5 = new ArrayList<String>();
        ArrayList<String > arr6 = new ArrayList<String>();
        ArrayList<String > arr7 = new ArrayList<String>();
        ArrayList<String > arr8 = new ArrayList<String>();
        ArrayList<String > arr9 = new ArrayList<String>();

        boolean start = true;
        while(start == true ) {//code}
            int num = scan.nextInt();

            if (num > 0 && num < 11) {
                arr.add("*");
            } else if (num > 10 && num < 21) {
                //System.out.println("*");
                arr1.add("*");

            } else if (num > 20 && num < 31) {
                //System.out.println("*");
                arr2.add("*");

            } else if (num > 30 && num < 41) {
                //System.out.println("*");
                arr3.add("*");

            } else if (num > 40 && num < 51) {
                //System.out.println("*");
                arr4.add("*");

            } else if (num > 50 && num < 61) {
                //System.out.println("*");
                arr5.add("*");

            }else if (num > 60 && num < 71) {
                //System.out.println("*");
                arr6.add("*");

            }else if (num > 70 && num < 81) {
                //System.out.println("*");
                arr7.add("*");

            }else if (num > 80 && num < 91) {
                //System.out.println("*");
                arr8.add("*");

            }else if (num > 90 && num < 101) {
                //System.out.println("*");
                arr9.add("*");

            }else if (num > 100 && num < 1) {
                //System.out.println("*");
                System.out.println("Type a valid integer from 1-100!");
            }else {
                start = false;
            }
                //System.out.println("*");
        }
        System.out.println("1-10|"+arr);
        System.out.println("11-20|"+arr1);
        System.out.println("21-30|"+arr2);
        System.out.println("31-40|"+arr3);
        System.out.println("41-50|"+arr4);
        System.out.println("51-60|"+arr5);
        System.out.println("61-70|"+arr6);
        System.out.println("71-80|"+arr7);
        System.out.println("81-90|"+arr8);
        System.out.println("91-100|"+arr9);
    }
}