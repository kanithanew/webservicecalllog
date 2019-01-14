package calllog.webservices.calllog_ws.gfmis_staff;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Gfmis_staff{
  @Id
   private String calllogin;
   private String  callpassword;
   private String  callusername;
   private String  positionuser;
	}