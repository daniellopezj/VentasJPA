package co.edu.uptc.sw2.proyectoventas.servicios.logica;

import co.edu.uptc.sw2.proyectoventas.persistencia.TipoProductoDao;
import co.edu.uptc.sw2.proyectoventas.persistencia.entities.TipoProducto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class TipoProductoLogica {
    
    @EJB
    private TipoProductoDao dao;
    
    public List<TipoProducto> obtenerTipoProducto(){
     return dao.getTipoProducto();
    }
    
    public List<Object> reportBebidas(){
     return dao.getRbebidas();
    }
}
