# My_Java_Collections_Framework
This is a class project which required me to create LinkedList and ArrayList classes in JCF from scratch.
I created the Measurable interface which had one method declaration of getMeasure().
I implemented type parameterization in myLinkedlist and myArrayList so that these data structures could only contain objects (and subclasses)
of a certain class (in this case, Measurable type).

To test the functionality of my type parameterization,
I created the ChristmasTree and Lightbulb classes to implement the getMeasure() method in Measurable interface
and added objects of these classes to my myList implementations (MyArrayList and MyLinkedList).

The "DataSetGenerics" class is
a child class of MyArrayList, which is associated with another Java assignment but
it relates to this assignment as well. "Tester" and "DatasetGenericsTester"
provide JUnit and main method test cases to test the functionality of DataSetGenerics, MyLinkedList, and MyArrayList.

## Installation

Install JDK 8 from Oracle Website


## Usage
The purpose of MyList interface, MyArrayList and MyLinkedList classes is to mimic
the functionality of List interface, LinkedList and ArrayList classes in Java Collections Framework.

## Contributing
If you would like to make changes or add your own version of other data structures in Java Collections Framework,
submit a pull request. 
