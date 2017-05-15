package com.example.korisnik.jelovnik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Korisnik on 15.5.2017..
 */

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onCreate", Toast.LENGTH_SHORT);
        toast.show();
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

    public void btnStartActivityClicked(View view){

        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
