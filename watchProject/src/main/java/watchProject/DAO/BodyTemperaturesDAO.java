package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.BodyTemperature;

@Repository
public interface BodyTemperaturesDAO extends CrudRepository<BodyTemperature, Long> {
}
