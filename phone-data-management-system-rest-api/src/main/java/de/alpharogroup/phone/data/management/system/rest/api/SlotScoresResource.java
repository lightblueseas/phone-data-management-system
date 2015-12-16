package de.alpharogroup.phone.data.management.system.rest.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.service.rs.RestfulResource;

/**
 * The interface {@link SlotScoresResource} provides methods for resolving slot scores.
 */
@Path("/SlotGame")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SlotScoresResource extends RestfulResource<Integer, SlotScore>
{

    /**
     * Find the {@link SlotScore} from the given phone number.
     *
     * @param phoneNumber the phone number
     * @return the {@link SlotScore}
     */
    @GET
    @Path("/get/{phoneNumber}")
    Response find(@PathParam("phoneNumber")final String phoneNumber);


    /**
     * Gets the score from the given phone number.
     *
     * @param action the action
     * @param phoneNumber the phone number
     * @return the score
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String getScore(@QueryParam("action")String action, @QueryParam("pn")final String phoneNumber, @QueryParam("score")final String score);

    /**
     * Find the {@link SlotScore} from the given phone number.
     *
     * @param phoneNumber the phone number
     * @return the {@link SlotScore}
     */
    @GET
    @Path("/get/{phoneNumber}/{score}")
	List<SlotScore> find(@PathParam("phoneNumber")final String phoneNumber, @PathParam("score")final Integer score);
}
