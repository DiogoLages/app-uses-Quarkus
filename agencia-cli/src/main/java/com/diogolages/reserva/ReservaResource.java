package com.diogolages.reserva;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.diogolages.cliente.Cliente;
import com.diogolages.cliente.ClienteService;

@Path("/reserva-cli")
public class ReservaResource {
    @Inject
    @RestClient
    ReservaService reservaService;

    @Inject
    @RestClient
    ClienteService clienteService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("createReserva")
    public String createReserva(){
        Cliente cliente = clienteService.findById(2);
        Reserva reserva = Reserva.of(cliente);

        return reservaService.createReserva(reserva);
    }
    
}
