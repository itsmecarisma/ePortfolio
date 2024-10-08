# ePortfolio

Table of Content

- Professional Self-Assessment
- Code Reviews
- Appointment Capstone (Software Design and Enineering)
- Task Capstone (Algorithms and Data Structure)
- AnimalShelter Capstone (Databases)
__________________________________________

Professional Self-Assessment

Hello! My name is Carsima Carter. I am a military veteran. I have been studying computer science for two years now.  My journey into the world of computer science has been driven by a deep-seated passion for technology and a commitment to excellence in everything I undertake. As I transition from my military career to a future in cybersecurity, I am excited to leverage the skills and knowledge I have gained from my time at Southern New Hampshire University. 

Completing my coursework in the computer science program and developing my ePortfolio has been instrumental in highlighting my strengths, shaping my professional goals, and preparing me for a successful career in the field. Throughout the program, I have developed a comprehensive understanding of core computer science principles such as Software Design and Engineering, Algorithms and Data Structure, and Databases. I also gained hands-on experience with various technologies. This ePortfolio has allowed me to present my skills in a structured and professional manner, showcasing my ability to solve complex problems, collaborate with peers, and deliver high-quality software solutions. This process has reinforced my commitment to continuous learning and my passion for developing innovative technologies that make a difference.

One of the key strengths I have developed in this program is the ability to collaborate effectively in a team environment. During my coursework, I frequently had to reach out to my peers either to work on group projects or if I had any questions. This required clear communication and collective problem-solving. For instance, in my CS-210 course, my team and I developed a time clock application in Python. Being new to the field of computer science, I did not have much knowledge of the language of Python. This project not only demonstrated my technical skills but also my ability to work with others to achieve a common goal. Outside of coursework, I have had the opportunity to apply these skills in my role as a secretary at a Naval hospital, where I worked with a team to streamline the process of tracking medical supplies, ensuring accuracy and efficiency. Additionally, communicating with stakeholders has been a critical aspect of my training. Whether it was presenting project updates to instructors or gathering requirements from clients, I learned to convey complex technical concepts in a way that is accessible and relevant to non-technical audiences.

My proficiency in data structures and algorithms has been a cornerstone of my education. Through rigorous coursework and practical assignments, I have mastered the fundamentals of algorithm design, complexity analysis, and data management. An example of this is my work on a capstone project where I implemented an optimized search algorithm to enhance the performance of a database application. Outside of the classroom, I applied these skills in a volunteer project where I helped develop a scheduling system for a local recreational center. This experience not only solidified my understanding of theoretical concepts but also demonstrated my ability to apply these principles to real-world problems. Similarly, my exposure to software engineering principles and database management systems has equipped me with the skills needed to design, develop, and maintain strong software applications. For example, my work with MongoDB and MySQL during various projects has given me a strong foundation in database design and querying. 

One of the most critical aspects of my education has been developing a security mindset. As I transition into cybersecurity, this mindset has become increasingly important. During my coursework, I had the opportunity to implement security features in several projects, one of which involved securing a web application that handled sensitive user data. In my CS-305 course, I was tasked with designing a web-based system that required user authentication and data protection. To ensure the security of the application, I implemented secure authentication mechanisms using hashed passwords and HTTPS protocols to encrypt data transmission between the client and server.

In addition to securing the authentication process, I integrated input validation and sanitization techniques to prevent common web vulnerabilities such as SQL injection and cross-site scripting (XSS) attacks. This experience taught me the importance of anticipating adversarial exploits and proactively addressing potential vulnerabilities in the software architecture. By considering these security aspects during the design and development phases, I ensured that the application not only met functional requirements but also protected user data and maintained the integrity of the system.

Furthermore, in the AnimalShelter project, I focused on securing the database by implementing access control measures and ensuring that only authorized personnel could perform certain CRUD operations. This approach minimized the risk of unauthorized data access and potential data breaches. These experiences have reinforced my commitment to adopting a security-first approach in all my future projects, ensuring that the software solutions I develop are not only effective but also secure.

