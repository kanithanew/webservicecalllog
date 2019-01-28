package calllog.webservices.calllog_ws.module;
import lombok.Data;

import java.text.DateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Module {
  @Id
 
  private String moduleid;
  private String modulename;
	}