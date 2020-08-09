package ejb;

import entidades.users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class UsersFacade extends AbstractFacade<users> implements UsersFacadeLocal {

    @PersistenceContext(unitName = "Banco_Servi_Web_RESTfulPU")
    private EntityManager em;

    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
    public UsersFacade() {
        super(users.class);
    }
    
}
