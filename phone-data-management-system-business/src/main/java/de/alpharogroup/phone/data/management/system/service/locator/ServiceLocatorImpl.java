package de.alpharogroup.phone.data.management.system.service.locator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.alpharogroup.phone.data.management.system.service.api.SlotScoresService;


@Service("serviceLocator")
public class ServiceLocatorImpl implements ServiceLocator {
	@Autowired
	private SlotScoresService slotScoreService;

	@Override
	public SlotScoresService getSlotScoreService() {
		return slotScoreService;
	}

	@Override
	public void setSlotScoreService(final SlotScoresService slotScoreService) {
		this.slotScoreService = slotScoreService;
	}

}
