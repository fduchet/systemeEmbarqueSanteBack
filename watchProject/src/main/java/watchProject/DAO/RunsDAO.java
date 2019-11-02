package watchProject.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import watchProject.objects.Run;

@Repository
public interface RunsDAO extends CrudRepository<Run, Long> {

}
