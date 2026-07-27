# Bridge Design Pattern

## Overview

The Bridge pattern separates an abstraction from its implementation.

In this example:

- **Notification** represents the abstraction.
- **Provider** represents the implementation.
- Different notification types can work with different providers without creating a large number of classes.

## Design

### Abstraction

```java
public interface Notification {
    void send();
}
```

Concrete abstractions:

- EmailNotification
- SmsNotification

These classes define the type of notification while delegating the delivery implementation to a `Provider`.

---

### Implementor

```java
public interface Provider {
    void processNotification();
}
```

Concrete implementation:

- AwsProvider

The provider contains the implementation responsible for processing the notification.

---

## Class Diagram

```
                 Notification
                      ▲
          ┌───────────┴───────────┐
          │                       │
 EmailNotification         SmsNotification
          │                       │
          └───────────┬───────────┘
                      │
                 Provider
                      ▲
                      │
                AwsProvider
```
---

## Why Use the Bridge Pattern?

Without the Bridge pattern, supporting multiple notification types and providers would require creating a class for every combination.

Example:

```
EmailAwsNotification
EmailTwilioNotification
EmailFirebaseNotification

SmsAwsNotification
SmsTwilioNotification
SmsFirebaseNotification
```
---

## Benefits

- Decouples abstraction from implementation.
- Follows the Open/Closed Principle.
- Promotes composition over inheritance.
- Reduces class explosion.
- Allows runtime selection of implementations.

---

## Design Pattern Mapping

| Bridge Pattern Role | Project Class |
|---------------------|---------------|
| Abstraction | `Notification` |
| Refined Abstraction | `EmailNotification`, `SmsNotification` |
| Implementor | `Provider` |
| Concrete Implementor | `AwsProvider` |