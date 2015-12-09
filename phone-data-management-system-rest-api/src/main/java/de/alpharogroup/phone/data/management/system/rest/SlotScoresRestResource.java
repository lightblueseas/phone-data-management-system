package de.alpharogroup.phone.data.management.system.rest;

import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.phone.data.management.system.rest.api.SlotScoresResource;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class SlotScoresRestResource
	extends
		AbstractRestfulResource<Integer, SlotScore, SlotScoreService>
	implements SlotScoresResource
{

}
