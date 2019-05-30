
package co.edu.uptc.sw2.proyectoventas.servicios.logica;

import co.edu.uptc.sw2.proyectoventas.persistencia.DetalleFacturaDao;
import co.edu.uptc.sw2.proyectoventas.persistencia.entities.DetalleFactura;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author felip
 */
@Stateless
public class DetalleFacturaLogica {
    
     @EJB
    private DetalleFacturaDao dao;
    
    public List<DetalleFactura> obtenerDetalleFactura(){
     return dao.getDetalleFactura();
    }
    
}
