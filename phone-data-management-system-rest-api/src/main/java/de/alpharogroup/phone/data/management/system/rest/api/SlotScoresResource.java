package de.alpharogroup.phone.data.management.system.rest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.service.rs.RestfulResource;

/**
 * The interface {@link SlotScoresResource} provides methods for resolving slot scores.
 */
@Path("/address/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SlotScoresResource extends RestfulResource<Integer, SlotScore>
{

}
