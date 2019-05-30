package co.edu.uptc.sw2.proyectoventas.servicios;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.Producto;
import co.edu.uptc.sw2.proyectoventas.servicios.logica.ProductoLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Producto")
public class ProductoServicio {

    @EJB
    private ProductoLogica pl;

    @GET
    public List<Producto> getProdcutos() {
        return pl.obtenerProducto();
    }
    
    @Path("/SumaAceites")  
    @GET  
    public List<Object> getSumAceite() {
        return pl.SumaAceites();
    }
    
    @Path("/MasBendido")  
    @GET  
    public List<Object> getMasBendido() {
        return pl.masBendido();
    }
    
    @Path("/MenosBendido")  
    @GET  
    public List<Object> getMenosBendido() {
        return pl.menosBendido();
    }
}
