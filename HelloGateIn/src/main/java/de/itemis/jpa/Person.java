package de.itemis.jpa;

public class Person {

    private int id;

    private String name;
    
    private String vorname;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getVorname() {
        return vorname;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    public String toString() {
        return vorname + " " + name + " (" + id +")";
    }
}
