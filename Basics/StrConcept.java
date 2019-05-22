package Basics;

public class StrConcept {
    public static void main(String[] args) {
        //Concat
        String a="Hello";
        System.out.println(a);
        String b= a.concat(" World");
        System.out.println(b);

        //Replace
        char c[]={'j','a','v','a','t','p','o','i','n','t'};
        String D=new String(c);
        String s = D.replace('a','w');
        System.out.println(s);

        //ReplaceAll
        String r="Very Good Morning";
        System.out.println(r.replaceAll("Very","Rainy"));

        //ReplaceFirst
        String first="Have nice day";
        System.out.println(first.replaceFirst("Have","Have a great and "));



    }

}
