## Chain Of Responsibility


### Overview
- [Intent](#intent)
- [Applicability](#applicability)
- [Pros](#pros)
- [References](#references)

### Intent
- **Chain of Responsibility** is a behavioral design pattern that lets you pass requests along a chain of handlers.
- Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
- **Chain of Responsibility** relies on transforming particular behaviors into stand-alone objects called handlers.
- Each check should be extracted to its own class with a single method that performs the check.
- The request, along with its data, is passed to this method as an argument.
- The pattern suggests that you link these handlers into a chain.
- Each linked handler has a field for storing a reference to the next handler in the chain.
- In addition to processing a request, handlers pass the request further along the chain.
- The request travels along the chain until all handlers have had a chance to process it.
- Handler can decide not to pass the request further down the chain and effectively stop any further processing.

### Applicability
- Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
- The pattern lets you link several handlers into one chain and, upon receiving a request, “ask” each handler whether it can process it. This way all handlers get a chance to process the request.
- Use the pattern when it’s essential to execute several handlers in a particular order.

### Pros
- You can control the order of request handling.
- _Single Responsibility Principle_. You can decouple classes that invoke operations from classes that perform operations.
- _Open/Closed Principle_. You can introduce new handlers into the app without breaking the existing client code.

### References
- [Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)
- [Chain of Responsibility in Java](https://refactoring.guru/design-patterns/chain-of-responsibility/java/example)
- [Chain of Responsibility Design Pattern in detail | Interview Question](https://www.youtube.com/watch?v=h9wiLblSRXk)
- [Chain of Responsibility Design Pattern in Java](https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java)