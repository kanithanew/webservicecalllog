package calllog.webservices.calllog_ws.submodule;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface SubModule_Repository
        extends JpaRepository<SubModule, Long>, JpaSpecificationExecutor<SubModule> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_SUBMODULE ="select submoduleid,submodulename from module_enable where moduleid='1' order by submoduleid";
    @Query(value = GET_SUBMODULE, nativeQuery = true)
    Collection<SubModule> findsubmodule(String moduleid);

}