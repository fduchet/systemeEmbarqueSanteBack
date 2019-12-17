package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.OutsideTemperature;

@Repository
public interface OutsideTemperatureDAO extends CrudRepository<OutsideTemperature, Long> {
}
