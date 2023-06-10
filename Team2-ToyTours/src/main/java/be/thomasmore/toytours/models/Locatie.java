package be.thomasmore.toytours.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Locatie {
    @Id
    private Integer id;
    private String naam;
    private String karakterFotoadres;
    private String achtergrondFotoadres;
    @Column(length = 500)
    private String tekstje;

    public Locatie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKarakterFotoadres() {
        return karakterFotoadres;
    }

    public void setKarakterFotoadres(String karakterFotoadres) {
        this.karakterFotoadres = karakterFotoadres;
    }

    public String getAchtergrondFotoadres() {
        return achtergrondFotoadres;
    }

    public void setAchtergrondFotoadres(String achtergrondFotoadres) {
        this.achtergrondFotoadres = achtergrondFotoadres;
    }

    public String getTekstje() {
        return tekstje;
    }

    public void setTekstje(String tekstje) {
        this.tekstje = tekstje;
    }
}
