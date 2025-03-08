Man and Person Proxy

This project demonstrates the use of Java Reflection and Proxy Pattern to create dynamic proxy instances of the Person interface. The Man class implements the Person interface and provides methods to introduce a person, say their age, and mention where they are from. A Proxy is used to intercept method calls and print an additional message before delegating the method call to the original Man instance.

🔹 Project Overview

This project demonstrates how to use Java's dynamic proxy functionality to intercept method calls of an object at runtime. The proxy class implements the Person interface and delegates the actual method calls to the Man class, allowing for the introduction of custom behavior (like printing "Hi" before the actual implementation of the method).

🔹 Features

Proxy Pattern Implementation – Using Java’s Proxy.newProxyInstance to create a proxy for the Person interface.
Reflection – Using reflection to inspect and modify the behavior of objects at runtime.
Method Interception – The proxy intercepts method calls, adding extra functionality before calling the actual method in the Man class.
Customizable Behavior – The PersonInvocationHandler is used to customize method behavior, allowing the proxy to print additional messages.
🔹 Technologies Used

Java 17
Proxy Pattern
Reflection API
🔹 How It Works

1️⃣ Create a Man instance with properties like name, age, city, and country.
2️⃣ Create a proxy for the Man object that implements the Person interface.
3️⃣ The proxy intercepts method calls and executes custom logic (e.g., prints "Hi" before introducing the person).
4️⃣ The actual methods (like introduce, sayAge, and sayWhereFrom) are called from the original Man instance after the proxy logic.

🔹 Example Usage

Here’s how the project works:

Man mohan = new Man("Mohan", 20, "Patna", "India");

// Create the proxy
Person proxyMohan = (Person) Proxy.newProxyInstance(
    mohan.getClass().getClassLoader(),
    mohan.getClass().getInterfaces(),
    new PersonInvocationHandler(mohan)
);

// Call methods on the proxy
proxyMohan.introduce(mohan.getName());
Output:
Hi
My Name is Mohan
🔹 Setup Instructions

1️⃣ Clone the repository

git clone https://github.com/Abhinav-raj-100/man-person-proxy.git
cd man-person-proxy
2️⃣ Compile and run the project

javac Man.java Person.java App.java PersonInvocationHandler.java
java App
Let me know if you need any modifications or additions! 😊











Search

