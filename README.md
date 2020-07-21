Goal
---
The aim of the API Service is to interface the connectivity of Open Banking *AISP/PISP* APIs with the help of Sandbox environment with default TLS configuration or your own configured Open Banking certificates(MATLS).
The API Service can be used by third party providers to integrate and test OB APIs.

Post downloading/cloning the code, follow the below steps to run the APIService - 

1. cd to the APIService folder
2. mvn clean install
3. After successful build please run the below command-
 mvn -pl visionaries-web spring-boot:run -Dspring-boot.run.profiles=AD

The above steps should have you running the API Service.
Next please view the readme file for recommendation-engine (another repository) as it is dependent on API Service to access sandbox (to fetch transactions for an account) and then provide the recommendations.
