package com.example.java_programs;

import java.net.URL;

    ////   this class Is demonstrate the URL class of java And its function.


public class UrlClassJava {

    public static void main(String [] args){
        try{

            URL url = new URL("https://www.youtube.com/watch?v=l-YVzkQMLKg");

            System.out.println("Protocol: "+url.getProtocol());

            System.out.println("Host Name: "+url.getHost());

            System.out.println("Port Number: "+url.getPort());

            System.out.println("File Name: "+url.getFile());

            System.out.println("Query String: "+url.getQuery());

            System.out.println("Path: "+url.getPath());

            System.out.println("Default Port Number: "+url.getDefaultPort());



        }catch (Exception e){

        }
    }

}
