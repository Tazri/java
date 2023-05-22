Chapter 05 : Array
==================

**Table of contain this chapter note :**
- [Array Declaration, Creation and Access](#array-declaration-creation-and-access)
- [Array Processing](#array-processing)
- [Array Copy](#array-copy)
- [Two Dimensional Array](#two-dimensional-array)
- [Multi-Diemsional Array](#multi-dimensional-array)
- [Important information about array in java](#important-information-about-array-in-java)
- [Practice Problem](#practice)

<hr />

## Array Declaration, Creation and Access

**Declaring array in Java :**
```java
<data_type> name[]; // best way
<data_type> []name; // second way but not best.

// example
int numbers[];
int []numbers;
```

**Array initialization :**
```java
arrName = new type[size];

// example 
numbers = new int[20];

// declaring and initialization same time
int []numbers = new int[10];
```

**Accessing array index :**
```java
// accesing array
arrName[index];

// chaning array value using index
arrName[index] = value;

// example
anArray[0] = 100;
```

**Array Initializer :**
```java
type []names = {value,value,value,value};

// in that case array length set automatically accorading to total element inside the curly bracket.

// example
int []nums = {100,300,400,500,60};
```

**Find the array length :**
```java
array.length; // return the total array.

// if nothing to initializing in array then it store null.
```

<hr />

## Array Processing

**Example of Array Processing :**
- [Traverse the array.](./ArrayProcessOne.java)
- [Traverse the array two times.](./ArrayProcessTwo.java)

**Problem Solution with Array Processing :**
- [Find maximum, minimu, sum and average from array.](./AverageMinAndMaxCalculator.java)
- [Count the letter from sentence.](./CountLetter.java)

**Necessary Function and There Description :**

| Function Name | Description                                                                                              |
|---------------|----------------------------------------------------------------------------------------------------------|
| String stringOb.toLowerCase(String st) | make the string to lowercase. |
| String stringOb.toUpperCase(String st) | make the string to uppercase. |
| Char[] stringOb.toCharArray(String st) | make the string to character array. | 
| boolean Character.isLetter(char ch) | return true if ch is letter. |
| void Arrays.toString(ob[] arrays) | Printing arrays like Python and JavaScript style. |

**Default value for the array :**

| Array Type    | Default Value     |
|---------------|-------------------|
| boolean       | false             |
| int,long      | 0                 |
| float,double  | 0.0               |
| Referance Type| null              |

**Example of default value :**
- [Printing default value of arrays.](./DefaultValueOfArray.java)

**Syntax of enhanced for loop or for-each loop :**
```java
for(type variable: array/collection){
    // statements
}
```

**Example of enhanced for loop :**
[Calculate sum of numebrs array using for-each loop.](./EnhancedForLoopExample.java)

<hr />

## Array Copy

**Necessary Function :**
- [arraycopy](#systemarraycopy)
- [copyOf](#arrayscopyof)
- [copyOfRange](#arrayscopyofrange)

#### System.arraycopy()
```java 
⚙️ Function : arraycopy ⚙️

// prototype
public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);

// function source System class

// Description : 
Object src : Here first argument is src array or target array to copy.
int srcPos : Postion to start copy.
Object dest : Which array used to store copied data.
int destPos : Position to dest array.
int length : Number of element to be copied.


// example
System.arraycopy(myArray,5,copyTo,7,10);
```

#### Arrays.copyOf()
```java 
⚙️ Function : copyOf ⚙️

// prototype
ob/type[] copyOf(ob/type array,int length);

// function source Arrays class

// Description : 
ob/type array : Take a array which used to copied.
int length : Number of element are coping.

// example
int []  copiedArray = Arrays.copyOf(array,10);
```

#### Arrays.copyOfRange()
```java 
⚙️ Function : copyOfRange ⚙️

// prototype
ob/type[] copyOf(ob/type array,int startPos,int endPos);

// function source Arrays class

// Description : 
ob/type array : Take a array which used to copied.
int startPos : Position of starting.
int endPos : Position of ending. Array are copy before the ending.

// example
int [] array = {23,43,55,12,65,88,92};
int [] copiedArray = Arrays.copyOfRange(array,1,4);

// the result 
copiedArray = {43,55,12};
```

**Example of using those function :**
[Dynamic array.](./DynamicArray.java)

> If throw `ArrayIndexOutOfBoundsException` for `i <= length` where length is a numbers of elements of array then it called **off-by-one error**.

<hr />

## Two Dimensional Array
**Syntax of two dimensional array :**
```java
datatype[][] nameOfTheArray;

// example 
int[][] matrix = new int[5][5];

// accessing example
matrix[2][2] = 15;
matrix[2][3] = 35;

// example of short hand of two dimensional array
int [][] array1 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
}
```

> If Every col length are not equal in two dimensional array, then called it **ragged array**.

**Example of using two dimentional array :**
[Two dimensional array example.](./TwoDimensionalArray.java)
[Example of Ragged array.](./RaggedArray.java)

**Problem solution with two dimensional array :**
[Calculate matrix sum, subtraction and multiplication or product.](./MatrixCaculator.java)

<hr />

## Multi-Dimensional Array

**Example of create multi dimensional array :**
```java
int myArray[][][] = new int[4][2][5];

// accesing multi dimensional array
myArray[0][1][4] = 45;

// another example
int balances[] = new int[10][];
balances[0] = new int[5];
balances[1] = new int[15];
balances[2] = new int[25];
```

> 🟢 A multidimensional array which arrays length are different from each other called **jagged array** or **ragged array** or **irregular dimensional array**.

<hr />

## Important information about array in Java

+ Array is one type of object. This inherit `java.lang.Object` class like other class and object
+ Array only contain one type of data.
- Array can store null.
- Array vairable only contain array referance.
- Array has public final field called `length`.
- Character array are not called stirng like C programming and also this is not terminate by `\u0000`.

<hr />

## Practice 
Here is all practice file : 
- [Practice 01: ](./practice/Stack.java)
- [Practice 02: ](./practice/PrintFibo.java)
- [Practice 03: ](./practice/SortArray.java)
- [Practice 04: ](./practice/SortArrayUser.java)
- [Practice 05: ](./practice/ArrayHighestandLowest.java)
- [Practice 06: ](./practice/RemoveOdd.java)
- [Practice 07: ](./practice/FindTwoSum.java)
- [Practice 08: ](./practice/EqualArray.java)
- [Practice 09 and 10: ](./practice/Temperature.java)
- [Practice 11: ](./practice/CountriesQuiz.java)

<hr />

## Navigator

#### [< Chapter 4 : Control FLow](./../chapter_04/chapter_04.md)
#### [Back to table of Index](./../Note.md)
#### [Chapter 6 : Object and Class >](./../chapter_06/chapter_06.md)

#### [Back to READEME.md >](./../../../README.md)