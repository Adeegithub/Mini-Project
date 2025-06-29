# Mini-Project

This is a project focused on Beans, Autowiring and DI in Spring. <br>
Given Below is the High Level Architecture of the implemented project.

<img width="991" alt="Screenshot 2025-06-29 at 11 50 03 PM" src="https://github.com/user-attachments/assets/6c0f5e1c-9925-4477-9371-f00ea6b8bcfb" />
<br>

Given Below are the Instantiated Beans by Spring IOC using @Component
1. Vehicle Bean
2. Person Bean
3. Vehicle Service Bean
4. Sony Speakers Bean
5. JBL Speakers Bean
6. BridgeStone Tyres Bean
7. Ferentino Tyres Bean

• Vehicle Bean has a dependency on Vehicle Service Bean. <br>
• Person Bean has a dependency on Vehicle Bean. <br>
• Vehicle Services bean depend on the implementations of Speakers and Tyres to serve Vehicle Bean requests. <br>

• Speakers interface with makeSound() method. <br>
• Tyres interface method with rotate() method. <br>

Two Implementations of Speakers Interface
1. JBL Speakers.
2. Sony Speakers.

Two Implementations of Tyres Interface
1. BridgesStone Tyres.
2. Ferentino Tyres.

# Goal

The application should play music from one of the Speakers implementations & move using one of the Tyres implementation.
It should also give flexibility to switch between the implementations easily.

