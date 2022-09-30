package Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateJson {
    public static void main(String[] args){
        ArrayList<Type> listOfTypes = new ArrayList<Type>();
        ArrayList<String> strTypes = new ArrayList<>(Arrays.asList("Fire", "Water", "Ice", "Grass", "Dragon", "Ghost",
                "Fairy", "Bug", "Dark", "Fairy", "Normal",
                "Electric", "Poison", "Ground", "Rock", "Fighting", "Steel", "Psychic"));
        for (String s:strTypes) {
            Type t = new Type(s);
            ArrayList<String> arr = new ArrayList<>();
            System.out.println(strTypes.toString());
            arr.addAll(strTypes);
            switch (s){
                case "Fire":
                    t.attacking.strong.addAll(Arrays.asList("Grass", "Ice","Bug","Steel"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Water","Rock","Dragon"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Water","Ground","Rock"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fire","Grass","Ice","Bug","Steel","Fairy"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
            }
        }
    }
}
