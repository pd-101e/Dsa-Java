![image](https://github.com/pd-101e/Dsa-Java/assets/59065854/dd1e8a6a-860b-4180-b089-ca8d83f02f9c)
try{
}catch(Exeption e)
{System.out.println(e.getClass().toString().replaceFirst("class ", ""));}

instanceof Keyword in Java---------------------
// Java Program to Illustrate instanceof Keyword

// Importing required I/O classes
import java.io.*;

// Main class
class GFG {
	public static void main(String[] args)
	{

		// Creating object of class inside main()
		GFG object = new GFG();

		// Returning instanceof
		System.out.println(object instanceof GFG);
	}
}

-------------------------------------------------
import java.io.*;
import javafx.util.*;
import java.util.*;
import java.lang.*;


/*To implement a custom comparable for a priority queue in Java, you need to do the following steps:

- Define a class that implements the `Comparable<T>` interface, where `T` is the type of the elements in the priority queue. For example, if you want to store `Student` objects in the priority queue, you can define a class like this:

```java
class Student implements Comparable<Student> {
  // fields, constructors, getters and setters
  // ...

  // override the compareTo method to define the natural ordering of Student objects
  @Override
  public int compareTo(Student other) {
    // compare the students by their cgpa
    return Double.compare(this.cgpa, other.cgpa);
  }
}
```

- Alternatively, you can define a custom comparator that implements the `Comparator<T>` interface and pass it to the constructor of the priority queue. For example, if you want to sort the students by their name instead of their cgpa, you can define a comparator like this:

```java
class NameComparator implements Comparator<Student> {
  // override the compare method to define the custom ordering of Student objects
  @Override
  public int compare(Student s1, Student s2) {
    // compare the students by their name
    return s1.name.compareTo(s2.name);
  }
}
```

- Then, you can create a priority queue with this comparator as follows:

```java
PriorityQueue<Student> pq = new PriorityQueue<>(new NameComparator());
```

- You can also use lambda expressions or method references to create comparators without defining a separate class. For example, you can use the following code to create a priority queue that sorts the students by their id:

```java
PriorityQueue<Student> pq = new PriorityQueue<>((s1, s2) -> s1.id - s2.id);
// or
PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparing(Student::id));
```

- You can find more examples and explanations about Java priority queues and comparators in these web pages: ¹, ², ³, ⁴, and ⁵. I hope this helps you understand how to implement a custom comparable for a priority queue in Java.

Source: Conversation with Bing, 10/23/2023
(1) Java priority queues and comparable interface - Stack Overflow. https://stackoverflow.com/questions/18355932/java-priority-queues-and-comparable-interface.
(2) Implement PriorityQueue through Comparator in Java. https://www.geeksforgeeks.org/implement-priorityqueue-comparator-java/.
(3) Java Priority Queue (+ Comparator Example) - HowToDoInJava. https://howtodoinjava.com/java/collections/java-priorityqueue/.
(4) Implement a custom comparator for my PriorityQueue. https://stackoverflow.com/questions/60594820/implement-a-custom-comparator-for-my-priorityqueue.
(5) priority queue - Java PriorityQueue with custom Comparator - Stack Overflow. https://stackoverflow.com/questions/46891478/java-priorityqueue-with-custom-comparator.*/
