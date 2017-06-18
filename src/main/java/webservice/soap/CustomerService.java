package webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CustomerService {

    @WebMethod
    public String getName(@WebParam long id);
}
