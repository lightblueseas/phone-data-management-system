package de.alpharogroup.phone.data.management.system.rest.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

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
			restClient = new PhoneDataManagementSystemRestClient("http://localhost:11080");
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

	@Test(enabled=true)
	public void testGetSlotScoresResource() throws IOException
	{
        // Connect to servlet
			final URL url = new URL("http://localhost:11080/SlotGame?action=GetScore&pn=%2B49174/1763646");
			final URLConnection connection = url.openConnection();
			final InputStream is = connection.getInputStream();
			final byte[] buffer = new byte[100];
			final int length = is.read(buffer);
			final String score = new String(buffer, 0, length);
			System.out.println(score);
	}

}
