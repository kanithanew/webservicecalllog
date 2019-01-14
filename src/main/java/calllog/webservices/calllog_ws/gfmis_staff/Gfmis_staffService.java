package calllog.webservices.calllog_ws.gfmis_staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Gfmis_staffService {
    private Gfmis_staffRepository gfmis_staffRepository;

    @Autowired
  public Gfmis_staffService(Gfmis_staffRepository repository) {
        this.gfmis_staffRepository = repository;
    }

    public List<Gfmis_staff> retrieveGfmis_staff() {
        return (List<Gfmis_staff>) gfmis_staffRepository.findAll();
    }

    public List<Gfmis_staff> retrieveGfmis_staff(String calllogin) {
        return gfmis_staffRepository.findBycalllogin(calllogin);
    }
}