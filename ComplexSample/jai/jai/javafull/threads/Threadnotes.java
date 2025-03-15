A process is called thread. A program may have multiple threads.
Java supports Multithreaded progrmmaing. 

Thread Execution
----------------
A thread can be executable by calling it's start method. after
calling the start() method it register thread with a piece of
system code called thread sheduler. the sheduler determines which thread
is actually running & shedules the other threads for execution according
to thier thread priorities. A call to start method does not make a thread
to run, it just make eligible to run. A thread thread should be wait for
cpu timings along with other threads. when a thread has started execution
the run() method of the thread is called

Executing run method
--------------------
The run() method can use any of the following objects
1. it can use it's own run method
2. some other's run method
to execute a thread's own run method, the class should be a subclass of thread
class
if a thread needs to execute run() method of some other object, an instance
of thread class should be constructed
when the run() method returns. the thread finished its task and considered
as dead. it cannot be start again

Thread's State
--------------
1. Running -  The state where the thread's execution is in progress
2. various waiting states such as waiting,sleeping, suspended and blocked
   are some states which stops the execution of thread temporarily for
   sometimes
3. Ready - The state where the thread waits for cpu,while other threads
           are running
4. Dead - The state where the thread execution is completed.

Thread Priority
---------------
Every thread has a priority which is nothing but an integer from 1 to 10
the thread with higher priority get preference over the lower priority. set
Priority() and getPriority() are the methods to set and return thread Priority

Priority        Values          Constant value in code
Minimum           1                     MIN_PRIORITY
Normal            5                     NORM_PRIORITY
Maximum          10                     MAX_PRIORITY

Contolling Threads
------------------
Thread control is art of moving thread from one state to another.
Thread can be Controlled by triggering transitions. hte various pathways out
of running state are
1. Yielding
2. Suspending and then Resuming
3. Sleeping
4. Blocking and then continuing
5. Waiting and then being notified

Yielding
-------
  It is a process where the thread can offer to move out of a virtual CPU
  Yielding is done by calling Yielding Method. A Yielded thread would be
  restart, if there are no other thread to be executed.

Suspending
----------
        Suspending a thread makes another thread unrunnable for an indefinite
        period of time. suspended threads can become runnable. when other threads
        resumes it. Suspending threads can cause deadlock as there is no control
        over suspending threads

Sleeping
--------
       A Sleeping thread passes times without doing anything. There are 2 ways
       to call this method.

Blocking
--------
        Many methods that perform input or ouptput have to wait for some occurance
        in the outsideworld before they can proceed, this behaviour is called Blocking





