package com.java.demo.object.init.demo;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/25 10:39
 */
public class Derive extends Base{

    private Member m1 = new Member("Member 1");
    private Member m3 ;

    static {
        System.out.println("Initial Block()");
    }

    public Derive() {
        m3 = new Member("Member 3");
        System.out.println("Derive()1");
    }

    private Member m2 = new Member("Member 2");
    private int i = getInt();

    public int getInt()
    {
        System.out.println("getInt()");
        return 2;
    }

    public static void main(String[] args)
    {
        new Derive();
    }
}

class Base
{
    public Base()
    {
        System.out.println("Base()");
    }
}


class Member
{
    public Member(String m)
    {
        System.out.println("Member() "+m);
    }
}
