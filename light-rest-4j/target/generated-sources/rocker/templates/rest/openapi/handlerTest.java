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
import java.util.Map;

/*
 * Auto generated code to render template templates/rest/openapi/handlerTest.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class handlerTest extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "handlerTest.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.rest.openapi";
    static public final String HEADER_HASH = "95537080";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "handlerPackage", "map" };

    // argument @ [2:2]
    private String handlerPackage;
    // argument @ [2:2]
    private Map<String,Object> map;

    public handlerTest handlerPackage(String handlerPackage) {
        this.handlerPackage = handlerPackage;
        return this;
    }

    public String handlerPackage() {
        return this.handlerPackage;
    }

    public handlerTest map(Map<String,Object> map) {
        this.map = map;
        return this;
    }

    public Map<String,Object> map() {
        return this.map;
    }

    static public handlerTest template(String handlerPackage, Map<String,Object> map) {
        return new handlerTest()
            .handlerPackage(handlerPackage)
            .map(map);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \npackage 
        static private final byte[] PLAIN_TEXT_0_0;
        // ;\n\nimport com.networknt.client.Http2Client;\nimport com.networknt.exception.ApiException;\nimport com.networknt.exception.ClientException;\nimport io.undertow.UndertowOptions;\nimport io.undertow.client.ClientConnection;\nimport io.undertow.client.ClientRequest;\nimport io.undertow.client.ClientResponse;\nimport io.undertow.util.Headers;\nimport io.undertow.util.Methods;\nimport org.junit.Assert;\nimport org.junit.ClassRule;\nimport org.junit.Test;\nimport org.slf4j.Logger;\nimport org.slf4...
        static private final byte[] PLAIN_TEXT_1_0;
        // \npublic class 
        static private final byte[] PLAIN_TEXT_2_0;
        //  {\n    @ClassRule\n    public static TestServer server = TestServer.getInstance();\n\n    static final Logger logger = LoggerFactory.getLogger(
        static private final byte[] PLAIN_TEXT_3_0;
        // );\n    static final boolean enableHttp2 = server.getServerConfig().isEnableHttp2();\n    static final boolean enableHttps = server.getServerConfig().isEnableHttps();\n    static final int httpPort = server.getServerConfig().getHttpPort();\n    static final int httpsPort = server.getServerConfig().getHttpsPort();\n    static final String url = enableHttp2 || enableHttps ? \"https://localhost:\" + httpsPort : \"http://localhost:\" + httpPort;\n\n    @Test\n    public void test
        static private final byte[] PLAIN_TEXT_4_0;
        //  throws ClientException, ApiException {\n        /*\n        final Http2Client client = Http2Client.getInstance();\n        final CountDownLatch latch = new CountDownLatch(1);\n        final ClientConnection connection;\n        try {\n            connection = client.connect(new URI(url), Http2Client.WORKER, Http2Client.SSL, Http2Client.POOL, enableHttp2 ? OptionMap.create(UndertowOptions.ENABLE_HTTP2, true): OptionMap.EMPTY).get();\n        } catch (Exception e) {\n            throw new Clie...
        static private final byte[] PLAIN_TEXT_5_0;
        // \").setMethod(Methods.
        static private final byte[] PLAIN_TEXT_6_0;
        // );\n            
        static private final byte[] PLAIN_TEXT_7_0;
        // \n            request.getRequestHeaders().put(Headers.CONTENT_TYPE, \"application/json\");\n            request.getRequestHeaders().put(Headers.TRANSFER_ENCODING, \"chunked\");\n            connection.sendRequest(request, client.createClientCallback(reference, latch, \"request body to be replaced\"));\n            
        static private final byte[] PLAIN_TEXT_8_0;
        // \n            connection.sendRequest(request, client.createClientCallback(reference, latch));\n            
        static private final byte[] PLAIN_TEXT_9_0;
        // \n            latch.await();\n        } catch (Exception e) {\n            logger.error(\"Exception: \", e);\n            throw new ClientException(e);\n        } finally {\n            IoUtils.safeClose(connection);\n        }\n        int statusCode = reference.get().getResponseCode();\n        String body = reference.get().getAttachment(Http2Client.RESPONSE_BODY);\n        Assert.assertEquals(200, statusCode);\n        Assert.assertNotNull(body);\n        */\n    }\n}\n
        static private final byte[] PLAIN_TEXT_10_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(handlerTest.class.getClassLoader(), handlerTest.class.getName() + "$PlainText", "UTF-8");
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
        }

        // argument @ [2:2]
        protected final String handlerPackage;
        // argument @ [2:2]
        protected final Map<String,Object> map;

        public Template(handlerTest model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.handlerPackage = model.handlerPackage();
            this.map = model.map();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [2:55]
            __internal.aboutToExecutePosInTemplate(2, 55);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [3:9]
            __internal.aboutToExecutePosInTemplate(3, 9);
            __internal.renderValue(handlerPackage, false);
            // PlainText @ [3:24]
            __internal.aboutToExecutePosInTemplate(3, 24);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // WithBlockBegin @ [27:1]
            __internal.aboutToExecutePosInTemplate(27, 1);
            WithBlocksGenerated0.with(map.get("handlerName") + "Test", map.get("handlerName") + "Test()", map.get("handlerName") + "Test" + ".class", map.get("method"), ("POST".equals(map.get("method").toString()) || "PUT".equals(map.get("method").toString()) || "PATCH".equals(map.get("method").toString())), map.get("normalizedPath"), false, (className, method, loggerName, httpMethod, hasBody, path) -> {
                // PlainText @ [32:43]
                __internal.aboutToExecutePosInTemplate(32, 43);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // ValueExpression @ [33:14]
                __internal.aboutToExecutePosInTemplate(33, 14);
                __internal.renderValue(className, false);
                // PlainText @ [33:24]
                __internal.aboutToExecutePosInTemplate(33, 24);
                __internal.writeValue(PLAIN_TEXT_3_0);
                // ValueExpression @ [37:58]
                __internal.aboutToExecutePosInTemplate(37, 58);
                __internal.renderValue(loggerName, false);
                // PlainText @ [37:69]
                __internal.aboutToExecutePosInTemplate(37, 69);
                __internal.writeValue(PLAIN_TEXT_4_0);
                // ValueExpression @ [45:21]
                __internal.aboutToExecutePosInTemplate(45, 21);
                __internal.renderValue(method, false);
                // PlainText @ [45:28]
                __internal.aboutToExecutePosInTemplate(45, 28);
                __internal.writeValue(PLAIN_TEXT_5_0);
                // ValueExpression @ [57:66]
                __internal.aboutToExecutePosInTemplate(57, 66);
                __internal.renderValue(path, false);
                // PlainText @ [57:71]
                __internal.aboutToExecutePosInTemplate(57, 71);
                __internal.writeValue(PLAIN_TEXT_6_0);
                // ValueExpression @ [57:92]
                __internal.aboutToExecutePosInTemplate(57, 92);
                __internal.renderValue(httpMethod, false);
                // PlainText @ [57:103]
                __internal.aboutToExecutePosInTemplate(57, 103);
                __internal.writeValue(PLAIN_TEXT_7_0);
                // IfBlockBegin @ [58:13]
                __internal.aboutToExecutePosInTemplate(58, 13);
                if (hasBody) {
                    // PlainText @ [58:27]
                    __internal.aboutToExecutePosInTemplate(58, 27);
                    __internal.writeValue(PLAIN_TEXT_8_0);
                    // IfBlockElse @ [62:13]
                    __internal.aboutToExecutePosInTemplate(62, 13);
                } else { // else @ [62:13]
                    // PlainText @ [62:21]
                    __internal.aboutToExecutePosInTemplate(62, 21);
                    __internal.writeValue(PLAIN_TEXT_9_0);
                    // IfBlockEnd @ [58:13]
                    __internal.aboutToExecutePosInTemplate(58, 13);
                } // if end @ [58:13]
                // PlainText @ [64:14]
                __internal.aboutToExecutePosInTemplate(64, 14);
                __internal.writeValue(PLAIN_TEXT_10_0);
                // WithBlockEnd @ [27:1]
                __internal.aboutToExecutePosInTemplate(27, 1);
            }); // with end @ [27:1]
        }
    }
    private static class WithBlocksGenerated0 { 
        interface WithStatementConsumer6<V0, V1, V2, V3, V4, V5> { 

            void accept(V0 v0, V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) throws IOException;

        }
        static public <V0, V1, V2, V3, V4, V5> void with (V0 v0, V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, boolean nullSafe, WithStatementConsumer6<V0, V1, V2, V3, V4, V5> consumer) throws IOException {
            consumer.accept(v0, v1, v2, v3, v4, v5);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\npackage ";
        static private final String PLAIN_TEXT_1_0 = ";\n\nimport com.networknt.client.Http2Client;\nimport com.networknt.exception.ApiException;\nimport com.networknt.exception.ClientException;\nimport io.undertow.UndertowOptions;\nimport io.undertow.client.ClientConnection;\nimport io.undertow.client.ClientRequest;\nimport io.undertow.client.ClientResponse;\nimport io.undertow.util.Headers;\nimport io.undertow.util.Methods;\nimport org.junit.Assert;\nimport org.junit.ClassRule;\nimport org.junit.Test;\nimport org.slf4j.Logger;\nimport org.slf4j.LoggerFactory;\nimport org.xnio.IoUtils;\nimport org.xnio.OptionMap;\nimport java.net.URI;\nimport java.util.concurrent.CountDownLatch;\nimport java.util.concurrent.atomic.AtomicReference;\n\nimport java.io.IOException;\n\n";
        static private final String PLAIN_TEXT_2_0 = "\npublic class ";
        static private final String PLAIN_TEXT_3_0 = " {\n    @ClassRule\n    public static TestServer server = TestServer.getInstance();\n\n    static final Logger logger = LoggerFactory.getLogger(";
        static private final String PLAIN_TEXT_4_0 = ");\n    static final boolean enableHttp2 = server.getServerConfig().isEnableHttp2();\n    static final boolean enableHttps = server.getServerConfig().isEnableHttps();\n    static final int httpPort = server.getServerConfig().getHttpPort();\n    static final int httpsPort = server.getServerConfig().getHttpsPort();\n    static final String url = enableHttp2 || enableHttps ? \"https://localhost:\" + httpsPort : \"http://localhost:\" + httpPort;\n\n    @Test\n    public void test";
        static private final String PLAIN_TEXT_5_0 = " throws ClientException, ApiException {\n        /*\n        final Http2Client client = Http2Client.getInstance();\n        final CountDownLatch latch = new CountDownLatch(1);\n        final ClientConnection connection;\n        try {\n            connection = client.connect(new URI(url), Http2Client.WORKER, Http2Client.SSL, Http2Client.POOL, enableHttp2 ? OptionMap.create(UndertowOptions.ENABLE_HTTP2, true): OptionMap.EMPTY).get();\n        } catch (Exception e) {\n            throw new ClientException(e);\n        }\n        final AtomicReference<ClientResponse> reference = new AtomicReference<>();\n        try {\n            ClientRequest request = new ClientRequest().setPath(\"";
        static private final String PLAIN_TEXT_6_0 = "\").setMethod(Methods.";
        static private final String PLAIN_TEXT_7_0 = ");\n            ";
        static private final String PLAIN_TEXT_8_0 = "\n            request.getRequestHeaders().put(Headers.CONTENT_TYPE, \"application/json\");\n            request.getRequestHeaders().put(Headers.TRANSFER_ENCODING, \"chunked\");\n            connection.sendRequest(request, client.createClientCallback(reference, latch, \"request body to be replaced\"));\n            ";
        static private final String PLAIN_TEXT_9_0 = "\n            connection.sendRequest(request, client.createClientCallback(reference, latch));\n            ";
        static private final String PLAIN_TEXT_10_0 = "\n            latch.await();\n        } catch (Exception e) {\n            logger.error(\"Exception: \", e);\n            throw new ClientException(e);\n        } finally {\n            IoUtils.safeClose(connection);\n        }\n        int statusCode = reference.get().getResponseCode();\n        String body = reference.get().getAttachment(Http2Client.RESPONSE_BODY);\n        Assert.assertEquals(200, statusCode);\n        Assert.assertNotNull(body);\n        */\n    }\n}\n";

    }

}
