package de.alpharogroup.phone.data.management.system.service.api;

import java.util.List;

import de.alpharogroup.db.service.api.BusinessService;
import de.alpharogroup.phone.data.management.system.entities.SlotScores;

public interface SlotScoresService extends BusinessService<SlotScores, Integer> {
	SlotScores find(final String phoneNumber);
	List<SlotScores> find(final String phoneNumber, final Integer score);
}
