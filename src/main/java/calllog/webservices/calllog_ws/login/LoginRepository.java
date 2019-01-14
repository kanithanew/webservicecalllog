package calllog.webservices.calllog_ws.login;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoginRepository extends CrudRepository<Login, Long> {
    List<Login> findByFirstName(String firstName);

}