The artifacts included in my ePortfolio reflect the scope and depth of my computer science knowledge and capabilities. Each project has been carefully selected to demonstrate my technical expertise and my ability to integrate different technologies flawlessly. For instance, the appointment class showcases my ability to manage scheduling logic and data structures effectively. The task class highlights my skills in object-oriented programming and software design, demonstrating my capacity to develop modular and maintainable code. My work on the AnimalShelter project underscores my proficiency in database management and CRUD operations using MongoDB. Additionally, the scheduling system I developed for the recreational center demonstrates my ability to contribute to real-world projects outside the academic environment. By summarizing these artifacts, my portfolio provides a holistic view of my abilities and prepares me for the challenges of the professional world. It serves as a testament to my dedication to the field and my readiness to contribute meaningfully to any organization.
____________________________________________________________________________________________________________________________________________

Code Review

Below are two links for my code reviews. Both are a direct link to my YouTube page. My code view emphasizes clarity, maintainability, and efficiency. I believe in writing clean, well-documented code that is easy to understand and maintain by others. Additionally, I focus on optimizing performance to ensure that my solutions are both effective and scalable.

[Appointment and AnimalShelter Code Review](https://youtu.be/LmlQ2o6t7L8)

[Task Code Review](https://youtu.be/8f4CrHqlY0A)

___________________________________________________________________________________________________________________________________________

Appointment Capstone (Software Design and Enineering)

![image](https://github.com/user-attachments/assets/5f814510-e02e-4fba-a621-f6a0242698c3)

[Appointment Capstone](https://github.com/itsmecarisma/ePortfolio/blob/main/Appointment%20Capstone/Appointment%20Capstone/src/appointmentservice/Appointment.java)

The Appointment class is designed to manage appointment details, including a unique identifier, appointment date, and description. The class includes fields for `appointmentid`, `appointmentdate`, and `description`, with constraints on their values to ensure validity. The ID is generated using UUID and limited to 10 characters, while the description is capped at 50 characters and cannot be null. The `appointmentdate` must be a future date, verified using the `isFutureDate` method which parses the date string and compares it with the current date. The constructor initializes the appointment with a given date and description, enforcing the constraints through setter methods. The `toString` method provides a readable representation of the appointment details. The main method includes functionality to generate and print 100 valid appointments and test various edge cases, such as null descriptions, overly long descriptions, past dates, and invalid date formats, demonstrating the class's robustness in handling input validation and error reporting.

___________________________________________________________________________________________________________________________________________

 Task Capstone (Algorithms and Data Structure)

![image](https://github.com/user-attachments/assets/f6bf5ff4-20f0-468c-b1e3-f6e0af78c9ca)

[Task Capstone](https://github.com/itsmecarisma/ePortfolio/blob/main/Task%20Capstone/Task%20Capstone/src/taskservice/Main.java)

The Task class is designed to manage tasks efficiently, capturing essential attributes such as task ID, name, and description. The `Main` class demonstrates the functionality of the `TaskServiceCapStone` class, which manages a collection of Task objects. The code initializes the task service, generating and adding 100 tasks with unique IDs and descriptions. It includes methods to find a task by ID, retrieve all tasks sorted by name, identify the highest priority task, delete a task, and find the index of a task by its ID. This comprehensive set of functionalities ensures effective task management and manipulation, providing a various framework for handling task-related operations in various applications.

___________________________________________________________________________________________________________________________________________

AnimalShelter Capstone (Databases)

![image](https://github.com/user-attachments/assets/0e49477b-c77d-492a-93f1-6fdeb5464495)

[AnimalShelter Capstone](https://github.com/itsmecarisma/ePortfolio/blob/main/AnimalShelter%20Capstone/src/AnimalShelter.py)

AnimalShelter Python code defines a class `AnimalShelter` that facilitates CRUD (Create, Read, Update, Delete) operations on a MongoDB collection named `animals`. The class uses the `pymongo` library to establish a connection to a MongoDB database using connection pooling, and it handles potential connection errors. In the constructor, it attempts to connect to the MongoDB server and creates an index on the `name` field for better read performance. The class provides methods to create a document in the collection (`create`), read documents based on a query (`read`), update a document (`update`), and delete a document (`delete`). Additionally, the class includes a method (`generate_test_data`) to generate and insert a specified number of test records into the collection, with random values for `name`, `species`, and `age`. The code ensures error handling for database operations and validates input data for each CRUD method.








