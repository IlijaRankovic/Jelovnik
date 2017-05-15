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
        Kategorija riba = new Kategorija(3, "Riba");

        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj));
        jela.add(new Jelo(1, "beloMeso.jpg", "Belo meso", "Pilece grudi spremane na rostilju, veoma popularno kod sportista.", 80, 300, rostilj));
        jela.add(new Jelo(2, "sisCevap.jpg", "Sis cevap", "Meso peceno na rostilju, sjajnog ukusa.", 100, 320, rostilj));
        jela.add(new Jelo(3, "raznjici.jpg", "Raznjici", "Kvalitetno meso stavljeno na stapic raznjic i peceno na rostilju.", 110, 280, rostilj));
        jela.add(new Jelo(4, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje));
        jela.add(new Jelo(5, "prasetina.jpg", "Prasetina", "Tradicionalan balkanski nacin spremanja praseceg mesa. Prase peceno na raznju.", 200, 800, pecenje));
        jela.add(new Jelo(6, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano));
        jela.add(new Jelo(7, "domacaSupa.jpg", "Domaca supa", "Sjajan recept srpskih domacica, svakako treba probati.", 80, 150, kuvano));
        jela.add(new Jelo(8, "pasulj.jpg", "Pasulj", "Povrce koje se moze spremati na razne nacine. Medju najboljima je kuvani pasulj.", 150, 200, kuvano));
        jela.add(new Jelo(9, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, riba));
        jela.add(new Jelo(10, "oslic.jpg", "Oslic", "Veoma ukusna riba, obogacena OMEGA3 kiselinama.", 110, 500, riba));
        jela.add(new Jelo(11, "brancin.jpg", "Brancin", "Morska riba, visokog kvaliteta.", 120, 700, riba));
        jela.add(new Jelo(12, "orada.jpg", "Orada", "Kao i brancin, visoko kvalitetna morska riba. Svakako treba probati.", 100, 750, riba));
        return jela;
    }

    public static List<String> getJeloNaziv(){

        List<String> naziv = new ArrayList<>();
        naziv.add("Pljeskavica");
        naziv.add("Belo meso");
        naziv.add("Sis cevap");
        naziv.add("Raznjici");
        naziv.add("Jagnjetina");
        naziv.add("Prasetina");
        naziv.add("Ragu teleca corba");
        naziv.add("Domaca supa");
        naziv.add("Pasulj");
        naziv.add("Susi");
        naziv.add("Oslic");
        naziv.add("Brancin");
        naziv.add("Orada");
        return naziv;
    }

    public static Jelo getJeloById(int id){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija riba = new Kategorija(3, "Riba");

        switch (id){
            case 0:
                return new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj);
            case 1:
                return new Jelo(1, "beloMeso.jpg", "Belo meso", "Pilece grudi spremane na rostilju, veoma popularno kod sportista.", 80, 300, rostilj);
            case 2:
                return new Jelo(2, "sisCevap.jpg", "Sis cevap", "Meso peceno na rostilju, sjajnog ukusa.", 100, 320, rostilj);
            case 3:
                return new Jelo(3, "raznjici.jpg", "Raznjici", "Kvalitetno meso stavljeno na stapic raznjic i peceno na rostilju.", 110, 280, rostilj);
            case 4:
                return new Jelo(4, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje);
            case 5:
                return new Jelo(5, "prasetina.jpg", "Prasetina", "Tradicionalan balkanski nacin spremanja praseceg mesa. Prase peceno na raznju.", 200, 800, pecenje);
            case 6:
                return new Jelo(6, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano);
            case 7:
                return new Jelo(7, "domacaSupa.jpg", "Domaca supa", "Sjajan recept srpskih domacica, svakako treba probati.", 80, 150, kuvano);
            case 8:
                return new Jelo(8, "pasulj.jpg", "Pasulj", "Povrce koje se moze spremati na razne nacine. Medju najboljima je kuvani pasulj.", 150, 200, kuvano);
            case 9:
                return new Jelo(9, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, riba);
            case 10:
                return new Jelo(10, "oslic.jpg", "Oslic", "Veoma ukusna riba, obogacena OMEGA3 kiselinama.", 110, 500, riba);
            case 11:
                return new Jelo(11, "brancin.jpg", "Brancin", "Morska riba, visokog kvaliteta.", 120, 700, riba);
            case 12:
                return new Jelo(12, "orada.jpg", "Orada", "Kao i brancin, visoko kvalitetna morska riba. Svakako treba probati.", 100, 750, riba);
            default:
                return null;
        }
    }
}
