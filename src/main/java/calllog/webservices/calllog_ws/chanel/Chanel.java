package calllog.webservices.calllog_ws.chanel;
import lombok.Data;

import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Chanel {
  @Id
 
  private String chanelid;
  private String chaneldesc;
	}