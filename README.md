# MoviesDB
## Instructions to build image
1. ./gradlew clean build
2. docker build --build-arg JAR_FILE=build/libs/\*.jar -t moviesdb .
3. docker tag moviesdb:latest public.ecr.aws/e8q1i6h1/moviesdb:latest

## Instructions to run locally
1. docker-compose up

## Deploying to ECR
docker push public.ecr.aws/e8q1i6h1/moviesdb:latest
