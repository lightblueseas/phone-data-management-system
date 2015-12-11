package de.alpharogroup.db.init;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import de.alpharogroup.phone.data.management.system.init.DatabaseInitialization;
import de.alpharogroup.resourcebundle.properties.PropertiesExtensions;

/**
 * The Class InitializeDbPhoneDataManagement.
 */
public class InitializeDatabase {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the sQL exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(final String[] args) throws ClassNotFoundException,
			SQLException, IOException {
		final Properties dbProperties = PropertiesExtensions.loadProperties("jdbc.properties");
		new DatabaseInitialization(dbProperties).initializeDatabase();
	}

}