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
 * Auto generated code to render template templates/rest/model.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class model extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "model.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.rest";
    static public final String HEADER_HASH = "-882578332";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "modelPackage", "className", "props" };

    // argument @ [2:2]
    private String modelPackage;
    // argument @ [2:2]
    private String className;
    // argument @ [2:2]
    private Any props;

    public model modelPackage(String modelPackage) {
        this.modelPackage = modelPackage;
        return this;
    }

    public String modelPackage() {
        return this.modelPackage;
    }

    public model className(String className) {
        this.className = className;
        return this;
    }

    public String className() {
        return this.className;
    }

    public model props(Any props) {
        this.props = props;
        return this;
    }

    public Any props() {
        return this.props;
    }

    static public model template(String modelPackage, String className, Any props) {
        return new model()
            .modelPackage(modelPackage)
            .className(className)
            .props(props);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \npackage 
        static private final byte[] PLAIN_TEXT_0_0;
        // ;\nimport java.io.Serializable;\n\npublic class 
        static private final byte[] PLAIN_TEXT_1_0;
        //  implements Serializable {\n    public 
        static private final byte[] PLAIN_TEXT_2_0;
        //  () {\n    }\n}\n
        static private final byte[] PLAIN_TEXT_3_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(model.class.getClassLoader(), model.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
        }

        // argument @ [2:2]
        protected final String modelPackage;
        // argument @ [2:2]
        protected final String className;
        // argument @ [2:2]
        protected final Any props;

        public Template(model model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.modelPackage = model.modelPackage();
            this.className = model.className();
            this.props = model.props();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [2:57]
            __internal.aboutToExecutePosInTemplate(2, 57);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [3:9]
            __internal.aboutToExecutePosInTemplate(3, 9);
            __internal.renderValue(modelPackage, false);
            // PlainText @ [3:22]
            __internal.aboutToExecutePosInTemplate(3, 22);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // ValueExpression @ [6:14]
            __internal.aboutToExecutePosInTemplate(6, 14);
            __internal.renderValue(className, false);
            // PlainText @ [6:24]
            __internal.aboutToExecutePosInTemplate(6, 24);
            __internal.writeValue(PLAIN_TEXT_2_0);
            // ValueExpression @ [7:12]
            __internal.aboutToExecutePosInTemplate(7, 12);
            __internal.renderValue(className, false);
            // PlainText @ [7:22]
            __internal.aboutToExecutePosInTemplate(7, 22);
            __internal.writeValue(PLAIN_TEXT_3_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\npackage ";
        static private final String PLAIN_TEXT_1_0 = ";\nimport java.io.Serializable;\n\npublic class ";
        static private final String PLAIN_TEXT_2_0 = " implements Serializable {\n    public ";
        static private final String PLAIN_TEXT_3_0 = " () {\n    }\n}\n";

    }

}
