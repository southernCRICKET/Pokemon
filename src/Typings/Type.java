package Typings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Type {
    String name;
    Effective attacking;
    Effective defending;
    static final  ArrayList<String> STR_TYPES = new ArrayList<>(Arrays.asList("Fire", "Water", "Ice", "Grass", "Dragon", "Ghost",
            "Fairy", "Bug", "Dark", "Flying", "Normal",
            "Electric", "Poison", "Ground", "Rock", "Fighting", "Steel", "Psychic"));

    public Type(String name){
        this.name=name;
        attacking = new Effective();
        defending = new Effective();
    }

    public void LoadType(){
        ArrayList<String> arr = new ArrayList<>(STR_TYPES);
        switch (this.name) {
            case "Fire" -> {
                this.attacking.strong.addAll(Arrays.asList("Grass", "Ice", "Bug", "Steel"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fire", "Water", "Rock", "Dragon"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Water", "Ground", "Rock"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fire", "Grass", "Ice", "Bug", "Steel", "Fairy"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);
            }
            case "Normal" -> {
                this.attacking.weak.addAll(Arrays.asList("Rock", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Ghost");
                arr.removeAll(this.attacking.immune);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.add("Fighting");
                arr.removeAll(this.defending.strong);
                this.defending.immune.add("Ghost");
                this.defending.normal.addAll(arr);

            }
            case "Water" -> {
                this.attacking.strong.addAll(Arrays.asList("Fire", "Ground", "Rock"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Grass", "Water", "Dragon"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Grass", "Electric"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fire", "Water", "Ice", "Steel"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Grass" -> {
                this.attacking.strong.addAll(Arrays.asList("Water", "Ground", "Rock"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fire", "Grass", "Ground", "Flying", "Bug", "Dragon", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Fire", "Ice", "Poison", "Flying", "Bug"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Water", "Grass", "Electric", "Ground"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Electric" -> {
                this.attacking.strong.addAll(Arrays.asList("Water", "Flying"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Grass", "Ice", "Dragon"));
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Ground");
                arr.removeAll(this.attacking.immune);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.add("Ground");
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Electric", "Flying", "Steel"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Ice" -> {
                this.attacking.strong.addAll(Arrays.asList("Grass", "Ground", "Flying", "Dragon"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fire", "Water", "Ice", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Fire", "Fighting", "Rock", "Steel"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.add("Ice");
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Fighting" -> {
                this.attacking.strong.addAll(Arrays.asList("Normal", "Ice", "Rock", "Steel", "Dark"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Poison", "Flying", "Psychic", "Bug", "Fairy"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Flying", "Psychic", "Fairy"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Dark", "Rock", "Bug"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Poison" -> {
                this.attacking.strong.addAll(Arrays.asList("Grass", "Fairy"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Poison", "Ground", "Rock", "Ghost"));
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Steel");
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Psychic", "Ground"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fighting", "Grass", "Poison", "Bug", "Fairy"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);
            }
            case "Ground" -> {
                this.attacking.strong.addAll(Arrays.asList("Fire", "Electric", "Poison", "Rock", "Steel"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Grass", "Bug"));
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Electric");
                arr.remove("Electric");
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Water", "Grass", "Ice"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Poison", "Rock"));
                arr.removeAll(this.defending.weak);
                this.defending.immune.add("Electric");
                arr.remove("Electric");
                this.defending.normal.addAll(arr);
            }
            case "Flying" -> {
                this.attacking.strong.addAll(Arrays.asList("Grass", "Fighting", "Bug"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Electric", "Steel", "Rock"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Electric", "Ice", "Rock"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Grass", "Fighting", "Bug"));
                arr.removeAll(this.defending.weak);
                this.defending.immune.add("Ground");
                arr.remove("Ground");
                this.defending.normal.addAll(arr);
            }
            case "Psychic" -> {
                this.attacking.strong.addAll(Arrays.asList("Fighting", "Poison"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Psychic", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Dark");
                arr.remove("Dark");
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Bug", "Ghost", "Dark"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fighting", "Psychic"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);
            }
            case "Bug" -> {
                this.attacking.strong.addAll(Arrays.asList("Grass", "Psychic", "Dark"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel", "Fairy"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Fire", "Flying", "Rock"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Grass", "Fighting", "Ground"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Rock" -> {
                this.attacking.strong.addAll(Arrays.asList("Fire", "Ice", "Bug", "Flying"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fighting", "Ground", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Water", "Ground", "Grass", "Fighting", "Steel"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fire", "Normal", "Poison", "Flying"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);
            }
            case "Ghost" -> {
                this.attacking.strong.addAll(Arrays.asList("Psychic", "Ghost"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.add("Dark");
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Normal");
                arr.remove("Normal");
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Ghost", "Dark"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Poison", "Bug"));
                arr.removeAll(this.defending.weak);
                this.defending.immune.addAll(Arrays.asList("Normal", "Fighting"));
                arr.removeAll(this.defending.immune);
                this.defending.normal.addAll(arr);
            }
            case "Dragon" -> {
                this.attacking.strong.add("Dragon");
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.add("Steel");
                arr.removeAll(this.attacking.weak);
                this.attacking.immune.add("Fairy");
                arr.remove("Fairy");
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Ice", "Dragon", "Fairy"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fire", "Grass", "Water", "Electric"));
                arr.removeAll(this.defending.weak);
                this.defending.normal.addAll(arr);

            }
            case "Dark" -> {
                this.attacking.strong.addAll(Arrays.asList("Psychic", "Ghost"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fighting", "Dark", "Fairy"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Fighting", "Bug", "Fairy"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Ghost", "Dark"));
                arr.removeAll(this.defending.weak);
                this.defending.immune.add("Psychic");
                arr.remove("Psychic");
                this.defending.normal.addAll(arr);

            }
            case "Steel" -> {
                this.attacking.strong.addAll(Arrays.asList("Ice", "Rock", "Fairy"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fire", "Water", "Electric", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Fire", "Ground", "Fighting"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Normal", "Grass", "Ice", "Flying", "Psychic", "Bug", "Rock", "Dragon", "Steel", "Fairy"));
                arr.removeAll(this.defending.weak);
                this.defending.immune.add("Poison");
                arr.remove("Poison");
                this.defending.normal.addAll(arr);

            }
            case "Fairy" -> {
                this.attacking.strong.addAll(Arrays.asList("Fighting", "Dragon", "Dark"));
                arr.removeAll(this.attacking.strong);
                this.attacking.weak.addAll(Arrays.asList("Fire", "Poison", "Steel"));
                arr.removeAll(this.attacking.weak);
                this.attacking.normal.addAll(arr);
                arr.clear();
                arr.addAll(STR_TYPES);
                this.defending.strong.addAll(Arrays.asList("Poison", "Steel"));
                arr.removeAll(this.defending.strong);
                this.defending.weak.addAll(Arrays.asList("Fighting", "Dark", "Bug"));
                arr.removeAll(this.defending.weak);
                this.defending.immune.add("Dragon");
                arr.remove("Dragon");
                this.defending.normal.addAll(arr);

            }
        }
    }

    public void PrintType(){
        System.out.println("\n" + this.name);
        System.out.println("\tAttacking");
        System.out.print("\t\tSuper effective against: ");
        PrintList(attacking.strong);
        System.out.print("\t\tNot very effective against: ");
        PrintList(attacking.weak);
        System.out.print("\t\tNeutral against: ");
        PrintList(attacking.normal);
        if(!attacking.immune.isEmpty()){
            System.out.print("\t\tHas no effect on: ");
            PrintList(attacking.immune);
        }
        System.out.println("\tDefending");
        System.out.print("\t\tWeak to: ");
        PrintList(defending.strong);
        System.out.print("\t\tStrong to: ");
        PrintList(defending.weak);
        System.out.print("\t\tNeutral to: ");
        PrintList(defending.normal);
        if(!defending.immune.isEmpty()){
            System.out.print("\t\tImmune to: ");
            PrintList(defending.immune);
        }
    }

    public void PrintList(List<String> list){
        for(String s:list) {
            if (list.indexOf(s)==(list.size()-1))
                System.out.println(s + "\n");
            else
                System.out.print(s + ", ");
        }
    }
}
