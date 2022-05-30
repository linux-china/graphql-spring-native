build:
  mvn -DskipTests clean package

native-build:
  mvn -DskipTests -Pnative clean package