# Restaurant Ordering System

## Project Overview

Restaurant Ordering System is a Java application developed to demonstrate the practical implementation of six object-oriented Design Patterns.

The system simulates a restaurant ordering process. Customers can select meals, add extra ingredients, create orders, apply discounts, and receive notifications about order status changes.

The project demonstrates how design patterns improve code organization, reusability, flexibility, and maintainability.

## Design Patterns Used

The project implements six design patterns from three categories.

| Category | Design Pattern | Implementation |
|---|---|---|
| Creational | Factory | Creates meal objects such as Pizza and Burger |
| Creational | Builder | Constructs orders step by step |
| Structural | Decorator | Adds extra cheese or sauce to meals |
| Structural | Facade | Simplifies the ordering process |
| Behavioral | Strategy | Applies different discount calculations |
| Behavioral | Observer | Notifies observers when an order status changes |

### 1. Factory Pattern

The Factory Pattern is implemented through `MealFactory`.

It provides a method for creating different meal objects without requiring the client to instantiate concrete meal classes directly.

**Main classes:** `MealFactory`, `Pizza`, `Burger`, `Meal`.

### 2. Builder Pattern

The Builder Pattern is implemented through `OrderBuilder`.

It allows the system to construct an order step by step by selecting a customer and adding meals.

**Main class:** `OrderBuilder`.

**Main methods:** `setCustomer()`, `addMeal()`, `build()`.

### 3. Decorator Pattern

The Decorator Pattern allows additional ingredients to be added dynamically without modifying the original meal classes.

**Main classes:** `MealDecorator`, `ExtraCheese`, `ExtraSauce`.

### 4. Facade Pattern

The Facade Pattern is implemented through `RestaurantFacade`.

It provides a simplified interface that coordinates order creation, discount calculation, and status notifications.

**Main methods:** `placeOrder()`, `markReady()`.

### 5. Strategy Pattern

The Strategy Pattern allows different discount algorithms to be selected.

**Main classes:** `DiscountStrategy`, `RegularDiscount`, `StudentDiscount`.

### 6. Observer Pattern

The Observer Pattern notifies registered observers when an order status changes.

**Main classes:** `OrderObserver`, `OrderPublisher`, `CustomerNotifier`, `KitchenNotifier`.

## Project Structure

```text
RestaurantOrderingSystem/
├── src/
│   ├── builder/
│   │   └── OrderBuilder.java
│   ├── decorator/
│   │   ├── MealDecorator.java
│   │   ├── ExtraCheese.java
│   │   └── ExtraSauce.java
│   ├── facade/
│   │   └── RestaurantFacade.java
│   ├── factory/
│   │   ├── MealFactory.java
│   │   ├── Pizza.java
│   │   └── Burger.java
│   ├── model/
│   │   ├── Customer.java
│   │   ├── Meal.java
│   │   ├── Order.java
│   │   └── OrderStatus.java
│   ├── observer/
│   │   ├── OrderObserver.java
│   │   ├── OrderPublisher.java
│   │   ├── CustomerNotifier.java
│   │   └── KitchenNotifier.java
│   ├── strategy/
│   │   ├── DiscountStrategy.java
│   │   ├── RegularDiscount.java
│   │   └── StudentDiscount.java
│   └── Main.java
└── README.md
```

## Technologies Used

- Java
- IntelliJ IDEA
- Git and GitHub
- PlantUML for class diagrams

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/aiymissabayeva/RestaurantOrderingSystem.git
   ```

2. Open the project in IntelliJ IDEA.
3. Configure a compatible Java JDK.
4. Open `src/Main.java`.
5. Run the `Main` class.
6. Observe the output in the console.

## Functional Testing

The application can be tested by executing `Main.java` and checking the console output.

The project report describes two test scenarios:

| Test Case | Description | Expected Total |
|---|---|---|
| 1 | Pizza with Extra Cheese and Extra Sauce, Student Discount | 2250 KZT |
| 2 | Burger with Regular Discount | 1500 KZT |

These are manual functional test scenarios. Their expected results should be compared with the actual program output.

## Team Members and Contributions

| Team Member | Responsibilities |
|---|---|
| Zhannur | Factory Pattern and Decorator Pattern |
| Aiym | Strategy Pattern and Observer Pattern |
| Balnur | Builder Pattern and Facade Pattern |

Project integration, testing, documentation, and final presentation are collaborative team activities.

## Conclusion

The Restaurant Ordering System demonstrates how six design patterns can work together in a Java application.

By separating object creation, functionality extension, discount calculation, status notification, and order management, the system becomes easier to understand, maintain, and extend.

**Academic Project - Java Design Patterns**
