package ejb;

import entidades.solicitudes;
import java.util.List;
import javax.ejb.Local;


@Local
public interface SolicitudesFacadeLocal {

    void create(solicitudes solicitudes);

    void edit(solicitudes solicitudes);

    void remove(solicitudes solicitudes);

    solicitudes find(Object id);

    List<solicitudes> findAll();

    List<solicitudes> findRange(int[] range);

    int count();
    
}
