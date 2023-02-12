# jdk11을 base 이미지로 사용
FROM openjdk:11-jdk

VOLUME /tmp

# Dockerfile build시에 사용하는 변수
ARG JAR_FILE=./build/libs/*.jar

# 변수에 저장된 것을 컨테이너 실행시 이름을 app.jar파일로 변경하여 컨테이너에 저장
COPY ${JAR_FILE} app.jar

# github push test
# 빌드된 이미지가 run될 때 실행할 명령어
ENTRYPOINT ["java","-jar","app.jar"]