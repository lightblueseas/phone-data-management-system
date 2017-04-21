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

	private String baseUrl;

	private String basePath;

	private String actionParameterPrefix;

	private String phoneNumberParameterPrefix;

	private String scoreParameterPrefix;

	/**
	 * Sets the up method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	public void setUpMethod() throws Exception
	{
		if (baseUrl == null)
		{
			baseUrl = "http://localhost:11080";
			basePath = "/SlotGame";
			actionParameterPrefix = "action=";
			phoneNumberParameterPrefix = "pn=";
			scoreParameterPrefix = "score=";
		}
		if (restClient == null)
		{
			restClient = new PhoneDataManagementSystemRestClient(baseUrl);
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

	@Test(enabled = false)
	public void testGetSlotScoresResource() throws IOException
	{
		// Connect to rest-api
		String getScoreUrl = baseUrl + basePath + "?" + actionParameterPrefix
			+ SlotScoresResource.GET_SCORE_ACTION + "&" + phoneNumberParameterPrefix
			+ "%2B49174/1763646";
		final URL url = new URL(getScoreUrl);
		final URLConnection connection = url.openConnection();
		final InputStream is = connection.getInputStream();
		final byte[] buffer = new byte[100];
		final int length = is.read(buffer);
		final String score = new String(buffer, 0, length);
		System.out.println(score);
	}

	@Test(enabled = false)
	public void testUpdateSlotScoresResource() throws IOException
	{
		// Connect to rest-api
		// http://localhost:11080/SlotGame?action=UpdateScore&pn=%2B49174/1763646&score=5555
		String updateScoreUrl = baseUrl + basePath + "?" + actionParameterPrefix
			+ SlotScoresResource.UPDATE_SCORE_ACTION + "&" + phoneNumberParameterPrefix
			+ "%2B49174/1763646" + "&" + scoreParameterPrefix + "5555";
		final URL url = new URL(updateScoreUrl);
		final URLConnection connection = url.openConnection();
		final InputStream is = connection.getInputStream();
		final byte[] buffer = new byte[100];
		final int length = is.read(buffer);
		final String score = new String(buffer, 0, length);
		System.out.println(score);
	}

}
