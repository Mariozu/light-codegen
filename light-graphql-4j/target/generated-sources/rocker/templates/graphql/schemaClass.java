package templates.graphql;

import javax.annotation.Generated;
import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template templates/graphql/schemaClass.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class schemaClass extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "schemaClass.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.graphql";
    static public final String HEADER_HASH = "-1193733343";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { "schemaPackage", "schemaClass" };

    // argument @ [1:2]
    private String schemaPackage;
    // argument @ [1:2]
    private String schemaClass;

    public schemaClass schemaPackage(String schemaPackage) {
        this.schemaPackage = schemaPackage;
        return this;
    }

    public String schemaPackage() {
        return this.schemaPackage;
    }

    public schemaClass schemaClass(String schemaClass) {
        this.schemaClass = schemaClass;
        return this;
    }

    public String schemaClass() {
        return this.schemaClass;
    }

    static public schemaClass template(String schemaPackage, String schemaClass) {
        return new schemaClass()
            .schemaPackage(schemaPackage)
            .schemaClass(schemaClass);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // \npackage 
        static private final byte[] PLAIN_TEXT_0_0;
        // ;\n\nimport com.networknt.graphql.router.SchemaProvider;\nimport graphql.schema.GraphQLSchema;\nimport graphql.schema.idl.RuntimeWiring;\nimport graphql.schema.idl.SchemaGenerator;\nimport graphql.schema.idl.SchemaParser;\nimport graphql.schema.idl.TypeDefinitionRegistry;\nimport org.slf4j.Logger;\nimport org.slf4j.LoggerFactory;\n\nimport java.io.IOException;\nimport java.io.InputStream;\nimport java.io.InputStreamReader;\n\n/**\n * Created by steve on 25/03/17.\n */\npublic class 
        static private final byte[] PLAIN_TEXT_1_0;
        //  implements SchemaProvider {\n    private static Logger logger = LoggerFactory.getLogger(SchemaProvider.class);\n    private static String schemaName = \"schema.graphqls\";\n    @Override\n    public GraphQLSchema getSchema() {\n        SchemaParser schemaParser = new SchemaParser();\n        TypeDefinitionRegistry typeRegistry = null;\n\n        try(InputStream is = getClass().getClassLoader().getResourceAsStream(schemaName)) {\n            typeRegistry = schemaParser.parse(new InputStreamRe...
        static private final byte[] PLAIN_TEXT_2_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(schemaClass.class.getClassLoader(), schemaClass.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
        }

        // argument @ [1:2]
        protected final String schemaPackage;
        // argument @ [1:2]
        protected final String schemaClass;

        public Template(schemaClass model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.schemaPackage = model.schemaPackage();
            this.schemaClass = model.schemaClass();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [1:49]
            __internal.aboutToExecutePosInTemplate(1, 49);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [2:9]
            __internal.aboutToExecutePosInTemplate(2, 9);
            __internal.renderValue(schemaPackage, false);
            // PlainText @ [2:23]
            __internal.aboutToExecutePosInTemplate(2, 23);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // ValueExpression @ [20:14]
            __internal.aboutToExecutePosInTemplate(20, 14);
            __internal.renderValue(schemaClass, false);
            // PlainText @ [20:26]
            __internal.aboutToExecutePosInTemplate(20, 26);
            __internal.writeValue(PLAIN_TEXT_2_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "\npackage ";
        static private final String PLAIN_TEXT_1_0 = ";\n\nimport com.networknt.graphql.router.SchemaProvider;\nimport graphql.schema.GraphQLSchema;\nimport graphql.schema.idl.RuntimeWiring;\nimport graphql.schema.idl.SchemaGenerator;\nimport graphql.schema.idl.SchemaParser;\nimport graphql.schema.idl.TypeDefinitionRegistry;\nimport org.slf4j.Logger;\nimport org.slf4j.LoggerFactory;\n\nimport java.io.IOException;\nimport java.io.InputStream;\nimport java.io.InputStreamReader;\n\n/**\n * Created by steve on 25/03/17.\n */\npublic class ";
        static private final String PLAIN_TEXT_2_0 = " implements SchemaProvider {\n    private static Logger logger = LoggerFactory.getLogger(SchemaProvider.class);\n    private static String schemaName = \"schema.graphqls\";\n    @Override\n    public GraphQLSchema getSchema() {\n        SchemaParser schemaParser = new SchemaParser();\n        TypeDefinitionRegistry typeRegistry = null;\n\n        try(InputStream is = getClass().getClassLoader().getResourceAsStream(schemaName)) {\n            typeRegistry = schemaParser.parse(new InputStreamReader(is));\n        } catch (IOException e) {\n            logger.error(\"IOException:\", e);\n        }\n\n        RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()\n            // put other wiring logic here.\n            .build();\n\n        return new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);\n    }\n}\n";

    }

}