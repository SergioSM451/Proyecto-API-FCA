package fca.suayed.resources;

import fca.suayed.dal.StoreDal;
import fca.suayed.dto.ResponseDto;
import fca.suayed.dto.ClientDto;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/clients")
public class ClientsResource {

    @Inject
    StoreDal storeDal;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClients() {
        ResponseDto<List<ClientDto>> responseDto = storeDal.getClients();
        return Response.ok(responseDto).build();
    }
}
