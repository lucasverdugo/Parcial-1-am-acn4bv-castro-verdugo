package com.example.parcial_1_am_acn4bv_castro_verdugo;

import static com.example.parcial_1_am_acn4bv_castro_verdugo.R.drawable.bienvenida1;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void onClickCentral(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaCentral);
        contenido1.setText(R.string.contenido1Central);
        imagenNoticia.setImageResource(R.drawable.centralimg);
        contenido2.setText(R.string.contenido2Central);
    }
    public void onClickBoca(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaBoca);
        contenido1.setText(R.string.contenido1Boca);
        imagenNoticia.setImageResource(R.drawable.bocaimg);
        contenido2.setText(R.string.contenido2Boca);
    }
    public void onClickRiver(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRiver);
        contenido1.setText(R.string.contenido1River);
        imagenNoticia.setImageResource(R.drawable.riverimg);
        contenido2.setText(R.string.contenido2River);
    }
    public void onClickRosario(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRosario);
        contenido1.setText(R.string.contenido1Rosario);
        imagenNoticia.setImageResource(R.drawable.rosarioimg);
        contenido2.setText(R.string.contenido2Rosario);
    }
    public void onClickDefensa(View view){
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaDefensa);
        contenido1.setText(R.string.contenido1Defensa);
        imagenNoticia.setImageResource(R.drawable.defensaimg);
        contenido2.setText(R.string.contenido2Defensa);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);;
        tituloNoticia.setText(R.string.tituloNoticia);
        imagenNoticia.setImageResource(R.drawable.chiquimafia);
        contenido1.setText(R.string.content1);
        contenido2.setText(R.string.content2);
    }
}