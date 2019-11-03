package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.Temperature;

@Repository
public interface TemperaturesDAO extends CrudRepository<Temperature, Long> {
}
