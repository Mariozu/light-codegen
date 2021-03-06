package templates.rest.openapi;

import javax.annotation.Generated;
import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;
// import @ [1:1]
import com.jsoniter.any.Any;

/*
 * Auto generated code to render template templates/rest/openapi/pom.xml.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class pom extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "pom.xml.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.rest.openapi";
    static public final String HEADER_HASH = "81757138";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "config" };

    // argument @ [2:2]
    private Any config;

    public pom config(Any config) {
        this.config = config;
        return this;
    }

    public Any config() {
        return this.config;
    }

    static public pom template(Any config) {
        return new pom()
            .config(config);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \n<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">\n    <parent>\n        <groupId>org.sonatype.oss</groupId>\n        <artifactId>oss-parent</artifactId>\n        <version>5</version>\n    </parent>\n    <modelVersion>4.0.0</modelVersion>\n    <groupId>
        static private final byte[] PLAIN_TEXT_0_0;
        // </groupId>\n    <artifactId>
        static private final byte[] PLAIN_TEXT_1_0;
        // </artifactId>\n    <packaging>jar</packaging>\n    <name>
        static private final byte[] PLAIN_TEXT_2_0;
        // </name>\n    <version>
        static private final byte[] PLAIN_TEXT_3_0;
        // </version>\n\n    <properties>\n        <java.version>1.8</java.version>\n        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n        <version.light-4j>1.5.8</version.light-4j>\n        <version.light-rest-4j>1.5.8</version.light-rest-4j>\n        <version.openapi-parser>1.5.4</version.openapi-parser>\n        <version.jackson>2.9.1</version.jackson>\n        <version.slf4j>1.7.25</version.slf4j>\n        <version.jose4j>0.6.1</version.jose4j>\n        <version.antlr4>...
        static private final byte[] PLAIN_TEXT_4_0;
        // \n        <version.hikaricp>2.6.2</version.hikaricp>\n        
        static private final byte[] PLAIN_TEXT_5_0;
        // \n        
        static private final byte[] PLAIN_TEXT_6_0;
        // \n        <version.oracle>11.2.0.3</version.oracle>\n        
        static private final byte[] PLAIN_TEXT_7_0;
        // \n        <version.mysql>6.0.5</version.mysql>\n        
        static private final byte[] PLAIN_TEXT_8_0;
        // \n        <version.postgres>42.1.1</version.postgres>        \n        
        static private final byte[] PLAIN_TEXT_9_0;
        // \n        <version.h2>1.3.176</version.h2>\n        
        static private final byte[] PLAIN_TEXT_10_0;
        // \n        <versions.maven-version>2.4</versions.maven-version>\n    </properties>\n\n    <dependencies>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>config</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>utility</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <depend...
        static private final byte[] PLAIN_TEXT_11_0;
        // \n        <dependency>\n            <groupId>com.zaxxer</groupId>\n            <artifactId>HikariCP</artifactId>\n            <version>${version.hikaricp}</version>\n        </dependency>\n        
        static private final byte[] PLAIN_TEXT_12_0;
        // \n        <dependency>\n            <groupId>com.oracle</groupId>\n            <artifactId>ojdbc6</artifactId>\n            <version>${version.oracle}</version>\n        </dependency>\n        
        static private final byte[] PLAIN_TEXT_13_0;
        // \n        <dependency>\n            <groupId>mysql</groupId>\n            <artifactId>mysql-connector-java</artifactId>\n            <version>${version.mysql}</version>\n        </dependency>\n        
        static private final byte[] PLAIN_TEXT_14_0;
        // \n        <dependency>\n            <groupId>org.postgresql</groupId>\n            <artifactId>postgresql</artifactId>\n            <version>${version.postgres}</version>\n        </dependency>\n        
        static private final byte[] PLAIN_TEXT_15_0;
        // \n        <!-- Test Dependencies -->\n        <dependency>\n            <groupId>junit</groupId>\n            <artifactId>junit</artifactId>\n            <version>${version.junit}</version>\n            <scope>test</scope>\n        </dependency>\n        
        static private final byte[] PLAIN_TEXT_16_0;
        // \n        <dependency>\n            <groupId>com.h2database</groupId>\n            <artifactId>h2</artifactId>\n            <version>${version.h2}</version>\n            <scope>test</scope>\n        </dependency>\n        
        static private final byte[] PLAIN_TEXT_17_0;
        // \n    </dependencies>\n\n\n    <build>\n        <defaultGoal>install</defaultGoal>\n        <directory>target</directory>\n        <finalName>${project.artifactId}-${project.version}</finalName>\n        <plugins>\n            <plugin>\n                <groupId>org.codehaus.mojo</groupId>\n                <artifactId>versions-maven-plugin</artifactId>\n                <version>${versions.maven-version}</version>\n            </plugin>\n            <plugin>\n                <groupId>org.apache...
        static private final byte[] PLAIN_TEXT_18_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(pom.class.getClassLoader(), pom.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
            PLAIN_TEXT_5_0 = loader.tryGet("PLAIN_TEXT_5_0");
            PLAIN_TEXT_6_0 = loader.tryGet("PLAIN_TEXT_6_0");
            PLAIN_TEXT_7_0 = loader.tryGet("PLAIN_TEXT_7_0");
            PLAIN_TEXT_8_0 = loader.tryGet("PLAIN_TEXT_8_0");
            PLAIN_TEXT_9_0 = loader.tryGet("PLAIN_TEXT_9_0");
            PLAIN_TEXT_10_0 = loader.tryGet("PLAIN_TEXT_10_0");
            PLAIN_TEXT_11_0 = loader.tryGet("PLAIN_TEXT_11_0");
            PLAIN_TEXT_12_0 = loader.tryGet("PLAIN_TEXT_12_0");
            PLAIN_TEXT_13_0 = loader.tryGet("PLAIN_TEXT_13_0");
            PLAIN_TEXT_14_0 = loader.tryGet("PLAIN_TEXT_14_0");
            PLAIN_TEXT_15_0 = loader.tryGet("PLAIN_TEXT_15_0");
            PLAIN_TEXT_16_0 = loader.tryGet("PLAIN_TEXT_16_0");
            PLAIN_TEXT_17_0 = loader.tryGet("PLAIN_TEXT_17_0");
            PLAIN_TEXT_18_0 = loader.tryGet("PLAIN_TEXT_18_0");
        }

        // argument @ [2:2]
        protected final Any config;

        public Template(pom model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.config = model.config();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [2:19]
            __internal.aboutToExecutePosInTemplate(2, 19);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [10:14]
            __internal.aboutToExecutePosInTemplate(10, 14);
            __internal.renderValue(config.get("groupId"), false);
            // PlainText @ [10:36]
            __internal.aboutToExecutePosInTemplate(10, 36);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // ValueExpression @ [11:17]
            __internal.aboutToExecutePosInTemplate(11, 17);
            __internal.renderValue(config.get("artifactId"), false);
            // PlainText @ [11:42]
            __internal.aboutToExecutePosInTemplate(11, 42);
            __internal.writeValue(PLAIN_TEXT_2_0);
            // ValueExpression @ [13:11]
            __internal.aboutToExecutePosInTemplate(13, 11);
            __internal.renderValue(config.get("name"), false);
            // PlainText @ [13:30]
            __internal.aboutToExecutePosInTemplate(13, 30);
            __internal.writeValue(PLAIN_TEXT_3_0);
            // ValueExpression @ [14:14]
            __internal.aboutToExecutePosInTemplate(14, 14);
            __internal.renderValue(config.get("version"), false);
            // PlainText @ [14:36]
            __internal.aboutToExecutePosInTemplate(14, 36);
            __internal.writeValue(PLAIN_TEXT_4_0);
            // IfBlockBegin @ [33:9]
            __internal.aboutToExecutePosInTemplate(33, 9);
            if (config.toBoolean("supportDb") || config.toBoolean("supportH2ForTest")) {
                // PlainText @ [33:84]
                __internal.aboutToExecutePosInTemplate(33, 84);
                __internal.writeValue(PLAIN_TEXT_5_0);
                // IfBlockEnd @ [33:9]
                __internal.aboutToExecutePosInTemplate(33, 9);
            } // if end @ [33:9]
            // PlainText @ [35:10]
            __internal.aboutToExecutePosInTemplate(35, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [36:9]
            __internal.aboutToExecutePosInTemplate(36, 9);
            if (config.toBoolean("supportDb") && "oracle".equalsIgnoreCase(config.toString("dbInfo", "name"))) {
                // PlainText @ [36:108]
                __internal.aboutToExecutePosInTemplate(36, 108);
                __internal.writeValue(PLAIN_TEXT_7_0);
                // IfBlockEnd @ [36:9]
                __internal.aboutToExecutePosInTemplate(36, 9);
            } // if end @ [36:9]
            // PlainText @ [38:10]
            __internal.aboutToExecutePosInTemplate(38, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [39:9]
            __internal.aboutToExecutePosInTemplate(39, 9);
            if (config.toBoolean("supportDb") && "mysql".equalsIgnoreCase(config.toString("dbInfo", "name"))) {
                // PlainText @ [39:107]
                __internal.aboutToExecutePosInTemplate(39, 107);
                __internal.writeValue(PLAIN_TEXT_8_0);
                // IfBlockEnd @ [39:9]
                __internal.aboutToExecutePosInTemplate(39, 9);
            } // if end @ [39:9]
            // PlainText @ [41:10]
            __internal.aboutToExecutePosInTemplate(41, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [42:9]
            __internal.aboutToExecutePosInTemplate(42, 9);
            if (config.toBoolean("supportDb") && "postgres".equalsIgnoreCase(config.toString("dbInfo", "name"))) {
                // PlainText @ [42:110]
                __internal.aboutToExecutePosInTemplate(42, 110);
                __internal.writeValue(PLAIN_TEXT_9_0);
                // IfBlockEnd @ [42:9]
                __internal.aboutToExecutePosInTemplate(42, 9);
            } // if end @ [42:9]
            // PlainText @ [44:10]
            __internal.aboutToExecutePosInTemplate(44, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [45:9]
            __internal.aboutToExecutePosInTemplate(45, 9);
            if (config.toBoolean("supportH2ForTest")) {
                // PlainText @ [45:51]
                __internal.aboutToExecutePosInTemplate(45, 51);
                __internal.writeValue(PLAIN_TEXT_10_0);
                // IfBlockEnd @ [45:9]
                __internal.aboutToExecutePosInTemplate(45, 9);
            } // if end @ [45:9]
            // PlainText @ [47:10]
            __internal.aboutToExecutePosInTemplate(47, 10);
            __internal.writeValue(PLAIN_TEXT_11_0);
            // IfBlockBegin @ [223:9]
            __internal.aboutToExecutePosInTemplate(223, 9);
            if (config.toBoolean("supportDb") || config.toBoolean("supportH2ForTest")) {
                // PlainText @ [223:84]
                __internal.aboutToExecutePosInTemplate(223, 84);
                __internal.writeValue(PLAIN_TEXT_12_0);
                // IfBlockEnd @ [223:9]
                __internal.aboutToExecutePosInTemplate(223, 9);
            } // if end @ [223:9]
            // PlainText @ [229:10]
            __internal.aboutToExecutePosInTemplate(229, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [230:9]
            __internal.aboutToExecutePosInTemplate(230, 9);
            if (config.toBoolean("supportDb") && "oracle".equalsIgnoreCase(config.toString("dbInfo", "name"))) {
                // PlainText @ [230:108]
                __internal.aboutToExecutePosInTemplate(230, 108);
                __internal.writeValue(PLAIN_TEXT_13_0);
                // IfBlockEnd @ [230:9]
                __internal.aboutToExecutePosInTemplate(230, 9);
            } // if end @ [230:9]
            // PlainText @ [236:10]
            __internal.aboutToExecutePosInTemplate(236, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [237:9]
            __internal.aboutToExecutePosInTemplate(237, 9);
            if (config.toBoolean("supportDb") && "mysql".equalsIgnoreCase(config.toString("dbInfo", "name"))) {
                // PlainText @ [237:107]
                __internal.aboutToExecutePosInTemplate(237, 107);
                __internal.writeValue(PLAIN_TEXT_14_0);
                // IfBlockEnd @ [237:9]
                __internal.aboutToExecutePosInTemplate(237, 9);
            } // if end @ [237:9]
            // PlainText @ [243:10]
            __internal.aboutToExecutePosInTemplate(243, 10);
            __internal.writeValue(PLAIN_TEXT_6_0);
            // IfBlockBegin @ [244:9]
            __internal.aboutToExecutePosInTemplate(244, 9);
            if (config.toBoolean("supportDb") && "postgres".equalsIgnoreCase(config.toString("dbInfo", "name"))) {
                // PlainText @ [244:110]
                __internal.aboutToExecutePosInTemplate(244, 110);
                __internal.writeValue(PLAIN_TEXT_15_0);
                // IfBlockEnd @ [244:9]
                __internal.aboutToExecutePosInTemplate(244, 9);
            } // if end @ [244:9]
            // PlainText @ [250:10]
            __internal.aboutToExecutePosInTemplate(250, 10);
            __internal.writeValue(PLAIN_TEXT_16_0);
            // IfBlockBegin @ [258:9]
            __internal.aboutToExecutePosInTemplate(258, 9);
            if (config.toBoolean("supportH2ForTest")) {
                // PlainText @ [258:51]
                __internal.aboutToExecutePosInTemplate(258, 51);
                __internal.writeValue(PLAIN_TEXT_17_0);
                // IfBlockEnd @ [258:9]
                __internal.aboutToExecutePosInTemplate(258, 9);
            } // if end @ [258:9]
            // PlainText @ [265:10]
            __internal.aboutToExecutePosInTemplate(265, 10);
            __internal.writeValue(PLAIN_TEXT_18_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\n<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">\n    <parent>\n        <groupId>org.sonatype.oss</groupId>\n        <artifactId>oss-parent</artifactId>\n        <version>5</version>\n    </parent>\n    <modelVersion>4.0.0</modelVersion>\n    <groupId>";
        static private final String PLAIN_TEXT_1_0 = "</groupId>\n    <artifactId>";
        static private final String PLAIN_TEXT_2_0 = "</artifactId>\n    <packaging>jar</packaging>\n    <name>";
        static private final String PLAIN_TEXT_3_0 = "</name>\n    <version>";
        static private final String PLAIN_TEXT_4_0 = "</version>\n\n    <properties>\n        <java.version>1.8</java.version>\n        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n        <version.light-4j>1.5.8</version.light-4j>\n        <version.light-rest-4j>1.5.8</version.light-rest-4j>\n        <version.openapi-parser>1.5.4</version.openapi-parser>\n        <version.jackson>2.9.1</version.jackson>\n        <version.slf4j>1.7.25</version.slf4j>\n        <version.jose4j>0.6.1</version.jose4j>\n        <version.antlr4>4.7</version.antlr4>\n        <version.commons-text>1.1</version.commons-text>\n        <version.encoder>1.2.1</version.encoder>\n        <version.logback>1.2.3</version.logback>\n        <version.junit>4.12</version.junit>\n        <version.undertow>1.4.20.Final</version.undertow>\n        <version.json-schema-validator>0.1.10</version.json-schema-validator>\n        <version.fastscanner>2.7.0</version.fastscanner>\n        ";
        static private final String PLAIN_TEXT_5_0 = "\n        <version.hikaricp>2.6.2</version.hikaricp>\n        ";
        static private final String PLAIN_TEXT_6_0 = "\n        ";
        static private final String PLAIN_TEXT_7_0 = "\n        <version.oracle>11.2.0.3</version.oracle>\n        ";
        static private final String PLAIN_TEXT_8_0 = "\n        <version.mysql>6.0.5</version.mysql>\n        ";
        static private final String PLAIN_TEXT_9_0 = "\n        <version.postgres>42.1.1</version.postgres>        \n        ";
        static private final String PLAIN_TEXT_10_0 = "\n        <version.h2>1.3.176</version.h2>\n        ";
        static private final String PLAIN_TEXT_11_0 = "\n        <versions.maven-version>2.4</versions.maven-version>\n    </properties>\n\n    <dependencies>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>config</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>utility</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>security</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>client</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>audit</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>info</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>health</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>status</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>exception</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>body</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>mask</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>metrics</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>handler</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>sanitizer</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>traceability</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>correlation</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>service</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>registry</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>balance</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>cluster</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>consul</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>server</artifactId>\n            <version>${version.light-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>json-schema-validator</artifactId>\n            <version>${version.json-schema-validator}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>openapi-parser</artifactId>\n            <version>${version.openapi-parser}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>openapi-meta</artifactId>\n            <version>${version.light-rest-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>openapi-security</artifactId>\n            <version>${version.light-rest-4j}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.networknt</groupId>\n            <artifactId>openapi-validator</artifactId>\n            <version>${version.light-rest-4j}</version>\n        </dependency>\n\n        <dependency>\n            <groupId>com.fasterxml.jackson.core</groupId>\n            <artifactId>jackson-databind</artifactId>\n            <version>${version.jackson}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.fasterxml.jackson.core</groupId>\n            <artifactId>jackson-core</artifactId>\n            <version>${version.jackson}</version>\n        </dependency>\n        <dependency>\n            <groupId>com.fasterxml.jackson.datatype</groupId>\n            <artifactId>jackson-datatype-jsr310</artifactId>\n            <version>${version.jackson}</version>\n        </dependency>\n        <dependency>\n            <groupId>ch.qos.logback</groupId>\n            <artifactId>logback-classic</artifactId>\n            <version>${version.logback}</version>\n        </dependency>\n        <dependency>\n            <groupId>org.apache.commons</groupId>\n            <artifactId>commons-text</artifactId>\n            <version>${version.commons-text}</version>\n        </dependency>\n        <dependency>\n            <groupId>io.undertow</groupId>\n            <artifactId>undertow-core</artifactId>\n            <version>${version.undertow}</version>\n        </dependency>\n        <dependency>\n            <groupId>io.github.lukehutch</groupId>\n            <artifactId>fast-classpath-scanner</artifactId>\n            <version>${version.fastscanner}</version>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_12_0 = "\n        <dependency>\n            <groupId>com.zaxxer</groupId>\n            <artifactId>HikariCP</artifactId>\n            <version>${version.hikaricp}</version>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_13_0 = "\n        <dependency>\n            <groupId>com.oracle</groupId>\n            <artifactId>ojdbc6</artifactId>\n            <version>${version.oracle}</version>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_14_0 = "\n        <dependency>\n            <groupId>mysql</groupId>\n            <artifactId>mysql-connector-java</artifactId>\n            <version>${version.mysql}</version>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_15_0 = "\n        <dependency>\n            <groupId>org.postgresql</groupId>\n            <artifactId>postgresql</artifactId>\n            <version>${version.postgres}</version>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_16_0 = "\n        <!-- Test Dependencies -->\n        <dependency>\n            <groupId>junit</groupId>\n            <artifactId>junit</artifactId>\n            <version>${version.junit}</version>\n            <scope>test</scope>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_17_0 = "\n        <dependency>\n            <groupId>com.h2database</groupId>\n            <artifactId>h2</artifactId>\n            <version>${version.h2}</version>\n            <scope>test</scope>\n        </dependency>\n        ";
        static private final String PLAIN_TEXT_18_0 = "\n    </dependencies>\n\n\n    <build>\n        <defaultGoal>install</defaultGoal>\n        <directory>target</directory>\n        <finalName>${project.artifactId}-${project.version}</finalName>\n        <plugins>\n            <plugin>\n                <groupId>org.codehaus.mojo</groupId>\n                <artifactId>versions-maven-plugin</artifactId>\n                <version>${versions.maven-version}</version>\n            </plugin>\n            <plugin>\n                <groupId>org.apache.maven.plugins</groupId>\n                <artifactId>maven-shade-plugin</artifactId>\n                <version>2.4.3</version>\n                <executions>\n                    <execution>\n                        <phase>package</phase>\n                        <goals>\n                            <goal>shade</goal>\n                        </goals>\n                        <configuration>\n                            <transformers>\n                                <transformer implementation=\"org.apache.maven.plugins.shade.resource.ServicesResourceTransformer\"/>\n                            </transformers>\n                        </configuration>\n                    </execution>\n                </executions>\n            </plugin>\n            <plugin>\n                <groupId>org.apache.maven.plugins</groupId>\n                <artifactId>maven-source-plugin</artifactId>\n                <version>3.0.1</version>\n                <executions>\n                    <execution>\n                        <id>attach-sources</id>\n                        <goals>\n                            <goal>jar</goal>\n                        </goals>\n                    </execution>\n                </executions>\n            </plugin>\n            <plugin>\n                <groupId>org.apache.maven.plugins</groupId>\n                <artifactId>maven-javadoc-plugin</artifactId>\n                <version>2.10.4</version>\n                <executions>\n                    <execution>\n                        <id>attach-javadocs</id>\n                        <goals>\n                            <goal>jar</goal>\n                        </goals>\n                    </execution>\n                </executions>\n            </plugin>\n            <plugin>\n                <groupId>org.apache.maven.plugins</groupId>\n                <artifactId>maven-surefire-plugin</artifactId>\n                <version>2.14</version>\n                <dependencies>\n                    <dependency>\n                        <groupId>org.apache.maven.surefire</groupId>\n                        <artifactId>surefire-junit47</artifactId>\n                        <version>2.14</version>\n                    </dependency>\n                </dependencies>\n            </plugin>\n            <plugin>\n                <groupId>org.apache.maven.plugins</groupId>\n                <artifactId>maven-jar-plugin</artifactId>\n                <version>2.6</version>\n                <configuration>\n                    <archive>\n                        <manifest>\n                            <mainClass>com.networknt.server.Server</mainClass>\n                        </manifest>\n                    </archive>\n                </configuration>\n            </plugin>\n            <plugin>\n                <groupId>org.codehaus.mojo</groupId>\n                <artifactId>exec-maven-plugin</artifactId>\n                <version>1.4.0</version>\n                <configuration>\n                    <executable>java</executable>\n                    <arguments>\n                        <argument>-jar</argument>\n                        <argument>target/${project.build.finalName}.jar</argument>\n                    </arguments>\n                </configuration>\n            </plugin>\n            <!-- Google error-prone compiles -->\n            <plugin>\n                <groupId>org.apache.maven.plugins</groupId>\n                <artifactId>maven-compiler-plugin</artifactId>\n                <version>3.3</version>\n                <configuration>\n                    <compilerId>javac-with-errorprone</compilerId>\n                    <showWarnings>true</showWarnings>\n                    <showDeprecation>true</showDeprecation>\n                    <compilerArgs>\n                        <!-- add command line validation here -->\n                    </compilerArgs>\n                    <forceJavacCompilerUse>true</forceJavacCompilerUse>\n                    <!-- maven-compiler-plugin defaults to targeting Java 5, but our javac\n                         only supports >=6 -->\n                    <source>${java.version}</source>\n                    <target>${java.version}</target>\n                </configuration>\n                <dependencies>\n                    <dependency>\n                        <groupId>org.codehaus.plexus</groupId>\n                        <artifactId>plexus-compiler-javac-errorprone</artifactId>\n                        <version>2.8</version>\n                    </dependency>\n                    <!-- override plexus-compiler-javac-errorprone's dependency on\n                         Error Prone with the latest version -->\n                    <dependency>\n                        <groupId>com.google.errorprone</groupId>\n                        <artifactId>error_prone_core</artifactId>\n                        <version>2.0.15</version>\n                    </dependency>\n                </dependencies>\n            </plugin>\n\n            <!-- end Google error-proce compiles -->\n        </plugins>\n\n        <pluginManagement>\n        \t<plugins>\n        \t\t<!--This plugin's configuration is used to store Eclipse m2e settings only. It has no influence on the Maven build itself.-->\n        \t\t<plugin>\n        \t\t\t<groupId>org.eclipse.m2e</groupId>\n        \t\t\t<artifactId>lifecycle-mapping</artifactId>\n        \t\t\t<version>1.0.0</version>\n        \t\t\t<configuration>\n        \t\t\t\t<lifecycleMappingMetadata>\n        \t\t\t\t\t<pluginExecutions>\n        \t\t\t\t\t\t<pluginExecution>\n        \t\t\t\t\t\t\t<pluginExecutionFilter>\n        \t\t\t\t\t\t\t\t<groupId>\n        \t\t\t\t\t\t\t\t\torg.apache.maven.plugins\n        \t\t\t\t\t\t\t\t</groupId>\n        \t\t\t\t\t\t\t\t<artifactId>\n        \t\t\t\t\t\t\t\t\tmaven-compiler-plugin\n        \t\t\t\t\t\t\t\t</artifactId>\n        \t\t\t\t\t\t\t\t<versionRange>\n        \t\t\t\t\t\t\t\t\t[3.3,)\n        \t\t\t\t\t\t\t\t</versionRange>\n        \t\t\t\t\t\t\t\t<goals>\n        \t\t\t\t\t\t\t\t\t<goal>compile</goal>\n        \t\t\t\t\t\t\t\t\t<goal>testCompile</goal>\n        \t\t\t\t\t\t\t\t</goals>\n        \t\t\t\t\t\t\t</pluginExecutionFilter>\n        \t\t\t\t\t\t\t<action>\n        \t\t\t\t\t\t\t\t<ignore></ignore>\n        \t\t\t\t\t\t\t</action>\n        \t\t\t\t\t\t</pluginExecution>\n        \t\t\t\t\t</pluginExecutions>\n        \t\t\t\t</lifecycleMappingMetadata>\n        \t\t\t</configuration>\n        \t\t</plugin>\n        \t</plugins>\n        </pluginManagement>\n\n    </build>\n\n    <repositories>\n        <repository>\n            <id>sonatype-snapshots</id>\n            <url>https://oss.sonatype.org/content/repositories/snapshots</url>\n            <snapshots>\n                <enabled>true</enabled>\n            </snapshots>\n        </repository>\n        <repository>\n            <id>codelds</id>\n            <url>https://code.lds.org/nexus/content/groups/main-repo</url>\n        </repository>                          \n    </repositories>\n</project>\n";

    }

}
