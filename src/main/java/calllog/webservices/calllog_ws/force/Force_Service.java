package calllog.webservices.calllog_ws.force;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Force_Service {
    private Force_Repository force_repository;

    @Autowired
    public Force_Service(Force_Repository repository) {
        this.force_repository = repository;
    }
    public List<Force> retrieveForce() { 
        return (List<Force>) force_repository.findforce();
    }

}