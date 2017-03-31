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
package de.alpharogroup.phone.data.management.system.rest;

import java.util.List;

import javax.ws.rs.core.Response;

import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.phone.data.management.system.rest.api.SlotScoresResource;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class SlotScoresRestResource extends AbstractRestfulResource<Integer, SlotScore, SlotScoreService>
		implements SlotScoresResource {

	@Override
	public Response find(final String phoneNumber) {
		final SlotScoreService domainService = getDomainService();
		final SlotScore slotScore = domainService.find(phoneNumber);
		return Response.ok(slotScore).build();
	}

	@Override
	public List<SlotScore> find(final String phoneNumber, final Integer score) {
		final SlotScoreService domainService = getDomainService();
		final List<SlotScore> slotScores = domainService.find(phoneNumber, score);
		return slotScores;
	}

	@Override
	public String getScore(final String action, final String phoneNumber, final String score) {
		final SlotScoreService domainService = getDomainService();
		SlotScore slotScore = domainService.find(phoneNumber);
		if (GET_SCORE_ACTION.equals(action)) {
			// handle get score action...
			// if slotScore is null its the first time so create a new one...
			if (slotScore == null) {
				// create new SlotCore object...
				slotScore = SlotScore.builder().phoneNumber(phoneNumber).score(1000).build();
				// Save SlotCore object...
				slotScore = domainService.create(slotScore);
			}
		} else if (UPDATE_SCORE_ACTION.equals(action)) {
			// handle update score action...
			if (slotScore != null) {
				Integer credits;
				try {
					credits = Integer.valueOf(score);
					slotScore.setScore(credits);
				} catch (final NumberFormatException e) {
					e.printStackTrace();
				}
			} else {
				// create new SlotCore object...
				slotScore = SlotScore.builder().phoneNumber(phoneNumber).score(1000).build();
			}
			// Save SlotCore object...
			domainService.update(slotScore);
		}
		Integer ns = slotScore.getScore();
		String newScore = Integer.toString(ns);
		return newScore;
	}

}
