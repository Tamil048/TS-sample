package Basics;

public class Extends {
    public void method1(){
        System.out.println("admin test");
    }
}

class B extends Extends{
    public B(){
        System.out.println("constructo B class");
    }
    public void method1(){
        System.out.println("second admin test");
    }

    public static void main(String[] args) {
        Extends a = new B();
        a.method1();
    }
}
