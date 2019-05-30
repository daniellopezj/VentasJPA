package co.edu.uptc.sw2.proyectoventas.servicios;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.TipoProducto;
import co.edu.uptc.sw2.proyectoventas.servicios.logica.TipoProductoLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("TProducto")
public class TipoProductoServicio {
    
    @EJB
    private TipoProductoLogica tpl;
    
    @GET
    public List<TipoProducto> getTipoProducto(){
        return tpl.obtenerTipoProducto();
    }
    
    @Path("Rbebidas")  @GET
    public List<Object> getbebidas(){
        return tpl.reportBebidas();
    }
}