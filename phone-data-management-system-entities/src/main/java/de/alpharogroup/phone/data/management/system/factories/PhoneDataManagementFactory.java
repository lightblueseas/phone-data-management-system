package de.alpharogroup.phone.data.management.system.factories;

import java.io.Serializable;

import de.alpharogroup.phone.data.management.system.entities.SlotScore;


public class PhoneDataManagementFactory implements Serializable
{
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/** The Constant instance. */
	private static final PhoneDataManagementFactory instance = new PhoneDataManagementFactory();

	/**
	 * Gets the single instance of DomainObjectFactory.
	 *
	 * @return single instance of DomainObjectFactory
	 */
	public static PhoneDataManagementFactory getInstance() {
		return instance;
	}

	protected SlotScore getSlotScore(final Integer id, final String phoneNumber,final Integer score) {
		final SlotScore slotScore = new SlotScore();
		slotScore.setId(id);
		slotScore.setPhoneNumber(phoneNumber);
		slotScore.setScore(score);
		return slotScore;
	}

	public SlotScore getSlotScore(final String phoneNumber,final Integer score) {
		return getSlotScore(null, phoneNumber, score);
	}

}
