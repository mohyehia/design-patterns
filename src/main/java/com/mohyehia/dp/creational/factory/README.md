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
- **Factory Method** is a `creational` design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Problem
- Adding a new class to the program isn’t that simple if the rest of the code is already coupled to existing classes.

### Solution
- The Factory Method pattern suggests that you replace direct object construction calls (using the `new` operator) with calls to a special factory method.
- The objects will still be created via the `new` operator, but it's being called from within the factory method.
- Objects returned by a factory method are often referred to as `products`.
- We can now override the factory method in a subclass and change the class of products being created by the method.

### Applicability
- Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
  - The Factory Method separates product construction code from the code that actually uses the product.
  - Therefore, it’s easier to extend the product construction code independently of the rest of the code.
- Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
- Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

### How to Implement
1. Make all products follow the same interface. This interface should declare methods that make sense in every product.
2. Add an empty factory method inside the creator class. The return type of the method should match the common product interface.
3. In the creator’s code find all references to product constructors. One by one, replace them with calls to the factory method, while extracting the product creation code into the factory method.
4. Now, create a set of creator subclasses for each type of product listed in the factory method.
5. Override the factory method in the subclasses and extract the appropriate bits of construction code from the base method.
6. If there are too many product types, and it doesn't make sense to create subclasses for all of them, you can reuse the control parameter from the base class in subclasses.
7. If, after all the extractions, the base factory method has become empty, you can make it abstract. If there’s something left, you can make it a default behavior of the method.

### Pros and Cons
| Pros                                                                                                                                            | Cons                                                                                                                                                                                                                                 |
|-------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| You avoid tight coupling between the creator and the concrete products.                                                                         | The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. <br/>The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes. |
| `Single Responsibility Principle`. <br/>You can move the product creation code into one place in the program, making the code easier to support | -                                                                                                                                                                                                                                    |
| `Open/Closed Principle`.<br/> You can introduce new types of products into the program without breaking existing client code.                   | -                                                                                                                                                                                                                                    |


### References
- [Factory Method](https://refactoring.guru/design-patterns/factory-method)
- [Factory Method in Java](https://refactoring.guru/design-patterns/factory-method/java/example)
- [Factory Design Pattern in detail | Interview Question](https://www.youtube.com/watch?v=D5d1f9Lcmv4)
- [Factory Design Pattern in Java](https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java)