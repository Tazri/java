Chapter 07 : Object Oriented Programming
========================================

> 🟢 Object Oriented Programmng is a programming rules where common bulding block of programming is object.

A object has two thing : 
1. State
2. Behavior.

Here this chapter cover : 

- [Adventage of object oriented programming](#adventage-of-object-oriented-programming)
- [Application of object oriented programming](#application-of-object-oriented-programming)
- [Encapsulation](#encapsulation)
- [Abstraction](#abstraction)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)
- [Up Casting and Down Casting](#up-casting-and-down-casting)
- [Abstract Class and abstract method](#abstract-class-and-abstract-method)
- [Interface](#interface)
- [Multiple Inheritance](#multiple-inheritance)
- [Practice](#practice)
- [Navigation](#navigation)

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

> 🟢 Something which can capable to transform many form in various time called polymorphism in oop. Some part of program in oop can capable to change form based on time.

> ● Polymorphism come from Greek word "poly" and "morph". Meaning "multiple" and "Form".


> 🔴 If Parent Class variable store sub sub class vairable and called the override method from parent class variable then it called sub class method.

```java
class Parent{
    public void say(){
        System.out.println("Hello, from parent.");
    }
}


class Child extends Parent{
    @Override // override the say method
    public void say(){
        System.out.println("Hello, from Child.");
    }
}

public class Main{
    public static void main(String args[]){
        Parent parentVariable = new Child();

        parentVariable.say(); // it called the child method.
    }
}
```

> 🟢 It possible to pass sub class variable in function parater instead of parent class. 

```java
functionName(subclassVairable); // where function argument type ParentClass variable.
```

> 🟠 If class name with package as string it called **Fully qualified name**.


**Point to be noted :**
- It possible to store subclass into super class reference.
- In that case called the method, then it call super class method.
- If override the method by `@Override` keyword from sub class then it called sub class method in runtime.

<hr / >

## Up Casting and Down Casting

> 🟢 When store a different type of object into variable called casting. There two type of casting.

- Up casting (implicit). Store child object into parent reference.
- Down casting (explicit). Cast the parent type to child type. In that case make sure that Variable can cast to child object by `instanceof` keyword.

**Example of Up casting :**
```java
ParentClass objectName = new ChildClass();
```

**Example of Down casting with safe way :**
```java
if(parentObject instanceof ChildClassName){
    ChildClassName objectName = (ChildClassName) parentObject; // cast the down.
}
```

<hr />

## Abstract Class and Abstract method

> 🟢 A class starting to write with `abstract` keyword called abstract class. This type of calss is not instantiatable. This type of class only use for inheriting.

Here is example of declare abstract class :
```java
abstract class ClassName{

}
```


> 🟢 A abstract method is a method in abstract class, declare with `abstract` keyword without defination that what to do, just write what it return and what it takes. This type of method define in child class with `Override` keyword. Here is example : 


```java
abstract class ClassName{
    abstract return_type abstractMethodName(/** arguments */);
    // no defination this method. It will override in child class.
}
```

**Rule of abstract class and method :**
1. Abstract class are not instantiatable. Dose not create abstract class object using `new` keyword.
2. Abstract class can be has constructor.
3. Abstract class and abstract method can not be declare with `final` keyword or as a final.
4. A abstract class can be has abstract method or not.
5. Abstract method only used in abstract class.
6. It's necessary to implement all abstract method in sub class.
7. It can be happen that a sub class of regular class can be abstract class.


> 🟣 Extensibility - the ability to be extended or stretched.


> 🟢 A abstract class with only abstract method called **pure abstract class.**

<hr />

## Interface

> 🟢 **Interface** is a one kind of abstract class which is use for define the class behavior. Describe the method what it take and what it return but do not define the body. Method body are define in sub class which is implement this.


> 🟢 It possible to create interface variable but not to possible create interface instance. The interface vairable store a object which object class implement's the interface.

**Example of daclare interface :**
```java
public interface PureAbstractClass{
    void method1();
    void method2();
    void method3();
}
```

**Example of implements inteface :**
```java
public class ClassName implements interface{
    /* implementing */
}
```

**Some rules for interface :**
1. A interface method always public and abstract. So not necessary to use `abstract` and `public` keyword in interface.
2. Interface vairable are constant and it is `public static`. If not use these keyword, compile automatic attach those keyword.
3. Interface method can not be final.
4. A interface can extend another interface.

```java
interface A{
    void method1();
    void method2()j;
}

interface B extends A{
    void method3();
    void method4();
}
```

5. Java class can implement multiple interface.

```java
public class ClassName implements interface1, interface2, interface3{

}
```

6. A interface can be without method.
7. A inteface can be has private static or default method.

<hr />

## Multiple Inheritance

> 🟢 Java dose not support multiple inheritance because it create a diamond problem.

<hr />

## Practice

<details>
    <summary>Practice 1 : BMI</summary>

1. [BMI Class](./practice/practice_1_bmi/BMI.java)
2. [Testing Here](./practice/practice_1_bmi/Main.java)
</details>

<details>
<summary>Practice 2 : Calculate area</summary>

1. [Area Calculator class which use  to calculate area of circle, tirangle, rectangle and cylinder.](./practice/practice_2_shape/AreaCalculator.java)
</details>

<details>
<summary>Practice 3 : Author and Book</summary>

1. [Author Class](./practice/practice_3_author_and_book/Author.java)
2. [Book Class](./practice/practice_3_author_and_book/Book.java)
3. [Test Class](./practice/practice_3_author_and_book/TestApp.java)
</details>

<details>
<summary>Practice 4 : Predict the output</summary>

1. [Animal Class](./practice/practice_4_analysis/Animal.java)
2. [Horse Class](./practice/practice_4_analysis/Horse.java)
3. [UseAnimal Class](./practice/practice_4_analysis/UseAnimal.java)

Predicted Output : 
```bash
> Inside Animal Version.
```

Output : 
```bash
> Inside Animal Version.
```
</details>

<details>
<summary>Practice 5 : Find the mistake</summary>

1. [Shape class](./practice/practice_5_find_mistake/Shape.java)
2. [Circle class](./practice/practice_5_find_mistake/Circle.java)

The mistake has in circle class, which is that try to override private methdo, which is not possible.
</details>

<details>
<summary>Practice 6 : ATM</summary>

1. [Transision Class](./practice/practice_6_atm/Transision.java)
2. [Account Class](./practice/practice_6_atm/Account.java)
3. [ATM Class](./practice/practice_6_atm/ATM.java)
4. [Main Class](./practice/practice_6_atm/Main.java)


**Sample output of this practice :**
```bash
> ATM going to Start...
> Main Menu <
> 'options' Show Options
> 'enter' -> Log in
> 'create' -> Create account
> 'stop' -> Stop ATM


> Command : create
> Enter new account name : 
Md Tazri
> Enter password : 
thisispassword
> Thanks to create a account, now log your account with the password.

> Command : options
> Main Menu <
> 'options' Show Options
> 'enter' -> Log in
> 'create' -> Create account
> 'stop' -> Stop ATM

> Command : check

> Your option is not valid

> Command : enter 
> Enter your user name please : 
Md Tazri
> Enter your password please : 
thisispassword
> Welcome Md Tazri
> Your current balance : 100


> Main Menu <
> 'options' Show Options
> 'check' -> Check Balance
> 'withdraw' -> Withdraw
> 'deposit' -> Depsoit
> 'exit' -> Exit
> 'stop' -> Stop ATM

> Command : check
> current blance : 100

> Command : deposit
> Deposit amount : 5030200
> Transision Details <
> Account Name : Md Tazri
> Status : Successfull
> Desposit : 5030200
> Balance : 5030300
> Transition Successfull :)

> Command : withdraw 
> Withdraw amount : 3234563
> Password : thisispassword
> Transistion Details <
> Account Name : Md Tazri
> Status : Successfull
> Widtraw : 3234563
> Balance : 1795737
> Transition Successfull :)

> Command : check
> current blance : 1795737

> Command : exit
> Thanks to use our service. :)

> Command : options
> Main Menu <
> 'options' Show Options
> 'enter' -> Log in
> 'create' -> Create account
> 'stop' -> Stop ATM

> Command : create
> Enter new account name : 
Ans Anonymo
> Enter password : 
anonymopassword
> Thanks to create a account, now log your account with the password.

> Command : enter
> Enter your user name please : 
Ans Anonymo
> Enter your password please : 
anonymopassword
> Welcome Ans Anonymo
> Your current balance : 100


> Main Menu <
> 'options' Show Options
> 'check' -> Check Balance
> 'withdraw' -> Withdraw
> 'deposit' -> Depsoit
> 'exit' -> Exit
> 'stop' -> Stop ATM

> Command : check    
> current blance : 100

> Command : deposit 
> Deposit amount : 5403200
> Transision Details <
> Account Name : Ans Anonymo
> Status : Successfull
> Desposit : 5403200
> Balance : 5403300
> Transition Successfull :)

> Command : withdraw 
> Withdraw amount : 432
> Password : anonymopassword
> Transistion Details <
> Account Name : Ans Anonymo
> Status : Successfull
> Widtraw : 432
> Balance : 5402868
> Transition Successfull :)

> Command : check
> current blance : 5402868

> Command : exit
> Thanks to use our service. :)

> Command : enter 
> Enter your user name please : 
Md Tazri
> Enter your password please : 
thisispassword
> Welcome Md Tazri
> Your current balance : 1795737


> Main Menu <
> 'options' Show Options
> 'check' -> Check Balance
> 'withdraw' -> Withdraw
> 'deposit' -> Depsoit
> 'exit' -> Exit
> 'stop' -> Stop ATM

> Command : check
> current blance : 1795737

> Command : exit
> Thanks to use our service. :)

> Command : stop


> Terminate <
```

</details>

<hr />


## Navigation

#### [< Chapter 6 : Object and Class](./../chapter_06/chapter_06.md)
#### [Back to table of Index](./../Note.md)
#### [Chapter 8 : Exception Handling >](./../chapter_08/chapter_08.md)

#### [Back to READEME.md >](./../../../README.md)