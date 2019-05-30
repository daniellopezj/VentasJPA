
package co.edu.uptc.sw2.proyectoventas.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
    
    @Id
    private int id;
    private TipoProducto tipoProducto;
    private String nombre;
    private int valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
