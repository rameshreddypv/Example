public class Example {

public Example () {
  System.out.println("this Constructor");

}
public void display(){
  System.out.println("this is display method");

}
public static void main(String args[]){

  Example e = new Example();
  e.display();
}
}
