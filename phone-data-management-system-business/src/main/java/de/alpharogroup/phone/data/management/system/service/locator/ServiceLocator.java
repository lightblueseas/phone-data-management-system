package de.alpharogroup.phone.data.management.system.service.locator;

import de.alpharogroup.phone.data.management.system.service.api.SlotScoresService;


public interface ServiceLocator {

	SlotScoresService getSlotScoreService();

	void setSlotScoreService(final SlotScoresService slotScoreService);
}
