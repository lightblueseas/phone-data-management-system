package de.alpharogroup.phone.data.management.system.service.api;

import java.util.List;

import de.alpharogroup.db.service.jpa.BusinessService;
import de.alpharogroup.phone.data.management.system.entities.SlotScore;

public interface SlotScoreService extends BusinessService<SlotScore, Integer> {
	SlotScore find(final String phoneNumber);
	List<SlotScore> find(final String phoneNumber, final Integer score);
}
