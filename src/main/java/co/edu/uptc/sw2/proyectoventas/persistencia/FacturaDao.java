package co.edu.uptc.sw2.proyectoventas.persistencia;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.Factura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FacturaDao {

    @PersistenceContext
    private EntityManager em;

    public List<Factura> getfactura() {
        String query = "Select f from  Factura f";
        return em.createQuery(query).getResultList();
    }

    public List<Object> gettotalcliente() {
        String query = "Select f.cliente as cliente, sum(d.valor) as total \n"
                + "from  Factura f , DetalleFactura d\n"
                + "where f.id = d.factura.id\n"
                + "group by f.cliente";
        return em.createQuery(query).getResultList();
    }

    public List<Object> gettotal() {
        String query = "Select sum(d.valor) \n"
                + "from DetalleFactura d";
        return em.createQuery(query).getResultList();
    }

    public List<Object> getmesDiciembre() {
        String query = "select sum(d.valor)\n"
                + "from Factura f, DetalleFactura d\n"
                + "where f.id = d.factura.id\n"
                + "and month(f.fecha) = 12";
        return em.createQuery(query).getResultList();
    }
}
