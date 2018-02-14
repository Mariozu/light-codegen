package templates.graphql;

import javax.annotation.Generated;
import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template templates/graphql/serverYml.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class serverYml extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "serverYml.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.graphql";
    static public final String HEADER_HASH = "-474272988";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "serviceId", "enableHttp", "httpPort", "enableHttps", "httpsPort", "enableRegistry" };

    // argument @ [1:2]
    private String serviceId;
    // argument @ [1:2]
    private Boolean enableHttp;
    // argument @ [1:2]
    private String httpPort;
    // argument @ [1:2]
    private Boolean enableHttps;
    // argument @ [1:2]
    private String httpsPort;
    // argument @ [1:2]
    private Boolean enableRegistry;

    public serverYml serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String serviceId() {
        return this.serviceId;
    }

    public serverYml enableHttp(Boolean enableHttp) {
        this.enableHttp = enableHttp;
        return this;
    }

    public Boolean enableHttp() {
        return this.enableHttp;
    }

    public serverYml httpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    public String httpPort() {
        return this.httpPort;
    }

    public serverYml enableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
        return this;
    }

    public Boolean enableHttps() {
        return this.enableHttps;
    }

    public serverYml httpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    public String httpsPort() {
        return this.httpsPort;
    }

    public serverYml enableRegistry(Boolean enableRegistry) {
        this.enableRegistry = enableRegistry;
        return this;
    }

    public Boolean enableRegistry() {
        return this.enableRegistry;
    }

    static public serverYml template(String serviceId, Boolean enableHttp, String httpPort, Boolean enableHttps, String httpsPort, Boolean enableRegistry) {
        return new serverYml()
            .serviceId(serviceId)
            .enableHttp(enableHttp)
            .httpPort(httpPort)
            .enableHttps(enableHttps)
            .httpsPort(httpsPort)
            .enableRegistry(enableRegistry);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \n# Server configuration\n---\n# This is the default binding address if the service is dockerized.\nip: 0.0.0.0\n\n# Http port if enableHttp is true.\nhttpPort: 
        static private final byte[] PLAIN_TEXT_0_0;
        // \n\n# Enable HTTP should be false on official environment.\nenableHttp: 
        static private final byte[] PLAIN_TEXT_1_0;
        // \n\n# Https port if enableHttps is true.\nhttpsPort: 
        static private final byte[] PLAIN_TEXT_2_0;
        // \n\n# Enable HTTPS should be true on official environment.\nenableHttps: 
        static private final byte[] PLAIN_TEXT_3_0;
        // \n\n# Http/2 is enabled by default.\nenableHttp2: true\n\n# Keystore file name in config folder. KeystorePass is in secret.yml to access it.\nkeystoreName: tls/server.keystore\n\n# Flag that indicate if two way TLS is enabled. Not recommended in docker container.\nenableTwoWayTls: false\n\n# Truststore file name in config folder. TruststorePass is in secret.yml to access it.\ntruststoreName: tls/server.truststore\n\n# Unique service identifier. Used in service registration and discovery etc.\...
        static private final byte[] PLAIN_TEXT_4_0;
        // \n\n# Flag to enable service registration. Only be true if running as standalone Java jar.\nenableRegistry: 
        static private final byte[] PLAIN_TEXT_5_0;
        // \n\n# environment tag that will be registered on consul to support multiple instances per env for testing.\n# https://github.com/networknt/light-doc/blob/master/docs/content/design/env-segregation.md\n# This tag should only be set for testing env, not production. The production certification process will enforce it.\n# environment: test1\n
        static private final byte[] PLAIN_TEXT_6_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(serverYml.class.getClassLoader(), serverYml.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
            PLAIN_TEXT_5_0 = loader.tryGet("PLAIN_TEXT_5_0");
            PLAIN_TEXT_6_0 = loader.tryGet("PLAIN_TEXT_6_0");
        }

        // argument @ [1:2]
        protected final String serviceId;
        // argument @ [1:2]
        protected final Boolean enableHttp;
        // argument @ [1:2]
        protected final String httpPort;
        // argument @ [1:2]
        protected final Boolean enableHttps;
        // argument @ [1:2]
        protected final String httpsPort;
        // argument @ [1:2]
        protected final Boolean enableRegistry;

        public Template(serverYml model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.serviceId = model.serviceId();
            this.enableHttp = model.enableHttp();
            this.httpPort = model.httpPort();
            this.enableHttps = model.enableHttps();
            this.httpsPort = model.httpsPort();
            this.enableRegistry = model.enableRegistry();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [1:125]
            __internal.aboutToExecutePosInTemplate(1, 125);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [8:11]
            __internal.aboutToExecutePosInTemplate(8, 11);
            __internal.renderValue(httpPort, false);
            // PlainText @ [8:20]
            __internal.aboutToExecutePosInTemplate(8, 20);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // ValueExpression @ [11:13]
            __internal.aboutToExecutePosInTemplate(11, 13);
            __internal.renderValue(enableHttp, false);
            // PlainText @ [11:24]
            __internal.aboutToExecutePosInTemplate(11, 24);
            __internal.writeValue(PLAIN_TEXT_2_0);
            // ValueExpression @ [14:12]
            __internal.aboutToExecutePosInTemplate(14, 12);
            __internal.renderValue(httpsPort, false);
            // PlainText @ [14:22]
            __internal.aboutToExecutePosInTemplate(14, 22);
            __internal.writeValue(PLAIN_TEXT_3_0);
            // ValueExpression @ [17:14]
            __internal.aboutToExecutePosInTemplate(17, 14);
            __internal.renderValue(enableHttps, false);
            // PlainText @ [17:26]
            __internal.aboutToExecutePosInTemplate(17, 26);
            __internal.writeValue(PLAIN_TEXT_4_0);
            // ValueExpression @ [32:12]
            __internal.aboutToExecutePosInTemplate(32, 12);
            __internal.renderValue(serviceId, false);
            // PlainText @ [32:22]
            __internal.aboutToExecutePosInTemplate(32, 22);
            __internal.writeValue(PLAIN_TEXT_5_0);
            // ValueExpression @ [35:17]
            __internal.aboutToExecutePosInTemplate(35, 17);
            __internal.renderValue(enableRegistry, false);
            // PlainText @ [35:32]
            __internal.aboutToExecutePosInTemplate(35, 32);
            __internal.writeValue(PLAIN_TEXT_6_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\n# Server configuration\n---\n# This is the default binding address if the service is dockerized.\nip: 0.0.0.0\n\n# Http port if enableHttp is true.\nhttpPort: ";
        static private final String PLAIN_TEXT_1_0 = "\n\n# Enable HTTP should be false on official environment.\nenableHttp: ";
        static private final String PLAIN_TEXT_2_0 = "\n\n# Https port if enableHttps is true.\nhttpsPort: ";
        static private final String PLAIN_TEXT_3_0 = "\n\n# Enable HTTPS should be true on official environment.\nenableHttps: ";
        static private final String PLAIN_TEXT_4_0 = "\n\n# Http/2 is enabled by default.\nenableHttp2: true\n\n# Keystore file name in config folder. KeystorePass is in secret.yml to access it.\nkeystoreName: tls/server.keystore\n\n# Flag that indicate if two way TLS is enabled. Not recommended in docker container.\nenableTwoWayTls: false\n\n# Truststore file name in config folder. TruststorePass is in secret.yml to access it.\ntruststoreName: tls/server.truststore\n\n# Unique service identifier. Used in service registration and discovery etc.\nserviceId: ";
        static private final String PLAIN_TEXT_5_0 = "\n\n# Flag to enable service registration. Only be true if running as standalone Java jar.\nenableRegistry: ";
        static private final String PLAIN_TEXT_6_0 = "\n\n# environment tag that will be registered on consul to support multiple instances per env for testing.\n# https://github.com/networknt/light-doc/blob/master/docs/content/design/env-segregation.md\n# This tag should only be set for testing env, not production. The production certification process will enforce it.\n# environment: test1\n";

    }

}