# MoviesDB
## Instructions to build image
1. ./gradlew clean build
2. docker build --build-arg JAR_FILE=build/libs/\*.jar -t golden/moviesdb .

## Instructions to run locally
3. docker-compose up