package de.alpharogroup.phone.data.management.system.rest;

import java.util.List;

import javax.ws.rs.core.Response;

import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.phone.data.management.system.rest.api.SlotScoresResource;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class SlotScoresRestResource
	extends
		AbstractRestfulResource<Integer, SlotScore, SlotScoreService>
	implements SlotScoresResource
{
	private static final String UPDATE_SCORE_ACTION = "UpdateScore";

	private static final String GET_SCORE_ACTION = "GetScore";

	@Override
	public Response find(final String phoneNumber)
	{
		final SlotScoreService domainService = getDomainService();
		final SlotScore slotScore = domainService.find(phoneNumber);
		return Response.ok(slotScore).build();
	}

	@Override
	public List<SlotScore> find(final String phoneNumber, final Integer score)
	{
		final SlotScoreService domainService = getDomainService();
		final List<SlotScore> slotScores = domainService.find(phoneNumber, score);
		return slotScores;
	}

	@Override
	public String getScore(final String action, final String phoneNumber, final String score)
	{
		final SlotScoreService domainService = getDomainService();
		SlotScore slotScore = domainService.find(phoneNumber);
		if(GET_SCORE_ACTION.equals(action)){
			// handle get score action...
			// if slotScore is null its the first time so create a new one...
			if(slotScore == null) {
				// create new SlotCore object...
				slotScore = SlotScore.builder().phoneNumber(phoneNumber).score(1000).build();
				// Save SlotCore object...
				slotScore = domainService.create(slotScore);
			}
		}else if(UPDATE_SCORE_ACTION.equals(action)){
			// handle update score action...
			if(slotScore != null) {
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
			slotScore = domainService.create(slotScore);
		}
		return Integer.toString(slotScore.getScore());
	}

}
