public class Guest implements Comparable<Guest>
{ 
 
    String firstName; 
    String lastName; 
    int age; 
    String phoneNumber; 
  
    
    public Guest(String firstName, String lastName, int age, String phoneNumber) 
    { 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.age = age; 
        this.phoneNumber = phoneNumber; 
    } 
  
    public String toString() { 
        return("{" + this.lastName + ", " + this.firstName + ", " + this.age + ", "+ this.phoneNumber +"}"); 
    } 

    public int compareTo(Guest g) 
    { 
        return this.age - g.age; 
    } 

} 