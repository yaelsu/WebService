package webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CustomerService {

    @WebMethod
    String getName(@WebParam long id);
}
