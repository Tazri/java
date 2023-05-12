Chapter 02: Common Programming Problem
======================================

## Simple Java Program
**Here is the simple Java Program :**
```java
class Hello_World{ // this is the class
    public static void main(String []args){
        System.out.println("Hello, World!");
    }
}

/*
Output : 
Hello, World!
*/
```

> 🔴 Java program start from main class.

**🔴 The main method syntax :**
```java
// must be main method declare as below other wise throw error.
public static void main(String []args);
```

<hr />

## Scanner
> 🟢 `Scanner` class use for take input from user from console. It is inside the `java.util`.

**Syntax of declare Scanner for input from user :**
```java
Scanner input = new Scanner(System.in);

// close the scanner end of the code otherwise it's throw a resource leak warning.
input.close();
``` 

### Some Scanner Method to take input from user.    
- `nextInt()` -> Get integer number.
- `nextDouble()` -> Get float type number.
- `next()` -> Get text.

**Exmaple of take input from user :**
```java
import java.util.Scanner;

class Sum {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = input.nextInt();

        System.out.println("Enter another number : ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("Sum : "+sum);

        input.close();
    }    
}

/*
Enter a number : 
10
Enter another number : 
20
Sum : 30
*/
```

<hr />


## Identifier

> *Identifier* is name of something like class, package, method etc.

**Rules of named identifier :**
1. Identifier name can be has character, digit, underscore(_) and dollar ($) symbol.
2. Identifier dose not start with number.
3. Using reserve keyword as indentifier is not allowed.
4. Any kind of length.

> 🔴 Java is case sensitive language.

<hr />

## Variable

> 🟢 Something which take a space in memory and capable to store data and it can be change letter called variable.

Syntax of declare variable : 
```java
datatype variableName;
datatype variableNameOne, variableNameTwo;

// example
int a;
int a,b;

// value assignment
datatype variableName = value;

variableName = value;
```

Here some data type : 
- short
- int
- long
- float
- double
- byte
- char
- boolean

### Variable Naming Convention in Java
- Generally naming variable using camelCase style in java.
- Use meaning full name.
- Usally variable name are noun in Java.


Some variable naming convention : 
- camelCase -> variableName
- PascalCase or UpperCamelCase -> VariableName
- snake_case -> variable_name.


<hr />

## Comment
**Syntax of commenting in java : **
```java
// this is a single line comment.

/* 
this is a
multi line
comment
*/
```

**Syntax of java doc comment :**
```java
/**
 * Harmonic series is the divergent infinite series.
 * This method will return sum of a harmonic series up
 * to nth elements.
 * 
 * @param n the length of the sum
 * @return returns the sum of the harmonic series
 * /

public double harmonic(int n){
    double sum = 0.0;
    for(int i = 1;i <= n;i++){
        double  divide  = deivide(1.0,i);
        sum = add(sum,divide);
    }

    return sum;
}
```

<hr />

## Practice
1. [Practice 01](./practice/Calculate.java)
2. [Practice 02](./practice/Smily.java)
3. [Practice 03](./practice/Pattern.java)
4. [Practice 04](./practice/JavaPattern.java)
5. [Practice 05](./practice/AreaRectangle.java)
6. [Practice 06](./practice/AreaHexagon.java)
7. [Practice 07](./practice/TwoPoint.java)
8. [Practice 08](./practice/CalculatePoints.java)
9. [Practice 09](./practice/Volume.java)
10. [Practice 10](./practice/ConvertDegree.java)

<hr />

**Link to Go :**

#### [< Chapter 1 : Java Programming Language](./../chapter_01/chapter_01.md)
#### [Back to table of Index](./../Note.md)
#### [Chapter 3 : Data Type, Operator and Expressionm >](./../chapter_03/chapter_03.md)

#### [Back to READEME.md >](./../../../README.md)