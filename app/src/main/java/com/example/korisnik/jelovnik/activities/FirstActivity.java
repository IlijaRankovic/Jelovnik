package com.example.korisnik.jelovnik.activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.korisnik.jelovnik.R;
import com.example.korisnik.jelovnik.fragments.DetailFragment;
import com.example.korisnik.jelovnik.fragments.ListFragment;
import com.example.korisnik.jelovnik.provider.JeloProvider;
import com.example.korisnik.jelovnik.provider.KategorijaProvider;

import java.util.List;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class FirstActivity extends Activity implements ListFragment.OnItemSelectedListener{

    boolean landscape = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        Toast.makeText(getBaseContext(), "FirstActivity.onCreate()", Toast.LENGTH_SHORT).show();

       if(savedInstanceState == null){

           FragmentTransaction ft = getFragmentManager().beginTransaction();
           ListFragment listFragment = new ListFragment();
           ft.add(R.id.list_view, listFragment, "List_Fragment_1");
           ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           ft.commit();
       }

        if (findViewById(R.id.detail_view) != null) {
            landscape = true;
            getFragmentManager().popBackStack();

            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_view);
            if (detailFragment == null) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                detailFragment = new DetailFragment();
                ft.replace(R.id.detail_view, detailFragment, "Detail_Fragment_1");
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }
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

    @Override
    public void onItemSelected(int position) {

        Toast.makeText(getBaseContext(), "FirstActivity.onItemSelected()", Toast.LENGTH_SHORT).show();

        if (landscape) {
            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_view);
            detailFragment.updateContent(position);
        } else {
            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setContent(position);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.list_view, detailFragment, "Detail_Fragment_2");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
