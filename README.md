# JPA_CRUD_Operation
first create the project in the eclipse that is file->new->spring starter project->
In the main package for ex:com.data right click and create sub packages
pakages->1)Controller  2)Entity  3)Repository  4)Service
create the classes and in the Repository create Interface

In Application.Properties file :
spring.application.name=StudentJPAApplication
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=Root
spring.jpa.hibernate.ddl-auto=create
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

Create a database in the mysql ex:student_db 
for the dialect file go to google search dialect for jpa and then copy the sql link there and then paste in front of the dialect
The ddl-auto will be first create then after running once in second time it will replace with update like
spring.jpa.hibernate.ddl-auto=update
