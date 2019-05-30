package co.edu.uptc.sw2.proyectoventas.persistencia.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Factura {

    @Id
    private int id;
    private String cliente;
    private Date fecha;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy="Factura")
    private List<DetalleFactura> ListDetalle;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetalleFactura> getListDetalle() {
        return ListDetalle;
    }

    public void setListDetalle(List<DetalleFactura> ListDetalle) {
        this.ListDetalle = ListDetalle;
    }
   
    
}
