# Strategy Design Pattern

## Overview

The Strategy pattern allows the behavior of a class to change at runtime without modifying the class itself.

In this example:

- **NotificationService** is the Context.
- **NotificationStrategy** defines the strategy interface.
- **EmailNotificationStrategy** and **SmsNotificationStrategy** are concrete strategies.

## Design

### Strategy

```java
public interface NotificationStrategy {
    void send();
}
```

The strategy interface defines a common contract for all notification algorithms.

---

### Concrete Strategies

```java
public class SmsNotificationStrategy implements NotificationStrategy {

    @Override
    public void send() {
        System.out.println("SMS notification");
    }
}
```

Each concrete strategy provides its own implementation of the notification behavior.

---

### Context

```java
public class NotificationService {

    private final NotificationStrategy strategy;

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send() {
        strategy.send();
    }
}
```

The `NotificationService` does not know how notifications are sent. Instead, it delegates the task to the injected strategy.

## Class Diagram

```
                    NotificationStrategy
                            ▲
                ┌───────────┴───────────┐
                │                       │
EmailNotificationStrategy    SmsNotificationStrategy
                ▲                       ▲
                └───────────┬───────────┘
                            │
                  NotificationService
```

## Why Use the Strategy Pattern?

Without the Strategy pattern, a service often contains conditional logic.

```java
public void send(String type) {
    if (type.equals("EMAIL")) {
        // Send email
    } else if (type.equals("SMS")) {
        // Send SMS
    }
}
```

As more notification methods are added, the service becomes harder to maintain.

Using the Strategy pattern, each algorithm is placed in its own class.

```
NotificationService
        │
        ▼
NotificationStrategy
    ├── EmailNotificationStrategy
    ├── SmsNotificationStrategy
    └── PushNotificationStrategy
```

Adding a new notification method only requires creating another strategy class. The existing code remains unchanged.

---

## Benefits

- Encapsulates algorithms into separate classes.
- Eliminates large conditional statements.
- Follows the Open/Closed Principle.
- Makes algorithms interchangeable.
- Promotes composition over inheritance.

---

## Design Pattern Mapping

| Strategy Pattern Role | Project Class |
|-----------------------|---------------|
| Strategy | `NotificationStrategy` |
| Concrete Strategy | `EmailNotificationStrategy`, `SmsNotificationStrategy` |
| Context | `NotificationService` |
| Client | `Main` |
