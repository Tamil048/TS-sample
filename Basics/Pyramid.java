package Basics;

public class Pyramid {

    public static void printStarts(int num){
        int i,j;
        for (i=0;i<num;i++){
            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n=5;
        printStarts(n);
        int i =2;
        int r =i++;
        int k=++i;
        int j=r +k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(i+j);

    }
}
