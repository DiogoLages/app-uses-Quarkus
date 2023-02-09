package com.diogolages.cliente;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/client-cli")
public class ClienteResource {
    
    @Inject
    @RestClient
    ClienteService clienteService;

    @GET
    @Path("createCliente")
    public Response createCliente(){

        Cliente cliente = Cliente.of(99, "Remoto");
        Response response = clienteService.createCliente(cliente);
        return Response.status(Status.CREATED).entity(response).build();
        
    }

}
