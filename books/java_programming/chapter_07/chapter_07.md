Chapter 07 : Object Oriented Programming
========================================

> 🟢 Object Oriented Programmng is a programming rules where common bulding block of programming is object.

A object has two thing : 
1. State
2. Behavior.

## Adventage of object oriented programming
Here is adventage of object oriented programming : 

1. This system is very modular. Because all object work differently each other. That's why make them differently.
2. This system make the component reusable.
3. Maintenance is easy.
4. Easy to add new feature.

A object oriented programming based on three concept : 
<details>
<summary>1. Encapsulation</summary>
This way object hide the property or data and method from outside.
</details>

<details>
<summary>2. Inheritance </summary>
This way a class inherit the others class method and feilds.
</details>

<details>
<summary>3. Polymorphism </summary>
A object can various form in different time by polymorphism.
</details>

<hr />

## Application of Object Oriented Programming

**Here details about three important relation between two object :**

<details>
<summary>Composition</summary>

Think about two object `a` and `b`. If `a` is a independed object where `b` is depened on `a`. This type of relation called composition.

<br />

![Composition Relation](./asset/Composition_Relation.png)
</details>

<details>
<summary>Aggregation Relation</summary>

Think about two object `a` and `b`, `a` and `b` are depended. `b` can be relation with one or more `a` type of object. This type of relation called aggregation relation.

![Aggregation Relation](./asset/Aggregation_Relation.png)

</details>

<details>
<summary>Inheritance Relation </summary>

If a object inherit some feature from another object, this type of relation called inheritance.

</details>

#### ArrayList Class
```java
import java.util.ArrayList;

this is a dynamic array work like a list.

// syntax to create array : 
ArrayList<type> objectName = new ArrayList<type>();

// Example : 
ArrayList<int> objectName = new ArrayList<int>();

// add item using add method
objectName.add(Item);

// access item using get method
objectName.get(index);

// change the item set method
objectName.set(index,item);

// remove item using remove method
objectName.remove(index);

// clear the list using clear method
objectName.clear();

// access size using size method
objectName.size();
```

#### [Here is a simple mini project using class and object.](./shopingProgram/Demo.java)


<hr />

## Encapsulation

> 🟢 Encapsulation means hide the field or property from outside the class.



For encapsulation java use four type of access modifier. Here is the list : 

| Modifer      |  Class    | Package    | Sub Class | Others |
|--------------|-----------|------------|-----------|--------|
| `public`     | yes       | yes        | yes       | yes    |
| `protected`  | yes       | yes        | yes       | no     |
| `default`    | yes       | yes        | no        | no     |
| `private`    | yes       | no         | no        | no     |      


> 🔵 **getter* is a method which use for accessing private or protected field.

> 🔵 **setter* is a method which use for changing value of `private` or `protected` field.

**Important things about encapsulation :**

- Always use `private` and `protected` modifier before the class field.
- Define the **getter** and **setter** for accessing the **private** or **protected** field.
- If method dose not need to accessing outside of the class then use `private` keyword for defining the method.
- `private` method and field are not inheritable. So it not possible ot overrite the private method and field.


<hr />

## Abstraction

> 🟢 Abstraction means simplification the complex things. Another way, hide the complex thing from user and provide the functionality to user what is needed.

<hr />

## Inheritance

> 🟢 Inheritance means a class inherit another class, first class called deribed class or sub class or child class and other class is called super class or parent class or base class.


**Syntax of inheritanc in simple way :**
```java
class SubClassName extends SuperClassName{
    // use extend keyword for inherit the class

    // public method and variable which are declare in subclass are available in 
    // this class.
}
```

**[Here is the simple inheritance example](./InheritanceExample/InheritanceDemo.java)**
**[Another example to see this package.](./InheritanceWithBicycle/BikeDemo.java)**

> 🟢 Sub class did not inherit super class constructor. If super class has a constructor then must be super class constructor in child class constructor by `super` keyword.

**Syntax to called super class constructor :**
```java
class SubClassName extends SuperClassName{
    public SubClassName(){
        // call the super class constructor
        super(/*paramter list if has*/);


        // super must be called first then do other things.
    }
}
```

**Rules of using constructor with inheritance :**
1. If any class has no constructor then java attach default constructor which is not get any argument.
2. If class has constructor then java dose not attach any constructor by default.
3. If parent and child class has no constructor then java attach default constructor in parent class. Then attach another default constructor in child class and call the parent class constructor. Here is thinks like : 

```java
public class A{

}

public class B extends A{
    public B(){
        super(); // call the defualt constructor.
    }
}
```

4. `super` keyword can called two way. With argument and without argument. If parent class has default constructor then `super` keyword called without argument. If parent class has any constructor with argument then child class can called `suepr` keyword with argument.

5. If parent class has any constructor with argument then child class must be define a constructor which called the parent constructor by `super`.

6. If parent has more than one constructor and one is default constructor or without argument contructor then there is no requirement to called constructor by `super` keyword in child class.

> 🟢 A constructor can not give any argument then this type of constructor called **no-argument constructor or default constructor**.


### Final Class

> 🟢 A class which is define with `final` keyword then this type of class dose not extendsable.

**Example :**
```java
public final class Password{
    private char[] hash;

    public Password(char [] hash){
        this.hash = hash;
    }

    // some useful method.
}

// this class is non inheritable.
```

<hr />

### Method Overriding

> 🟢 Overload a super class method in child class with `@Override` annotation called method overriding. This method replace the superclass method.

**Syntax of method overriding :**
```java
public class SubClassName extends SuperClassName{
    // override the method
    @Override
    access_modifier return_type overridingMethodName(/*parameter list*/){
        // statement(s)
    }
}
```

**Some rules of method overriding in java :**
1. Super class method parameters and sub class method parameters must be same type and order.
2. Sub class method return type and super class method return type must be same or any sub class. It possible to use sub class instead of super class. Same thing with variable. Super class variable can store sub class variable.
**Example :**
```java
public class Shape{
}

class Circle extend Shape{
}

class Triangle extend Shape{
}
```

```java
public class ShapeFactory{
    public Shape newShape(String type){
        return new Shape();
    }
}

class CircleFactory extends ShapeFactory{
    @Override
    public Circle newShape(String type){
        return new Circle();
    }
}
```

3. Static method can not overrideable.
4. If a method declare with `final` keyword then this method can not be override.
5. `private` method can not be overrideable.
6. Override mtheod can throw run time exception.
7. Constructor not overridable.

<hr />

### @Override Annotation

> 🟢 `@Override` annotation used before the method for override them. This is not required to override the method but it's use for safe to override.

### super keyword 

> 🟢 If need to called parent class constructor and parent class method and accessing parent field then use `super` keyword.

**Syntax of calling constructor, method and accessing parent field via `super` keyword :**
```java
public class SubClassName extends SuperClassName{
    public SubClassName(/* parameter list */){
        // call parent class constructor
        super(/* argument list */);

        // call parent class method
        super.parentClassMethodName(/* arguments list */);

        // accesing parent field
        super.fieldName;
    }
}
```

### final

> 🟢 A method with `final` keyword then this method called final method. This type of method is not overridable.



<hr />

## Polymorphism

> 🟢 Something which can capabol to transform many form in various time called polymorphism in oop. Some part of program in oop can capable to change form based on time.

