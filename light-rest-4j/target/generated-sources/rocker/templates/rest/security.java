package templates.rest;

import javax.annotation.Generated;
import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template templates/rest/security.yml.rocker.raw
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
@Generated("com.fizzed.rocker.compiler.JavaGenerator") @SuppressWarnings("unused")
public class security extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.RAW;
    static public final String TEMPLATE_NAME = "security.yml.rocker.raw";
    static public final String TEMPLATE_PACKAGE_NAME = "templates.rest";
    static public final String HEADER_HASH = "2508083";
    static public final long MODIFIED_AT = 1518543981000L;
    static public final String[] ARGUMENT_NAMES = { };

    static public security template() {
        return new security();
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // # Security configuration in light framework.\n---\n# Enable JWT verification flag.\nenableVerifyJwt: false\n\n# Enable JWT scope verification. Only valid when enableVerifyJwt is true.\nenableVerifyScope: true\n\n# User for test only. should be always be false on official environment.\nenableMockJwt: false\n\n# JWT signature public certificates. kid and certificate path mappings.\njwt:\n  certificate:\n    '100': oauth/primary.crt\n    '101': oauth/secondary.crt\n  clockSkewInSeconds: 60\n\n# ...
        static private final byte[] PLAIN_TEXT_0_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(security.class.getClassLoader(), security.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
        }

        public Template(security model) {
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

        static private final String PLAIN_TEXT_0_0 = "# Security configuration in light framework.\n---\n# Enable JWT verification flag.\nenableVerifyJwt: false\n\n# Enable JWT scope verification. Only valid when enableVerifyJwt is true.\nenableVerifyScope: true\n\n# User for test only. should be always be false on official environment.\nenableMockJwt: false\n\n# JWT signature public certificates. kid and certificate path mappings.\njwt:\n  certificate:\n    '100': oauth/primary.crt\n    '101': oauth/secondary.crt\n  clockSkewInSeconds: 60\n\n# Enable or disable JWT token logging\nlogJwtToken: true\n\n# Enable or disable client_id, user_id and scope logging.\nlogClientUserScope: false\n\n# If OAuth2 provider support http2 protocol. If using light-oauth2, set this to true.\noauthHttp2Support: true\n\n# Enable JWT token cache to speed up verification. This will only verify expired time\n# and skip the signature verification as it takes more CPU power and long time.\nenableJwtCache: true\n\n# If you are using light-oauth2, then you don't need to have oauth subfolder for public\n# key certificate to verify JWT token, the key will be retrieved from key endpoint once\n# the first token is arrived. Default to false for dev environment without oauth2 server\n# or official environment that use other OAuth 2.0 providers.\nbootstrapFromKeyService: false\n";

    }

}
