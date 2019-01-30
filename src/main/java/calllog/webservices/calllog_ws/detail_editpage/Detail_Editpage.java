package calllog.webservices.calllog_ws.detail_editpage;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
//insert data from editdetail
public class Detail_Editpage {
  @Id
  private String callid;
  private String payunit;
  private String namecontact;
  private String telcontact;
  private String emailcontact;
  private String problem;
  private Integer force;
  private Integer problemtype;
  private String idopen;
  private String helpdeskowner;
  private String calllogin;
  private String callstatus;
  private String  attach;
  private String calldate;
  private Integer callchanel;
  private Integer callmodule;
  private Integer callsubmodule;
  private String cretaedate;
  


	}