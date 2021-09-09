package dccs.mobile.soapmarshaller;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "http://bc.tdc.dk/ordertrigger")
public class Updatestatus {
  public Updatestatus updatestatus;
  private String orderId;
  private String referenceId;
  private int account;
  private String status;
}
