package de.alpharogroup.phone.data.management.system.service.locator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.alpharogroup.phone.data.management.system.service.api.SlotScoresService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Service("serviceLocator")
public class ServiceLocatorImpl implements ServiceLocator {
	@Autowired
	private SlotScoresService slotScoresService;
}
