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

***Syantax of enum constructor :***
```java
enum EnumName{
    ValueName(value),
    ValueName(value),
    ....
    ValueName(value);

    access_spacifier type fieldName;
    
    // constructor
    private EnumName(parameterList){
        // statement
    }
}
```

**Example of enum constructor :**
- [Level](./Level.java)
- [Create enum for pizza size](./Size.java)

**Important information about enum :**
- Enum is a one kind of class which is extends the `java.lang.Enum` class. Enum dose not extendable, but enum can implement interface.
- Enum is type safe. Mean that's dose not allow to other value to assining in enum.
- `==` and `equals()` method use for compare enums.
- It dose not possible to create enum instance using `new` keyword.

<hr />

## Null
A object dose not store anything then it store `null` value. If try to access null value then java throw `NullPointerException` exception.


## Static Variable, Constant and Method

> 🟢 when decalare a variable and method with `static` keyword then the method and keyword are not copy in every object. I'ts associate with only class not object. 

> 🟢 If declare with variable with `final` then this variable turn into constant. In java convention constant write with uppercase. `final` variable are not support more than one time initialization.

> 🟢 Static method only can change the static field where non static method can change static and non static field. Also static method can only use static variable.

**Examples :**
- [Example of static variable.](./Circle.java)
- [Example of static method.](./CalculatorStatic.java)
- [Another exaple of static field.](./CricketPlayer.java)

<hr />

## Practice

### 1. Difference between class and object ?
`And :` <br />

**Different between class and object :**

| class                     | Object                     |
|---------------------------|----------------------------|
| Class is a blue print of object. | Object is instants of class. |
| Class is not independed entity.  | Object is a indepened entity. |
| Class use to create object.      | Object use to hold state and behavior. |
| Class define what object should be. | Object execute task and chane state what class define. |


### 2. What type of elements has a java program ?
`Ans :` <br />

**A java program hold :**
- Package declaration.
- Import package statement.
- Type declaration. ( class, enum and interface)
- Methods.
- Fields.

### 3. What is package ? How to declare it ?
`Ans :` <br />

**Package** is one kind of folder which hold java class, enum, interface also hold others package. It use for organize the java classes, enums and interfaces. Here is syntax of declare package : 

```java
package package_name_similar_to_folder_name;
```

### 4. How to write java method ? What kind of element has java method ?
`Ans :` <br />

**Syntax of method declaration :**
```java
class ClassName{
    // non-static method declare
    accessModifier returnType methodName(parameterList){
        // statemenet(s)
    }

    // static method declare
    accessModifier static returnType methodName(parameterList){
        // statement(s)
    }
}
```

### 5. What is method overloading ? Write it with example ?
`Ans :` <br />

Method overloading is, define a method with same name in the same class with different type of parameter list or different type of parameter or different parameter type order called method overloading.

**Here is the example of method overloading in java :**
```java
class Calculator{
    private int add(int a,int b){
        return a + b;
    }

    // overload the method
    private int add(int a,int b,int c){
        return a + b + c;
    }
}
```

### 6. How to create a object ?
`Ans :` <br />

**Here is the syntax of create object :**
```java
// create object
ClassName objectName = new ClassName();

// if Class has parameter then
ClassName objectName = new ClassName(ArgumentList..);
```

### 7. What is constructor ?
`Ans :` <br />

**Constructor :** Construcot is thing which is define the object, and take memory for object when declare the object. If a class has no object then compiler add by default constructor for the object.

**Difference between constructor and method :**

| Constructor        | Method |
|-------------------|--------|
| Constructor define the object. | Method is behavieor of the object. |
| Constructor has no return type. | Method has return type.|
| Constructor name and class name always same. | Class name ans method name are not same. |
| Constructor called when create the object. | Method called when it call. |
| Constructor called one time. | Method called when it necessary to call, and call it as much time it needed. |

<hr />

## Navigator

#### [< Chapter 5 : Array](./../chapter_05/chapter_05.md)
#### [Back to table of Index](./../Note.md)
#### [Chapter 7 : Object and Class >](./../chapter_07/chapter_07.md)

#### [Back to READEME.md >](./../../../README.md)