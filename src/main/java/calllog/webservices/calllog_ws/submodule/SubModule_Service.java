package calllog.webservices.calllog_ws.submodule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
@Service
public class SubModule_Service {
    private SubModule_Repository submodule_repository;

    @Autowired
    public SubModule_Service(SubModule_Repository repository) {
        this.submodule_repository = repository;
    }
    public List<SubModule> retrieveSubModule(String moduleid) { 
        return (List<SubModule>) submodule_repository.findsubmodule(moduleid);
    }

}