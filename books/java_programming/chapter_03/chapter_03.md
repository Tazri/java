Chapter 03: Data Type, Operator and Expression
==============================================

Here this file contains : 
- *[Data Type](#data-type)*
- [Literal](#literal)
- [Overflow and Underflow](#overflow-and-underflow)
- [How Computer Represent Real Number](#how-computer-represent-real-number)
- [String Operation](#string-operation)
- [Oeprator](#operator)
- [Type Conversion and Type Casting](#type-conversion-and-type-casting)
- [Expression, Statement and Block](#expression-statement-and-block)
- [If Condition](#if-condition)
- [Practice](#practice)

<hr />

## Data Type
There are two kind of data type in java : 
1. Primitive Type.
2. Reference Type.

### There are 8 type of Primitive Type
1. Byte (byte) (8 bit)
2. Boolean (boolean) (1 bit)
3. Character (char) (16 bit) (Store unicode character)
4. Short for small integer number (short) (16 bit)
5. integer (int) (32 bit)
6. long for big integer number (long) (64 bit) (Must be use l or L end of the digit.)
7. Float (float) (32 bit) (float can store 7 digit after floating point. Last digit is rounding.)
8. double for big floating point number (double) (64 bit) (double can store 15 digit after floating point. Last digit is rounding)

> 🟢 double data rounded when convertin it in float Example : 

```java
double pi = 3.141592653589793;
float pi = (float) pi; // it will 3.1415927
```

> 🔴 Java is static type language.

**Example to chaning value of data type in illegal way :**
```java
class Example{
    public static void main(String []args){
        int a = 5;
        System.out.println("a = "+a);
        a = 3.4; // throw error
    }
}
```

#### Static Type and Dynamic Type

> 🔵 A **Static type** is type where must be write data type before assign the value in variable.  A variable can not store any other type value except self type value.

> 🔵 A **Dynamic type** is type where not necessary to write data type before assign the value in variable.

### Wrapper Type
If data type name start with capital letter then it called `wrapper type`. Wrapper is one kind of reference type. Here is all wrapper type :

- `Byte`
- `Boolean`
- `Character`
- `Short`
- `Integer`
- `Long`
- `Float`
- `Double`

> 🟢 They all same space in memory like primitive type.

**● Automatic Conversion :**<br />
If primitive type convert to wrapper type or wrapper type convert to primitive type then it's called *Automatic Conversion*. There are 2 type automatic conversion :
1. **●autoboxing :** If primitive type convert to wrapper type or reference type then it called autoboxing.
2. **●unboxing :** If reference type or wrapper type convert to primitive then it called unboxing.

**Here is autoboxing example :**
```java
public class AutoboxingExample {
    public static Integer add(Integer a,Integer b){
        return a + b;
    }
    public static void main(String []args){
        int a = 5;
        int b = 15;

        add(a,b);// here is autoboxing
    }
}
```

**Here is unboxing example :**
```java
public class UnboxingExample {
    public static int add(int a,int b){
        return a + b;
    }
    public static void main(String []args){
        Integer a = 5;
        Integer b = 15;
        add(a,b); // unboxing
    }
}
```

### Default Value of Primitive Data Type
**Here is default value of primitive data type :**

| Datatype | Default Value |
|----------|---------------|
| byte     | 0             |
| short    | 0             |
| int      | 0             |
| long     | 0L            |
| float    | 0.0f          |
| double   | 0.0d          |
| char     | '\u0000'      |
| boolean  | false         |

> 🟤 Default values are depend on variable scope.

<hr />

## Literal
> 🟢 Literal is something which is fixed value in source code. It is built in by compiler.


**Here some important literal :**
```java
int decimalValue = 123;
int hexDecimalValue = 0x7B; // hexa decmal literal start with 0x or 0X.
int binaryValue = 0b1111011; // binary literal start with 0b or 0B.
int octalValue = 0173; // octal literal start with 0.
double doubeScitificValue = 6.67408E-11; // Scintifi value. Here e or E both same for use.
float pi = 3.141f; // end with f or F.
char ch = 'A'; // using single quotaion.
String name = "Anonymo"; // using double quotation.

// using underscore in middle of two digit dose not effect the number
int n = 33_3; // same 333
```

**Converting number example :**
```java
public class NumberSystemConversion {
    public static void main(String []args){
        int number = 1_000_000; // 1 million

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);

        System.out.println("Binary : "+binary); // Binary : 11110100001001000000
        System.out.println("Hex : "+hex); // Hex : f4240
        System.out.println("Octal : "+octal); // Octal : 3641100
    }
}
```

### Escape Character
Here is some important escape character for java : 
| Escape Sequence | Description     |
|-----------------|-----------------|
| \n              | new line        |
| \r              | carriage return |
| \t              | tab             |
| \"              | "               |
| \'              | '               |
| \\\             | \               |

### Text Block 
Here is the Syntax of text block in java :
```java
"""
    This is the text box
    for write multiline string. Like 
    doc string in python.
"""
```

<hr />

## Overflow and Underflow
> ● When value cross the highest limit then it called overflow. If it happen then it counting from lowest value again. Floating point overflow is infinity.

> ● When value cross the lowest limit then it called underflow. If it happen then it counting from hightest value again. Floating point underflow is 0.0.

> 🔴 Every rapper class contain it's hiehest value and lowest value as a property. Here is the example : 

**Example of overflow and underflow :**
```java
public class Overflow_Underflow {
    public static void main(String []args){
        int maxInteger = Integer.MAX_VALUE;
        int mintInteger = Integer.MIN_VALUE;

        System.out.println("maxInteger : "+maxInteger); // maxInteger : 2147483647
        System.out.println("minInteger : "+mintInteger); // minInteger : -214748364

        maxInteger += 1;
        mintInteger -= 1;
        System.out.println("After maxInteger += 1 and minInteger -= 1 : ");

        System.out.println("maxInteger : "+maxInteger); // maxInteger : -2147483648
        System.out.println("minInteger : "+mintInteger); // minInteger : 2147483647

        double minDouble = Double.MIN_VALUE; // minDouble = 4.9E-324
        double maxDouble = Double.MAX_VALUE; // maxDouble = 1.7976931348623157E308

        System.out.println("\nminDouble = "+minDouble);
        System.out.println("maxDouble = "+maxDouble);

        minDouble /= 2;
        maxDouble *= 2;
        System.out.println("After minDouble /= 2 and maxDouble *= 2 : ");
        System.out.println("minDouble = "+minDouble); // minDouble = 0.0
        System.out.println("maxDouble = "+maxDouble); // maxDouble = Infinity
    }
}
```

> ⚫ Every primitive wrapper has `MAX_VALUE` and `MIN_VALUE` static property.

<hr />

## How Computer Represent Real Number
There are two way to computer represent real numer :
1. Fixed Point Representation.
2. Floating Point Representation.

> Fixed Pointer representation is that number represent bit by bit. Like 12.5 = 1100.1000

**There are three part of number as IEEE standard :**
1. Sign Bit.
2. Exponent Bit.
3. Mantissa Bit.

**● Sign Bit :** First bit is sign bit. It is hold a sign is number negative or positive. 0 for positive and 1 for negative.<br/>
**● Exponent Bit:** Float(32 bit.) using 7( 1bit is sign and 7 bit is exponent total 8 bit.) bit as expnent. So Exponent limit is -127 to +127. Use 127 number as biase format. Double (64)  using 11 bit for exponent. Biase is 1023.
**● Mantissa Bit:** It's first bit all time 1 as IEEE standard it called significane bit.. Other bit are always fraction. Signifiane bit is remove because it always 1. That's called normalized Significane. 23 bit is mantissa for 32 bit and 52 bit is mantissa bit for 64 bit.

There are two more type in real number in java :
1. Inifninity. If sing bit is 0 then it called + infinity otherwise it called - inifity.
2. NaN. Mean not a number. It happen when execute 0/0, inifnity-infinity, inifinty * 0 etc.

<hr />

## String Operation
Using double quotaion for write string in java and use addition (+) operator concatation two string. If string added with number then it cancatition. Here is example : 
```java
"string"; // it is string
"3" + 3; // "33"
"A" + "B"; // "AB"
```


<hr />

## Operator
Here is all java operator : 

#### Arithmetic Operator
| Operator | Name              |
|----------|-------------------|
| +        | Addition          |
| -        | Subtraction       |
| *        | Multiplication    |
| /        | Division          |
| %        | Modulus           |

> 🔵 `int/int` integer division case, java all time do integer division. In that case java round the number to 0.

> 🔵 If one or more floating number exist in arithmetic operator then java operate with floating division.

#### Realational Operator
| Operator | Name                     |
|----------|--------------------------|
| ==       | equal to                 |
| !=       | not equal                |
| >        | greater than             |
| >=       | greater than or equal to |
| <        | less than                |
| <=       | less than or equal to    |

> 🟢 Realational operator always return boolean data.

**Here is example of relational operator : **
```java
public class Equality {
    public static void main(String []args){
        int a = 5;
        int b = 7;

        boolean isAGreaterThanB = a > b;
        System.out.println("isGreaterThanB = "+isAGreaterThanB); // isGreaterThanB = false
    }
}
```

#### Logical Operator
| Operator    | Name        |
|-------------|-------------|
| !           | not         |
| &&          | and         |
| ||          | or          |
| ^           | exclusive   |

#### Unary Operator
Here is all unary operator : 

| Operator | Example | Name                     |
|----------|---------|--------------------------|
| +        | +a      | Uniary Plus              |
| ++       | ++a     | Pre increment            |
| ++       | a++     | Post increment           |
| --       | --a     | Pre decrement            |
| --       | a--     | Post decrement           |
| -        | -a      | Uniary Minux             |

<hr />

## Type Conversion and Type Casting

> 🔵 Convert small size data into big size called Type conversion and convert big size data into small size called Type casting.

Java permit 19 type of type conversion for primitive type conversion : 
1. byte -> short, int, long, float, double
2. short -> int, long ,float, double
3. char -> int, long, float, double
4. int -> long, float, double
5. long -> float, double
6. float -> double

(They are called widening primitive conversion)



If convert data out of widening primitive conversion then convert it explicitly. Here is syntax : 
```java
// cstyle type conversion
(datatype) variable_or_data;

// this type of type casting called narrowing primitive.
```

Java allow 22 type of narrowing primitive  type conversion :
1. short -> byte,char
2. char -> byte,short
3. int -> byte,short,char
4. long -> byte,short,char,int,long
5. float -> byte,short,char,int,long
6. double -> byte,short,char,int,long,float

<hr />

## Expression, Statement and Block

> 🟢 Expression build with one or more operand,operator, or function called to determine a value.

> 🟢 Statement is unit of code which is end with semicolon ';'.

> 🟢 If inside a curly bracket '{}' 0 or one or more than one statement is exist then it called block. 

<hr />

## If Condition

Here is `if` condition syntax : 
```java
if(condition){
    // if block
}
``` 

<hr />

## Practice
- [Problem Number 1 : is All Equal](./practice/AllAreEqual.java)
- [Problem Number 2 : Five Number Average](./practice/Average.java)
- [Problem Number 3 : BMI Problem](./practice/BMI.java)
- [Problem Number 4 : Calculate of Area of Triangle by 3 Point of Triangle.](./practice/AreaTriangle.java)
- [Problem Number 5 : What is Output.](./practice/WhatOutput1.java)
- [Problem Number 6 : Convert m/m to km/s](./practice/CalculateDistance.java)
- [Problem Number 7 : Checking is Triangle or not by 3 Edge of Triangle.](./practice/IsTrianlge.java)
- [Problem Number 8 : Sum of All Digit of a Number which is Between 0 and 1000.](./practice/SumDigit.java)
- [Problem Number 9 : Calculate Exchange Rate When Convert BDT to USD and BDT to CAD.](./practice/ExchangeRate.java)
- [Problem Number 10 : Calculate Bikash Charge.](./practice/BikashCharge.java)
- [Problem Number 11 : Get Marks of Six Subject and Calculate Sumation of Marks, Average of Marks and Percentage of Marks.](./practice/SubjectNumber.java)
- [Problem Number 12 : Identify the Character is Letter, Number or Symbol.](./practice/IdentifyTheCharacter.java)
- [Problem Number 13 : Print the Last Digit of a Number.](./practice/LastDigit.java)
- [Problem Number 14 : Calculate of Charge of Call.](./practice/ChargeOfCall.java)
- [Problem Number 15 : Check a Number Divisible by 5 and 6.](./practice/FiveSix.java)
- [Problem Number 16 : Need Day to Save money to Buy a Car Which Cost is : 35,00,000.00 ](./practice/BuyCar.java)
- [Problem Number 17 : Convert Seconds Into Hours, Minutes and Seconds.](./practice/TimeConversion.java)
- [Problem Number 18 : Check is Possible to divide the Pizza Slices Into Friends by Their Wanted Number of Pizza Slices.](./practice/PizzaProblem.java)
- [Problem Number 19 : Check a Rectangle Fit in Circle.](./practice/FitInCircle.java)

<hr />

#### [< Chapter 2 : Common Programming Problem >](./../chapter_02/chapter_02.md)
#### [Back to table of Index](./../Note.md)
#### [Chapter 4 : Control FLow >](./../chapter_04/chapter_04.md)

#### [Back to READEME.md >](./../../../README.md)