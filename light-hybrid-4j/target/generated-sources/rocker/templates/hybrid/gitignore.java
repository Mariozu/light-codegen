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
 * Auto generated code to render template templates/hybrid/gitignore.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class gitignore extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "gitignore.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.hybrid";
    static public final String HEADER_HASH = "2508083";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { };

    static public gitignore template() {
        return new gitignore();
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // target/\nbower_components/\nnode_modules/\ndist/\n.idea/\n.tmp/\n.project\n.classpath\n.settings\n.metadata/\n*.iml\n*.log\n*.tmp\n*.zip\n*.bak\ndependency-reduced-pom.xml\n\n# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml\nhs_err_pid*\n
        static private final byte[] PLAIN_TEXT_0_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(gitignore.class.getClassLoader(), gitignore.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
        }

        public Template(gitignore model) {
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

        static private final String PLAIN_TEXT_0_0 = "target/\nbower_components/\nnode_modules/\ndist/\n.idea/\n.tmp/\n.project\n.classpath\n.settings\n.metadata/\n*.iml\n*.log\n*.tmp\n*.zip\n*.bak\ndependency-reduced-pom.xml\n\n# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml\nhs_err_pid*\n";

    }

}
