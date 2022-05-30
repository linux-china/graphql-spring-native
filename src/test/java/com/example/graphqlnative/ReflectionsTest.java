package com.example.graphqlnative;

import graphql.language.Node;
import graphql.schema.GraphQLSchemaElement;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class ReflectionsTest {

    @Test
    public void testListGraphQLNodes() {
        Set<String> reflectionClasses = new HashSet<>();
        Reflections reflections = new Reflections("graphql");
        // graphql.language.Node sub types
        reflections.get(SubTypes.of(Node.class).asClass())
                .stream()
                .filter(clazz -> !clazz.isInterface() && !Modifier.isAbstract(clazz.getModifiers())).map(Class::getCanonicalName)
                .sorted()
                .forEach(reflectionClasses::add);
        // graphql.schema.GraphQLSchemaElement sub types
        reflections.get(SubTypes.of(GraphQLSchemaElement.class).asClass())
                .stream()
                .filter(clazz -> !clazz.isInterface() && !Modifier.isAbstract(clazz.getModifiers())).map(Class::getCanonicalName)
                .sorted()
                .forEach(reflectionClasses::add);
        reflectionClasses.stream().sorted().forEach(s -> {
            System.out.println(s + ".class, ");
        });
    }
}
