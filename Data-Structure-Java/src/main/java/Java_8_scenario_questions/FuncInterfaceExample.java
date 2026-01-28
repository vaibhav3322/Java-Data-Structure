package Java_8_scenario_questions;

@FunctionalInterface
public interface FuncInterfaceExample {

    /*
      Scenario 1. take 2 abstract methods read() & write() in functional Interface and check?
      result :- compile time error - multiple abstract methods are found
     */

//    abstract void read();
//    abstract void write();

    /*
      Scenario 2. take 1 abstract method and any no of methods from Object Class in functional Interface and check?
      result :- No error it will work fine. As Interface can have any no of Object class methods in it.
     */

     void print(); // it is abstract method because it does have declaration but not implementation.
    abstract String toString(); // here toSting, equals() & hashCode() method are from Object class.
    abstract boolean equals(Object obj);
    int hashCode();


    /*
      Scenario 3. take 1 abstract method with abstract keyword and take 2nd method with no abstract keyword in functional Interface and check?
      result :- compile time error - multiple abstract methods are found
     */

//    abstract int result();
//    void transform(); // this is abstract method because it does not have implementation as it have only declaration.
}
