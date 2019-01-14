package calllog.webservices.calllog_ws.loginuser_profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;

@Service
public class Loginuser_ProfileService {
    private Loginuser_ProfileRepository loginuser_profileRepository;

    @Autowired
    public Loginuser_ProfileService(Loginuser_ProfileRepository repository) {
        this.loginuser_profileRepository = repository;
    }

    public List<Loginuser_Profile> retrieveLoginuser_Profile(String calllogin, String callpassword) { 
        return (List<Loginuser_Profile>) loginuser_profileRepository.findLogin(calllogin, callpassword);
    }

}