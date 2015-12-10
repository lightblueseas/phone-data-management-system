package de.alpharogroup.phone.data.management.system.service.locator;

import de.alpharogroup.phone.data.management.system.service.api.SlotScoresService;


public interface ServiceLocator {

	SlotScoresService getSlotScoresService();

	void setSlotScoresService(final SlotScoresService slotScoreService);
}
