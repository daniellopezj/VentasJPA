package co.edu.uptc.sw2.proyectoventas.servicios;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.DetalleFactura;
import co.edu.uptc.sw2.proyectoventas.servicios.logica.DetalleFacturaLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("DetalleFactura")
public class DetalleFacturaServicio {
    
    @EJB
    private DetalleFacturaLogica dfl;
    
     @GET
    public List<DetalleFactura> getDetalleFactura(){
        return dfl.obtenerDetalleFactura();
    }
    
}
