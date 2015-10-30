package de.alpharogroup.phone.data.management.system.service.locator;

import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;


public interface ServiceLocator {

	SlotScoreService getSlotScoreService();

	void setSlotScoreService(final SlotScoreService slotScoreService);
}
