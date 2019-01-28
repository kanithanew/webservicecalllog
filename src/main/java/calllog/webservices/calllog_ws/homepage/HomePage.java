package calllog.webservices.calllog_ws.homepage;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class HomePage {
  @Id
   private String callid;
   private String  touser;
   private String  fromuser;
   private String  modulename;
   private String  submodulename;
   private String  payunit;
   private String calldate;
   private String  callusername;
   private String  logprocess;
   private String status; 

	}