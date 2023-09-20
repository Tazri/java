Chapter 8 : Exception Handling
===============================

If a error occur and failled the normal programming flow then java programm create a **object** and transfer to run time system. This object called **exception object**.

> 🟢 Create a exception object and transfer to runtime system called **exception throwing**.

## Try Block

**Syntax of try block :**
```java
try{
    // code that may cause exceptions
}catch(Throwable ex){
    // here throwable is a parent class of all exception.
}
```

> 🟢 It's possible to use one or more catch block in try-catch block.

Here is another syntax : 
```java
try{
    // code that may cause exceptions
}catch(ExceptionClass ex){

}catch(AnotherExceptionClass ex){

}

// used vertical bar
try{
    // code that my cause exceptions
}catch(EceptionClass ex | AnotherExceptionClass ex){

}
```

## Finally Block

**Syntax of finally block :**
```java
try{

}finally{
    // code always executed after the
    // try and any catch block doesn't matter
    // if an exception thrown or not
}

// finally block with catch
try{

}catch(Throwable ex){

}finally{

}
```

<hr />

## Java Exception Type

**Java Exception Heirarchy :**
![Java Exception Heirarchy](./asset/Java_Exception_hierarchy.png)

> 🟢 Every exception inherit the **Throwable class.**

> 🟢 Error and error's sub types are throw for unusual event, generally this type of event happend in virtual machine. Like : Overflow heap of virtual machine. There is no alternative way to handle this.

> 🟢 It's possible to create alternative way to handle **Exception and their sub class.**

> 🟢 Unchecked Exception happend for unpredictable part of program. This type of exception throw in run time. That's why this type of exception called run time exception.

> 🟢 Checked Exception is a sub class of Exception but not run time exception. 

Compiler when invoke the method then first check that this method can throws a check method by method signature. Then compiler check two more thing. Is this : 

1. Check method is in try catch ?
2. Check invoked method has throw keyword or has checked expression.

Fill up the any one option from above two option if used checked exrpession in method invoke. This is called **catch-or-declare-requirement**.

