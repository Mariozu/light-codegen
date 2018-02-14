package templates.rest;

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
 * Auto generated code to render template templates/rest/project.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class project extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "project.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.rest";
    static public final String HEADER_HASH = "81757138";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "config" };

    // argument @ [2:2]
    private Any config;

    public project config(Any config) {
        this.config = config;
        return this;
    }

    public Any config() {
        return this.config;
    }

    static public project template(Any config) {
        return new project()
            .config(config);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \n<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<projectDescription>\n\t<name>
        static private final byte[] PLAIN_TEXT_0_0;
        // </name>\n\t<comment></comment>\n\t<projects>\n\t</projects>\n\t<buildSpec>\n\t\t<buildCommand>\n\t\t\t<name>org.eclipse.jdt.core.javabuilder</name>\n\t\t\t<arguments>\n\t\t\t</arguments>\n\t\t</buildCommand>\n\t\t<buildCommand>\n\t\t\t<name>org.eclipse.m2e.core.maven2Builder</name>\n\t\t\t<arguments>\n\t\t\t</arguments>\n\t\t</buildCommand>\n\t</buildSpec>\n\t<natures>\n\t\t<nature>org.eclipse.jdt.core.javanature</nature>\n\t\t<nature>org.eclipse.m2e.core.maven2Nature</nature>\n\t</natures>\n...
        static private final byte[] PLAIN_TEXT_1_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(project.class.getClassLoader(), project.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
        }

        // argument @ [2:2]
        protected final Any config;

        public Template(project model) {
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
            // ValueExpression @ [5:8]
            __internal.aboutToExecutePosInTemplate(5, 8);
            __internal.renderValue(config.get("name"), false);
            // PlainText @ [5:27]
            __internal.aboutToExecutePosInTemplate(5, 27);
            __internal.writeValue(PLAIN_TEXT_1_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<projectDescription>\n\t<name>";
        static private final String PLAIN_TEXT_1_0 = "</name>\n\t<comment></comment>\n\t<projects>\n\t</projects>\n\t<buildSpec>\n\t\t<buildCommand>\n\t\t\t<name>org.eclipse.jdt.core.javabuilder</name>\n\t\t\t<arguments>\n\t\t\t</arguments>\n\t\t</buildCommand>\n\t\t<buildCommand>\n\t\t\t<name>org.eclipse.m2e.core.maven2Builder</name>\n\t\t\t<arguments>\n\t\t\t</arguments>\n\t\t</buildCommand>\n\t</buildSpec>\n\t<natures>\n\t\t<nature>org.eclipse.jdt.core.javanature</nature>\n\t\t<nature>org.eclipse.m2e.core.maven2Nature</nature>\n\t</natures>\n</projectDescription>\n";

    }

}