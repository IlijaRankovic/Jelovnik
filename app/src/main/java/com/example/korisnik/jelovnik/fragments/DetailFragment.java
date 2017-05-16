package com.example.korisnik.jelovnik.fragments;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.korisnik.jelovnik.R;
import com.example.korisnik.jelovnik.model.Kategorija;
import com.example.korisnik.jelovnik.provider.JeloProvider;
import com.example.korisnik.jelovnik.provider.KategorijaProvider;
import com.example.korisnik.jelovnik.provider.SastojakProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Korisnik on 16.5.2017..
 */

public class DetailFragment extends Fragment {

    private int position = 0;

    @Override
    public void onCreate(Bundle savedInstatnceState){
        super.onCreate(savedInstatnceState);

        Toast.makeText(getActivity(), "DetailFragment.onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(Bundle savedInsatnceState){
        super.onActivityCreated(savedInsatnceState);

        Toast.makeText(getActivity(), "DetailFragment.onActivityCreated()", Toast.LENGTH_SHORT).show();

        if(savedInsatnceState != null){
            position = savedInsatnceState.getInt("position", 0);
        }

        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(JeloProvider.getJeloById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvNaziv = (TextView) getView().findViewById(R.id.tv_naziv);
        tvNaziv.setText(JeloProvider.getJeloById(position).getNaziv());

        TextView tvOpis = (TextView) getView().findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvider.getJeloById(position).getOpis());

        Spinner kategorija = (Spinner) getView().findViewById(R.id.sp_kategorija);
        List<String> kategorije = KategorijaProvider.getKategorijaNaziv();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, kategorije);
        kategorija.setAdapter(adapter);
        kategorija.setSelection((int)JeloProvider.getJeloById(position).getKategorija().getId());

        Button btnBuy = (Button) getView().findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Kupili ste " + JeloProvider.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        TextView tvSastojak = (TextView) getView().findViewById(R.id.tv_sastojak);
        tvSastojak.setText(SastojakProvider.getSastojakById(position).getNaziv());

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onSaveInstanceState()", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt("position", position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "DetailFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();

        Toast.makeText(getActivity(), "DetailFragment.onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    public void setContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }

    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);

        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(JeloProvider.getJeloById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvNaziv = (TextView) getView().findViewById(R.id.tv_naziv);
        tvNaziv.setText(JeloProvider.getJeloById(position).getNaziv());

        TextView tvOpis = (TextView) getView().findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvider.getJeloById(position).getOpis());

        Spinner kategorija = (Spinner) getView().findViewById(R.id.sp_kategorija);
        List<String> kategorije = KategorijaProvider.getKategorijaNaziv();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, kategorije);
        kategorija.setAdapter(adapter);
        kategorija.setSelection((int)JeloProvider.getJeloById(position).getKategorija().getId());

        Button btnBuy = (Button) getView().findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Kupili ste " + JeloProvider.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        TextView tvSastojak = (TextView) getView().findViewById(R.id.tv_sastojak);
        tvSastojak.setText(SastojakProvider.getSastojakById(position).getNaziv());
    }
}
