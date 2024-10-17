package com.example.prueba_m4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
public void retornar( View v)
{
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
}
//abrir navegador
public void correo(View view)
{
        Intent intent =new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.gmail.com"));
        startActivity(intent);
}
//abrir telefono
    public void telefono(View view)
    {
    Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+56994258606"));
        startActivity(intent);
    }
    //abrir navegador linkedin
    public void linkedin(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.linkedin.com"));
        startActivity(intent);
    }

}