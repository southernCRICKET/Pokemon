package Typings;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSON {
    public static void WriteJson(boolean print){
        HashMap<String, PokeType> listOfTypes = new HashMap<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        PokeType t;
        for (String s: PokeType.STR_TYPES) {
            t = new PokeType(s);
            t.LoadType();
            listOfTypes.put(s,t);
        }

        int success = CreateFile("Types.txt", gson.toJson(listOfTypes));
        if(print) {
            if (success == 1)
                System.out.println("File Created Successfully");
            else if (success == 0)
                System.out.println("File already exists");
            else
                System.out.println("Error occurred");
        }
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

    public static String ReadFile(String name){
        try{
            return Files.readString(Paths.get(name));
        } catch (IOException e){
            System.out.println("Error while reading JSON");
            e.printStackTrace();
        }
        return "0";
    }

    public static HashMap<String, PokeType> ReadJson(){
        String s=ReadFile("Types.txt");
        if(s.length()==1)
            return null;
        Type type = new TypeToken<HashMap<String,PokeType>>(){}.getType();
        return new Gson().fromJson(s, type);

    }
}
