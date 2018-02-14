package templates.hybrid.server;

import javax.annotation.Generated;
import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template templates/hybrid/server/README.md.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class README extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "README.md.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.hybrid.server";
    static public final String HEADER_HASH = "2508083";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { };

    static public README template() {
        return new README();
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // # Light Hybrid 4J Server\n\n## Start server\n\nIf you only have one service jar file, then your can include the jar file into the\nclass path as below.\n\n```\njava -cp petstore-1.0.1.jar:target/petstore-1.0.1.jar com.networknt.server.Server\n```\n\nIf you have multiple service jar files, you'd better create a directory and include\nthat directory into the classpath when starting the server.\n\n```\njava -cp petstore-1.0.1.jar:/service com.networknt.server.Server\n```\n\n\n## Test\n
        static private final byte[] PLAIN_TEXT_0_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(README.class.getClassLoader(), README.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
        }

        public Template(README model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [1:1]
            __internal.aboutToExecutePosInTemplate(1, 1);
            __internal.writeValue(PLAIN_TEXT_0_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "# Light Hybrid 4J Server\n\n## Start server\n\nIf you only have one service jar file, then your can include the jar file into the\nclass path as below.\n\n```\njava -cp petstore-1.0.1.jar:target/petstore-1.0.1.jar com.networknt.server.Server\n```\n\nIf you have multiple service jar files, you'd better create a directory and include\nthat directory into the classpath when starting the server.\n\n```\njava -cp petstore-1.0.1.jar:/service com.networknt.server.Server\n```\n\n\n## Test\n";

    }

}