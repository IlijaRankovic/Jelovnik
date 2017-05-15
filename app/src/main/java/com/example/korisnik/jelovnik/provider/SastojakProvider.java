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
        Kategorija riba = new Kategorija(3, "Riba");

        Jelo pljeskavica = new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj);
        Jelo beloMeso = new Jelo(1, "beloMeso.jpg", "Belo meso", "Pilece grudi spremane na rostilju, veoma popularno kod sportista.", 80, 300, rostilj);
        Jelo sisCevap = new Jelo(2, "sisCevap.jpg", "Sis cevap", "Meso peceno na rostilju, sjajnog ukusa.", 100, 320, rostilj);
        Jelo raznjici = new Jelo(3, "raznjici.jpg", "Raznjici", "Kvalitetno meso stavljeno na stapic raznjic i peceno na rostilju.", 110, 280, rostilj);
        Jelo jagnjetina = new Jelo(4, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje);
        Jelo prasetina = new Jelo(5, "prasetina.jpg", "Prasetina", "Tradicionalan balkanski nacin spremanja praseceg mesa. Prase peceno na raznju.", 200, 800, pecenje);
        Jelo raguTelecaCorba = new Jelo(6, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano);
        Jelo domacaSupa = new Jelo(7, "domacaSupa.jpg", "Domaca supa", "Sjajan recept srpskih domacica, svakako treba probati.", 80, 150, kuvano);
        Jelo pasulj = new Jelo(8, "pasulj.jpg", "Pasulj", "Povrce koje se moze spremati na razne nacine. Medju najboljima je kuvani pasulj.", 150, 200, kuvano);
        Jelo susi = new Jelo(9, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, riba);
        Jelo oslic = new Jelo(10, "oslic.jpg", "Oslic", "Veoma ukusna riba, obogacena OMEGA3 kiselinama.", 110, 500, riba);
        Jelo brancin = new Jelo(11, "brancin.jpg", "Brancin", "Morska riba, visokog kvaliteta.", 120, 700, riba);
        Jelo orada = new Jelo(12, "orada.jpg", "Orada", "Kao i brancin, visoko kvalitetna morska riba. Svakako treba probati.", 100, 750, riba);

        List<Sastojak> sastojci = new ArrayList<>();
        sastojci.add(new Sastojak(0, "*So\n*Mleveno meso\n*Tucana paprika\n*Biber", pljeskavica));
        sastojci.add(new Sastojak(1, "So\n*Pilece grudi\n*Kari", beloMeso));
        sastojci.add(new Sastojak(2, "So\n*Mleveno meso\n*Sunka\n*Sir\n*Tucana paprika\n*Biber", sisCevap));
        sastojci.add(new Sastojak(3, "So\n*Pilece gruid\n*Slanina\n*Sir", raznjici));
        sastojci.add(new Sastojak(4, "So\n*Jagnje celo ocisceno", jagnjetina));
        sastojci.add(new Sastojak(5, "So\n*Prase celo ocisceno", prasetina));
        sastojci.add(new Sastojak(6, "So\n*Telece meso\n*Voda\n*Biber\n*Sargarepa\n*Pavlaka", raguTelecaCorba));
        sastojci.add(new Sastojak(7, "So\n*Junece meso\n*Voda\n*Biber\n*Sargarepa\n*Zacin C", domacaSupa));
        sastojci.add(new Sastojak(8, "So\n*Pasulj\n*Voda\n*Biber\n*Kranjska kobasica\n*Svinjska rebra\n*Sargarepa", pasulj));
        sastojci.add(new Sastojak(9, "So\n*Losos sirov\n*Pirinac\n*Biber", susi));
        sastojci.add(new Sastojak(10, "So\n*Prezla\n*Umucena jaja\n*Limun", oslic));
        sastojci.add(new Sastojak(11, "So\n*Limun", brancin));
        sastojci.add(new Sastojak(12, "So\n*Limun", orada));
        return sastojci;
    }

    public static List<String> getSastojakNaziv(){

        List<String> naziv = new ArrayList<>();
        naziv.add("*So\n*Mleveno meso\n*Tucana paprika\n*Biber");
        naziv.add("So\n*Pilece grudi\n*Kari");
        naziv.add("So\n*Mleveno meso\n*Sunka\n*Sir\n*Tucana paprika\n*Biber");
        naziv.add("So\n*Pilece gruid\n*Slanina\n*Sir");
        naziv.add("So\n*Jagnje celo ocisceno");
        naziv.add("So\n*Prase celo ocisceno");
        naziv.add("So\n*Telece meso\n*Voda\n*Biber\n*Sargarepa\n*Pavlaka");
        naziv.add("So\n*Junece meso\n*Voda\n*Biber\n*Sargarepa\n*Zacin C");
        naziv.add("So\n*Pasulj\n*Voda\n*Biber\n*Kranjska kobasica\n*Svinjska rebra\n*Sargarepa");
        naziv.add("So\n*Losos sirov\n*Pirinac\n*Biber");
        naziv.add("So\n*Prezla\n*Umucena jaja\n*Limun");
        naziv.add("So\n*Limun");
        naziv.add("So\n*Limun");
        return naziv;
    }

    public static Sastojak getSastojakById(int id){

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija pecenje = new Kategorija(1, "Pecenje");
        Kategorija kuvano = new Kategorija(2, "Kuvano");
        Kategorija riba = new Kategorija(3, "Riba");

        Jelo pljeskavica = new Jelo(0, "pljeskavica.jpg", "Pljeskavica", "Ukusno meso peceno na rostilju. Tradicionalno jelo balkanskih drzava.", 150, 250, rostilj);
        Jelo beloMeso = new Jelo(1, "beloMeso.jpg", "Belo meso", "Pilece grudi spremane na rostilju, veoma popularno kod sportista.", 80, 300, rostilj);
        Jelo sisCevap = new Jelo(2, "sisCevap.jpg", "Sis cevap", "Meso peceno na rostilju, sjajnog ukusa.", 100, 320, rostilj);
        Jelo raznjici = new Jelo(3, "raznjici.jpg", "Raznjici", "Kvalitetno meso stavljeno na stapic raznjic i peceno na rostilju.", 110, 280, rostilj);
        Jelo jagnjetina = new Jelo(4, "jagnjetina.jpg", "Jagnjetina", "Jagnje peceno na raznju, softano i ukusno meso.", 190, 1000, pecenje);
        Jelo prasetina = new Jelo(5, "prasetina.jpg", "Prasetina", "Tradicionalan balkanski nacin spremanja praseceg mesa. Prase peceno na raznju.", 200, 800, pecenje);
        Jelo raguTelecaCorba = new Jelo(6, "raguTelecaCorba.jpg", "Ragu teleca corba", "Corba visokog kvaliteta sa telecim mesom.", 90, 150, kuvano);
        Jelo domacaSupa = new Jelo(7, "domacaSupa.jpg", "Domaca supa", "Sjajan recept srpskih domacica, svakako treba probati.", 80, 150, kuvano);
        Jelo pasulj = new Jelo(8, "pasulj.jpg", "Pasulj", "Povrce koje se moze spremati na razne nacine. Medju najboljima je kuvani pasulj.", 150, 200, kuvano);
        Jelo susi = new Jelo(9, "susi.jpg", "Susi", "Japansko tradicionalno jelo, spremano sa sirovom ribom Losos", 170, 1200, riba);
        Jelo oslic = new Jelo(10, "oslic.jpg", "Oslic", "Veoma ukusna riba, obogacena OMEGA3 kiselinama.", 110, 500, riba);
        Jelo brancin = new Jelo(11, "brancin.jpg", "Brancin", "Morska riba, visokog kvaliteta.", 120, 700, riba);
        Jelo orada = new Jelo(12, "orada.jpg", "Orada", "Kao i brancin, visoko kvalitetna morska riba. Svakako treba probati.", 100, 750, riba);

        switch (id){
            case 0:
                return new Sastojak(0, "*So\n*Mleveno meso\n*Tucana paprika\n*Biber", pljeskavica);
            case 1:
                return new Sastojak(1, "So\n*Pilece grudi\n*Kari", beloMeso);
            case 2:
                return new Sastojak(2, "So\n*Mleveno meso\n*Sunka\n*Sir\n*Tucana paprika\n*Biber", sisCevap);
            case 3:
                return new Sastojak(3, "So\n*Pilece gruid\n*Slanina\n*Sir", raznjici);
            case 4:
                return new Sastojak(4, "So\n*Jagnje celo ocisceno", jagnjetina);
            case 5:
                return new Sastojak(5, "So\n*Prase celo ocisceno", prasetina);
            case 6:
                return new Sastojak(6, "So\n*Telece meso\n*Voda\n*Biber\n*Sargarepa\n*Pavlaka", raguTelecaCorba);
            case 7:
                return new Sastojak(7, "So\n*Junece meso\n*Voda\n*Biber\n*Sargarepa\n*Zacin C", domacaSupa);
            case 8:
                return new Sastojak(8, "So\n*Pasulj\n*Voda\n*Biber\n*Kranjska kobasica\n*Svinjska rebra\n*Sargarepa", pasulj);
            case 9:
                return new Sastojak(9, "So\n*Losos sirov\n*Pirinac\n*Biber", susi);
            case 10:
                return new Sastojak(10, "So\n*Prezla\n*Umucena jaja\n*Limun", oslic);
            case 11:
                return new Sastojak(11, "So\n*Limun", brancin);
            case 12:
                return new Sastojak(12, "So\n*Limun", orada);
            default:
                return null;
        }
    }
}
