package de.alpharogroup.phone.data.management.system.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;
import de.alpharogroup.phone.data.management.system.entities.SlotScores;
import lombok.Getter;
import lombok.Setter;


@Repository("slotScoresDao")
public class SlotScoresDao extends JpaEntityManagerDao<SlotScores, Integer> {
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The entity manager. */
	@PersistenceContext
	@Getter
	@Setter
	private EntityManager entityManager;
}
