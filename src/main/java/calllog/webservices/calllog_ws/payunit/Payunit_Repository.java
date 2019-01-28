package calllog.webservices.calllog_ws.payunit;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Payunit_Repository
        extends JpaRepository<Payunit, Long>, JpaSpecificationExecutor<Payunit> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_PAYUNIT = "select payunit,payunit_name,department_name,ministry_name from province_relations where payunit=?1" ;

    @Query(value = GET_PAYUNIT, nativeQuery = true)
    Collection<Payunit> findpayunit(String payunit);

}