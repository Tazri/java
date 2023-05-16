package practice;

import java.util.Scanner;

public class Stack {
    int []stk = null;
    int stkSize = 0;
    int topIndex = -1;
    public int popedItem = 0;

    public Stack createStack(int stackSize){
        if(stk == null){
            stk = new int[stackSize];
            
        }else{
            System.out.println("> Stack is already created.");
            return null;
        }

        return this;
    }

    public boolean isStackFull(){
        if(stk == null){
            System.out.println("> Stack is even not created.");
            return false;
        }else if(stkSize == stk.length){
            return true;
        }
        return false;
    }

    public boolean isStackEmpty(){
        if(stk == null){
            System.out.println("> Stack is not even created.");
            return false;
        }
        return stkSize == 0;
    }

    public boolean isStackHasEmptySlot(){
        if(stk == null){
            System.out.println("> Stack not even created. So there is no space slot.");
            return false;
        }
        return stkSize < stk.length;
    }

    public boolean isStackCreated(){
        return stk != null;
    }

    public Stack makeEmptyStack(){
        stkSize = 0;
        topIndex = 0;
        return this;
    }

    public int peek(){
        if(stk == null){
            System.out.println("> Stack is not even created!!");
            return 0;
        }else if(stkSize == 0){
            System.out.println("> Stack has no item.");
            return 0;
        }
        return stk[topIndex];
    }

    public Stack popItem(){
        if(stk == null){
            System.out.println("> Stack is not even created.");
            return null;
        }

        if(stkSize == 0){
            System.out.println("> Stack is empty.");
            return null;
        }

        popedItem = stk[topIndex];
        topIndex--;
        stkSize--;
        return this;
    }

    public Stack pushItem(int item){
        if(stk == null){
            System.out.println("> Stack is not even created.");
            return null;
        }

        if(stkSize == stk.length){
            System.out.println("> Stack is overflow!!");
            System.out.println("> Need to increase the space.");
            return null;
        }

        stk[++topIndex] = item;
        stkSize++;
        return this;
    }

    public Stack deleteStack(){
        if(stk == null){
            System.out.println("> There is no stack to delete.");
        }else{
            stk = null;
            topIndex = -1;
            stkSize = 0;
        }
        return this;
    }

    public void status(){
        if(stk != null){
            if(stkSize <= 0){
                System.out.println("> Stack("+stk.length+"): [ stack is empty ]");
            }else{
                System.out.print("> Stack("+stk.length+") : ("+stkSize+")[ ");
                print(stk[0]+"");

                for(int i = 1;i < stkSize;i++){
                    print(", "+stk[i]);
                }

                print("(top) ]\n");
            }


        }else{
            System.out.println("> Stack(null) : Stack is not created. please create the stack first.");
        }
    }

    public static void print(String s){
        System.out.print(s);
    }

    public static void println(String s){
        System.out.println(s);
    }

    public static void br(){
        println("");
    }

    public static void printAllComamnd(){
        println("> Here is all command : ");
        println("> 1 -> for check status of stack.");
        println("> 2 -> for created stack.");
        println("> 3 -> for push item in stack.");
        println("> 4 -> for pop item from stack.");
        println("> 5 -> for peek the top item from stack.");
        println("> 6 -> for delete the stack.");
        println("> 99 -> for print all vaild command.");
        println("> 0 -> for terminate the program.");
    }

