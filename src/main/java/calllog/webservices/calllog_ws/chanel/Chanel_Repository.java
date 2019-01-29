package calllog.webservices.calllog_ws.chanel;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Chanel_Repository
        extends JpaRepository<Chanel, Long>, JpaSpecificationExecutor<Chanel> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_CHANEL = "select chanelid,chaneldesc from gfmis_m_chanel order by chanelid" ;
   @Query(value = GET_CHANEL, nativeQuery = true)
    Collection<Chanel> findchanel();

}