package Typings;

import java.util.HashMap;

public class CreateJson {
    public static void main(String[] args){
        HashMap<String,Type> listOfTypes = new HashMap<>();

        for (String s: Type.STRTYPES) {
            Type t = new Type(s);
            t.LoadType(s);
            listOfTypes.put(s,t);

        }
    }
}
