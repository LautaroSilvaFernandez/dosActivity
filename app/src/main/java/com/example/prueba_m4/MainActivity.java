package com.example.prueba_m4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prueba_m4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void acercaDe(View v)
    {
        Intent intento=new Intent(this, MainActivity2.class);
        startActivity(intento);
    }
}