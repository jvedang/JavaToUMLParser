The project takes input as Java Source code and creates a UML Diagram (Class diagram) for the
source Code. This project includes the following tools and libraries:

1. Eclipse Luna - IDE for the development of Project
2. Java Parser (https://github.com/javaparser/javaparser) - Java Parser used to parse the Java
Source code
3. java-parser-core-2.1.0.jar - The java parser jar file used to actually parse the java source
code
4. UML Generator – yUML (http://yuml.me/diagram/scruffy/class/draw )- yUML tool used to
create the UML Diagram after passing the class diagram structure as per the yUML
specifications for the required UML Diagram.
These tools and libraries are used as mentioned below:
1. This project is a Java Project, developed in Eclipse Luna IDE.
2. The Java Parser(https://github.com/javaparser/javaparser) mentioned above is used to
parse the complete java source code.
3. After the source code has been parsed, I have extracted the different parts of the code
required to form the UML diagram (e.g.: Class name, Instance variables, Primitive variables,
methods, extends, implements, associations and dependencies)
4. These different parts are then used to form a structured yUML URL according to
specifications provided in yUML.
5. This URL is then passed to yUML and a class diagram is generated from it and saved on the
disk.
