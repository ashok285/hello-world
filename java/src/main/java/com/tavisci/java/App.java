package com.tavisci.java;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Hello World!");
        String url = "https://bsono97638.stage.lithium.com/bsono97638/attachments/bsono97638/power-bi-designer/4032/1/download%20(1).jpg";
        String fileName1 = URLDecoder.decode(url.substring(url.lastIndexOf('/') + 1), "UTF-8");
        int post = url.lastIndexOf('/') + 1;
        System.out.println(post);
        String fileName = URLDecoder.decode(url.substring(url.lastIndexOf('/') + 1));
        System.out.println(fileName1);
        System.out.println("testing man");
    }
    
}
