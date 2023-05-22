Chapter : Object and Class
===========================

## Theory About Object

> 🟢 In object oriented programming, Object is something like that which can capable to execute spacify task and has spacify state.

**Main characteristics of object in java :**
- It capable execute spacfify task.
- Can holds own state.
- It's indepened.

<hr />

## Theory About Class

> 🟢 A class is a blueprint of object which is use for create a object. It cantains details about object should be.

**Important note about class :**
- Class is **reference** type. Also it's called **user defined** type.
- It's not possible to create object without creating class.

<hr />

## The Elements of Object Oriented Programming
A java file extension is **.java**. This type of file contains : 

- Package Declaration
- Import Statement
- Type Declaration
- Fields
- Methods

### Package

> 🟢 In java, package is like a container which contains classes, interfaces etc. Package work like folder, folder can contains lots of file and also contains another folder too.

> 🟤 Package declaration is not required to run java program, it's help to organize the code.

**Rule of package declartion :**
- Package must be declare start of the file.
- Use `package` keyword to declare package.
- Package name should be write in lowercase english character.
- Various software company write package with their name in reverse way. Example : Domain example.com write like `package com.example.package;`

### Import
The second thing in the java file is import statement. 

> 🟢 `import` keyword use for include other java class in the program. 

**Syntax of import :**

```java
import package.name.ClassName;

// example
import java.util.Scanner;
import java.util.Arrays;
```

### Type Declaration
Third thing in the java program is **Type Declaration**. It's should be class, enum or interface.

**Syntax of Class Declaration :**

```java
class ClassName{
    // method and fields
}
```

**Syntax of Public Class Declaration :**
```java
public class ClassNameAccordingToFileName{
    // methods and fields
}
```

## Fields

> 🟢 A class work with some data. Which can use to store state about class. This type of data called **fields**.

**Example of class fields :**
```java
access_spacifier type field_name;
access_spacifier type field_name = value;
type field_name = value; // here access spacifier value is private by defualt.

// example
class DemoClassName{
    // fields name
    private char empty_box = '';
    String Name;
}
```

## Methods

> 🟢 Method like a function, which capable to execute some task. But difference between method and function in java is, method asociat with object and class.

**Syntax of declare method in java :**
```java
class ClassName{
    access_spacifier return_type method_name(argument_list){
        // task to perform
    }

    return_type method_name(argumetn_list){
        // task to perform
        // by default access spacifier is private
    }

    static return_type method_name(argumetn_list){
        // static type method asociat with only class not with object
        // this type of method can called without creating object by help of class name.
    }
}
```

> 🟢 Java program start with main method. It is a entry point of java program.

**Syntax of main method in java :**
```java
class ClassName{
    public static void main(String args[]){

    }

    // it same too
    public static vid main(String []args){

    }
}
```
#### [Make a simple tic tac tie game with class, object, methods and fields.](./TicTacToe.java)

<hr />

## Java Method

***Syntax of method declaration :***

```java
public class ClassName{
    access_modifier returnType methodName(List of Parameters){
        // method body
    }
}
```

#### Access Modifier :

> 🟢 Access modifier set the limitation of the method where the method can be called.

**There are three access modifier :**
- public
- private
- protected

🟢 A method which is public, is accessable from any class, where private and protected are not.

#### Return Type

Return type mean what method return after the complating task, if method dose not return anything in that case use `void` keyword.

#### Method Name
This is just a method name. Java follow the camelCase convention for naming method.

#### List of Parameters
If method take a paramers then, write them inside the first bracket sperate by comma, with their type.

#### List of Exceptions
Method can be throw exception one or more. If method can throw exception then write `throw` keyword after the parentheses.

#### Method Body
It contains statements of method which is execute after calling the method. It start opening culry bracess '{' and end with endin curly bracess '}'.

### Requiremend of create method is : 
- Return Type
- Method Name
- Method Body

### Common mistake to write method for new comer.
- If return type is `void` then there is no need to write `return` statement.
- Not forget the return statement.
- It's not possible to write method inside the another method in java.


### Parameter and Argument

> Write variables inside the parentheses when define the methon called **parameters**.

> Called the method with variables, here variables are **arguments**.

## Object Instantiation

> 🟢 When create a object using class called object instantiation.

Three step to create a object from a class is : 
- Declaration.
- Instantiation.
- Initialization.

***Syntax to declare and initialization a object :***
```java
ClassName objectName; // declare a object
// by default it store null value

// initialization :
objectName = new ClassName();

// declare and initialization at same time : 
ClassName objectName = new ClassName();

// call the constructor with class name called object instantiation.
```

***Here is example of create object and work with it :***
- [Create Bicycle class and make object.](./Bicycle.java)
- [Create ComplexNumber class and make object and do some operation with object](./ComplexNumber.java)

<hr />

## Method Overloading

> 🟢 Define two or more method with same name, but return type and argument list and types are different, that's called method overloading.

***Method overloading parameters are three way to can be different from other :**

- Parameters numbers are different.
- Parameters data type are different each other.
- Parameters numbers and type are same but their order are different.

#### [Example of method overloading.](./Calculator.java);

## Object

> 🟢 We create object using `new` keyword, something dose this job to create object, this thing called **constructor**.

**Characterstic of constructor in java :**

- Constructor and class name are same.
- Constructor is one kind of method which has no return type.
- Contrucotor create object when instantiate a object with `new` keyword.
- If a class without construcot then java compiler add default constructor for that class.
- Constructor can be overload.

**Syntax of define constructor :**
```java
public class ClassName{
    ClassName(){ // constructor
    
    }
}
```

**Example of using constructor :**
- [Create person class to store about person.](./Person.java)
- [Create student class to store about student.](./Student.java)

## Constructor chainging
When call a constructor from inside the another constructor in spacific way called constructor chaining. In that case use `this` keydword to called constructor from another inside of constructor. Here is example : 

**Here is the example :**
- [Here is the example of constructor chaining.](./ChainPerson.java)
- [Create stack using class.](./CharStack.java)
- [Check is brackets are balanced are not using stack](./BracketBalancedChecker.java)


#### StringJoiner
```java
Class StringJoiner, java.util.StringJoiner;

use : 
Use joining the string using various type of delimeter.

prototype :
StringJoiner(sperator,prefix,suffix);

sperator : which is user for between two item in string joining.
prefix : add prefix
suffix : add suffix

StringJoinerObject.add(String ob) : add string

We can print StringJoiner object with System.out.println and System.out.print.
```



## Object Reference 

> 🟢 When creating object with `new` keyword, and store it in a variable then the variable could not store the object, it store the reference of the object. 


```java
ClassName object = new ClassName();

// here object variable store the reference.

ClassName anotherObject = object;

// here anotherObject and object store the same reference of a object.
```

#### [Here is testing reference of object.](./ReferenceTest.java)

## Enum

***Syntax of declaration enum :***

```java
public enum EnumName{ ValueOne, ValueTwo, ValueThree, ValueFour....};

// access enum value
EnumName enumObject = EnumName.ValueName;
```

