package de.alpharogroup.phone.data.management.system.service.util;

public class HqlStringCreator {

	public static String forSlotScore(String phoneNumber, Integer score){
		StringBuilder sb = new StringBuilder();
		sb.append("select ss from SlotScore ss");
		boolean phoneNumberIsNotNull = phoneNumber != null && !phoneNumber.isEmpty();
		if (phoneNumberIsNotNull) {
			sb.append(" ");
			sb.append("where ss.phoneNumber=:phoneNumber");
		}
		boolean scoreIsNotNull = score != null;
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
