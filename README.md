#Build docker 
docker compose up

*Using Postman test API*

#Add
Method: Post
http://localhost:8080/api/employees
Raw JSON in Body: {
    "firstName": "Van",
    "lastName": "A",
    "email": "VanAgmail.com" 
}

#Select by id
Method: Get
http://localhost:8080/api/employees/{id}

#Get All
Method: Get
http://localhost:8080/api/employees

#Upload
Method: Put
http://localhost:8080/api/employees/{id}

#Delete
Method: Delete
http://localhost:8080/api/employees/{id}
