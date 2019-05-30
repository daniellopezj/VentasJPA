package co.edu.uptc.sw2.proyectoventas.servicios.logica;

import co.edu.uptc.sw2.proyectoventas.persistencia.ProductoDao;
import co.edu.uptc.sw2.proyectoventas.persistencia.entities.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ProductoLogica {

    @EJB
    private ProductoDao dao;

    public List<Producto> obtenerProducto() {
        return dao.getProducto();
    }

    public List<Object> SumaAceites() {
        return dao.getSumaceite();
    }
    
     public List<Object> masBendido() {
        return dao.getMasbendido();
    }
     
       public List<Object> menosBendido() {
        return dao.getMenosbendido();
    }
}
