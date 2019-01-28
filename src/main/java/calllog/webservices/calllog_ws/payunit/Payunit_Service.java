package calllog.webservices.calllog_ws.payunit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Payunit_Service {
    private Payunit_Repository payunit_repository;

    @Autowired
    public Payunit_Service(Payunit_Repository repository) {
        this.payunit_repository = repository;
    }
    public List<Payunit> retrievePayunit(String payunit) { 
        return (List<Payunit>) payunit_repository.findpayunit(payunit);
    }

}