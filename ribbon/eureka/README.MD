一个docker helloworld项目
quickstart

./Dockefile ---》docker镜像制作脚本
一、操作步骤
1.cd /项目根目录，
2.docker build -t app/eureka .
3.docker images
4.docker run   -p 8761:8761 app/eureka -d

二、项目,请求路径："/"
./src/java/main
