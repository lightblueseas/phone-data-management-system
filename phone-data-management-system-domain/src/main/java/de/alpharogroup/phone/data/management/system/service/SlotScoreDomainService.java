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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.phone.data.management.system.daos.SlotScoresDao;
import de.alpharogroup.phone.data.management.system.domain.SlotScore;
import de.alpharogroup.phone.data.management.system.entities.SlotScores;
import de.alpharogroup.phone.data.management.system.mapper.SlotScoresMapper;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoresService;
import de.alpharogroup.service.domain.AbstractDomainService;
import lombok.Getter;
import lombok.Setter;

@Transactional
@Service("slotScoreDomainService")
public class SlotScoreDomainService
		extends AbstractDomainService<Integer, SlotScore, SlotScores, SlotScoresDao, SlotScoresMapper>
		implements SlotScoreService {

	/** The {@link SlotScoresService}. */
	@Autowired
	@Getter
	@Setter
	private SlotScoresService slotScoresService;

	@Transactional
	@Override
	public SlotScore create(final SlotScore domainObject) {
		return super.create(domainObject);
	}

	@Override
	public SlotScore find(final String phoneNumber) {
		final SlotScores slotScores = slotScoresService.find(phoneNumber);
		final SlotScore slotScore = getMapper().toDomainObject(slotScores);
		return slotScore;
	}

	@Override
	public List<SlotScore> find(final String phoneNumber, final Integer score) {
		final List<SlotScores> slotScoresEntities = slotScoresService.find(phoneNumber, score);
		final List<SlotScore> slotScoreDomainObjects = getMapper().toDomainObjects(slotScoresEntities);
		return slotScoreDomainObjects;
	}

	/**
	 * Sets the specific {@link SlotScoresDao}.
	 *
	 * @param slotScoresDao
	 *            the new {@link SlotScoresDao}.
	 */
	@Autowired
	public void setSlotScoresDao(final SlotScoresDao slotScoresDao) {
		setDao(slotScoresDao);
	}

	/**
	 * Sets the specific {@link SlotScoresMapper}.
	 *
	 * @param slotScoresMapper
	 *            the new {@link SlotScoresMapper}.
	 */
	@Autowired
	public void setSlotScoresMapper(final SlotScoresMapper slotScoresMapper) {
		setMapper(slotScoresMapper);
	}

}
