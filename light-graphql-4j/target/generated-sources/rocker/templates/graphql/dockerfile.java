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
import com.jsoniter.any.Any;

/*
 * Auto generated code to render template templates/graphql/dockerfile.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class dockerfile extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "dockerfile.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.graphql";
    static public final String HEADER_HASH = "-1436420006";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "config", "expose" };

    // argument @ [2:2]
    private Any config;
    // argument @ [2:2]
    private String expose;

    public dockerfile config(Any config) {
        this.config = config;
        return this;
    }

    public Any config() {
        return this.config;
    }

    public dockerfile expose(String expose) {
        this.expose = expose;
        return this;
    }

    public String expose() {
        return this.expose;
    }

    static public dockerfile template(Any config, String expose) {
        return new dockerfile()
            .config(config)
            .expose(expose);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \nFROM openjdk:8-jre-alpine\nEXPOSE 
        static private final byte[] PLAIN_TEXT_0_0;
        // \n
        static private final byte[] PLAIN_TEXT_1_0;
        // ADD /target/
        static private final byte[] PLAIN_TEXT_2_0;
        //  server.jar
        static private final byte[] PLAIN_TEXT_3_0;
        // \nCMD [\"/bin/sh\",\"-c\",\"java -Dlight-4j-config-dir=/config -Dlogback.configurationFile=/config/logback.xml -jar /server.jar\"]
        static private final byte[] PLAIN_TEXT_4_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(dockerfile.class.getClassLoader(), dockerfile.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
        }

        // argument @ [2:2]
        protected final Any config;
        // argument @ [2:2]
        protected final String expose;

        public Template(dockerfile model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.config = model.config();
            this.expose = model.expose();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [2:34]
            __internal.aboutToExecutePosInTemplate(2, 34);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [4:8]
            __internal.aboutToExecutePosInTemplate(4, 8);
            __internal.renderValue(expose, false);
            // PlainText @ [4:15]
            __internal.aboutToExecutePosInTemplate(4, 15);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // WithBlockBegin @ [5:1]
            __internal.aboutToExecutePosInTemplate(5, 1);
            com.fizzed.rocker.runtime.WithBlock.with(config.get("artifactId") + "-" + config.get("version") + ".jar", false, (name) -> {
                // PlainText @ [5:81]
                __internal.aboutToExecutePosInTemplate(5, 81);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // ValueExpression @ [5:93]
                __internal.aboutToExecutePosInTemplate(5, 93);
                __internal.renderValue(name, false);
                // PlainText @ [5:98]
                __internal.aboutToExecutePosInTemplate(5, 98);
                __internal.writeValue(PLAIN_TEXT_3_0);
                // WithBlockEnd @ [5:1]
                __internal.aboutToExecutePosInTemplate(5, 1);
            }); // with end @ [5:1]
            // PlainText @ [5:110]
            __internal.aboutToExecutePosInTemplate(5, 110);
            __internal.writeValue(PLAIN_TEXT_4_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\nFROM openjdk:8-jre-alpine\nEXPOSE ";
        static private final String PLAIN_TEXT_1_0 = "\n";
        static private final String PLAIN_TEXT_2_0 = "ADD /target/";
        static private final String PLAIN_TEXT_3_0 = " server.jar";
        static private final String PLAIN_TEXT_4_0 = "\nCMD [\"/bin/sh\",\"-c\",\"java -Dlight-4j-config-dir=/config -Dlogback.configurationFile=/config/logback.xml -jar /server.jar\"]";

    }

}
