package Typings;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSON {
    public static void main(String[] args){
        int success = CreateFile("Types.txt", CreateJson());
        if(success==1)
            System.out.println("File Created Successfully");
        else if (success==0)
            System.out.println("File already exists");
        else
            System.out.println("Error occurred");
    }

    public static String CreateJson(){
        HashMap<String,Type> listOfTypes = new HashMap<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type t;
        for (String s: Type.STR_TYPES) {
            t = new Type(s);
            t.LoadType();
            listOfTypes.put(s,t);
        }
       return gson.toJson(listOfTypes)+"\n";
    }

    public static int CreateFile(String name, String outputToFile)
    {
        try{
            File file = new File(name);
            if(!file.createNewFile())
                return 0;
            FileOutputStream fos = new FileOutputStream(name);
            fos.write(outputToFile.getBytes());
            fos.close();
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
            return -1;
        }

        return 1;
    }
}
