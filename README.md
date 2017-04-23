# Overview

Parent project that holds module projects for the persistence of phone data.

The project holds backend data for phone data.

# ERD-Diagramm

The erd-diagramm for this database looks as follows: ![erd-diagramm](https://raw.githubusercontent.com/lightblueseas/phone-data-management-system/develop/phone-data-management-system-init/src/main/resources/erd/erd-diagramm-phone-data-management-system.jpa.png)

This erd-diagramm was created with [Jeddict plugin from netbeans as JPA Modeler](http://plugins.netbeans.org/plugin/53057/jpa-modeler)  and [Jeddict](https://jeddict.github.io/)

## License

The source code comes under the liberal MIT License.

# Build status
[![Build Status](https://travis-ci.org/lightblueseas/phone-data-management-system.svg?branch=master)](https://travis-ci.org/lightblueseas/phone-data-management-system)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/phone-data-management-system/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/phone-data-management-system)

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~phone-data-management-system~~~) for latest snapshots and releases.

Add the following maven dependencies to your project `pom.xml` if you want to import the core functionality:

You can first define the version properties:

	<properties>
			...
		<!-- phone-data-management-system version -->
		<phone-data-management-system.version>3.11.0</phone-data-management-system.version>
		<phone-data-management-system-business.version>${phone-data-management-system.version}</phone-data-management-system-business.version>
		<phone-data-management-system-domain.version>${phone-data-management-system.version}</phone-data-management-system-domain.version>
		<phone-data-management-system-entities.version>${phone-data-management-system.version}</phone-data-management-system-entities.version>
		<phone-data-management-system-init.version>${phone-data-management-system.version}</phone-data-management-system-init.version>
		<phone-data-management-system-rest-api.version>${phone-data-management-system.version}</phone-data-management-system-rest-api.version>
		<phone-data-management-system-rest-client.version>${phone-data-management-system.version}</phone-data-management-system-rest-client.version>
		<phone-data-management-system-rest-web.version>${phone-data-management-system.version}</phone-data-management-system-rest-web.version>
			...
	</properties>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-business:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-business</artifactId>
				<version>${phone-data-management-system-business.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-domain:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-domain</artifactId>
				<version>${phone-data-management-system-domain.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-entities:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-entities</artifactId>
				<version>${phone-data-management-system-entities.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-init:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-init</artifactId>
				<version>${phone-data-management-system-init.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-rest-api:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-rest-api</artifactId>
				<version>${phone-data-management-system-rest-api.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-rest-client:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-rest-client</artifactId>
				<version>${phone-data-management-system-rest-client.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of phone-data-management-system-rest-web:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>phone-data-management-system-rest-web</artifactId>
				<version>${phone-data-management-system-rest-web.version}</version>
			</dependency>
			...
		</dependencies>
		 
## Open Issues
[![Open Issues](https://img.shields.io/github/issues/astrapi69/phone-data-management-system.svg?style=flat)](https://github.com/astrapi69/phone-data-management-system/issues) 

## Want to Help and improve it? ###

The source code for phone-data-management-system are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/phone-data-management-system/fork](https://github.com/lightblueseas/phone-data-management-system/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/phone-data-management-system/pull/new/master).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the phone-data-management-system developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/phone-data-management-system/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Fphone-data-management-system" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>

