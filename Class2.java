public class Class2 {
string name;
int age;
    
student ( String n, int a) {
    name= "name";
    age= a;
}
void display(){
    System.out.println ("Name: "+ name +",Age : " + age);
}
    
}
public class Main {
    public static void main(String[] args){
        Student student1 =newStudent("sakchhi",20);
        student1.display();
    }
}
