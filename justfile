export GRAALVM_HOME := "~/.jenv/candidates/java/graalvm-22.1-java17"

build:
  mvn -DskipTests clean package

native-build:
  mvn -DskipTests -Pnative clean package

run-with-agent:
   mkdir -p target/native-image
   {{GRAALVM_HOME}}/bin/java -agentlib:native-image-agent=config-output-dir=target/native-image -jar target/graphql-native-0.0.1-SNAPSHOT.jar
