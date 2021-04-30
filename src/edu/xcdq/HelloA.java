package edu.xcdq;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-28 10:36
 */
class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    /*{
        System.out.println("Im A class");
    }*/

    static {
        System.out.println("static A");
    }
}

class HelloB extends HelloA {
    static {
        System.out.println("static B");
    }

     /*{
        System.out.println("Im B calss");
    }*/

    public HelloB() {
        System.out.println("HelloB");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
