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
	public static PhoneDataManagementFactory getInstance()
	{
		return instance;
	}

	protected SlotScores newSlotScores(final Integer id, final String phoneNumber,
		final Integer score)
	{
		final SlotScores slotScore = new SlotScores();
		slotScore.setId(id);
		slotScore.setPhoneNumber(phoneNumber);
		slotScore.setScore(score);
		return slotScore;
	}

	public SlotScores newSlotScores(final String phoneNumber, final Integer score)
	{
		return newSlotScores(null, phoneNumber, score);
	}

}
