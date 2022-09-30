package Typings;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CreateJson {
    public static void main(String[] args){
        HashMap<String,Type> listOfTypes = new HashMap<>();
        String json="";

        for (String s: Type.STRTYPES) {
            Type t = new Type(s);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            t.LoadType(t);
            listOfTypes.put(s,t);
            json += gson.toJson(t)+"\n";
        }

        try{
            File file = new File("Types.txt");
            if(file.createNewFile())
                System.out.println("File Created");
            else
                System.out.println("File already exists");
            FileOutputStream fos = new FileOutputStream("Types.txt");
            fos.write(json.getBytes());
            fos.close();

        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
