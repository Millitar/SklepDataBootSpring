package pl.sklep.sklepspringdataboot.Asortyment;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asortyment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String kodKreskowy;
    private Double cena;
    private int ilosc;

    public Asortyment(String kodKreskowy, Double cena, int ilosc) {
        this.kodKreskowy = kodKreskowy;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public Asortyment() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKodKreskowy() {
        return kodKreskowy;
    }

    public void setKodKreskowy(String kodKreskowy) {
        this.kodKreskowy = kodKreskowy;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
