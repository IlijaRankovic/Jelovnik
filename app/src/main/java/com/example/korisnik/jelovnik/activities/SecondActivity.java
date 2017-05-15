package com.example.korisnik.jelovnik.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.korisnik.jelovnik.R;
import com.example.korisnik.jelovnik.model.Jelo;
import com.example.korisnik.jelovnik.provider.JeloProvider;
import com.example.korisnik.jelovnik.provider.KategorijaProvider;

import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate", Toast.LENGTH_SHORT);
        toast.show();

        final int position = getIntent().getIntExtra("position", 0);
        List<String> jeloNaziv = JeloProvider.getJeloNaziv();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item1, jeloNaziv);
        ListView listView = (ListView) findViewById(R.id.listofJelo);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
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
