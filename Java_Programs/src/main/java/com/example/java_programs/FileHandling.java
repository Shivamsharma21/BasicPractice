package com.example.java_programs;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.DocFlavor;

public class FileHandling {

    public static void main(String[] args) throws Exception {


         File file = new File("C:\\Users\\vinay\\Desktop\\File Handling\\myfile.txt");
        if (file.createNewFile()){
            System.out.println("File is creates  "+ file.getName());
        }else{
            System.out.println("Error While creating a file");
        }

      //WriteIntoFile writeIntoFile = new WriteIntoFile();

        //    writeIntoFile.Write();

    }


}

// function for Write data into a file //


