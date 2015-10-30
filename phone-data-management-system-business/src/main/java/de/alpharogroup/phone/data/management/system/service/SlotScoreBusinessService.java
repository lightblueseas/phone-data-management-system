package de.alpharogroup.phone.data.management.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.collections.ListExtensions;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.phone.data.management.system.daos.SlotScoreDao;
import de.alpharogroup.phone.data.management.system.entities.SlotScore;
import de.alpharogroup.phone.data.management.system.service.api.SlotScoreService;
import de.alpharogroup.phone.data.management.system.service.util.HqlStringCreator;


@Transactional
@Service("slotScoreService")
public class SlotScoreBusinessService extends AbstractBusinessService<SlotScore, Integer, SlotScoreDao> implements SlotScoreService  {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SlotScore find(final String phoneNumber){
		final List<SlotScore> slotScores = find(phoneNumber, null);
		return ListExtensions.getFirst(slotScores);
	}

	@SuppressWarnings("unchecked")
	public List<SlotScore> find(final String phoneNumber, final Integer score) {
		final String hqlString = HqlStringCreator.forSlotScore(phoneNumber, score);
		final Query query = getQuery(hqlString);
		if((phoneNumber != null) && !phoneNumber.isEmpty()){
			query.setParameter("phoneNumber", phoneNumber);
		}
		if(score != null){
			query.setParameter("score", score);
		}
		final List<SlotScore> images = query.getResultList();
		return images;
	}

	@Autowired
	public void setProfileRatingsDao(final SlotScoreDao slotScoreDao) {
		setDao(slotScoreDao);
	}
}
