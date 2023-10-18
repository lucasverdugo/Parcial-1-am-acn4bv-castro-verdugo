package com.example.parcial_1_am_acn4bv_castro_verdugo;

import java.util.List;

public class Noticia {
    private String tituloNoticia;
    private String nombreEquipo;
    private String contenido1;
    private String contenido2;

    public Noticia(String nombreEquipo, String tituloNoticia, String contenido1, String contenido2) {
        this.nombreEquipo = nombreEquipo;
        this.contenido1 = contenido1;
        this.contenido2 = contenido2;
        this.tituloNoticia = tituloNoticia;
    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getContenido1() {
        return contenido1;
    }

    public void setContenido1(String contenido1) {
        this.contenido1 = contenido1;
    }

    public String getContenido2() {
        return contenido2;
    }

    public void setContenido2(String contenido2) {
        this.contenido2 = contenido2;
    }

    /*
    * Codigo para probar en una nueva vista:
    *
    * List<Noticia> noticias = new ArrayList<>();

    Noticia n1 = new Noticia("Boca", "Boca Gano el campeonato local","Boca se llevó la victoria en su última fecha ganando el campeonato Local","Boca jugará la próxima copa libertadores ante el Gremio.");
    Noticia n2 = new Noticia("River", "River Gano el campeonato local","River se llevó la victoria en su última fecha ganando el campeonato Local","River jugará la próxima copa libertadores ante el Gremio.");
    Noticia n3 = new Noticia("Central", "Central Gano el campeonato local","Central se llevó la victoria en su última fecha ganando el campeonato Local","Centra jugará la próxima copa libertadores ante el Gremio.");
    Noticia n4 = new Noticia("Rosario", "Rosario Gano el campeonato local","Rosario se llevó la victoria en su última fecha ganando el campeonato Local","Rosario jugará la próxima copa libertadores ante el Gremio.");
    Noticia n5 = new Noticia("Defensa", "Defensa Gano el campeonato local","Defensa se llevó la victoria en su última fecha ganando el campeonato Local","Defensa jugará la próxima copa libertadores ante el Gremio.");
    public void cargarNoticias(Noticia n){
        noticias.add(n1);
        noticias.add(n2);
        noticias.add(n3);
        noticias.add(n4);
        noticias.add(n5);
    }
    *
    * */

}
