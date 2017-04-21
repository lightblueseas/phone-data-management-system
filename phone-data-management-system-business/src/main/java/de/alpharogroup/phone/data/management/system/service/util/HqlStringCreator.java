/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.phone.data.management.system.service.util;

import de.alpharogroup.phone.data.management.system.entities.SlotScores;

public class HqlStringCreator
{

	public static String forSlotScore(final String phoneNumber, final Integer score)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("select ss from " + SlotScores.class.getSimpleName() + " ss");
		final boolean phoneNumberIsNotNull = phoneNumber != null && !phoneNumber.isEmpty();
		if (phoneNumberIsNotNull)
		{
			sb.append(" ");
			sb.append("where ss.phoneNumber=:phoneNumber");
		}
		final boolean scoreIsNotNull = score != null;
		if (scoreIsNotNull)
		{
			sb.append(" ");
			if (phoneNumberIsNotNull)
			{
				sb.append("and ss.score=:score");
			}
			else
			{
				sb.append("where ss.score=:score");
			}
		}
		return sb.toString();
	}

}
