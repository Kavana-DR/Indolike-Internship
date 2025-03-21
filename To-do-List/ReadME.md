To-Do List App (CLI-Based)
 Description:
This is a simple To-Do List Application built in Java that allows users to manage their daily tasks. Users can add tasks, view the list of tasks, mark tasks as completed, and delete tasks. It’s a user-friendly, console-based application.

 Features:
1. Add new tasks to the list.
2. View all tasks with their status (Completed or Pending).
3. Mark tasks as completed.
4. Delete tasks from the list.
5. Exit the application.

 Technologies Used:
Java for core programming.
ArrayList for task management.
Scanner for user input.
📂 Folder Structure
vbnet
Copy
Edit
/to-do-list
│── src
│   ├── ToDoList.java
│── README.md
│── tasks.txt (Optional for storage if implemented)


▶️ How to Run:
Clone the Repository:
git clone https://github.com/your-username/to-do-list.git
cd to-do-list

Compile the Java File:
javac ToDoList.java

Run the Application:
java ToDoList
📌 Usage Example
mathematica
Copy
Edit
📋 To-Do List Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Delete Task
5. Exit
Choose an option: 1
Enter task description: Complete Java assignment
✅ Task added!

Choose an option: 2
🗂️ Your Tasks:
1. Complete Java assignment ❗ (Pending)
💡 Future Enhancements
File Storage: Implement task saving using tasks.txt.
Task Prioritization: Allow users to set High, Medium, or Low priority.
Due Dates: Enable users to add deadlines.
Search Functionality: Find tasks using keywords.