package co.edu.uptc.sw2.proyectoventas.persistencia;

import co.edu.uptc.sw2.proyectoventas.persistencia.entities.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductoDao {

    @PersistenceContext
    private EntityManager em;

    public List<Producto> getProducto() {
        String query = "Select p from  Producto p";
        return em.createQuery(query).getResultList();
    }

    public List<Object> getSumaceite() {
        String query = "select sum(d.valor)\n"
                + "from DetalleFactura d\n"
                + "where d.producto.id = 4\n"
                + "or d.producto.id = 5";
        return em.createQuery(query).getResultList();
    }

    public List<Object> getMasbendido() {
        String query = "select s.nombre\n"
                + "from Producto p, (select p.nombre, sum(d.cantidad) as cant\n"
                + "      from DetalleFactura d, Producto p\n"
                + "      WHERE p.id = d.producto.id\n"
                + "       GROUP BY p.nombre)s\n"
                + "where p.nombre = s.nombre \n"
                + "and s.cant =" + maximo() + " \n";
        return em.createQuery(query).getResultList();
    }

    public int maximo() {
        String query = "select max(s.cant)\n"
                + "                from Producto p, (select p.nombre, sum(d.cantidad) as cant\n"
                + "                      from DetalleFactura d, Producto p\n"
                + "                      WHERE p.id = d.producto.id\n"
                + "                      GROUP BY p.nombre)s"
                + "                 Where p.nombre = s.nombre"
                + "               \n";
        return (int) em.createQuery(query).getSingleResult();
    }
    
    public List<Object> getMenosbendido() {
        String query = "select s.nombre\n"
                + "from Producto p, (select p.nombre, sum(d.cantidad) as cant\n"
                + "      from DetalleFactura d, Producto p\n"
                + "      WHERE p.id = d.producto.id\n"
                + "      GROUP BY p.nombre)s\n"
                + "where p.nombre = s.nombre \n"
                + "and s.cant =" + minimo() + " \n";
        return em.createQuery(query).getResultList();
    }

    public int minimo() {
        String query = "select min(s.cant)\n"
                + "                from Producto p, (select p.nombre, sum(d.cantidad) as cant\n"
                + "                      from DetalleFactura d, Producto p\n"
                + "                      WHERE p.id = d.producto.id\n"
                + "                      GROUP BY p.nombre)s"
                + "                 Where p.nombre = s.nombre"
                + "               \n";
        return (int)em.createQuery(query).getSingleResult();
    }
    
    
}
