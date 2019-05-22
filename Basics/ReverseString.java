package Basics;

public class ReverseString {

    public static void palindrome(){
        String a="madam";
        String m="";
        for (int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }

    }

    public static void main(String[] args) {
        palindrome();
        String s="tamil selvan";
        //StringBuilder sb=new StringBuilder(s);
       // sb.reverse().toString();
       // System.out.println(sb);
        //char []tr=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
         }
}
