package de.alpharogroup.phone.data.management.system.rest.client;

import de.alpharogroup.cxf.rest.client.AbstractRestClient;
import de.alpharogroup.phone.data.management.system.rest.api.SlotScoresResource;
import lombok.Getter;

public class PhoneDataManagementSystemRestClient extends AbstractRestClient
{

	/**
	 * The {@link SlotScoresResource}.
	 */
	@Getter
	private final SlotScoresResource slotScoresResource;

	/**
	 * Instantiates a new {@link PhoneDataManagementSystemRestClient} with the default base url.
	 */
	public PhoneDataManagementSystemRestClient()
	{
		this(DEFAULT_BASE_URL);
	}

	/**
	 * Instantiates a new {@link PhoneDataManagementSystemRestClient} with the given base url.
	 *
	 * @param baseUrl the base url
	 */
	public PhoneDataManagementSystemRestClient(final String baseUrl)
	{
		super(baseUrl);
		slotScoresResource = newResource(SlotScoresResource.class);
	}

}
