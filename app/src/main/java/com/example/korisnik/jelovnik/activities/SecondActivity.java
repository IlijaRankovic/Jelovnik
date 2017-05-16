package com.example.korisnik.jelovnik.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.korisnik.jelovnik.R;
import com.example.korisnik.jelovnik.model.Jelo;
import com.example.korisnik.jelovnik.provider.JeloProvider;
import com.example.korisnik.jelovnik.provider.KategorijaProvider;
import com.example.korisnik.jelovnik.provider.SastojakProvider;

import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_linear);

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate", Toast.LENGTH_SHORT);
        toast.show();

        final int position = getIntent().getIntExtra("position", 0);

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(JeloProvider.getJeloById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvNaziv = (TextView) findViewById(R.id.tv_naziv);
        tvNaziv.setText(JeloProvider.getJeloById(position).getNaziv());

        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvider.getJeloById(position).getOpis());

        /*TextView tvKalorijskaVrednost = (TextView) findViewById(R.id.tv_kalorijska_vrednost);
        tvKalorijskaVrednost.setText(JeloProvider.getJeloById(position).getKalorijskaVrednost());*/


        Spinner category = (Spinner) findViewById(R.id.sp_kategorija);
        List<String> categories = KategorijaProvider.getKategorijaNaziv();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)JeloProvider.getJeloById(position).getKategorija().getId());

        TextView tvSastojak = (TextView) findViewById(R.id.tv_sastojak);
        tvSastojak.setText(SastojakProvider.getSastojakById(position).getNaziv());

        Button btnBuy = (Button) findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Kupili ste " + JeloProvider.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    @Override
    protected void onStart(){

        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume(){

        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart(){

        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause(){

        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop(){

        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onDestroy(){

        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy", Toast.LENGTH_SHORT);
        toast.show();
    }
}
