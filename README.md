# dummy-github-events
- A Spring Boot application using Gradle building script that integrates with Github API and implements webhooks to track changes in a Github account.

# Tech Stack
- Java
- Hibernate
- Spring Framework
- Spring Boot
- Gradle

# Installation & Run
- Before running the Application , you should Download the ngrok then unzip the file and run the following command to  config ngrok :
  ngrok config add-authtoken <token>
  ngrok http <server.port>

- This will provide a global url for our local server port(eg.  https://77e7-103-47-173-15.in.ngrok.io)
- Now Run the Spring-Boot Application and start the Tomcat Server.

- Use the available url / <Controller end points> (eg. https://77e7-103-47-173-15.in.ngrok.io/req/webhook) to setting up the webhook
- now setup the webhook githubrepo which we want integrate
Thanks for visiting !
