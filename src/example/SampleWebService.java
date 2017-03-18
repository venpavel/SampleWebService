package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

// интерфейс будет работать как веб-сервис
@WebService
// веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface SampleWebService {
    // этот метод можно вызывать удаленно
    @WebMethod
    public String sayHelloWorldFrom(String from);

    @WebMethod
    public String Calculator(int first, int second, String operation);

}

