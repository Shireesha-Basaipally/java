package com.tnsif.interfacedemo;

public interface Interface1 {
	void show1();
    void show2();

}
interface Interface2 extends Interface1 {
    void show3();
}

class Child implements Interface2 {
    public void show1() {
        System.out.println("This is show1() from Interface1");
    }

    public void show2() {
        System.out.println("This is show2() from Interface1");
    }

    public void show3() {
        System.out.println("This is show3() from Interface2");
    }
}

