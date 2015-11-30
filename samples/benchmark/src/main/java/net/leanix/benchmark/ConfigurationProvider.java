package net.leanix.benchmark;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ConfigurationProvider {

    private static final String RANDOM_SEED = "random.seed";
    private Properties properties;
    private final File propertiesFile = new File(".benchmark.properties");

    public ConfigurationProvider() {
        properties = new Properties();
        readSettings();
    }

    private void readSettings() {
        if (!propertiesFile.exists()) {
            return;
        }
        try (FileInputStream is = new FileInputStream(propertiesFile)) {
            properties.load(is);
        } catch (IOException e) {
            // nothing to do
        }
    }

    private void persistSettings() {
        try (FileOutputStream os = new FileOutputStream(propertiesFile)) {
            properties.store(os, "Created by " + getClass().getSimpleName());
        } catch (IOException e) {
            throw new RuntimeException("internal error during persisting properties file", e);
        }
    }

    public static String getApiHostName() {
        return System.getProperty("api.hostname");
    }

    public static String getApiBasePath() {
        return Helper.getProperty("api.basePath", "https://local-eam.leanix.net/demo/api/v1");
    }

    public static String getApiKey() {
        return Helper.getProperty("api.key", null);
    }

    public static int getServicesCount() {
        return Helper.getIntProperty("services.count", 50);
    }

    public static int getNumResourcesPerService() {
        return Helper.getIntProperty("resourcesPerServices.count", 5);
    }

    public int getRandomSeed() {
        String givenRandomSeed = System.getProperty(RANDOM_SEED);
        if (StringUtils.isNotBlank(givenRandomSeed)) {
            properties.setProperty(RANDOM_SEED, givenRandomSeed);
            persistSettings();
        }
        return Integer.parseInt(properties.getProperty(RANDOM_SEED, "0"));
    }

    public void increaseSeed() {
        int num = Integer.parseInt(properties.getProperty(RANDOM_SEED, "0"));
        properties.setProperty(RANDOM_SEED, Integer.toString(num + 1));
        persistSettings();
    }

    public static String getApiMtmVersion() {
        return Helper.getProperty("api.mtm.version", "v1");
    }

    public static String createMtmApiUrl() {
        return Helper.getProperty("api.mtm.baseurl",
                String.format("https://%s/services/mtm/%s", getApiHostName(), getApiMtmVersion()));
    }

    public static String getTokenUrl() {
        return Helper.getProperty("api.tokenUrl", String.format("https://%s/services/mtm/v1/oauth2/token", getApiHostName()));
    }

    public static String getVerificationUrl() {
        return Helper.getProperty("api.verificationUrl",
                String.format("https://%s/services/mtm/%s/oauth2/verify", getApiHostName(), getApiMtmVersion()));
    }

    public static String getClientId() {
        return Helper.getProperty("api.clientId", "eam");
    }

    public static String getClientSecret() {
        return Helper.getProperty("api.clientSecret", null);
    }

    public static String getApiUserEmail() {
        return Helper.getProperty("api.userEmail", "cio@meshlab.de");
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
