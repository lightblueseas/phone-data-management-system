package de.alpharogroup.phone.data.management.system.service.api;

import java.util.List;

import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.service.domain.DomainService;

public interface SlotScoreService extends DomainService<Integer, SlotScore>
{

	SlotScore find(final String phoneNumber);

	List<SlotScore> find(final String phoneNumber, final Integer score);
}
