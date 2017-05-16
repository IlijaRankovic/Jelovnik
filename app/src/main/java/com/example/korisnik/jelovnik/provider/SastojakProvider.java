package com.example.korisnik.jelovnik.provider;

import com.example.korisnik.jelovnik.model.Jelo;
import com.example.korisnik.jelovnik.model.Kategorija;
import com.example.korisnik.jelovnik.model.Sastojak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class SastojakProvider {

    public static List<Sastojak> getSastojak(){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija sirovo = new Kategorija(3, "Sirovo");

        Jelo pljeskavica = new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj);
        Jelo jagnjetina = new Jelo(1, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje);
        Jelo raguTelecaCorba = new Jelo(2, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano);
        Jelo susi = new Jelo(3, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, sirovo);

        List<Sastojak> sastojci = new ArrayList<>();
        sastojci.add(new Sastojak(0, "*So\n*Mleveno meso\n*Tucana paprika\n*Biber", pljeskavica));
        sastojci.add(new Sastojak(1, "So\n*Jagnje celo ocisceno", jagnjetina));
        sastojci.add(new Sastojak(2, "So\n*Telece meso\n*Voda\n*Biber\n*Sargarepa\n*Pavlaka", raguTelecaCorba));
        sastojci.add(new Sastojak(3, "So\n*Losos sirov\n*Pirinac\n*Biber", susi));
        return sastojci;
    }

    public static List<String> getSastojakNaziv(){

        List<String> naziv = new ArrayList<>();
        naziv.add("*So\n*Mleveno meso\n*Tucana paprika\n*Biber");
        naziv.add("So\n*Jagnje celo ocisceno");
        naziv.add("So\n*Telece meso\n*Voda\n*Biber\n*Sargarepa\n*Pavlaka");
        naziv.add("So\n*Losos sirov\n*Pirinac\n*Biber");
        return naziv;
    }

    public static Sastojak getSastojakById(int id){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija sirovo = new Kategorija(3, "Sirovo");

        Jelo pljeskavica = new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj);
        Jelo jagnjetina = new Jelo(1, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje);
        Jelo raguTelecaCorba = new Jelo(2, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano);
        Jelo susi = new Jelo(3, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, sirovo);

        switch (id){
            case 0:
                return new Sastojak(0, "*So\n*Mleveno meso\n*Tucana paprika\n*Biber", pljeskavica);
            case 1:
                return new Sastojak(1, "*So\n*Jagnje celo ocisceno", jagnjetina);
            case 2:
                return new Sastojak(2, "*So\n*Telece meso\n*Voda\n*Biber\n*Sargarepa\n*Pavlaka", raguTelecaCorba);
            case 3:
                return new Sastojak(3, "*So\n*Losos sirov\n*Pirinac\n*Biber", susi);
            default:
                return null;
        }
    }
}
