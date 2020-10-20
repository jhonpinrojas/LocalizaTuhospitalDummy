package com.jhon.localizatuhospital;

public class Localidad {
    private int foto;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    private String nombre;

    public Localidad(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }
}
