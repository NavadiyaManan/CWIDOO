package azjm;

public class Employee {  
private int id;  
private String name;
private Address address;  

 
public Employee() {System.out.println("def cons");}  
  

public Employee(int id, String name) {  
    super();  
    this.id = id;  
    this.name = name; 
   
    
}  


public Employee(int id, String name, Address address) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.setAddress(address);  
} 
  
void show(){  
    System.out.println(id+" "+name);  
    System.out.println(address.toString());  
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}  
  
}  