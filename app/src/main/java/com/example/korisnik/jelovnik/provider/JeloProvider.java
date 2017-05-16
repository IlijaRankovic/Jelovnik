package com.example.korisnik.jelovnik.provider;

import com.example.korisnik.jelovnik.model.Jelo;
import com.example.korisnik.jelovnik.model.Kategorija;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class JeloProvider {

    public static List<Jelo> getJelo(){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija sirovo = new Kategorija(3, "Sirovo");

        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj));
        jela.add(new Jelo(1, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje));
        jela.add(new Jelo(2, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano));
        jela.add(new Jelo(3, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, sirovo));
        return jela;
    }

    public static List<String> getJeloNaziv(){

        List<String> naziv = new ArrayList<>();
        naziv.add("Pljeskavica");
        naziv.add("Jagnjetina");
        naziv.add("Ragu teleca corba");
        naziv.add("Susi");
        return naziv;
    }

    public static Jelo getJeloById(int id){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija sirovo = new Kategorija(3, "Sirovo");

        switch (id){
            case 0:
                return new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj);
            case 1:
                return new Jelo(1, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje);
            case 2:
                return new Jelo(2, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano);
            case 3:
                return new Jelo(3, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, sirovo);
            default:
                return null;
        }
    }
}
