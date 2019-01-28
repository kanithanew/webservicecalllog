package calllog.webservices.calllog_ws.homepage;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface HomePage_Repository extends JpaRepository<HomePage, Long>, JpaSpecificationExecutor<HomePage> {
    // Login Check Username and Password
 
    /**
   *
   */

  String GET_USER_PROFILE = "SELECT * FROM gfmis_staff a LEFT JOIN gfmis_m_callposition b ON a.callposition = b.callpositionid WHERE a.calllogin = ?1";

  String GET_HOMEPAGE = "SELECT alldate.* FROM (select d.callid,d.touser,d.fromuser,g.modulename,g.submodulename,d.payunit,d.calldate,e.callusername,d.logprocess,d.status  FROM ( select a.callid,a.callmodule,a.callsubmodule,a.payunit,a.calldate,b.touser,b.FROMuser,b.logprocess , "+
       "CASE   "+
       "WHEN  a.helpdeskOwner is null and (b.touser='Update' or b.touser='Create' or  b.touser='Edit' ) THEN'OpenCall'  "+
       "WHEN  b.touser ='Helpdesk' THEN 'NewCall'   WHEN  b.touser =?1 THEN 'MyInbox'  "+
       "WHEN  b.FROMuser =?1  and (b.touser='Update' or b.touser='Create' or  b.touser='Edit' )  THEN 'MyInbox'  "+
       "ELSE  'Othercalls'  END as status,  CASE    WHEN  a.helpdeskOwner is null THEN b.FROMuser   "+
       "WHEN  b.touser='Update' or b.touser='Create' or  b.touser='Edit'  THEN b.FROMuser   ELSE  b.touser  "+
       "END as reppersON   FROM gfmis_calllog a   LEFT JOIN callpending b ON a.callid=b.callid   "+
       "LEFT JOIN (select DISTINCT(callid) as listcallid,'ListCall' as   "+
       "TempField FROM callpending_process where FROMuser =?1 or touser=?1 )c   ON a.callid=c.listcallid   "+
       "where (c.listcallid is not null)  )d LEFT JOIN gfmis_staff e ON d.reppersON=e.calllogin  "+
       "LEFT JOIN module_enable g ON d.callmodule=g.moduleid and d.callsubmodule=g.submoduleid order by d.callid DESC )alldate   ";


       

    @Query(value = GET_HOMEPAGE, nativeQuery = true)
    Collection<HomePage> findLogin(String calllogin);

}