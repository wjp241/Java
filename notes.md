# Java

# Overall Process(Coding-to-Running)

1. Compilation
   - Developer writes a human-readable program in .java file.
   - Compiler compiles .java file to a machine-readable bytecode file in a .class format.   
   - Compilation catches mistakes before computer does any execution at all.
2. Interpretation & Execution
   - Java virtual machine executes the bytecode file OS independently.

# public static void main(string args[]) Explanation

#### Public

- Public means that this Method will be accessible by any Class(If other Classes can access this  Class).

#### Static

- It means the  given Method or variable is Class related, not instance related. It  can be accessed without creating a Class instance.

#### Void

- It defines what the  method can return. Void means the Method will not return any value.

#### main

- This Method name is searched by JVM as a starting point for an application.

#### String args[] / String… args

- It is the parameter to the main method. The argument name could be anything.

## Casting(Data Type Transformation)

- Manual casting is necessary:
  - from larger to smaller

- Automatic casting is possible:
  - from smaller data type to larger data type
  - but NOT, from larger to smaller

#### Example,

    - Data Size relationship
         byte < short < int < long < float < double
         (1)      (2)      (4)   (8)     (4)      (8)
         char < int < long < float < double
         (2)      (4)   (8)     (4)      (8)
       
       l-value = r-value
     
       double = int
       long = char
       int = (int)double   
       char = (char)int
       int = int   --> int
       long = long --> long
       float = float --> float
       int = double --> double
       int = char  --> int
       int = long  --> long
       long = float  --> float
       
       v1 + v2 = ?
    
       int   int --> int
       long long --> long
       float float --> float
       int   double --> double
       int   char  --> int
       int   long  --> long
       long  float  --> float
       char  char  --> int


### Variable Declaration&&Loops (For/While)

- declare variables outside of scopes

  #### Why?
  - to prevent extra declaration in every loop

# printf()

EX.

``` System.out.printf("age:%d", age) -> "age:14"``` 

#### Remember:

- For creating a new line, it is better to use '%n' than '\n' as it may print differently across different Oss.

Ex.

``` System.out.printf("age:%d%n", age); -> 출력후 줄바꿈을 한다.```

### What the heck is?

Ex.

``` System.outprintf("finger = [%5d] %n", finger); -> finger = [  10]```

@들어갈 십진법 정수의 수는 5개이다. 맨오른쪽으로 밀어쓴다. 빈공간은 띄어쓰기로 채운다. 이경우는 3개!

``` System.out.printf("finger=[%-5d]%n", finger); -> finger = [10   ]```

@왼쪽 줄맞춤해라. 들어갈 십진법 정수의 수는 5개이다. 빈공간은 띄어쓰기로 채운다.

``` System.out.printf("finger = [%05d] %n", finger) -> finger =[00010] ```

@왼쪽 줄맞춤해라. 5개의 십진법 정수가 들어간다. 빈공간은 0으로 채운다\\

# Scanner Class

Setup:

```java.util.Scanner```

```Scanner scanner = new Scanner(System.in);```

Some methods:

```scanner.next()``` takes out all the string until the first space. Afterwards, it places cursor in the same line where it left off.

```scanner.nextInt()``` takes out integer string until the first blank point and coverts it to int

```scanner.nextLine() ```reads all the strings until the end of the line. Afterwards, it places cursor in the next line beneath the line it left off.

##### Some methods to refer to later ....

``` java
public class ScannerClassExample2 {    
      public static void main(String args[]){                       
          String str = "Hello/This is JavaTpoint/My name is Abhishek.";  
          //Create scanner with the specified String Object  
          Scanner scanner = new Scanner(str);  
          System.out.println("Boolean Result: "+scanner.hasNextBoolean());            
          //Change the delimiter of this scanner  
          scanner.useDelimiter("/");  
          //Printing the tokenized Strings  
          System.out.println("---Tokenizes String---");   
        while(scanner.hasNext()){  
            System.out.println(scanner.next());  
        }  
          //Display the new delimiter  
          System.out.println("Delimiter used: " +scanner.delimiter());            
          scanner.close();  
          }    
}  
```

