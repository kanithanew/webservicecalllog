package calllog.webservices.calllog_ws.homepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class HomePage_Service {
    private HomePage_Repository homepage_Repository;

    @Autowired
    public HomePage_Service(HomePage_Repository repository) {
        this.homepage_Repository = repository;
    }
    public List<HomePage> retrieveHomePage(String calllogin) { 
        return (List<HomePage>) homepage_Repository.findLogin(calllogin);
    }

}