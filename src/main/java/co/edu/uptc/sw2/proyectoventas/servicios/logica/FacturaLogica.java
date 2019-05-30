package co.edu.uptc.sw2.proyectoventas.servicios.logica;

import co.edu.uptc.sw2.proyectoventas.persistencia.FacturaDao;
import co.edu.uptc.sw2.proyectoventas.persistencia.entities.Factura;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class FacturaLogica {

    @EJB
    private FacturaDao dao;

    public List<Factura> obtenerFactura() {
        return dao.getfactura();
    }

    public List<Object> cliente() {
        return dao.gettotalcliente();
    }

    public List<Object> total() {
        return dao.gettotal();
    }
    
      public List<Object> mesdiciembre() {
        return dao.getmesDiciembre();
    }
}
