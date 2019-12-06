# Java

# Overall Process

1. Compilation

   - Developer writes a human-readable program in .java file.
   - Compiler compiles .java file to a machine-readable bytecode file in a .class format.   
   - Compilation catches mistakes before computer does any execution at all.

2. Interpretation & Execution

   - Java virtual machine executes the bytecode file OS independently.

     

# public static void main(string args[]) Explanation

#### Public

Public means that this Method will be accessible by any Class(If other Classes can access this  Class.).

#### Static

It means the  given Method or variable is not instance-related but Class related. It  can be accessed without creating the instance of a Class.

#### Void

It defines what the  method can return. Void means the Method will not return any value.

#### main

This Method name is searched by JVM as a starting point for an application with a particular signature only.

#### String args[] / String… args

It is the parameter to the main method. The argument name could be anything.

## Casting(Data Type Transformation)

- Manual casting is necessary:
  - from larger to smaller

- Automatic casting is possible:
  - from smaller data type to larger data type
  - but NOT, from larger to smaller

# EX

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
