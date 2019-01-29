package calllog.webservices.calllog_ws.submodule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Submodule_Service {
    private Submodule_Repository submodule_repository;

    @Autowired
    public Submodule_Service(Submodule_Repository repository) {
        this.submodule_repository = repository;
    }
    public List<Submodule> retrieveSubmodul(Integer moduleid) { 
        return (List<Submodule>) submodule_repository.findpayunit(moduleid);
    }

}