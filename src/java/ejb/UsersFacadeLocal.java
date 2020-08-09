package ejb;

import entidades.users;
import java.util.List;
import javax.ejb.Local;


@Local
public interface UsersFacadeLocal {

    void create(users users);

    void edit(users users);

    void remove(users users);

    users find(Object id);

    List<users> findAll();

    List<users> findRange(int[] range);

    int count();
    
}