    public static void main(String args[]){
        Stack STK = new Stack();
        Scanner input = new Scanner(System.in);

        printAllComamnd();
        br();

        int command;
        do{
            print("> Enter the command : ");
            command = input.nextInt();

            // command 1 to check the status of stack
            if(command == 1){
                STK.status();
            }

            // command 2 create the stack
            else if(command == 2){
                print("> Enter the stk size : ");
                int size = input.nextInt();
                if(size <= 0){
                    println("> You enter invalid number to determine the stack size.");
                }else if(STK.isStackCreated()){
                    println("> Stack is alread created. Please delete the stack first with command 6.");
                }
                else{
                    STK.createStack(size);

                    println("> Stack created successfully. <");
                    STK.status();
                }
            }
            
            // command -> 3 : push the item in stack
            else if(command == 3){
                if(STK.isStackCreated()){
                    if(STK.isStackFull()){
                        println("> STK is overflow, Please first pop the item from the stack.");
                    }else{
                        print("> Enter the item : ");
                        int item = input.nextInt();
                        
                        STK.pushItem(item);

                        println("> "+item+" is pushed in stack.");
                    }
                    
                }else{
                    println("> Stack is not created, so it not possible to push item into the stack. Please create the stack by command 2.");
                }
            }

            // command -> 4 : pop the item from stack
            else if(command == 4){
                if(!STK.isStackCreated()){
                    println("> Stack is not even created. Create the stack command with 2.");
                }
                else if(STK.isStackEmpty()){
                    println("> Stack is underflow, please push the item from the stack.");
                }
                else{
                    STK.popItem();
                    int item = STK.popedItem;

                    println("> Poped item is : "+item);
                }
            }

            // command -> 5 : peek the top item from stack
            else if(command == 5){
                if(!STK.isStackCreated()){
                    println("> Stack is not even created. Please create the stack with command 2.");
                }
                else if(STK.isStackEmpty()){
                    println("> Stack is empty. Please push the item with command 3.");
                }else{
                    int item = STK.peek();
                    println("> Top item : "+item);
                }
            }
            
            // command -> 6 : delete the stack
            else if(command == 6){
                if(!STK.isStackCreated()){
                    println("> Stack is not even created. Please create the stack first.");
                }else{
                    println("> Before the delete stack, see the data from stack : ");
                    STK.status();
                    STK.deleteStack();

                    println("> Stack is deleted successfully. <");
                }
            }

            // command -> 99 : show the all command
            else if(command == 99){
                printAllComamnd();
            }

            // for unkown command1
            else{
                println("> Unknown Command <");
            }


            br();
            
        }while(command != 0);

        br();
        println("> Programs terminated. <");
        input.close();
    }
}

/*
Sample Output : 
> Here is all command : 
> 1 -> for check status of stack.
> 2 -> for created stack.
> 3 -> for push item in stack.
> 4 -> for pop item from stack.
> 5 -> for peek the top item from stack.
> 6 -> for delete the stack.
> 99 -> for print all vaild command.
> 0 -> for terminate the program.

> Enter the command : 1 
> Stack(null) : Stack is not created. please create the stack first.

> Enter the command : 3
> Stack is not created, so it not possible to push item into the stack. Please create the stack by command 2.

> Enter the command : 2
> Enter the stk size : 4
> Stack created successfully. <
> Stack(4): [ stack is empty ]

> Enter the command : 3
> Enter the item : 9
> 9 is pushed in stack.

> Enter the command : 3
> Enter the item : 7
> 7 is pushed in stack.

> Enter the command : 38
> Unknown Command <

> Enter the command : 3
> Enter the item : 8
> 8 is pushed in stack.

> Enter the command : 3
> Enter the item : 7
> 7 is pushed in stack.

> Enter the command : 3
> STK is overflow, Please first pop the item from the stack.

> Enter the command : 1
> Stack(4) : (4)[ 9, 7, 8, 7(top) ]

> Enter the command : 5
> Top item : 7

> Enter the command : 4
> Poped item is : 7

> Enter the command : 1
> Stack(4) : (3)[ 9, 7, 8(top) ]

> Enter the command : 5
> Top item : 8

> Enter the command : 4
> Poped item is : 8

> Enter the command : 6
> Before the delete stack, see the data from stack : 
> Stack(4) : (2)[ 9, 7(top) ]
> Stack is deleted successfully.
> Stack is deleted successfully. <

> Enter the command : 1
> Stack(null) : Stack is not created. please create the stack first.

> Enter the command : 3
> Stack is not created, so it not possible to push item into the stack. Please create the stack by command 2.

> Enter the command : 2
> Enter the stk size : 7
> Stack created successfully. <
> Stack(7): [ stack is empty ]

> Enter the command : 2
> Enter the stk size : 4
> Stack is alread created. Please delete the stack first with command 6.

> Enter the command : 0
> Unknown Command <


> Programs terminated. <
*/