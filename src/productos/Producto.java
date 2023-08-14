package productos;

import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class Producto {
    
    private String categoria;
    private String nombre;
    private double precio;
    private Categoria cateEnum;
    public ArrayList productos;

    public Producto() {
    }

    public Producto(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    

    
}
