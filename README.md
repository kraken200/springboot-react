# Employee management system
A spring boot react project based on REST architecture
# Front-end
- Frontend was made using ReactJs
- Used create react app to generate boilerplate code
- Used react hooks like useState, useEffect and useHistory

 # Back-end 
- API was created using springboot
- API was built using REST architecture, hence it supports CRUD operations
- MySQL database is used

# Instructions to run project
--Requirements
- Java JDK 11 or above
- MySQL database
- NodeJS and npm
 
--To set up backend
- Download or clone repository
- Create a new database in MySQL, I'm calling it 'ems' for future reference 
- Open springboot-backend in your favuorite IDE (Eclipse, Netbeans etc.)
- Go to src/main/resources/application properties
- Give the address of database in the designated area (eg- localhost/3000/ems)
- Enter username and password in designated spaces
- Run the project to make sure there is no error
- To add seed data, uncomment the commented lines in src/main/SpringbootBackendApplication.java
- Run the project and check to see data has been added successfully
- Comment or remove previously uncommented code to avoid redundant data
- To check using Postman client, make a get request to localhost:3000/api/v1/employees. You should get all the seed data.

-- To set up frontend
- Open react-frontend in your favuorite IDE
- Run npm install && npm start to install dependencies and run the frontend application
- It should open up a browser window, indicating that the project is up and running.

Feel free to experiment! Cheers!

