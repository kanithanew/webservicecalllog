package calllog.webservices.calllog_ws.detail_editpage;

import org.springframework.data.repository.CrudRepository;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface Detail_Editpage_Repository
        extends JpaRepository<Detail_Editpage, Long>, JpaSpecificationExecutor<Detail_Editpage> {

}