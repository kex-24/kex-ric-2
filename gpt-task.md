# Wildlife Tracker: The Java Expedition

## Deadline
This assignment should be completed before the next lecture.

## Instructions
For instructions on how to submit the assignment, please refer to the assignments section of the course instructions.

## Preparation
- Read and answer all questions in Module 2: Looking Inside Classes.

You can access the material both:
  - via Canvas (see the OLI Torus SE link in the left menu)
  - or directly on the webpage.

Note: The material and tasks might slightly differ from previous years, so it is acceptable to read ahead if needed.

## Learning Goals
After completing this week's assignment, you'll learn:
* How to design Java classes.
* How to add and work with instance fields.
* How to create constructors.
* About using getters and setters.
* How to use the dot operator.
* How to print to the terminal.
* Understanding the `main` method.
* About variable scope and variable shadowing.

## Troubleshooting Guide
If you encounter any issues, follow these steps:
1. Check the posted issues in the help section. Maybe other students have faced similar problems.
2. If your issue hasn't been addressed, create a New Issue.
3. Ask a TA in person during the weekly lab. Check your schedule for the next available lab session.

Discussion with course friends is encouraged, but sharing specific solutions is not allowed.

## Assignment

In the wild expanses of the Java programming environment, a diverse range of wildlife has been observed. Your mission, should you choose to accept it, is to model these creatures using Java. The diversity of wildlife is endless, but with modern computational tools, you are tasked with categorizing them in Java.

### Exercise 1: Initiating the Expedition

Start by creating a new Java file called `Wildlife.java` in the `src` folder. Within it, define the class `Wildlife` to include a `main` method.

Your first task is to model your first animal. Choose an animal and create variables for its name, health points, speed, and whether it's endangered or not, directly within the `main` method.
  
### Exercise 2: Expanding the Zoo
  
Having successfully modeled your first animal, it's time to model two more, bringing your total to three. After creating them, print their information to the console.

Even though this method works, it's not scalable. This is where object-oriented programming comes into play. Classes and objects allow for more efficient handling of similar data.

### Exercise 3: Fields of the Wild

Moving away from individual variable creation, utilize class fields to represent animal data. Create fields for an animal's name, health points, speed, and endangered status. Then instantiate a new animal object within the `main` method.

### Exercise 4: Access Control

Implement encapsulation by setting the access modifiers of your fields to `private` and creating appropriate getters and setters for each field. This step enhances security and flexibility.

### Exercise 5: Constructors in the Jungle

Constructors enable the setting of all object attributes at once during instantiation. Implement a constructor for your wildlife class and utilize it to create new animal objects.

### Exercise 6: Observing More Wildlife

Using your constructor, add two more animal objects. Feel the convenience compared to earlier methods.

### Exercise 7: Wildlife Reporting

Improve how you print animal information. Implement a `printInfo()` method that outputs all relevant details about the animal.

### Exercise 8: Interactions in the Wild

Wild animals interact in various ways. Implement an `interact` method that simulates an interaction between two animals. The exact nature of this interaction is up to your imagination.

### Exercise 9: Exploring Variable Shadowing

Review examples on variable shadowing and understand how to resolve such issues. Explore using the `this` keyword to differentiate between instance fields and method parameters.

## Checklist
- Create three animals directly in the `main` method and print their information. Remove this code afterward.
- Design your wildlife class with fields for name, health points, speed, and endangered status. Test accessing these fields.
- Implement getters and setters for all fields.
- Develop a constructor for your wildlife class and test creating animals with it.
- Write a `printInfo()` method for revealing animal details.
- Simulate wildlife interactions with the `interact` method.
- Review and understand variable shadowing.

## Bugs and errors?
If you encounter any inconsistencies or errors, please raise a New Issue with the title "Error in Task *x*: *brief description*". Any discovered bugs will be recognized in the acknowledgments section.