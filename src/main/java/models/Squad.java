package models;

import java.util.ArrayList;

public class Squad {
    private String name;
    private int size;
    private String cause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private ArrayList<Hero> heroes = new ArrayList<>();
    private int sid;

    public Squad(String name, int size, String cause) {
        this.name = name;
        this.size = size;
        this.cause = cause;
        this.heroes=new ArrayList<> ();
        this.sid = instances.size();
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getCause() {
        return cause;
    }

    public int getId(){
        return sid;
    }

    public static Squad findById(int id) {
        return instances.get(id-1);
    }

    public static ArrayList<Squad> getAllInstances() {
        return instances;
    }

    public ArrayList<Hero> getHeroes(){
        return heroes;
    }

    public void setNewHero(Hero newHero) {
        heroes.add(newHero);
    }

    public void clearAllHeroes(){
        getHeroes().clear();
    }

    public static void clear(){
        instances.clear();
    }

    public int findid() {
        return sid;
    }

}
