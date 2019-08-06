package com.example.addreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



        @SuppressWarnings("unused")
        public void OnclickNEXT(View v) {
            startActivity(new Intent(MainActivity.this, GuestsPerRoom.class));
        }


            }



