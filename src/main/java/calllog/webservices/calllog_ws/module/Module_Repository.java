package calllog.webservices.calllog_ws.module;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Module_Repository
        extends JpaRepository<Module, Long>, JpaSpecificationExecutor<Module> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_MODULE ="select moduleid,modulename from gfmis_m_module where status ='1' order by moduleid";
    @Query(value = GET_MODULE, nativeQuery = true)
    Collection<Module> findmodule();

}