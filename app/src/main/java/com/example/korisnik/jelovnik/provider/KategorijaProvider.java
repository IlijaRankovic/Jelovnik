package com.example.korisnik.jelovnik.provider;

import com.example.korisnik.jelovnik.model.Kategorija;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class KategorijaProvider {

    public static List<Kategorija> getKategorije(){

        List<Kategorija> kategorije = new ArrayList<>();
        kategorije.add(new Kategorija(0, "Rostilj"));
        kategorije.add(new Kategorija(1, "Pecenje"));
        kategorije.add(new Kategorija(2, "Kuvano"));
        kategorije.add(new Kategorija(3, "Sirovo"));
        return kategorije;
    }

    public static List<String> getKategorijaNaziv(){

        List<String> naziv = new ArrayList<>();
        naziv.add("Rostilj");
        naziv.add("Pecenje");
        naziv.add("Kuvano");
        naziv.add("Sirovo");
        return naziv;
    }

    public static Kategorija getKategorijaById(int id){
        switch (id){
            case 0:
                return new Kategorija(0, "Rostilj");
            case 1:
                return new Kategorija(1, "Pecenje");
            case 2:
                return new Kategorija(2, "Kuvano");
            case 3:
                return new Kategorija(3, "Sirovo");
            default:
                return null;
        }
    }
}
