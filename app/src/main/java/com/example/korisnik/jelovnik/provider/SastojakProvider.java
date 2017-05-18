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
        sastojci.add(new Sastojak(0, "*So", pljeskavica));
        sastojci.add(new Sastojak(1, "*So", jagnjetina));
        sastojci.add(new Sastojak(2, "*So", raguTelecaCorba));
        sastojci.add(new Sastojak(3, "*So", susi));
        sastojci.add(new Sastojak(4, "*Losos sirov", susi));
        sastojci.add(new Sastojak(5, "*Pirinac", susi));
        sastojci.add(new Sastojak(6, "*Biber", susi));
        sastojci.add(new Sastojak(7, "*Mleveno meso", pljeskavica));
        sastojci.add(new Sastojak(8, "*Tucana paprika", pljeskavica));
        sastojci.add(new Sastojak(9, "*Biber", pljeskavica));
        sastojci.add(new Sastojak(10, "*Jagnje celo ocisceno", jagnjetina));
        sastojci.add(new Sastojak(11, "*Telece meso", raguTelecaCorba));
        sastojci.add(new Sastojak(12, "*Voda", raguTelecaCorba));
        sastojci.add(new Sastojak(13, "*Biber", raguTelecaCorba));
        sastojci.add(new Sastojak(14, "*Sargarepa", raguTelecaCorba));
        sastojci.add(new Sastojak(15, "*Pavlaka", raguTelecaCorba));
        return sastojci;
    }

    public static List<String> getSastojakNaziv(){

        List<String> naziv = new ArrayList<>();
        naziv.add("*So");
        naziv.add("*Mleveno meso");
        naziv.add("*Tucana paprika");
        naziv.add("*Biber");
        naziv.add("*Jagnje celo ocisceno");
        naziv.add("*So");
        naziv.add("So");
        naziv.add("*Telece meso");
        naziv.add("*Voda");
        naziv.add("*Biber");
        naziv.add("*Sargarepa");
        naziv.add("*Pavlaka");
        naziv.add("*So");
        naziv.add("*Losos sirov");
        naziv.add("*Pirinac");
        naziv.add("*Biber");
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
                return new Sastojak(0, "*So", pljeskavica);
            case 1:
                return new Sastojak(1, "*So", jagnjetina);
            case 2:
                return new Sastojak(2, "*So", raguTelecaCorba);
            case 3:
                return new Sastojak(3, "*So", susi);
            case 4:
                return new Sastojak(4, "*Losos sirov", susi);
            case 5:
                return new Sastojak(5, "*Pirinac", susi);
            case 6:
                return new Sastojak(6, "*Biber", susi);
            case 7:
                return new Sastojak(7, "*Mleveno meso", pljeskavica);
            case 8:
                return new Sastojak(8, "*Tucana paprika", pljeskavica);
            case 9:
                return new Sastojak(9, "*Biber", pljeskavica);
            case 10:
                return new Sastojak(10, "*Jagnje celo ocisceno", jagnjetina);
            case 11:
                return new Sastojak(11, "*Telece meso", raguTelecaCorba);
            case 12:
                return new Sastojak(12, "*Voda", raguTelecaCorba);
            case 13:
                return new Sastojak(13, "*Biber", raguTelecaCorba);
            case 14:
                return new Sastojak(14, "*Sargarepa", raguTelecaCorba);
            case 15:
                return new Sastojak(15, "*Pavlaka", raguTelecaCorba);
            default:
                return null;
        }
    }
}
