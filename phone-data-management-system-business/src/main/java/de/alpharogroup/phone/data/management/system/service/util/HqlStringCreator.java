package de.alpharogroup.phone.data.management.system.service.util;

import de.alpharogroup.phone.data.management.system.entities.SlotScores;

public class HqlStringCreator {

	public static String forSlotScore(final String phoneNumber, final Integer score){
		final StringBuilder sb = new StringBuilder();
		sb.append("select ss from " + SlotScores.class.getSimpleName() + " ss");
		final boolean phoneNumberIsNotNull = phoneNumber != null && !phoneNumber.isEmpty();
		if (phoneNumberIsNotNull) {
			sb.append(" ");
			sb.append("where ss.phoneNumber=:phoneNumber");
		}
		final boolean scoreIsNotNull = score != null;
		if (scoreIsNotNull) {
			sb.append(" ");
			if (phoneNumberIsNotNull) {
				sb.append("and ss.score=:score");
			} else {
				sb.append("where ss.score=:score");
			}
		}
		return sb.toString();
	}

}
