package co.edu.uptc.sw2.proyectoventas.persistencia;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.TipoProducto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TipoProductoDao {

    @PersistenceContext
    private EntityManager em;

    public List<TipoProducto> getTipoProducto() {
        String query = "Select tp from  TipoProducto tp";
        return em.createQuery(query).getResultList();
    }

    public List<Object> getRbebidas() {
        String query = "select sum(d.valor)\n"
                + "from DetalleFactura d, (select p.id \n"
                + "                        from Producto p\n"
                + "			   where p.tipoProducto.id = 5) x\n"
                + "where d.producto.id = x.id";
        return em.createQuery(query).getResultList();
    }
}
