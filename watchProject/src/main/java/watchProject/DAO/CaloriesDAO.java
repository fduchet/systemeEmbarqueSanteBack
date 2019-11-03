package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.Calorie;

@Repository
public interface CaloriesDAO extends CrudRepository<Calorie, Long> {

}
