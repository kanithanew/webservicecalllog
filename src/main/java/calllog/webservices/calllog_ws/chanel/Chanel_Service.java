package calllog.webservices.calllog_ws.chanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Chanel_Service {
    private Chanel_Repository chanel_repository;

    @Autowired
    public Chanel_Service(Chanel_Repository repository) {
        this.chanel_repository = repository;
    }
    public List<Chanel> retrieveChanel() { 
        return (List<Chanel>) chanel_repository.findchanel();
    }

}