package templates.hybrid;

import javax.annotation.Generated;
import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template templates/hybrid/testServer.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class testServer extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "testServer.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.hybrid";
    static public final String HEADER_HASH = "-752895709";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "handlerPackage" };

    // argument @ [1:2]
    private String handlerPackage;

    public testServer handlerPackage(String handlerPackage) {
        this.handlerPackage = handlerPackage;
        return this;
    }

    public String handlerPackage() {
        return this.handlerPackage;
    }

    static public testServer template(String handlerPackage) {
        return new testServer()
            .handlerPackage(handlerPackage);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \npackage 
        static private final byte[] PLAIN_TEXT_0_0;
        // ;\n\nimport com.networknt.server.Server;\nimport com.networknt.server.ServerConfig;\nimport org.junit.rules.ExternalResource;\nimport org.slf4j.Logger;\nimport org.slf4j.LoggerFactory;\nimport java.util.concurrent.atomic.AtomicInteger;\n\npublic class TestServer extends ExternalResource {\n    static final Logger logger = LoggerFactory.getLogger(TestServer.class);\n\n    private static final AtomicInteger refCount = new AtomicInteger(0);\n    private static Server server;\n\n    private stati...
        static private final byte[] PLAIN_TEXT_1_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(testServer.class.getClassLoader(), testServer.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
        }

        // argument @ [1:2]
        protected final String handlerPackage;

        public Template(testServer model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.handlerPackage = model.handlerPackage();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [1:30]
            __internal.aboutToExecutePosInTemplate(1, 30);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [2:9]
            __internal.aboutToExecutePosInTemplate(2, 9);
            __internal.renderValue(handlerPackage, false);
            // PlainText @ [2:24]
            __internal.aboutToExecutePosInTemplate(2, 24);
            __internal.writeValue(PLAIN_TEXT_1_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\npackage ";
        static private final String PLAIN_TEXT_1_0 = ";\n\nimport com.networknt.server.Server;\nimport com.networknt.server.ServerConfig;\nimport org.junit.rules.ExternalResource;\nimport org.slf4j.Logger;\nimport org.slf4j.LoggerFactory;\nimport java.util.concurrent.atomic.AtomicInteger;\n\npublic class TestServer extends ExternalResource {\n    static final Logger logger = LoggerFactory.getLogger(TestServer.class);\n\n    private static final AtomicInteger refCount = new AtomicInteger(0);\n    private static Server server;\n\n    private static final TestServer instance  = new TestServer();\n\n    public static TestServer getInstance () {\n        return instance;\n    }\n\n    private TestServer() {\n\n    }\n\n    public ServerConfig getServerConfig() {\n        return Server.config;\n    }\n\n    @Override\n    protected void before() {\n        try {\n            if (refCount.get() == 0) {\n                Server.start();\n            }\n        }\n        finally {\n            refCount.getAndIncrement();\n        }\n    }\n\n    @Override\n    protected void after() {\n        refCount.getAndDecrement();\n        if (refCount.get() == 0) {\n            Server.stop();\n        }\n    }\n}\n";

    }

}
