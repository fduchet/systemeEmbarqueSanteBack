package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.Speed;

@Repository
public interface SpeedsDAO extends CrudRepository<Speed, Long> {

}