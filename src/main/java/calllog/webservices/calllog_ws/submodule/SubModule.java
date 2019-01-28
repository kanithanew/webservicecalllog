package calllog.webservices.calllog_ws.submodule;
import lombok.Data;

import java.text.DateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class SubModule {
  @Id
 
  private String submoduleid;
  private String submodulename;
	}