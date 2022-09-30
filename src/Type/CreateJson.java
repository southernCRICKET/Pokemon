package Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CreateJson {
    public static void main(String[] args){
        HashMap<String,Type> listOfTypes = new HashMap<>();
        ArrayList<String> strTypes = new ArrayList<>(Arrays.asList("Fire", "Water", "Ice", "Grass", "Dragon", "Ghost",
                "Fairy", "Bug", "Dark", "Flying", "Normal",
                "Electric", "Poison", "Ground", "Rock", "Fighting", "Steel", "Psychic"));
        for (String s:strTypes) {
            Type t = new Type(s);
            ArrayList<String> arr = new ArrayList<>(strTypes);
            switch (s) {
                case "Fire" -> {
                    t.attacking.strong.addAll(Arrays.asList("Grass", "Ice", "Bug", "Steel"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Water", "Rock", "Dragon"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Water", "Ground", "Rock"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fire", "Grass", "Ice", "Bug", "Steel", "Fairy"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Normal" -> {
                    t.attacking.weak.addAll(Arrays.asList("Rock", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Ghost");
                    arr.removeAll(t.attacking.immune);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.add("Fighting");
                    arr.removeAll(t.defending.strong);
                    t.defending.immune.add("Ghost");
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Water" -> {
                    t.attacking.strong.addAll(Arrays.asList("Fire", "Ground", "Rock"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Grass", "Water", "Dragon"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Grass", "Electric"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fire", "Water", "Ice", "Steel"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Grass" -> {
                    t.attacking.strong.addAll(Arrays.asList("Water", "Ground", "Rock"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Grass", "Ground", "Flying", "Bug", "Dragon", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Fire", "Ice", "Poison", "Flying", "Bug"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Water", "Grass", "Electric", "Ground"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Electric" -> {
                    t.attacking.strong.addAll(Arrays.asList("Water", "Flying"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Grass", "Ice", "Dragon"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Ground");
                    arr.removeAll(t.attacking.immune);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.add("Ground");
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Electric", "Flying", "Steel"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Ice" -> {
                    t.attacking.strong.addAll(Arrays.asList("Grass", "Ground", "Flying", "Dragon"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Water", "Ice", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Fire", "Fighting", "Rock", "Steel"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.add("Ice");
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Fighting" -> {
                    t.attacking.strong.addAll(Arrays.asList("Normal", "Ice", "Rock", "Steel", "Dark"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Poison", "Flying", "Psychic", "Bug", "Fairy"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Flying", "Psychic", "Fairy"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Dark", "Rock", "Bug"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Poison" -> {
                    t.attacking.strong.addAll(Arrays.asList("Grass", "Fairy"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Poison", "Ground", "Rock", "Ghost"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Steel");
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Psychic", "Ground"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fighting", "Grass", "Poison", "Bug", "Fairy"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Ground" -> {
                    t.attacking.strong.addAll(Arrays.asList("Fire", "Electric", "Poison", "Rock", "Steel"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Grass", "Bug"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Electric");
                    arr.remove("Electric");
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Water", "Grass", "Ice"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Poison", "Rock"));
                    arr.removeAll(t.defending.weak);
                    t.defending.immune.add("Electric");
                    arr.remove("Electric");
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Flying" -> {
                    t.attacking.strong.addAll(Arrays.asList("Grass", "Fighting", "Bug"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Electric", "Steel", "Rock"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Electric", "Ice", "Rock"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Grass", "Fighting", "Bug"));
                    arr.removeAll(t.defending.weak);
                    t.defending.immune.add("Ground");
                    arr.remove("Ground");
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Psychic" -> {
                    t.attacking.strong.addAll(Arrays.asList("Fighting", "Poison"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Psychic", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Dark");
                    arr.remove("Dark");
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Bug", "Ghost", "Dark"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fighting", "Psychic"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Bug" -> {
                    t.attacking.strong.addAll(Arrays.asList("Grass", "Psychic", "Dark"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel", "Fairy"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Fire", "Flying", "Rock"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Grass", "Fighting", "Ground"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Rock" -> {
                    t.attacking.strong.addAll(Arrays.asList("Fire", "Ice", "Bug", "Flying"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fighting", "Ground", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Water", "Ground", "Grass", "Fighting", "Steel"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fire", "Normal", "Poison", "Flying"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Ghost" -> {
                    t.attacking.strong.addAll(Arrays.asList("Psychic", "Ghost"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.add("Dark");
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Normal");
                    arr.remove("Normal");
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Ghost", "Dark"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Poison", "Bug"));
                    arr.removeAll(t.defending.weak);
                    t.defending.immune.addAll(Arrays.asList("Normal", "Fighting"));
                    arr.removeAll(t.defending.immune);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Dragon" -> {
                    t.attacking.strong.add("Dragon");
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.add("Steel");
                    arr.removeAll(t.attacking.weak);
                    t.attacking.immune.add("Fairy");
                    arr.remove("Fairy");
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Ice", "Dragon", "Fairy"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fire", "Grass", "Water", "Electric"));
                    arr.removeAll(t.defending.weak);
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Dark" -> {
                    t.attacking.strong.addAll(Arrays.asList("Psychic", "Ghost"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fighting", "Dark", "Fairy"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Fighting", "Bug", "Fairy"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Ghost", "Dark"));
                    arr.removeAll(t.defending.weak);
                    t.defending.immune.add("Psychic");
                    arr.remove("Psychic");
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Steel" -> {
                    t.attacking.strong.addAll(Arrays.asList("Ice", "Rock", "Fairy"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Water", "Electric", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Fire", "Ground", "Fighting"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Normal", "Grass", "Ice", "Flying", "Psychic", "Bug", "Rock", "Dragon", "Steel", "Fairy"));
                    arr.removeAll(t.defending.weak);
                    t.defending.immune.add("Poison");
                    arr.remove("Poison");
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
                case "Fairy" -> {
                    t.attacking.strong.addAll(Arrays.asList("Fighting", "Dragon", "Dark"));
                    arr.removeAll(t.attacking.strong);
                    t.attacking.weak.addAll(Arrays.asList("Fire", "Poison", "Steel"));
                    arr.removeAll(t.attacking.weak);
                    t.attacking.normal.addAll(arr);
                    arr.clear();
                    arr.addAll(strTypes);
                    t.defending.strong.addAll(Arrays.asList("Poison", "Steel"));
                    arr.removeAll(t.defending.strong);
                    t.defending.weak.addAll(Arrays.asList("Fighting", "Dark", "Bug"));
                    arr.removeAll(t.defending.weak);
                    t.defending.immune.add("Dragon");
                    arr.remove("Dragon");
                    t.defending.normal.addAll(arr);
                    listOfTypes.put(s, t);
                }
            }
        }
    }
}
