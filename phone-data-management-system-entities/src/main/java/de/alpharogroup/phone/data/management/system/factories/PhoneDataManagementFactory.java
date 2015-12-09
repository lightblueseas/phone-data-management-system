package de.alpharogroup.phone.data.management.system.factories;

import java.io.Serializable;

import de.alpharogroup.phone.data.management.system.entities.SlotScores;


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

	protected SlotScores newSlotScores(final Integer id, final String phoneNumber,final Integer score) {
		final SlotScores slotScore = new SlotScores();
		slotScore.setId(id);
		slotScore.setPhoneNumber(phoneNumber);
		slotScore.setScore(score);
		return slotScore;
	}

	public SlotScores newSlotScores(final String phoneNumber,final Integer score) {
		return newSlotScores(null, phoneNumber, score);
	}

}
