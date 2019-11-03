package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.OxygenLevel;

@Repository
public interface OxygenLevelsDAO extends CrudRepository<OxygenLevel, Long> {


}
