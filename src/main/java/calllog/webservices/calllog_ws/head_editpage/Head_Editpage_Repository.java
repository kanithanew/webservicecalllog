package calllog.webservices.calllog_ws.head_editpage;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Head_Editpage_Repository
        extends JpaRepository<Head_Editpage, Long>, JpaSpecificationExecutor<Head_Editpage> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_HEAD_EDITPAGE = "SELECT a.callid,a.namecontact,a.telcontact,a.calldate,a.problem,b.modulename,c.submodulename, "+
  " CASE   "+
  "   WHEN a.callstatus LIKE'Close%'THEN'Close'ELSE'Pending' "+
  "END as "+
  "  callstatus FROM "+
  "  gfmis_calllog a "+
  "LEFT JOIN "+
  " gfmis_m_module b "+
  "ON a.callmodule=b.moduleid "+
  "LEFT "+
  "  JOIN gfmis_m_submodule "+
  " c "+
  " ON a.callmodule=c.moduleid and a.callsubmodule=c.submoduleid  "+
  " WHERE a.payunit=?1 "+
  " AND a.calldate>( "+
    "  SELECT current_date-interval'3 month') "+
    "  ORDER BY a.callid DESC" ;

    @Query(value = GET_HEAD_EDITPAGE, nativeQuery = true)
    Collection<Head_Editpage> findHead_Editpage(String payunit);

}