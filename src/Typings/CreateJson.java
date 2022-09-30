package Typings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class CreateJson {
    public static void main(String[] args){
        HashMap<String,Type> listOfTypes = new HashMap<>();

        for (String s: Type.STRTYPES) {
            Type t = new Type(s);
            JSONObject jo = new JSONObject();
            t.LoadType(t);
            listOfTypes.put(s,t);
            jo.put("name", s);
            Map m = new LinkedHashMap(2);

        }
    }
}
