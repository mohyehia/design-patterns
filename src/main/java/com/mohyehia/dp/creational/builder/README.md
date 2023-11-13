## Factory

### Overview
- [Intent](#intent)
- [Problem](#problem)
- [Solution](#solution)
- [Applicability](#applicability)
- [How to Implement](#how-to-implement)
- [Pros and Cons](#pros-and-cons)
- [References](#references)

### Intent
- **Builder** is a `creational` design pattern that lets you construct complex objects step by step.
- The pattern allows you to produce different types and representations of an object using the same construction code.

### Problem
- Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects.
- Such initialization code is usually buried inside a monstrous constructor with lots of parameters.

### Solution
- The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.
- The pattern organizes object construction into a set of steps.
- To create an object, you execute a series of these steps on a builder object.
- The important part is that you don’t need to call all the steps.
- You can call only those steps that are necessary for producing a particular configuration of an object.

### Applicability
- Use the Builder pattern to get rid of a multiple overloaded constructors.
- Use the Builder pattern when you want your code to be able to create different representations of some product.
- Use the Builder to construct Composite trees or other complex objects.

### How to Implement
1. First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is `Computer` then builder class should be named as `ComputerBuilder`.
2. Java Builder class should have a public constructor with all the required attributes as parameters.
3. Java Builder class should have methods to set the optional parameters, and it should return the same Builder object after setting the optional attribute.
4. The final step is to provide a `build()` method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.


### Pros and Cons
| Pros                                                                                                                      | Cons                                                                                                   |
|---------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| You can construct objects step-by-step, defer construction steps or run steps recursively.                                | The overall complexity of the code increases since the pattern requires creating multiple new classes. |
| You can reuse the same construction code when building various representations of products                                | -                                                                                                      |
| `Single Responsibility Principle`.<br/> You can isolate complex construction code from the business logic of the product. | -                                                                                                      |


### References
- [Builder](https://refactoring.guru/design-patterns/builder)
- [How does Builder Design Pattern solves problems like URL creation?](https://www.youtube.com/watch?v=4ff_KZdvJn8)
- [Builder Design Pattern in Java](https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java)