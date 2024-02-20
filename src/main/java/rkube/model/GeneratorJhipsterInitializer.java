package rkube.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;

public class GeneratorJhipsterInitializer {

    public GeneratorJhipster initializeGeneratorJhipster() {
        // Create an instance of GeneratorJhipster and set properties
        GeneratorJhipster generatorJhipster = new GeneratorJhipster();
        generatorJhipster.setApplicationType("monolith");
        generatorJhipster.setBaseName("jhipsterSampleApplication");
        generatorJhipster.setPackageName("com.mycompany.myapp");
        generatorJhipster.setPackageFolder("com/mycompany/myapp");
        generatorJhipster.setServerPort("8080");
        generatorJhipster.setAuthenticationType("jwt");
        generatorJhipster.setCacheProvider("ehcache");
        generatorJhipster.setEnableHibernateCache(true);
        generatorJhipster.setWebsocket(false);
        generatorJhipster.setDatabaseType("sql");
        generatorJhipster.setDevDatabaseType("h2Disk");
        generatorJhipster.setProdDatabaseType("postgresql");
        generatorJhipster.setSearchEngine(false);
        generatorJhipster.setEnableSwaggerCodegen(false);
        generatorJhipster.setMessageBroker(false);
        generatorJhipster.setBuildTool("maven");
        generatorJhipster.setClientFramework("angularX");
        generatorJhipster.setUseSass(true);
        generatorJhipster.setClientPackageManager("npm");
        generatorJhipster.setTestFrameworks(null); // Set as needed
        generatorJhipster.setEnableTranslation(true);
        generatorJhipster.setNativeLanguage("en");
        generatorJhipster.setLanguages(List.of("en")); // Set as needed
        generatorJhipster.setJhiPrefix("jhi");
        generatorJhipster.setServiceDiscoveryType(false);
        generatorJhipster.setWithAdminUi(true);
        generatorJhipster.setBlueprints(null); // Set as needed
        return generatorJhipster;
    }
}
