package Basics;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {

    public static int largestNthNumber(int a[],ArrayList<Integer> list,int time) {
        int max = a[0];
        for (int i : a) {
            if (max < i && !list.contains(i))
            {
                max = i;
            }
        }
            list.add(max);
            time--;
            if (time <= 0) {
                return max;
            } else {
                return largestNthNumber(a, list, time);
            }

    }
    public static void main(String[] args) {
        int a[]={23,25,27,29,30,13};
        System.out.println(largestNthNumber(a,new ArrayList<Integer>(),3));


    }
}
