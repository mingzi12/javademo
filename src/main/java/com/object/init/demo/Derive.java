package com.object.init.demo;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/25 10:39
 */
public class Derive extends Base{

    private Member m1 = new Member("子类的成员变量m1");
    private Member m3 ;

    static {
        System.out.println("子类的static代码块");
    }

    public Derive() {
        m3 = new Member("子类的构造函数");
        System.out.println("子类的构造函数Derive()");
    }

    private Member m2 = new Member("子类的成员变量m2");
    private int i = getInt();

    public int getInt()
    {
        System.out.println("初始化子类的成员变量i");
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
