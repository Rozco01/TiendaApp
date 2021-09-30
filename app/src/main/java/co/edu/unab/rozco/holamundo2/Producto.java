package co.edu.unab.rozco.holamundo2;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {


    private String nombre;
    private int precio;
    private String descripcion;
    private String urlImagen;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString(){
        return this.nombre+ "($"+ precio+")";
    }

    public Producto(String nombre,int precio,String urlImagen){
        this.nombre = nombre;
        this.precio = precio;
        this.urlImagen= urlImagen;
        this.descripcion = "sin descripcion";
    }



}
