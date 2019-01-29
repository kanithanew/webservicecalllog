package calllog.webservices.calllog_ws.problemtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Problemtype_Service {
    private Problemtype_Repository problemtype_repository;

    @Autowired
    public Problemtype_Service(Problemtype_Repository repository) {
        this.problemtype_repository = repository;
    }
    public List<Problemtype> retrieveProblemtype() { 
        return (List<Problemtype>) problemtype_repository.findProblemtype();
    }

}