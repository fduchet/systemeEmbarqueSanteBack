package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.HeartRate;

@Repository
public interface HeartRatesDAO extends CrudRepository<HeartRate, Long> {
}
