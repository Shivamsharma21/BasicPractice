package com.example.java_programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInToFile {
         public static void main(String []args){

             WriteIntoFile writeIntoFile = new WriteIntoFile();
                writeIntoFile.Write();
    }
}


// function for Write data into a file //

class WriteIntoFile{
    void Write(){
        String Data = "Data";
        try {
            FileWriter fileWriter = new FileWriter(new File("C:\\Users\\vinay\\Desktop\\File Handling\\myfile.txt"));
            fileWriter.write(Data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

