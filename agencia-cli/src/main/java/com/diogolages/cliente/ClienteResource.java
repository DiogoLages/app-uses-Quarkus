package com.diogolages.cliente;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/client-cli")
public class ClienteResource {
    
    @Inject
    @RestClient
    ClienteService clienteService;

    @GET
    @Path("createCliente")
    public String createCliente(){
        Cliente cliente = Cliente.of(99, "Remoto");
        return clienteService.createCliente(cliente);
    }

}
