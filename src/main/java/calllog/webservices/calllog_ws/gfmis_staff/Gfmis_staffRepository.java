package calllog.webservices.calllog_ws.gfmis_staff;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Gfmis_staffRepository extends CrudRepository<Gfmis_staff, Long> {
    List<Gfmis_staff> findBycalllogin(String calllogin);

}