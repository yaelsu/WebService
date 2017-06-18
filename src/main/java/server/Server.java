package server;

import webservice.soap.CustomerServiceImpl;

import javax.xml.ws.Endpoint;


public class Server {
    public static void main(String[] argv) {
        Object implementor = new CustomerServiceImpl();
        String address = "http://localhost:8080/CustomerService";
        Endpoint.publish(address, implementor);
    }
}
