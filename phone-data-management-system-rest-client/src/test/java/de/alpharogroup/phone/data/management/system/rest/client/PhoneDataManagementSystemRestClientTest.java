package de.alpharogroup.phone.data.management.system.rest.client;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.alpharogroup.phone.data.management.system.rest.api.SlotScoresResource;

public class PhoneDataManagementSystemRestClientTest
{

	/** The rest client. */
	private PhoneDataManagementSystemRestClient restClient;

	/** The SlotScoresResource. */
	private SlotScoresResource slotScoresResource;

	/**
	 * Sets the up method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	public void setUpMethod() throws Exception
	{
		if (restClient == null)
		{
			restClient = new PhoneDataManagementSystemRestClient("http://localhost:21080");
			slotScoresResource = restClient.getSlotScoresResource();
			AssertJUnit.assertNotNull(slotScoresResource);
		}
	}

	/**
	 * Tear down method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterMethod
	public void tearDownMethod() throws Exception
	{
	}

	@Test
	public void testGetSlotScoresResource()
	{
	}

}
