class Mother {
  int x;
  
  void show() {
    System.out.println("This is the show() method of the Mother class.");
  }
}

class Child extends Mother {
  // Empty body, but Child class inherits x and show() from Mother class
}

class Application {
  public static void main(String args[]) {
    Mother m = new Mother();
    m.show(); // Calls show() method of Mother class

    Child ch = new Child();
    ch.show(); // Calls inherited show() method from Mother class
  }
}
