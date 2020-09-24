package com.lab111.labwork2;

public class Cl2 implements If2 {

    If3 if3;

    @Override
    public void meth2() {
        System.out.println("Cl2.meth2()");
    }

    @Override
    public void meth1() {
        System.out.println("Cl2.meth1()");
    }

    @Override
    public void meth3() {
        System.out.println("Cl2.meth3()");
    }
}
