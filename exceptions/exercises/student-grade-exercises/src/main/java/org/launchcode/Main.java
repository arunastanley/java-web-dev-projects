package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(4,3);
        int pointReceived;

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String,String> fileName: studentFiles.entrySet()){
            pointReceived = CheckFileExtension(fileName.getValue());
            System.out.println("Points received by "+ fileName.getKey() + " : " + pointReceived);
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!

            if (y == 0) {
                try {
                    throw new ArithmeticException("The value of y is 0");
            }catch(ArithmeticException e){
                    e.printStackTrace();
                }

        }else System.out.println((double) x/y);
    }

    public static int CheckFileExtension(String fileName)
    {
        int point = -1;
        // Write code here!
        if(fileName.isEmpty()){
            try{
                throw new RuntimeException("File submitted is empty");
            }catch (RuntimeException e){
                e.printStackTrace();
            }
        }
        else if(fileName.endsWith(".java")){
            point = 1;
        }
        else{
           point = 0;
        }

        return point;
    }
}