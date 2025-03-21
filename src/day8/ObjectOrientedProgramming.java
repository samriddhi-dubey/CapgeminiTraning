/*
 * 
 * An object is an instance of a class. it is a block of memmory conataining heterogeneous non-static variables and methods.

Enacpsulation-securing the code.

non-static methods/object methods/instance methods- object of a class can be replicated
variables declared inside the block of the class without using the "static" keyword-non static variables.

class Book{
String name;String author;int price;
}

public void reading(){
sop("reading")
}

ClassName obj=new ClassName();
variables used to store the reference of the object is known as reference  variables

Syntax:
new ClassName"([formal args])"--> constructor calling statement --> calls a constructor -->all the non-static members of the class are loaded into the object and 
the variables are initialized with default values

new-keyword for the creation of an object. assigns an address to the object which is known as the object reference. any number of objects can be created
Every object will have a unique reference.

A copy  of non static variables and methods will be created to every object. If any method of variable is modified in an object, 
the changes are not done for the other objects

reference variable can be of any type. it depends on the scope and modifier in which it is created.

constructor is a specialized non-static method  whose name is same as class Name and does not have a return type.
----specfies which obj has to be loaded.
Synatx of a contructor:
[Access Modifier] className([formal args])

When a constructor is not created in the class, the compiler creates a default constructor.
parameterized, non-parameterized constructor

constructor of another class cannot be created in some  other  class.

Object is created duering runtime onlyy.

THIS keyword-local variable and a non-static variable can be differed using the this keyword. This keyword can be used in any non-static block.
            -cannot be used in static blocks.


Constructor chaining- process oof calling one constructor inside another constructor
can be done using two statements- 1. this call statement- perform constructor chaining within the same class
                                  2. super call statement- performing constructor chaining between parent class and child class

                                  
Rules for "this calling statement":
1. We can have only one tc statement in one constructor.
2. Tc statement should be used only inside a constructor.
3. Tc statement must always be the first statement inside the constructor.
4. A contructor can have either have this call statement or super call statement NOT both.
5. If a progarmmer fails to add a tc statement inside a constructor, then java compiler will not add a tc statement implicitly,
unlike default constructor.
6. If there are n constructors in a class, then we can use upto n-1 tc statements.(If n constructors used-
recursive calling of constructor resulting in stack overflow)
                                  
                                  
*/
package day8;

public class ObjectOrientedProgramming {

}
