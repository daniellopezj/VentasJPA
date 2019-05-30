package co.edu.uptc.sw2.proyectoventas.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoProducto {
        
    @Id
    private int id;
    private String nombre;
    private int iva;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}