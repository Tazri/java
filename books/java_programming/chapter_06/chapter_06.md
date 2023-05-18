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