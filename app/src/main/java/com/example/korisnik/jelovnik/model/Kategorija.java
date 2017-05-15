package com.example.korisnik.jelovnik.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class Kategorija {

    private int id;
    private String naziv;
    private List<Jelo> jela;

    public Kategorija(){
        jela = new ArrayList<>();
    }

    public Kategorija(int id, String naziv){

        this.id = id;
        this.naziv = naziv;
        jela = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void addJelo(Jelo jelo) {

        jela.add(jelo);
    }

    public void removeJelo(Jelo jelo) {

        jela.remove(jelo);
    }

    public Jelo getJelo(int position) {

        return jela.get(position);
    }

    public List<Jelo> getJela() {
        return jela;
    }

    public void setJela(List<Jelo> jela) {
        this.jela = jela;
    }
}
