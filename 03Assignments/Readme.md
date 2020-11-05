
## Stack and Heap
* Local variables (method variables) live on the stack.
* Objects and their instance variables live on the heap.

## Literals and Primitive Casting
* Integer literals can be binary, decimal, octal, or hexadecimal (such as 0x3d).
* Literals for `longs` end in `L` or `l`.
* Float literals end in `F` or `f`, and `double` literals end in a digit or `D` or `d`.
* The `boolean` literals are `true` and `false`.
* Literals for `chars` are a single character inside single quotes: `'d'`.

## Scope
* Scope refers to the lifetime of a variable.
* There are four basic scopes:
  * Static variables live basically as long as their class lives.
  * Instance variables live as long as their object lives.
  * Local variables live as long as their method is on the stack; however, if their method invokes another method, they are temporarily unavailable.
  * Block variables (for example, in a `for` or an `if`) live until the block completes.

## Basic Assignments
* Literal integers are implicitly `ints`.
* Integer expressions always result in an `int`-sized result, never smaller.
* Floating-point numbers are implicitly doubles (64 bits).
* Narrowing a primitive truncates the _high order_ bits.
* Compound assignments (such as `+=`) perform an automatic cast.
* A reference variable holds the bits that are used to refer to an object.
* Reference variables can refer to subclasses of the declared type but not to superclasses.
* When you create a new object, such as `Button b = new Button();`, the JVM does three things:
  * Makes a reference variable named `b`, of type `Button`.
  * Creates a new `Button` object.
  * Assigns the `Button` object to the reference variable `b`.

## Using a Variable or Array Element That Is Uninitialized and Unassigned
* When an array of objects is instantiated, objects within the array are not instantiated automatically, but all the references get the defult value of `null`.
* When an array of primitives is instantiated, elements get default values.
* Instance variables are always initialized with a default value.
* Local/automatic/method variables are never given a default value. If you attempt to use one before initializing it, you'll get a compiler error.

## Passing Variables into Methods
* Methods can take primitives and/or object references as arguments.
* Method arguments are always copies.
* Method arguments are never actual objects (they can be references to objects).
* A primitive argument is an unattached copy of the original primitive.
* A reference argument is another copy of a reference to the original object.
* Shadowing occurs when two variables with different scopes share the same name. This leads to hard-to-find bugs and hard-to-answer exam questions.

## Garbage Collection
* In Java, garbage collection (GC) provides automated memory management.
* The purpose of GC is to delete objects that can't be reached.
* Only the JVM decides when to run the GC; you can only suggest it.
* You can't know the GC algorithm for sure.
* Objects must be considered eligible before they can be garbage collected.
* An object is eligible when no live thread can reach it.
* To reach an object, you must have a live, reachable reference to that object.
* Java applications can run out of memory.
* Islands of objects can be garbage collected, even though they refere to each other.
* Request garbage collected, even though they refer to each other.
* Request garbage collection with `System.gc();`
* The `Class` object has a `finalize()` method.
* The `finalize()` method is guaranteed to run once and only once before the garbage collector deletes an object.
* The garbage collector makes no guarantees; `finalize()` may never run.
* You can ineligible-ize an object for GC from within `finalize()`.
