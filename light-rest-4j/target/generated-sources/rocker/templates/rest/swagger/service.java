package templates.rest.swagger;

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
 * Auto generated code to render template templates/rest/swagger/service.yml.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class service extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "service.yml.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.rest.swagger";
    static public final String HEADER_HASH = "81757138";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "config" };

    // argument @ [2:2]
    private Any config;

    public service config(Any config) {
        this.config = config;
        return this;
    }

    public Any config() {
        return this.config;
    }

    static public service template(Any config) {
        return new service()
            .config(config);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \n# Singleton service factory configuration/IoC injection\nsingletons:\n# HandlerProvider implementation\n- com.networknt.server.HandlerProvider:\n  - 
        static private final byte[] PLAIN_TEXT_0_0;
        // \n# StartupHookProvider implementations, there are one to many and they are called in the same sequence defined.\n# - com.networknt.server.StartupHookProvider:\n  # - com.networknt.server.Test1StartupHook\n  # - com.networknt.server.Test2StartupHook\n# ShutdownHookProvider implementations, there are one to many and they are called in the same sequence defined.\n# - com.networknt.server.ShutdownHookProvider:\n  # - com.networknt.server.Test1ShutdownHook\n# MiddlewareHandler implementations, th...
        static private final byte[] PLAIN_TEXT_1_0;
        // \n
        static private final byte[] PLAIN_TEXT_2_0;
        // \n- javax.sql.DataSource:\n  - com.zaxxer.hikari.HikariDataSource:\n      DriverClassName: 
        static private final byte[] PLAIN_TEXT_3_0;
        // \n      jdbcUrl: 
        static private final byte[] PLAIN_TEXT_4_0;
        // \n      username: 
        static private final byte[] PLAIN_TEXT_5_0;
        // \n      password: 
        static private final byte[] PLAIN_TEXT_6_0;
        // \n      maximumPoolSize: 10\n      useServerPrepStmts: true,\n      cachePrepStmts: true,\n      cacheCallableStmts: true,\n      prepStmtCacheSize: 10,\n      prepStmtCacheSqlLimit: 2048,\n      connectionTimeout: 2000\n
        static private final byte[] PLAIN_TEXT_7_0;
        // \n\n\n
        static private final byte[] PLAIN_TEXT_8_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(service.class.getClassLoader(), service.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
            PLAIN_TEXT_5_0 = loader.tryGet("PLAIN_TEXT_5_0");
            PLAIN_TEXT_6_0 = loader.tryGet("PLAIN_TEXT_6_0");
            PLAIN_TEXT_7_0 = loader.tryGet("PLAIN_TEXT_7_0");
            PLAIN_TEXT_8_0 = loader.tryGet("PLAIN_TEXT_8_0");
        }

        // argument @ [2:2]
        protected final Any config;

        public Template(service model) {
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
            // WithBlockBegin @ [7:5]
            __internal.aboutToExecutePosInTemplate(7, 5);
            com.fizzed.rocker.runtime.WithBlock.with(config.toString("rootPackage") + ".PathHandlerProvider", false, (provider) -> {
                // ValueExpression @ [7:80]
                __internal.aboutToExecutePosInTemplate(7, 80);
                __internal.renderValue(provider, false);
                // WithBlockEnd @ [7:5]
                __internal.aboutToExecutePosInTemplate(7, 5);
            }); // with end @ [7:5]
            // PlainText @ [7:90]
            __internal.aboutToExecutePosInTemplate(7, 90);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // IfBlockBegin @ [37:1]
            __internal.aboutToExecutePosInTemplate(37, 1);
            if (config.toBoolean("supportDb")) {
                // PlainText @ [37:36]
                __internal.aboutToExecutePosInTemplate(37, 36);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // WithBlockBegin @ [38:1]
                __internal.aboutToExecutePosInTemplate(38, 1);
                WithBlocksGenerated0.with(config.toString("dbInfo", "driverClassName"), config.toString("dbInfo", "jdbcUrl"), config.toString("dbInfo", "username"), config.toString("dbInfo", "password"), false, (driverClassName, jdbcUrl, username, password) -> {
                    // PlainText @ [38:215]
                    __internal.aboutToExecutePosInTemplate(38, 215);
                    __internal.writeValue(PLAIN_TEXT_3_0);
                    // ValueExpression @ [41:24]
                    __internal.aboutToExecutePosInTemplate(41, 24);
                    __internal.renderValue(driverClassName, false);
                    // PlainText @ [41:40]
                    __internal.aboutToExecutePosInTemplate(41, 40);
                    __internal.writeValue(PLAIN_TEXT_4_0);
                    // ValueExpression @ [42:16]
                    __internal.aboutToExecutePosInTemplate(42, 16);
                    __internal.renderValue(jdbcUrl, false);
                    // PlainText @ [42:24]
                    __internal.aboutToExecutePosInTemplate(42, 24);
                    __internal.writeValue(PLAIN_TEXT_5_0);
                    // ValueExpression @ [43:17]
                    __internal.aboutToExecutePosInTemplate(43, 17);
                    __internal.renderValue(username, false);
                    // PlainText @ [43:26]
                    __internal.aboutToExecutePosInTemplate(43, 26);
                    __internal.writeValue(PLAIN_TEXT_6_0);
                    // ValueExpression @ [44:17]
                    __internal.aboutToExecutePosInTemplate(44, 17);
                    __internal.renderValue(password, false);
                    // PlainText @ [44:26]
                    __internal.aboutToExecutePosInTemplate(44, 26);
                    __internal.writeValue(PLAIN_TEXT_7_0);
                    // WithBlockEnd @ [38:1]
                    __internal.aboutToExecutePosInTemplate(38, 1);
                }); // with end @ [38:1]
                // PlainText @ [52:2]
                __internal.aboutToExecutePosInTemplate(52, 2);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // IfBlockEnd @ [37:1]
                __internal.aboutToExecutePosInTemplate(37, 1);
            } // if end @ [37:1]
            // PlainText @ [53:2]
            __internal.aboutToExecutePosInTemplate(53, 2);
            __internal.writeValue(PLAIN_TEXT_8_0);
        }
    }
    private static class WithBlocksGenerated0 { 
        interface WithStatementConsumer4<V0, V1, V2, V3> { 

            void accept(V0 v0, V1 v1, V2 v2, V3 v3) throws IOException;

        }
        static public <V0, V1, V2, V3> void with (V0 v0, V1 v1, V2 v2, V3 v3, boolean nullSafe, WithStatementConsumer4<V0, V1, V2, V3> consumer) throws IOException {
            consumer.accept(v0, v1, v2, v3);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\n# Singleton service factory configuration/IoC injection\nsingletons:\n# HandlerProvider implementation\n- com.networknt.server.HandlerProvider:\n  - ";
        static private final String PLAIN_TEXT_1_0 = "\n# StartupHookProvider implementations, there are one to many and they are called in the same sequence defined.\n# - com.networknt.server.StartupHookProvider:\n  # - com.networknt.server.Test1StartupHook\n  # - com.networknt.server.Test2StartupHook\n# ShutdownHookProvider implementations, there are one to many and they are called in the same sequence defined.\n# - com.networknt.server.ShutdownHookProvider:\n  # - com.networknt.server.Test1ShutdownHook\n# MiddlewareHandler implementations, the calling sequence is as defined in the request/response chain.\n- com.networknt.handler.MiddlewareHandler:\n  # Exception Global exception handler that needs to be called first to wrap all middleware handlers and business handlers\n  - com.networknt.exception.ExceptionHandler\n  # Metrics handler to calculate response time accurately, this needs to be the second handler in the chain.\n  - com.networknt.metrics.MetricsHandler\n  # Traceability Put traceabilityId into response header from request header if it exists\n  - com.networknt.traceability.TraceabilityHandler\n  # Correlation Create correlationId if it doesn't exist in the request header and put it into the request header\n  - com.networknt.correlation.CorrelationHandler\n  # Swagger Parsing swagger specification based on request uri and method.\n  - com.networknt.swagger.SwaggerHandler\n  # Security JWT token verification and scope verification (depending on SwaggerHandler)\n  - com.networknt.security.JwtVerifyHandler\n  # Body Parse body based on content type in the header.\n  - com.networknt.body.BodyHandler\n  # SimpleAudit Log important info about the request into audit log\n  - com.networknt.audit.AuditHandler\n  # Sanitizer Encode cross site scripting\n  - com.networknt.sanitizer.SanitizerHandler\n  # Validator Validate request based on swagger specification (depending on Swagger and Body)\n  - com.networknt.validator.ValidatorHandler\n";
        static private final String PLAIN_TEXT_2_0 = "\n";
        static private final String PLAIN_TEXT_3_0 = "\n- javax.sql.DataSource:\n  - com.zaxxer.hikari.HikariDataSource:\n      DriverClassName: ";
        static private final String PLAIN_TEXT_4_0 = "\n      jdbcUrl: ";
        static private final String PLAIN_TEXT_5_0 = "\n      username: ";
        static private final String PLAIN_TEXT_6_0 = "\n      password: ";
        static private final String PLAIN_TEXT_7_0 = "\n      maximumPoolSize: 10\n      useServerPrepStmts: true,\n      cachePrepStmts: true,\n      cacheCallableStmts: true,\n      prepStmtCacheSize: 10,\n      prepStmtCacheSqlLimit: 2048,\n      connectionTimeout: 2000\n";
        static private final String PLAIN_TEXT_8_0 = "\n\n\n";

    }

}