# OOP

## 객체의 구성요소

1. 속성 Property == 멤버변수 Member Variable == 특성 attribute == 필드 field == 상태 state

2. 기능 function == 메서드 method == 함수 function == 행위 behavior

### Methods

#### Static(Class) vs Instance Method

-  Static methods are methods that are in the scope of a class. These methods can be accessed via ClassA.methodB syntax. 

  ** Static methods can be accessed by both static methods and instance methods.

##### Now what about Instance methods?

- Instance methods can be accessed *ONLY* by instance methods! Class(static) methods do not have access to instance methods.

***Why?***

- 인스턴스변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 클래스메서드(static이 붙은 메서드)는 인스턴스 생성 없이 호출가능하므로 **클래스 메서드가 호출되었을때 인스턴스가 존재하지 않을 수도 있다**. 그래서 클래스 메서드에서 인스턴스변수 사용을 금지한다.

- This is because class methods ***do not have reference*** to instance methods, unlike the vice versa!

# Overloading

Okay, **overloading** is when a class has multiple method with the same name!

- overloading is possible when the methods have different number or type of parameters!
- If parameters have same number and type of parameters but ***have different name***s, this is **not overloading**!

# Constructor

Okay, what is constructor

- constructor is a method responsible for initializing the members (variables(attributes) and methods) of instance.
- this method is invoked when instantiation begins with the keyword "new".
- it must be:
  - named the same as the class name!
  - have no void attached, even though it returns nothing since it only initializes!
- Cool Facts
  - it's possible to have multiple constructors
  - when one constructor calls another constructor, it must be done with this keyword like this: 
    - this(type var, type var2)..\

# Inheritance

Terms:

​	조상 클래스 - 부모(parent) 클래스, 상위(super) 클래스, 기반(base) 클래스

​	자손 클래스 - 자식(child)클래스, 하위(sub) 클래스, 파생된(derived) 클래스

Some rules:

- constructors and initialization blocks do not get passed down. But only the members.
- sub class always has either the same or more members than the ancestor class.

# Composition

##### can be summarized as follows:

```class Point { int x; int y;}```

```class Circle {Point c = new Point(); int r;}``` 

### Which relationship?!: 

### Composite vs Inheritance

Ask yourself:  **does Car have a wheel? Is a  Sports car a car?**

상속관계 '~은 ~ 이다. (is-a)'

포함관계 '~은 ~ 을 가지고 있다.(has-a)'

# Array(배열)

다차원 (Multidimensional)

행 (Row) + 열 (Column)

Ex

```
[[1,2,3],[4,5,6],[7,8,9]]
```

array[0] = 행

array [0] [1] = 열

가변 배열 Variable Length Array

Ex

```java
int[][] score = new int[5][];
score[0] = new int[4];
score[1] = new int[3];
score[1] = new int[2];
score[1] = new int[2];
score[1] = new int[3];
```

# Lambda

One actually useful example to answer the question: "How does function/method parameters work in Java?" :

``` java
interface MyFunction {
	void run();
}

public class lambda {
	
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
        public static void main(String[] args) {
        	
        	MyFunction f1 = () -> System.out.println("f1.run()");
        	
        	MyFunction f2 = new MyFunction() {
        		public void run() {
        			System.out.println("f2.run()");
        		}
        	};
        	
        	MyFunction f3 = getMyFunction();
        	
        	f1.run();
        	f2.run();
        	f3.run();
        	
        	execute(f1);
        	execute( ()-> System.out.println("run()"));
        	
      }
        
}
```

# ASCII

### Good to Remember

- 'A' : 65 -> 'a' : 97 
- Capital and lowercase. Different by 32 !

# Rounding

Pattern 1:

```Float.parseFloat(String.format("%.2f", 1/3f))```

1. format the float argument (1/3f) into a string such that it's rounded to second decimal.
2. parse the string of float into a float data type.