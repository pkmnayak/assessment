Publicis Sapient Assesment Readme :

Quick start

1)  I Have developed this API Using Spring boot and Micro service architecture

2) There are two micro service 
    a) Weather - Actuall API code written here
    b) gateway - Zuul Netflix Gateway
  
3) For Frontend i have written code in ReactJS and bundled files are included in side of micro service resource static folder 

4) UI Screen i'm attaching in root folder with name UiScreen 

5) UI have option to enter the city name and it display result in json format in Screen it self

6) Weather Service run on port : 8070  ( localhost:8070/city/Hyderabad,IN)

7) open weather map API key time being i have kept in application.properties file but i can moved to docker aurguement command line to protect it

8) API�s Documentaton  via swagger with Name "Swagger-api.yml"

9)sequence diagram (name :  SequenceDiagram.puml)

10) Build : building jar command :  mvn clean package -Dmaven.test.skip=true
    
    Deploy : docker file include in code ( Dockerfile) 
    
    docker command to create image and run docker :
    
    image create : sudo docker build -t weather:1.0 .
    
    Docke run : sudo docker run  -p 8070:8070 -t weather:1.0

11) Jenkin pipeline :  Jenkinsfile include ( not fully written )

12)  Due to time constraint i could  not write junit .

    