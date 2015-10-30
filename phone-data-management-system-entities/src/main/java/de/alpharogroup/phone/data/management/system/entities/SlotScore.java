package de.alpharogroup.phone.data.management.system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import de.alpharogroup.db.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Entity class {@link SlotScore} is keeping the information for the phone number of a player
 * and the point score of him. This prevents the player to uninstall the game and install it again
 * and get again 1000 points of score. Only the first time when the player installs the game the
 * player can get 1000 points score. Next time he have to buy points from google play.
 */
@Entity
@Table(name = "slot_score")
@Getter
@Setter
@NoArgsConstructor
public class SlotScore extends BaseEntity<Integer> implements Cloneable
{

	/** The serial Version UID. */
	private static final long serialVersionUID = 1L;

	/** The phone number. */
	@Column(length = 255)
	private String phoneNumber;

	/** The score. */
	@Column(name = "score")
	private Integer score;

}
