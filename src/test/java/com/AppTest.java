package com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void getIP(){
        try {
            InetAddress address = InetAddress.getLocalHost();
            String ip = address.getHostAddress().toString();//获取本机IP
            String hostName = address.getHostName().toString();//获取本机计算机名称
            System.out.println("ip is:"+ip);
            System.out.println("host name is:"+hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
