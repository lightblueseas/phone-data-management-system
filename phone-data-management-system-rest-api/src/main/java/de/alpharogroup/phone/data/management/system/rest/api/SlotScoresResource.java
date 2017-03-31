/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
 * The interface {@link SlotScoresResource} provides methods for resolving slot
 * scores.
 */
@Path("/SlotGame")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SlotScoresResource extends RestfulResource<Integer, SlotScore> {

	public static final String UPDATE_SCORE_ACTION = "UpdateScore";

	public static final String GET_SCORE_ACTION = "GetScore";

	/**
	 * Find the {@link SlotScore} from the given phone number.
	 *
	 * @param phoneNumber
	 *            the phone number
	 * @return the {@link SlotScore}
	 */
	@GET
	@Path("/get/{phoneNumber}")
	Response find(@PathParam("phoneNumber") final String phoneNumber);

	/**
	 * Find the {@link SlotScore} from the given phone number.
	 *
	 * @param phoneNumber
	 *            the phone number
	 * @param score
	 *            the score
	 * @return the {@link SlotScore}
	 */
	@GET
	@Path("/get/{phoneNumber}/{score}")
	List<SlotScore> find(@PathParam("phoneNumber") final String phoneNumber, @PathParam("score") final Integer score);

	/**
	 * Gets the score from the given phone number.
	 *
	 * @param action
	 *            the action
	 * @param phoneNumber
	 *            the phone number
	 * @param score
	 *            the score
	 * @return the score
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String getScore(@QueryParam("action") String action, @QueryParam("pn") final String phoneNumber,
			@QueryParam("score") final String score);
}
