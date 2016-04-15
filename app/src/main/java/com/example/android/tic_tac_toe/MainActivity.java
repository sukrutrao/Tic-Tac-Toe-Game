package com.example.android.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ((Button) findViewById(R.id.singleplayer)).setClickable(false);
    }

    public void playTwoPGame(View view) {
        Intent intent = new Intent(this,PlayerName.class);
        if(intent.resolveActivity(getPackageManager())!=null) {
            startActivity(intent);
        }

    }

    public void playSinglePGame(View view) {
        Intent intent = new Intent(this, PlayerNameWithComputer.class);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }


//    public void exitGame(View view){
//        finish();
//        System.exit(0);
//    }
}
