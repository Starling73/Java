package com.lab111.labwork2;

public class TestClass {
    static void creater(){
        new Cl1().meth1();
        new Cl1().meth3();
        new Cl2().meth1();
        new Cl2().meth2();
        new Cl2().meth3();
        new Cl3().meth3();
    }

    public static void main(String[] args) {
        creater();
    }
}
