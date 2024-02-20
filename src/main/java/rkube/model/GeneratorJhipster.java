package rkube.model;
import java.util.List;

public class GeneratorJhipster {
    private String applicationType;
    private String baseName;
    private String packageName;
    private String packageFolder;
    private String serverPort;
    private String authenticationType;
    private String cacheProvider;
    private boolean enableHibernateCache;
    private boolean websocket;
    private String databaseType;
    private String devDatabaseType;
    private String prodDatabaseType;
    private boolean searchEngine;
    private boolean enableSwaggerCodegen;
    private boolean messageBroker;
    private String buildTool;
    private String clientFramework;
    private boolean useSass;
    private String clientPackageManager;
    private List<String> testFrameworks;
    private boolean enableTranslation;
    private String nativeLanguage;
    private List<String> languages;
    private String jhiPrefix;
    private boolean serviceDiscoveryType;
    private boolean withAdminUi;
    private List<String> blueprints;

    // Constructors
    public GeneratorJhipster() {
        // Default constructor
    }

    // Getters and Setters
    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageFolder() {
        return packageFolder;
    }

    public void setPackageFolder(String packageFolder) {
        this.packageFolder = packageFolder;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getCacheProvider() {
        return cacheProvider;
    }

    public void setCacheProvider(String cacheProvider) {
        this.cacheProvider = cacheProvider;
    }

    public boolean isEnableHibernateCache() {
        return enableHibernateCache;
    }

    public void setEnableHibernateCache(boolean enableHibernateCache) {
        this.enableHibernateCache = enableHibernateCache;
    }

    public boolean isWebsocket() {
        return websocket;
    }

    public void setWebsocket(boolean websocket) {
        this.websocket = websocket;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getDevDatabaseType() {
        return devDatabaseType;
    }

    public void setDevDatabaseType(String devDatabaseType) {
        this.devDatabaseType = devDatabaseType;
    }

    public String getProdDatabaseType() {
        return prodDatabaseType;
    }

    public void setProdDatabaseType(String prodDatabaseType) {
        this.prodDatabaseType = prodDatabaseType;
    }

    public boolean isSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(boolean searchEngine) {
        this.searchEngine = searchEngine;
    }

    public boolean isEnableSwaggerCodegen() {
        return enableSwaggerCodegen;
    }

    public void setEnableSwaggerCodegen(boolean enableSwaggerCodegen) {
        this.enableSwaggerCodegen = enableSwaggerCodegen;
    }

    public boolean isMessageBroker() {
        return messageBroker;
    }

    public void setMessageBroker(boolean messageBroker) {
        this.messageBroker = messageBroker;
    }

    public String getBuildTool() {
        return buildTool;
    }

    public void setBuildTool(String buildTool) {
        this.buildTool = buildTool;
    }

    public String getClientFramework() {
        return clientFramework;
    }

    public void setClientFramework(String clientFramework) {
        this.clientFramework = clientFramework;
    }

    public boolean isUseSass() {
        return useSass;
    }

    public void setUseSass(boolean useSass) {
        this.useSass = useSass;
    }

    public String getClientPackageManager() {
        return clientPackageManager;
    }

    public void setClientPackageManager(String clientPackageManager) {
        this.clientPackageManager = clientPackageManager;
    }

    public List<String> getTestFrameworks() {
        return testFrameworks;
    }

    public void setTestFrameworks(List<String> testFrameworks) {
        this.testFrameworks = testFrameworks;
    }

    public boolean isEnableTranslation() {
        return enableTranslation;
    }

    public void setEnableTranslation(boolean enableTranslation) {
        this.enableTranslation = enableTranslation;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getJhiPrefix() {
        return jhiPrefix;
    }

    public void setJhiPrefix(String jhiPrefix) {
        this.jhiPrefix = jhiPrefix;
    }

    public boolean isServiceDiscoveryType() {
        return serviceDiscoveryType;
    }

    public void setServiceDiscoveryType(boolean serviceDiscoveryType) {
        this.serviceDiscoveryType = serviceDiscoveryType;
    }

    public boolean isWithAdminUi() {
        return withAdminUi;
    }

    public void setWithAdminUi(boolean withAdminUi) {
        this.withAdminUi = withAdminUi;
    }

    public List<String> getBlueprints() {
        return blueprints;
    }

    public void setBlueprints(List<String> blueprints) {
        this.blueprints = blueprints;
    }
}
