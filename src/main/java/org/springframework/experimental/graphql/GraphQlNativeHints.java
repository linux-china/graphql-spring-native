package org.springframework.experimental.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.nativex.hint.JdkProxyHint;
import org.springframework.nativex.hint.ResourceHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;

/**
 * Provides Spring Native hints to support using Spring GraphQL in a Spring Native application.
 *
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
@TypeHint(
        types = {
                QueryMapping.class,
                SchemaMapping.class
        }
)
@ResourceHint(patterns = {"graphiql/index.html"})
@JdkProxyHint(types = {SchemaMapping.class})
public class GraphQlNativeHints implements NativeConfiguration {
}
