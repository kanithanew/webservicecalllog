package calllog.webservices.calllog_ws.payunit;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Payunit {
  @Id
 
  private String payunit;
  private String payunit_name;
  private String department_name;
  private String ministry_name;
	}