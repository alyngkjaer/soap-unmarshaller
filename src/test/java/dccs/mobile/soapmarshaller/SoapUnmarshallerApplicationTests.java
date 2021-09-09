package dccs.mobile.soapmarshaller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SoapUnmarshallerApplicationTests {

    @Test
    void unmarshal() throws SOAPException, IOException, JAXBException {
        SOAPMessage message =
                MessageFactory.newInstance()
                        .createMessage(null, new ClassPathResource("response/soap.xml").getInputStream());
        JAXBContext jaxbContext = JAXBContext.newInstance(Updatestatus.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Updatestatus result = (Updatestatus) jaxbUnmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
        assertNotNull(result);
    }

}
