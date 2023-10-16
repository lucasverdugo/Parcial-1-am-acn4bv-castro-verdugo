package com.example.parcial_1_am_acn4bv_castro_verdugo;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void onClickCentral(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaCentral);
        contenido1.setText(R.string.contenido1Central);
        contenido2.setText(R.string.contenido2Central);
    }
    public void onClickBoca(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaBoca);
        contenido1.setText(R.string.contenido1Boca);
        contenido2.setText(R.string.contenido2Boca);
    }
    public void onClickRiver(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRiver);
        contenido1.setText(R.string.contenido1River);
        contenido2.setText(R.string.contenido2River);
    }
    public void onClickRosario(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRosario);
        contenido1.setText(R.string.contenido1Rosario);
        contenido2.setText(R.string.contenido2Rosario);
    }
    public void onClickDefensa(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaDefensa);
        contenido1.setText(R.string.contenido1Defensa);
        contenido2.setText(R.string.contenido2Defensa);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton central = findViewById(R.id.btn1);
        ImageButton boca = findViewById(R.id.btn2);
        ImageButton river = findViewById(R.id.btn3);
        ImageButton rosario = findViewById(R.id.btn4);
        ImageButton defensa = findViewById(R.id.btn5);


    }
}