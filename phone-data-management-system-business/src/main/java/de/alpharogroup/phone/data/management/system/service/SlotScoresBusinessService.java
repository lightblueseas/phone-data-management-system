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
package de.alpharogroup.phone.data.management.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.collections.ListExtensions;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.phone.data.management.system.daos.SlotScoresDao;
import de.alpharogroup.phone.data.management.system.entities.SlotScores;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoresService;
import de.alpharogroup.phone.data.management.system.service.util.HqlStringCreator;

@Transactional
@Service("slotScoresService")
public class SlotScoresBusinessService
	extends
		AbstractBusinessService<SlotScores, Integer, SlotScoresDao>
	implements
		SlotScoresService
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	@Transactional
	public SlotScores find(final String phoneNumber)
	{
		final List<SlotScores> slotScores = find(phoneNumber, null);
		return ListExtensions.getFirst(slotScores);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<SlotScores> find(final String phoneNumber, final Integer score)
	{
		final String hqlString = HqlStringCreator.forSlotScore(phoneNumber, score);
		final Query query = getQuery(hqlString);
		if ((phoneNumber != null) && !phoneNumber.isEmpty())
		{
			query.setParameter("phoneNumber", phoneNumber);
		}
		if (score != null)
		{
			query.setParameter("score", score);
		}
		final List<SlotScores> images = query.getResultList();
		return images;
	}

	@Autowired
	public void setProfileRatingsDao(final SlotScoresDao slotScoreDao)
	{
		setDao(slotScoreDao);
	}
}
