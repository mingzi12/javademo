package com.java.demo.generate.word.demo;

import org.apache.poi.hwpf.HWPFDocument;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author XXX
 * @description: 使用指定编码格式来拷贝生成新文件
 * @date 2019/8/18 14:25
 */
public class CopyFileWithEncoding {

    public static void main(String[] args) {
        //copyFileWithEncoding();
       // copyFileWithNoEncoding();
        //getJVMEnconding();
        printhelp();
    }

    // 获得jvm的默认编码
    public static String getJVMEnconding() {
        String encoding = System.getProperty("file.encoding");
        System.out.println(encoding);
        System.out.println("JRE Version:" + System.getProperty("java.version"));
        System.out.println("JVM code:" + Charset.defaultCharset());
        return encoding;
    }


    private static void copyFileWithEncoding() {
        InputStream inputStream =
                CopyFileWithEncoding.class.getResourceAsStream(
                "/doc/FileWithImages" +
                ".doc");
        InputStream inputStream1 =
                CopyFileWithEncoding.class.getResourceAsStream(
                        "/doc/plantFile" +
                                ".doc");
        String fullFilePath = CopyFileWithEncoding.class.getResource("/doc" +
                "/FileWithImages.doc").getPath();
        int index = fullFilePath.lastIndexOf("/");
        File secondFile =
                new File(fullFilePath.substring(0,index) + File.separator + System.currentTimeMillis() +
                "filesecond.doc");
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            //加入编码字符集
            in = new BufferedReader(new InputStreamReader(inputStream1, "utf-8"));
            //加入编码字符集
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(secondFile), "utf-8"));
            String line = "";
            while ((line = in.readLine()) != null) {
                out.write(line + "\r\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file is not fond");
        } catch (IOException e) {
            System.out.println("Read or write Exceptioned");
        } finally {
            if (null != in) try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void copyFileWithNoEncoding() {
        InputStream inputStream =
                CopyFileWithEncoding.class.getResourceAsStream(
                        "/doc/FileWithImages" +
                                ".doc");
        InputStream inputStream1 =
                CopyFileWithEncoding.class.getResourceAsStream(
                        "/doc/plantFile" +
                                ".doc");
        String fullFilePath = CopyFileWithEncoding.class.getResource("/doc" +
                "/FileWithImages.doc").getPath();
        int index = fullFilePath.lastIndexOf("/");
        File secondFile =
                new File(fullFilePath.substring(0,index) + File.separator + System.currentTimeMillis() +
                        "filesecond.doc");
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(secondFile);
            int len = 0 ;
            byte[] buff = new byte[1024*10];
            while ((len = inputStream.read(buff)) != -1) {
                out.write(buff,0,len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file is not fond");
        } catch (IOException e) {
            System.out.println("Read or write Exceptioned");
        } finally {
            if (null != in) try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void printhelp() {

        InputStream inputStream =
                CopyFileWithEncoding.class.getResourceAsStream(
                        "/doc/FileWithImages" +
                                ".doc");
        InputStream inputStream1 =
                CopyFileWithEncoding.class.getResourceAsStream(
                        "/doc/plantFile" +
                                ".doc");
        String fullFilePath = CopyFileWithEncoding.class.getResource("/doc" +
                "/FileWithImages.doc").getPath();
        int index = fullFilePath.lastIndexOf("/");
        File secondFile =
                new File(fullFilePath.substring(0,index) + File.separator + System.currentTimeMillis() +
                        "filesecond.doc");
        FileOutputStream out = null;


        try {
            HWPFDocument hdt = new HWPFDocument(inputStream);


            ByteArrayOutputStream ostream = new ByteArrayOutputStream();
            out = new FileOutputStream(secondFile);

            hdt.write(ostream);//数据写入到输出流
            out.write(ostream.toByteArray());

            out.flush();
            out.close();
            ostream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
