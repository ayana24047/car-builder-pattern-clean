# car-builder-pattern-clean
Car (Product): The class representing the final product—a car.

CarBuilder (Interface): Defines the common methods for building parts of the car step-by-step.

SimpleCarBuilder and SportsCarBuilder (Concrete Builders): Implement the CarBuilder interface and create specific types of cars (a regular and a sports car).

CarDirector (Director): Manages the construction process. It uses the builder's methods in a specific sequence to get a finished product.

Client and Main: The entry point to the application, where the director is created and the construction process is launched.
