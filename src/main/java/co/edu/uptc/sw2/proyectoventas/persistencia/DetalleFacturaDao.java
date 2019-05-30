
package co.edu.uptc.sw2.proyectoventas.persistencia;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.DetalleFactura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DetalleFacturaDao {
    
    @PersistenceContext
    private EntityManager em;
    
     public List<DetalleFactura>  getDetalleFactura() {
        String query = "Select df from  DetalleFactura df";
        return em.createQuery(query).getResultList();
    }
}
