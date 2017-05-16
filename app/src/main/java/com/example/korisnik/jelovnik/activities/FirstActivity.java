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
import com.example.korisnik.jelovnik.provider.KategorijaProvider;

import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class FirstActivity extends Activity {

    @Override//i
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onCreate", Toast.LENGTH_SHORT);
        toast.show();

        final List<String> kategorijaNaziv = KategorijaProvider.getKategorijaNaziv();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, kategorijaNaziv);
        ListView listView = (ListView) findViewById(R.id.listofKategorija);

        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){

        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onStart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume(){

        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart(){

        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onRestart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause(){

        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onPause", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop(){

        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onStop", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onDestroy(){

        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onDestroy", Toast.LENGTH_SHORT);
        toast.show();
    }
}
