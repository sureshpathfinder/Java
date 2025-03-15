Exception:
----------
An exception is an abnormal condition that arises in a code of sequence at
run time and disrupts normal program flow.

Exception Handling Fundamentals
-------------------------------
In computer languages that do not support exception handling, errors must
be checked and handled manually typically through the use of error codes
and so on.
Some of the cases when an exception is throwna are:
when trying to access an array out of its range,
when the file we try to open may not exist,
when the class file to be loaded is in the wrong format,
when the existing network connection may be distruped for some unknown reasons.

In java exceptions are represented by objects.
when an exceptional condition arises, an object representing that exception is
created and thrown in the method that caused the error. the method may choose
to handle that exception itself, or pass it on. in either of the cases, at
some point the exception is caught and processed.

Requirement for Exception handling
----------------------------------
Throwing an exception is friendlier than terminating the program because it
provides  the programmer with the option of writing a handler to dela with
the abnormal condition. Error handling code is separate from normal program
flow. This increases the readabilty and maintainability of the program.

The general form of exception handling construct is shown here

try
{
        //risk code Statements or methods that may throw exceptions
}
catch(someexception e) // Exception argument to be caught
{
        //Handle bad stuff  Statements to dela with exceptional situations
}

The try-catch Constructs
------------------------

try
{
        
       badMethod();
}
catch(NullPointerException ne)        Is it a NullPointer Exception?
{
        //Fix uninitialized objects
}
catch(ArithmeticException ae)          No.Is it a ArithmeticException?
{
        //Fix Arithmetic errors
}
catch(IndexOutOfBoundsException ie)    No.Is it a IndexOutOfBoundsException?
{
        //Fix Arithmetic errors
}
catch(Exception e)                       No.Exception will catch all the rest
{
        //Fix Everything else
}

There can be any number of catch clauses. when an exception occurs, the body
of the first exception handler whose exception class type is the same class
as or is a super class of the thrown exception will be executed. Consider
that an exception is thrown. sequential checks are now made to find the
matching catch block. First the compiler checks if it is an NullPointer
Exception, else it checks for an ArithmeticException or an indexOutofBounds
Exception. if either of exception matches, then the particular exception is
caught, else the exception is caught by the Exception which is the base class
for all exception.

Exception -Handling Constructs
------------------------------

try
{
        //statements...
        //allocate some resource
        method call(arguments);
        //statements
        //Some might throws an exception
}catch(someexception e)
{
        //do something perhaps try to recover
}
finally
{
        //this always happen
        //code that must be excecuted under successful or unsuccessful
        //conditions
        release resource...
}

The generalized exception handling code has one more part than one that we saw
in the last example . it is a finally block. this comes in handy for freeing
resource like file handlers allocated in the normal program body.
If we put a finally block after a try and its associated catch blocks,
then the code in the finally block will definetely be executed before the program
contol is transffered outside the programming construct.
The Catch clause is optional as is the finally clause. However, atleast one of
the catch and finally clauses must exist in a try-catch-finally construct.



















