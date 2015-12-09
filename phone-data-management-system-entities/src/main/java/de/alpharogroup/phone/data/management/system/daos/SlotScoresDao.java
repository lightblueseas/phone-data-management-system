package de.alpharogroup.phone.data.management.system.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;
import de.alpharogroup.phone.data.management.system.entities.SlotScores;


@Repository("slotScoresDao")
public class SlotScoresDao extends JpaEntityManagerDao<SlotScores, Integer> {
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
