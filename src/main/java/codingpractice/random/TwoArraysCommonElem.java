package codingpractice.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoArraysCommonElem {

    public static HashSet<Integer> duplicateElements(List<Integer> arr1, List<Integer> arr2) {

        HashSet<Integer> set1 = new HashSet<>(arr1);

        HashSet<Integer> set2 = new HashSet<>(arr2);
        
        set1.retainAll(set2);

        return set1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter integers for the first array (enter -999 to terminate):");
        while(sc.hasNextInt()) {
            temp = sc.nextInt();
            if(temp == -999)
                break;
            arr1.add(temp);
        }
        System.out.println("Enter integers for the second array (enter -999 to terminate):");
        while(sc.hasNextInt()) {
            temp = sc.nextInt();
            if(temp == -999)
                break;
            arr2.add(temp);
        }
        System.out.println("Arrays defined: \n" + "arr1 = " + arr1 + "\narr2 = " + arr2);

        if(!duplicateElements(arr1, arr2).isEmpty())
            System.out.println(duplicateElements(arr1, arr2));
        else
            System.out.println("No common elements exist");
    }
}
