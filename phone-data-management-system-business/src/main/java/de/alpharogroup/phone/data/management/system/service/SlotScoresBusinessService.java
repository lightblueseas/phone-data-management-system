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
public class SlotScoresBusinessService extends AbstractBusinessService<SlotScores, Integer, SlotScoresDao> implements SlotScoresService  {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SlotScores find(final String phoneNumber){
		final List<SlotScores> slotScores = find(phoneNumber, null);
		return ListExtensions.getFirst(slotScores);
	}

	@SuppressWarnings("unchecked")
	public List<SlotScores> find(final String phoneNumber, final Integer score) {
		final String hqlString = HqlStringCreator.forSlotScore(phoneNumber, score);
		final Query query = getQuery(hqlString);
		if((phoneNumber != null) && !phoneNumber.isEmpty()){
			query.setParameter("phoneNumber", phoneNumber);
		}
		if(score != null){
			query.setParameter("score", score);
		}
		final List<SlotScores> images = query.getResultList();
		return images;
	}

	@Autowired
	public void setProfileRatingsDao(final SlotScoresDao slotScoreDao) {
		setDao(slotScoreDao);
	}
}
