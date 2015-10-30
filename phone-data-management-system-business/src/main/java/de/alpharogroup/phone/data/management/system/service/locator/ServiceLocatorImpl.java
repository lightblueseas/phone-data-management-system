package de.alpharogroup.phone.data.management.system.service.locator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;


@Service("serviceLocator")
public class ServiceLocatorImpl implements ServiceLocator {
	@Autowired
	private SlotScoreService slotScoreService;

	@Override
	public SlotScoreService getSlotScoreService() {
		return slotScoreService;
	}

	@Override
	public void setSlotScoreService(final SlotScoreService slotScoreService) {
		this.slotScoreService = slotScoreService;
	}

}
