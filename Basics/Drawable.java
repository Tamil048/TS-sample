package Basics;

public abstract class Drawable {
    int a=10;
    abstract void trace();
    static void run(){
        System.out.println("Run the program");
    }
    abstract void shape();
    abstract void test();

}

class A extends Drawable{

    @Override
    void trace() {
        System.out.println("trace log successfully");
    }

    @Override
    void shape() {
        System.out.println("d");
    }

    @Override
    void test() {

    }
}
