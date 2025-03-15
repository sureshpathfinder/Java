Java is an object oriented programmming language.

1. there are many real world objects around us. example dog,
bicycle and television etc. these real world objects have both
state and behaviour. for example the dog has it state like(name,
color,...) and it have behaviour like (barking, running, fetching..)
Like the real-world objects, software objects also have state and
behaviours. where the state is get from it's variable & implements
its behaviour with methods.

I.Object:-
It is the principal building blocks of object-oriented programming
unit consisting of data(instance variables) & functionality(methods).
packaging an object's variable with in the protective custody of its
method is called encapsulation.it is used to hide unimportant implementation
details from other objects. (in programs, you don't need to know how a
class is implemented, you want to bother about methods invoking only)
thus implementation details can change without affecting other parts of the
program.

Advantages:-
1. object can choose to expose its variables to other objects allowing
those other objects to inspect and even modyfing the variables.
2. it can be hide methods from other objects for bidding those objects from
invoking the methods.
3. an object have complete control over, whether other objects can be access
its variables and methods and infact, can specify which other objects have
access.

II Message
A single object is generally not very useful and usually appears as a
component oflarger program that contains many other objects.
software objects interact and communicate with each other by sending
messages with each other.
when object A wants object B to perform one of the B's method,
object A sends messages to B.Sometimes the receiving object needs
more information, about what it wants to do exactly. this information
is passed along with the message as parameter.
a. the object to whom the message is addressed.
b. the name of the method to perform
c. any parameter needed by the method.

III classes
in object oriented software, it's also possible to have many objects of the
same kind that share characteristics: rectangles, employee records ...
we can take advantage of fact that the objects of the same kind are similar
and u can create a blue print for those objects. software "blue print" for
objects are called classes.

definition: A class is a prototype that defines the variables and methdods
common to all objects of a certai kind. in addition to instance variables and
class methods.
we can access the class variable or methods directly from the class( so there
is no need to initiate a class to use its clss variable & methods). class
methods can only operate on class variables, they ca'n able to access instance
variables or methods.
we can notice this illustration of class and objects look very similar to
each other. in short, object represents a blue print of an object, rather
than is a object for itself.
Advantages:
class provide the benefit of reusability software programmers use the same
class, same cod, over and over to create many objects.

IV Inheritance
Assigning properties of one class to another is called inheritance.
the basic principle of inheritance is given by subclass and super class.
each sub class in herits state from superclass. but subclass can add variables
and methods, so to improvize it's class.
subclass can also override(providing a different implementation of a method
in a subclass of the class that originally defined the method) inherited
methods and provide specialized implementation.






