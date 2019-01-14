package calllog.webservices.calllog_ws.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class LoginService {
    private LoginRepository loginRepository;

    @Autowired
  public LoginService(LoginRepository repository) {
        this.loginRepository = repository;
    }

    public List<Login> retrieveLogin() {
        return (List<Login>) loginRepository.findAll();
    }

    public List<Login> retrieveLogin(String name) {
        return loginRepository.findByFirstName(name);
    }
}