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
	extends
		AbstractDomainService<Integer, SlotScore, SlotScores, SlotScoresDao, SlotScoresMapper>
	implements
		SlotScoreService
{

	/** The {@link SlotScoresService}. */
	@Autowired
	@Getter
	@Setter
	private SlotScoresService slotScoresService;

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

	@Override
	public SlotScore find(final String phoneNumber)
	{
		final SlotScores slotScores = slotScoresService.find(phoneNumber);
		final SlotScore slotScore = getMapper().toDomainObject(slotScores);
		return slotScore;
	}

	@Override
	public List<SlotScore> find(final String phoneNumber, final Integer score)
	{
		final List<SlotScores> slotScoresEntities = slotScoresService.find(phoneNumber, score);
		final List<SlotScore> slotScoreDomainObjects = getMapper().toDomainObjects(slotScoresEntities);
		return slotScoreDomainObjects;
	}

}
