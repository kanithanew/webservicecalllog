package calllog.webservices.calllog_ws.module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
@Service
public class Module_Service {
    private Module_Repository module_repository;

    @Autowired
    public Module_Service(Module_Repository repository) {
        this.module_repository = repository;
    }
    public List<Module> retrieveModule() { 
        return (List<Module>) module_repository.findmodule();
    }

}