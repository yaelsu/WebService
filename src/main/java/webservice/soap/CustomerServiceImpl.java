package webservice.soap;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "webservice.soap.CustomerService")
public class CustomerServiceImpl implements CustomerService {

    private static Map<Long, String> nameById = new HashMap<Long, String>();

    static {
        nameById.put(305045678l, "Yael");
}

    public String getName(long id) {
        String name = nameById.get(id);
        return name == null ? "Customer with id: " + id + " wasn't found" : name;
    }
}
