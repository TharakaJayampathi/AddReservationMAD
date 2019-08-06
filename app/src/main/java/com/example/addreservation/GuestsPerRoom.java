package com.example.addreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GuestsPerRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guests_per_room);
    }

        public void OnclickEdit(View view) {
            startActivity(new Intent(GuestsPerRoom.this,ViewReservationManagement.class));
        }

    public void OnclickCancel(View view) {
        startActivity(new Intent(GuestsPerRoom.this,MainActivity.class));
    }




}
