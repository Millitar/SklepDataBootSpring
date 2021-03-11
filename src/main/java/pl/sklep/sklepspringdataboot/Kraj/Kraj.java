package pl.sklep.sklepspringdataboot.Kraj;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kraj {

    @Id
    private int kodKraju;

    private String nazwa_kraju;

    public Kraj(int kodKraju, String nazwa) {
        this.kodKraju = kodKraju;
        nazwa_kraju = nazwa;
    }

    public Kraj() {
    }

    public Kraj(int kodKraju) {
        this.kodKraju = kodKraju;
    }

    public String getNazwa_kraju() {
        return nazwa_kraju;
    }

    public void setNazwa_kraju(String nazwa_kraju) {
        this.nazwa_kraju = nazwa_kraju;
    }

    public int getKodKraju() {
        return kodKraju;
    }

    public void setKodKraju(int kodKraju) {
        this.kodKraju = kodKraju;
    }

}
