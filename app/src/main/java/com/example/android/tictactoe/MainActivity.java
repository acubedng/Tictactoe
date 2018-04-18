package com.example.android.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    // Set the content of the activity to use the activity_normal.xml layout file
    public void openNmode(View view) {
        Intent i = new Intent(this, NormalActivity.class);
        startActivity(i);
    }

    // Set the content of the activity to use the activity_ultimate.xml layout file
    public void openUmode(View view) {
        Intent i = new Intent(this, UltimateActivity.class);
        startActivity(i);
    }

    // Set the content of the activity to use the activity_aboutgame.xml layout file
    public void openAboutGame(View view) {
        Intent i = new Intent(this, AboutGameActivity.class);
        startActivity(i);
    }

    // Set the device to home
    public void openquit(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
