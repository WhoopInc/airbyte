package io.airbyte.integrations.acceptance_tests.destination;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

/**
 * This class is meant to run DAT with an injected configuration like an input yaml, command line args, etc.
 */
public class ExternallyConfigurableDestinationAcceptanceTest extends DestinationAcceptanceTest {
  private static TestConfiguration TEST_CONFIG;

  public static void initialize(TestConfiguration config){
    TEST_CONFIG = config;
  }

  @Override
  protected String getImageName() {
    return null;
  }

  @Override
  protected JsonNode getConfig() throws Exception {
    return null;
  }

  @Override
  protected JsonNode getFailCheckConfig() throws Exception {
    return null;
  }

  @Override
  protected void tearDown(DestinationAcceptanceTest.TestDestinationEnv testEnv)
      throws Exception {
    // no op
  }

  @Override
  protected void setup(DestinationAcceptanceTest.TestDestinationEnv testEnv)
      throws Exception {
    // TODO allow configuring this
    // no op
  }

  @Override
  protected List<JsonNode> retrieveRecords(DestinationAcceptanceTest.TestDestinationEnv testEnv,
                                           String streamName,
                                           String namespace,
                                           JsonNode streamSchema) throws Exception {
    // TODO this should run from the client 
    return null;
  }

  public static class TestConfiguration {
    String failConfigPath;
    String configPath;
    String imageName;

  }
}
