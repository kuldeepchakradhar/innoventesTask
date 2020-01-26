# innoventesTask
#Database connection

- For DataBase connection just use mysql and create database name "innoventes", use your system mysql password and edit it in application.properties file.


# Localhost default path
http://localhost:6002/innoventes/employee

# for Adding new Employee
-PostRequest
http://localhost:6002/innoventes/employee/add

Json object would look like this: 
{
	"name": "Demo name",
	"dateOfBirth":"2001-01-01"
}

# for updating Employee
-PutRequest
http://localhost:6002/innoventes/employee/update/1

{
	"name": "Demo tast",
	"dateOfBirth":"2001-01-01"
}

# for getting list of employee
-GetRuquest 
http://localhost:6002/innoventes/employee/all

# for getting employee by id
-GetRequest
http://localhost:6002/innoventes/employee/1





