package calllog.webservices.calllog_ws.force;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Force {
  @Id
 
  private String forceid;
  private String forcedesc;
	}