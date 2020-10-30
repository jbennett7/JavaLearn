# Chapter 2: Object Orientation

## Encapsulation, IS-A, HAS-A
* Encapsulation helps hide implementation behind an interface (or API).
* Encapsulated code has two features:
  * code has two features:
  * Getter and setter methods provide access to instance variables.
* IS-A refers to inheritance or implementation.
* IS-A is expressed with the keyword `extends` or `implements`.
* IS-A, "inherits from," and "is a subtype of" are all equivalent expressions.
* HAS-A means an instance of one class "has a" reference to an instance of another class or another instance of the same class.

## Inheritance
* Inheritance allows a class to be a subclass of a superclass and thereby inherit `public` and `protected` variables and methods of the superclass.
* Inheritance is a key concept that underlies IS-A, polymorphism, overriding, overloading, and casting.
* All classes (except class `Object`) are subclasses of type `Object`, and therefore they inherit `Ojbect`'s methods.

## Polymorphism
* Polymorphism means "many forms."
* A reference variable is always of a single, unchangeable type, but it can refer to a subtype object.
* A single object can be referred to by reference variables of many different types-- as long as they are the same type or a supertype of the object.
* The reference variable's type (not the object's type) determines which methods can be called!
* Polymorphic method invocations apply only to overriden _instance_ methods.

## Overriding and Overloading
* Methods can be overridden or overloaded; constructors can be overloaded but not overridden.
* With respect to the method it overrides, the overriding method:
  * Must have the same argument list.
  * Must have the same return type, except that, as of Java 5, the return type can be a subclass, and this is known as a covariant return.
  * Must not have a more restrictive access modifier.
  * May have a less restrictive access modifier.
  * Must not throw new or broader checked exceptions.
  * May throw fewer or narrower checked exceptions, or any unchecked exception.
* `final` methods cannot be overridden.
* Only inherited methods may be overriden, and remember that private methods are not inherited.
* Overloading means reusing a method name but with different arguments.
* Overloaded methods:
  * Must have different argument lists.
  * May have different return types, if argument lists are also different.
  * May have different access modifiers.
  * May throw different exceptions.
* Methods from a superclass can be overloaded in a subclass.
* Polymorphism applies to overriding, not to overloading.
* Object type (not the reference variable's type) determines which overridden method is used at runtime.
* Reference type determines which overloaded method will be used at compile time.

## Reference Variable Casting
* There are two types of reference varialbe casting: downcasting and upcasting.
  * __Downcasting__ If you have a reference variable that refers to a subtype object, you can assign it to a reference variable of the subtype. You must make an explicit cast to do this, and the result is that you can access the subtype's members with this new reference variable.
  * __Upcasting__ You can assign a reference variable to a supertype reference variable explicitly or implicitly. This is an inherently safe operation because the assignment restricts the access capabilities of the new variable.

## Implementing an Interface
* When you implement an interface, you are fulfilling its contract.
* You implement an interface by properly and concretely implementing all of the methods defined by the interface.
* A single class can implement many interfaces.

## Return Types
* Overloaded methods can cahnge return types; overridden methods cannot, except in the case of covariant returns.
* Object reference return types can accept `null` as a return value.
* An array is a legal return type, both to declare and return as a value.
* For methods with primitive return types, any value that can be implicitly converted to the return type can be returned.
* Nothing can be returned from a `void`, but you can return nothing. You're allowed to simply say `return` in any method with a `void` return type to bust out of a method early. But you can't return nothing from a method with a non-`void` return type.
* Methods with an object reference return type can return a subtype.
* Methods with an interface return type can return any implementer.

## Constructors and Instantiation
* A constructor is always invoked when a new object is created.
* Each superclass in an object's inheritance tree will have a constructor called.
* Every class, even an abstract class, has at least one constructor.
* Constructors must have the same name as the class.
* Constructors don't have a return type. If you see code with a return type, it's a method with the same name as the class; it's not a constructor.
* Typical constructor execution occurs as follows:
  * The constructor calls its superclass constructor, which calls its superclass constructor, and so on all the way up to the `Object` constructor.
  * The `Object` constructor executes and then returns to the calling constructor, which runs to completion and then returns to its calling constructor, and so on back down to the completion of the constructor of the actual instnce being created.
* Constructors can use any access modifier (even `private`!).
* The compiler will create a default constructor if you don't create any constructors in your class.
* The default constructor is a no-arg constructor with a no-arg call to `super()`.
* The first statement of every constructor must be a call either to `this()` (an overloaded constructor) or to `super()`.
* The compiler will add a call to `super()` unless you have already put in a call to `this()` or `super()`.
* Instance members are accessible only after the `super` constructor runs.
* `abstract` classes have constructors that are called when a concrete subclass is instantiated.
* Interfaces do not have constructors.
* If your superclass does not have a no-arg constructor, you must create a constructor and insert a call to `super()` with arguments matching those of the superclass constructor.
* Constructors are never inherited; thus they cannot be overridden.
* A constructor can be directly invoked only by another constructor (using a call to `super()` or `this()`).
