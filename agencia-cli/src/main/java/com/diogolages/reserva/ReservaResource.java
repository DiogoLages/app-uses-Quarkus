package com.diogolages.reserva;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/reserva-cli")
public class ReservaResource {
    @Inject
    @RestClient
    ReservaService reservaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("createReserva")
    public String createReserva(){
        Reserva reserva = Reserva.of(0, 2);

        return reservaService.createReserva(reserva);
    }
    
}
