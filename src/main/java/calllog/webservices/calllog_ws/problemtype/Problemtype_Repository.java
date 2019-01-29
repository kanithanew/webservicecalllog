package calllog.webservices.calllog_ws.problemtype;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Problemtype_Repository
        extends JpaRepository<Problemtype, Long>, JpaSpecificationExecutor<Problemtype> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_PROBLEMTYPE = "select problemid,problemdesc from gfmis_m_problemtype order by problemid" ;
   @Query(value = GET_PROBLEMTYPE, nativeQuery = true)
    Collection<Problemtype> findProblemtype();

}