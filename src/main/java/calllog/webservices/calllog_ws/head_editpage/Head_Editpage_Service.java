package calllog.webservices.calllog_ws.head_editpage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Head_Editpage_Service {
    private Head_Editpage_Repository head_editpage_Repository;

    @Autowired
    public Head_Editpage_Service(Head_Editpage_Repository repository) {
        this.head_editpage_Repository = repository;
    }
    public List<Head_Editpage> retrieveHomePage(String payunit) { 
        return (List<Head_Editpage>) head_editpage_Repository.findHead_Editpage(payunit);
    }

}