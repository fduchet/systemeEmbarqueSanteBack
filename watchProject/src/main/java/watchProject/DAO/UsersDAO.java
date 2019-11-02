package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.User;

@Repository
public interface UsersDAO extends CrudRepository<User, Long>{
}
