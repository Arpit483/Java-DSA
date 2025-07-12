
**String is a Java class**

There are two concepts to be understood : 
1. String pool
2. Immutability

![[Pasted image 20250712211652.png]]
This is **string pool**
**String Pool** is a separate memory pool inside the heap. 
String are **immutable** ( Unchangeable ).

```java
String a =  "HEllo";
a = "Bye";

```
so in the first case we could get output as **HEllo**
but in the second case we get the output as **Bye**
this is because a new keyword bye is created in string pool and object a points to it.  


## Comparison of String

### == Comparator
 Checks if reference variable are pointing to same objects 

   ![[Pasted image 20250712212424.png]]
   
   ```java
   
String a  = new String ( "Hello");
String b  = new String ( "Hello");
```

	In this case these values would be created outside the string pool but inside the heap
		In this case when we use == method it will give false as output 

### Pretty Printing

```java
System.out.printf("Preety %.2f" , a );
```

Because of *printf* it is formatted printing as we can see the *%.2f* symbol shows printing upto 2 digits of float 

refer : 

**PlaceHolders :** 
- **%c** - Character
- **%d** - Decimal number (base 10)
- **%e** - Exponential floating-point number
- **%f** - Floating-point number
- **%i** - Integer (base 10)
- **%o** - Octal number (base 8)
- **%s** - String
- **%u** - Unsigned decimal (integer) number
- **%x** - Hexadecimal number (base 16)
- **%t** - Date/time
- **%n** - Newline

## String Concatenation

refer :  

## String Builder


In the performance code as we can see
```java
for (int i = 0; i < 26; i++) {  
    char ch = (char)('a' + i );  
    System.out.print(ch + " ");  
    s = s + ch;  
}
```

this actually occupies a lot of memory as every time a chars is added a new string is created in string pool due to this a lot of memory is wasted 

