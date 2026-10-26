# Assignment 2: Hospital Medical Billing System

## Project Description
This Java program calculates the total cost of medical services in a hospital. The hospital provides consultations, laboratory tests, and ultrasound examinations. Each service has its own additional fee.



## Expected Output

![Employee output](Screenshots/Employeeoutput.png)


## Assignment Questions and Answers

### 1. Why is MedicalService declared abstract?
`MedicalService` is abstract because it contains the abstract method `calculateTotalCost()`. Each type of medical service calculates its total cost in a different way.

### 2. Can an object be created directly from MedicalService? Explain.
No. We cannot create an object directly from an abstract class. We create objects from its child classes, such as `Consultation`, `LaboratoryTest`, and `Ultrasound`.

### 3. What is the difference between an abstract method and a concrete method?
An abstract method does not have a body. A concrete method has a body and contains code that can run. For example, `calculateTotalCost()` is abstract in `MedicalService`, while `display()` is a concrete method in our program.

### 4. Why must each concrete subclass implement calculateTotalCost()?
Because `calculateTotalCost()` is an abstract method in the parent class. Each concrete child class must provide its own implementation to calculate the correct service cost.
