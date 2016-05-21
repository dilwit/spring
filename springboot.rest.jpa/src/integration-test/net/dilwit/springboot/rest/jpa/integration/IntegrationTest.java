package net.dilwit.springboot.rest.jpa.integration;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.dilwit.springboot.rest.jpa.App;


/**
 * Base class for all type of integration test.
 * @author DWithanage
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {App.class})
@WebIntegrationTest
public abstract class IntegrationTest {
	
	private static final Logger logger = Logger.getLogger(IntegrationTest.class);
}
