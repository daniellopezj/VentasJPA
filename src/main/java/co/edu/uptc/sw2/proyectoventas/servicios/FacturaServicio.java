package co.edu.uptc.sw2.proyectoventas.servicios;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.Factura;
import co.edu.uptc.sw2.proyectoventas.servicios.logica.FacturaLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Factura")
public class FacturaServicio {
    
    @EJB
    private FacturaLogica fl;
    
     @GET
    public List<Factura> getFacturas(){
        return fl.obtenerFactura();
    }
    
    @Path("/cliente")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getFacturascliente(){
        return fl.cliente();
    }
    
     @Path("/total")@GET
    public List<Object> gettotal(){
        return fl.total();
    }
    
     @Path("/Diciembre")@GET
    public List<Object> getmesDiciembre(){
        return fl.mesdiciembre();
    }
}