package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.Distance;

@Repository
public interface DistancesDAO extends CrudRepository<Distance, Long> {

}