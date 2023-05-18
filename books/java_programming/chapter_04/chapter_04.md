Chapter 04 : Control FLow
==========================

Java has a Three type of contorl flow : 
- *[Decision Making : if, if-else, switch](#decision-making)*
- *[Looping Statements : for, while, do-while](#looping)*
- *[Branching : break,continue return](#branching)*

## Decision Making

### Syntax of if statement in Java : 

```java
if(boolean-expression){
    // statement(s)
}
```

##### [Here is the example of if condition >](./VoterEligibilityChecker.java)

> 🟢 Dose not need curly bracket if only a statement after if Condition.


```java
if(condition) statement;

// or

if(condition)
    statement;
```


### Syntax of else consition : 
```java
if(boolean_expression){
    statement(s);
}else{
    statement(s);
}

// one statement if else condition

if(boolean_expression)
    statement;
else 
    statement;

if(boolean_expression) statement;
else statement;
```

##### [Here is the Example of if else statements >](./VoterEligiblityCheckerWithElse.java)

> 🟢 It possible to use a if else condition inside the another if else condition so many times.

### Syntax of else if statements : 
```java
if(boolean_expression){
    statement(s);
}else if(boolean_expression){
    statement(s);
}else{
    statement(s);
}

// one statement else if condition
if(boolean_expression) statement;
else if(boolean_expression) statement;
else statements;

// it possible to so many time used else if 
if(boolean_expression) statement;
else if(boolean_expression) statement;
else if(boolean_expression) statement;
else if(boolean_expression) statement;
......
else statements;

```

##### [Here is the example of else-if condition example >](./LetterGradeCalculator.java)

##### [Here is guessing number problem solution >](./GusingNumber.java)

### Syntax of switch statement
```java
switch(expresssion){
    case value1:
        statement(s) 1;
        break;
    case value2:
        statement(s) 2;
        break;
    case value3:
        statement(s) 3;
        break;
    case value4:
        statement(s) 4;
        break;
    ... ... ...
    case valueN:
        statement(s) n;
        break;
    default : 
        statement(s);   
}
```

#### [Here is example of switch statements >](./USSDOption.java)

### Advance switch statement syntax
```java
switch(expression){
    case value1,value2,value3 -> statement;
    case value4,valueN -> statement;
}
```

#### [Here is example of switch statements >](./WeekDaysAndWeekends.java)

### Systex of switch expression 
```java
Type result = switch(args){
    case L1 -> e1;
    case L2 -> e2;
    default -> e3; // default must needed
}
```

#### [Here is example of switch expression >](./SwitchExpressionWeekdaysAndWeekends.java)


If need to write multiple line in case then use `yeild` keyword to return value from case block. Here is example : 
#### [Here is example of used `yeild` keyword in switch expression >](./MonthToDayConverter.java)
#### [Here is another example of used `yeild` keyword in switch expression >](./Calculator.java)

<hr />

## Looping
There are three loop in java : 
1. while loop
2. for loop
3. do-while loop

### While loop syntax : 
```java
while(boolean_expression_that_results_true){
    // statement(s) // loop body
}
```

***Here is the example of while loops :***
##### [Printing times table using while loop.](./TimesTable.java)
##### [Printing log table using while loop.](./LogTable.java)
##### [Print 0 to 500](./Print0To500.java)

### For loop syntax : 
```java
for(initialization;condition;updating_variable){
    // block of statement
}
```

> 🟢 initialization, condition and updating_variable is not necessary like in c, c++ and c#. But condition must be return boolean value.


> Is it possible to use loop inside the another loop so many times.

***Here is example of for loop :***
##### [Print half pyramid of star *.](./HalfPyramid.java)
##### [Print prime factor of a number.](./PrimeFactorization.java)
##### [Print Pi from series.](./PiCalculatorDemo.java)

### Syntax of do while loop : 
```java
do{
    // block of statements
}while(boolean_condition);
```

**Example of do-while loop :**
##### [Guessing game.](./GusingNumber.java)


## Branching

### Break and continue

> 🟢 `break` break the loop and `continue` skip the loop itreation and go next itreation like other language.

> break leaves a loop, continue jumps to the next iteration.

<hr />

## Practice

**Here all Practice Problem solution :**
- [Practice 1 : Half pyramid of letter.](./practice/LetterHalfPyramid.java)
- [Practice 2 : Half pyramid of digit.](./practice/NumberHalfPyramid.java)
- [Practice 3 : A box of dot and star pyramid.](./practice/DotStar.java)
- [Practice 4 : Printing minum and maximum from numbers.](./practice/MinMax.java)
- [Practice 5 : What is the output of this code?](./practice/WhatOutput.java)
- [Practice 6 : Market System : calculate product and paid from customer.](./practice/Market.java)
- [Practice 7 : Printing palindrome number from a range of integer number.](./practice/Pallendrome.java)

<hr />

#### [< Chapter 3 : Data Type, Operator and Expression >](./../chapter_03/chapter_03.md)
#### [Back to table of Index](./../Note.md)
#### [Chapter 5 : Array >](./../chapter_05/chapter_05.md)

#### [Back to READEME.md >](./../../../README.md)