# PsuedoCode Training Repository  

This branch documents my **Week 1 & Week 2 learnings** in **PseudoCode Training**, focusing on **Java OOPS, Data Structures & Algorithms (DSA), and Java Generics & Collections**.  

---

## 📅 Week 1 – Object-Oriented Programming (OOPS)  
- ✅ Classes & Objects  
- ✅ Constructors & Overloading  
- ✅ Inheritance (IS-A, HAS-A relationships)  
- ✅ Polymorphism (Compile-time & Runtime)  
- ✅ Abstraction (Abstract class, Interface)  
- ✅ Encapsulation & Access Modifiers  
- ✅ Exception Handling Basics  

### 🔹 Example – OOPS (Polymorphism)
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Runtime Polymorphism
        a.sound(); // Output: Dog barks
    }
}

```



## 📅 Week 2 – DSA, Generics & Collections
# 🔹 Data Structures & Algorithms
- ✅ Time & Space Complexity

- ✅ Recursion problems

- ✅ Searching (Linear, Binary Search)

- ✅ Sorting (Bubble, Insertion, Selection, Merge, Quick)

- ✅ Linked List (Singly, Doubly, Circular)

- ✅ Stack & Queue (Implementation & Applications)

- ✅ Trees & Binary Search Trees
