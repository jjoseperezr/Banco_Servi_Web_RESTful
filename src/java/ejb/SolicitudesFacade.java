package ejb;

import entidades.solicitudes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class SolicitudesFacade extends AbstractFacade<solicitudes> implements SolicitudesFacadeLocal {

    @PersistenceContext(unitName = "Banco_Servi_Web_RESTfulPU")
    private EntityManager em;

    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
    public SolicitudesFacade() {
        super(solicitudes.class);
    }
    
}
