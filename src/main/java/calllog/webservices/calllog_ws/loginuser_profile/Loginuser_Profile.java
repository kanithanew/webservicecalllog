package calllog.webservices.calllog_ws.loginuser_profile;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Loginuser_Profile {
    @Id
    private String calllogin;
    //private String callpassword;
    private String callusername;
    private String positionuser;
  //  private String callposition;
   // private String callstatus;
   // private Date create_date;
  //  private Date update_date;
    private String callpositionid;
    private String callpositiondesc;

}