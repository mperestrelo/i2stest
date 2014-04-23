package de.itemis.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.itemis.jpa.Person;

@ManagedBean(name = "personBean")
@SessionScoped
public class PersonBean {

    private static int nextId = 0;

    private String name;
    private String vorname;
    private String neu;

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

    public String getNeu() {
        return neu;
    }

    public String create() {
        neu = createPerson(name, vorname).toString();
        name = "";
        vorname = "";
        return "";
    }

    private Person createPerson(String name, String vorname) {
        Person p = new Person();
        p.setName(name);
        p.setVorname(vorname);

        p.setId(nextId++);

        return p;
    }
}
