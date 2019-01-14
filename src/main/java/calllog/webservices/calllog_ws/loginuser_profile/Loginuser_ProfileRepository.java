
package calllog.webservices.calllog_ws.loginuser_profile;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface Loginuser_ProfileRepository
        extends JpaRepository<Loginuser_Profile, Long>, JpaSpecificationExecutor<Loginuser_Profile> {
    // Login Check Username and Password
 
    String GET_USER_PROFILE = "SELECT * FROM gfmis_staff a LEFT JOIN gfmis_m_callposition b ON a.callposition = b.callpositionid WHERE a.calllogin = ?1 and a.callpassword = ?2";

    @Query(value = GET_USER_PROFILE, nativeQuery = true)
    Collection<Loginuser_Profile> findLogin(String calllogin, String callpassword);
}
