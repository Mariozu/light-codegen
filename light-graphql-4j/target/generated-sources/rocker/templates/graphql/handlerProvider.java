package templates.graphql;

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
// import @ [2:1]
import java.util.List;

/*
 * Auto generated code to render template templates/graphql/handlerProvider.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class handlerProvider extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "handlerProvider.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.graphql";
    static public final String HEADER_HASH = "1632604572";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "rootPackage", "handlerPackage", "items" };

    // argument @ [3:2]
    private String rootPackage;
    // argument @ [3:2]
    private String handlerPackage;
    // argument @ [3:2]
    private List<Map<String,Object>> items;

    public handlerProvider rootPackage(String rootPackage) {
        this.rootPackage = rootPackage;
        return this;
    }

    public String rootPackage() {
        return this.rootPackage;
    }

    public handlerProvider handlerPackage(String handlerPackage) {
        this.handlerPackage = handlerPackage;
        return this;
    }

    public String handlerPackage() {
        return this.handlerPackage;
    }

    public handlerProvider items(List<Map<String,Object>> items) {
        this.items = items;
        return this;
    }

    public List<Map<String,Object>> items() {
        return this.items;
    }

    static public handlerProvider template(String rootPackage, String handlerPackage, List<Map<String,Object>> items) {
        return new handlerProvider()
            .rootPackage(rootPackage)
            .handlerPackage(handlerPackage)
            .items(items);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \npackage 
        static private final byte[] PLAIN_TEXT_0_0;
        // ;\n\nimport com.networknt.config.Config;\nimport com.networknt.server.HandlerProvider;\nimport io.undertow.Handlers;\nimport io.undertow.server.HttpHandler;\nimport io.undertow.server.HttpServerExchange;\nimport io.undertow.util.Methods;\nimport com.networknt.info.ServerInfoGetHandler;\nimport 
        static private final byte[] PLAIN_TEXT_1_0;
        // \n\npublic class PathHandlerProvider implements HandlerProvider {\n    @Override\n    public HttpHandler getHandler() {\n        return Handlers.routing()\n        
        static private final byte[] PLAIN_TEXT_2_0;
        // \n            .add(Methods.
        static private final byte[] PLAIN_TEXT_3_0;
        // , \"
        static private final byte[] PLAIN_TEXT_4_0;
        // \", new 
        static private final byte[] PLAIN_TEXT_5_0;
        // ())\n        
        static private final byte[] PLAIN_TEXT_6_0;
        // \n        ;\n    }\n}\n
        static private final byte[] PLAIN_TEXT_7_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(handlerProvider.class.getClassLoader(), handlerProvider.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
            PLAIN_TEXT_5_0 = loader.tryGet("PLAIN_TEXT_5_0");
            PLAIN_TEXT_6_0 = loader.tryGet("PLAIN_TEXT_6_0");
            PLAIN_TEXT_7_0 = loader.tryGet("PLAIN_TEXT_7_0");
        }

        // argument @ [3:2]
        protected final String rootPackage;
        // argument @ [3:2]
        protected final String handlerPackage;
        // argument @ [3:2]
        protected final List<Map<String,Object>> items;

        public Template(handlerProvider model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.rootPackage = model.rootPackage();
            this.handlerPackage = model.handlerPackage();
            this.items = model.items();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [3:83]
            __internal.aboutToExecutePosInTemplate(3, 83);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [4:9]
            __internal.aboutToExecutePosInTemplate(4, 9);
            __internal.renderValue(rootPackage, false);
            // PlainText @ [4:21]
            __internal.aboutToExecutePosInTemplate(4, 21);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // WithBlockBegin @ [13:8]
            __internal.aboutToExecutePosInTemplate(13, 8);
            com.fizzed.rocker.runtime.WithBlock.with(handlerPackage + ".*;", false, (p) -> {
                // ValueExpression @ [13:44]
                __internal.aboutToExecutePosInTemplate(13, 44);
                __internal.renderValue(p, false);
                // WithBlockEnd @ [13:8]
                __internal.aboutToExecutePosInTemplate(13, 8);
            }); // with end @ [13:8]
            // PlainText @ [13:47]
            __internal.aboutToExecutePosInTemplate(13, 47);
            __internal.writeValue(PLAIN_TEXT_2_0);
            // ForBlockBegin @ [19:9]
            __internal.aboutToExecutePosInTemplate(19, 9);
            try {
                com.fizzed.rocker.runtime.Java8Iterator.forEach(items, (item) -> {
                    try {
                        // PlainText @ [19:28]
                        __internal.aboutToExecutePosInTemplate(19, 28);
                        __internal.writeValue(PLAIN_TEXT_3_0);
                        // ValueExpression @ [20:26]
                        __internal.aboutToExecutePosInTemplate(20, 26);
                        __internal.renderValue(item.get("method"), false);
                        // PlainText @ [20:45]
                        __internal.aboutToExecutePosInTemplate(20, 45);
                        __internal.writeValue(PLAIN_TEXT_4_0);
                        // ValueExpression @ [20:48]
                        __internal.aboutToExecutePosInTemplate(20, 48);
                        __internal.renderValue(item.get("path"), false);
                        // PlainText @ [20:65]
                        __internal.aboutToExecutePosInTemplate(20, 65);
                        __internal.writeValue(PLAIN_TEXT_5_0);
                        // ValueExpression @ [20:72]
                        __internal.aboutToExecutePosInTemplate(20, 72);
                        __internal.renderValue(item.get("handlerName"), false);
                        // PlainText @ [20:96]
                        __internal.aboutToExecutePosInTemplate(20, 96);
                        __internal.writeValue(PLAIN_TEXT_6_0);
                        // ForBlockEnd @ [19:9]
                        __internal.aboutToExecutePosInTemplate(19, 9);
                    } catch (com.fizzed.rocker.runtime.ContinueException e) {
                        // support for continuing for loops
                    }
                }); // for end @ [19:9]
            } catch (com.fizzed.rocker.runtime.BreakException e) {
                // support for breaking for loops
            }
            // PlainText @ [21:10]
            __internal.aboutToExecutePosInTemplate(21, 10);
            __internal.writeValue(PLAIN_TEXT_7_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\npackage ";
        static private final String PLAIN_TEXT_1_0 = ";\n\nimport com.networknt.config.Config;\nimport com.networknt.server.HandlerProvider;\nimport io.undertow.Handlers;\nimport io.undertow.server.HttpHandler;\nimport io.undertow.server.HttpServerExchange;\nimport io.undertow.util.Methods;\nimport com.networknt.info.ServerInfoGetHandler;\nimport ";
        static private final String PLAIN_TEXT_2_0 = "\n\npublic class PathHandlerProvider implements HandlerProvider {\n    @Override\n    public HttpHandler getHandler() {\n        return Handlers.routing()\n        ";
        static private final String PLAIN_TEXT_3_0 = "\n            .add(Methods.";
        static private final String PLAIN_TEXT_4_0 = ", \"";
        static private final String PLAIN_TEXT_5_0 = "\", new ";
        static private final String PLAIN_TEXT_6_0 = "())\n        ";
        static private final String PLAIN_TEXT_7_0 = "\n        ;\n    }\n}\n";

    }

}
