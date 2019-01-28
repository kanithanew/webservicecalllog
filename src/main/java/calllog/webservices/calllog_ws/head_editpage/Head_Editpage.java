package calllog.webservices.calllog_ws.head_editpage;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Head_Editpage {
  @Id
  private String callid;
  private String namecontact;
  private String telcontact;
  private String calldate;
  private String problem;
  private String modulename;
  private String submodulename;
  private String callstatus;
	}