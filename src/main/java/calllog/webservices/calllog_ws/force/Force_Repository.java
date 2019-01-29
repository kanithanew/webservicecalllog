package calllog.webservices.calllog_ws.force;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Force_Repository
        extends JpaRepository<Force, Long>, JpaSpecificationExecutor<Force> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_FORCE = "select forceid,forcedesc from gfmis_m_force  order by forceid" ;
   @Query(value = GET_FORCE, nativeQuery = true)
    Collection<Force> findforce();

}