package org.springframework.experimental.graphql;

import graphql.GraphQL;
import graphql.execution.Execution;
import graphql.parser.ParserOptions;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLCodeRegistry;
import graphql.util.NodeAdapter;
import graphql.util.NodeZipper;
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
        typeNames = {
                "graphql.analysis.QueryTraversalContext",
                "graphql.schema.idl.SchemaParseOrder",
        },
        types = {
                ParserOptions.class,
                GraphQL.class,
                NodeAdapter.class,
                NodeZipper.class,
                Execution.class,
                DataFetchingEnvironment.class,
                GraphQLCodeRegistry.Builder.class,
                // sub types from graphql.language.Node or graphql.schema.GraphQLSchemaElement
                graphql.language.Argument.class,
                graphql.language.ArrayValue.class,
                graphql.language.BooleanValue.class,
                graphql.language.Directive.class,
                graphql.language.DirectiveDefinition.class,
                graphql.language.DirectiveLocation.class,
                graphql.language.Document.class,
                graphql.language.EnumTypeDefinition.class,
                graphql.language.EnumTypeExtensionDefinition.class,
                graphql.language.EnumValue.class,
                graphql.language.EnumValueDefinition.class,
                graphql.language.Field.class,
                graphql.language.FieldDefinition.class,
                graphql.language.FloatValue.class,
                graphql.language.FragmentDefinition.class,
                graphql.language.FragmentSpread.class,
                graphql.language.InlineFragment.class,
                graphql.language.InputObjectTypeDefinition.class,
                graphql.language.InputObjectTypeExtensionDefinition.class,
                graphql.language.InputValueDefinition.class,
                graphql.language.IntValue.class,
                graphql.language.InterfaceTypeDefinition.class,
                graphql.language.InterfaceTypeExtensionDefinition.class,
                graphql.language.ListType.class,
                graphql.language.NonNullType.class,
                graphql.language.NullValue.class,
                graphql.language.ObjectField.class,
                graphql.language.ObjectTypeDefinition.class,
                graphql.language.ObjectTypeExtensionDefinition.class,
                graphql.language.ObjectValue.class,
                graphql.language.OperationDefinition.class,
                graphql.language.OperationTypeDefinition.class,
                graphql.language.ScalarTypeDefinition.class,
                graphql.language.ScalarTypeExtensionDefinition.class,
                graphql.language.SchemaDefinition.class,
                graphql.language.SchemaExtensionDefinition.class,
                graphql.language.SelectionSet.class,
                graphql.language.StringValue.class,
                graphql.language.TypeName.class,
                graphql.language.UnionTypeDefinition.class,
                graphql.language.UnionTypeExtensionDefinition.class,
                graphql.language.VariableDefinition.class,
                graphql.language.VariableReference.class,
                graphql.schema.GraphQLAppliedDirective.class,
                graphql.schema.GraphQLAppliedDirectiveArgument.class,
                graphql.schema.GraphQLArgument.class,
                graphql.schema.GraphQLDirective.class,
                graphql.schema.GraphQLEnumType.class,
                graphql.schema.GraphQLEnumValueDefinition.class,
                graphql.schema.GraphQLFieldDefinition.class,
                graphql.schema.GraphQLInputObjectField.class,
                graphql.schema.GraphQLInputObjectType.class,
                graphql.schema.GraphQLInterfaceType.class,
                graphql.schema.GraphQLList.class,
                graphql.schema.GraphQLNonNull.class,
                graphql.schema.GraphQLObjectType.class,
                graphql.schema.GraphQLScalarType.class,
                graphql.schema.GraphQLTypeReference.class,
                graphql.schema.GraphQLUnionType.class,
        }
)
@ResourceHint(patterns = {"graphiql/index.html"})
@JdkProxyHint(types = {SchemaMapping.class})
public class GraphQlNativeHints implements NativeConfiguration {
}
