# Java

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
