abstract class Warrior {
    public abstract void fight();
    public abstract void obey();
    public abstract void kind();
}

class Pandav extends Warrior {
    public void fight() {
        System.out.println("Pandavs are skilled fighters");
    }
    public void obey() {
        System.out.println("Pandavs are obedient");
    }
    public void kind() {
        System.out.println("Pandavs are kind");
    }
}

class Bheem extends Pandav {
    public void kind() {
        System.out.println("Bheem is less kind than Arjun");
    }
}

class Arjun extends Pandav {
    public void kind() {
        System.out.println("Arjun is kind");
    }
}

class Kaurav extends Warrior {
    public void fight() {
        System.out.println("Kauravs are fighters");
    }
    public void obey() {
        System.out.println("Kauravs are disobedient");
    }
    public void kind() {
        System.out.println("Kauravs are cruel");
    }
}

class Vikarn extends Kaurav {
    public void kind() {
        System.out.println("Vikarn is noble");
    }
}

class Bharatvanshi extends Warrior {
    public void fight() {
        System.out.println("All Bharatvanshis are fighters");
    }
    public void obey() {
        System.out.println("All Bharatvanshis are obedient");
    }
    public void kind() {
        System.out.println("All Bharatvanshis are kind");
    }
}

public class InheritanceDesignExample {
    public static void main(String[] args) {
        Warrior pandav = new Pandav();
        pandav.fight(); // Output: Pandavs are skilled fighters
        pandav.obey(); // Output: Pandavs are obedient
        pandav.kind(); // Output: Pandavs are kind
        
        Warrior bheem = new Bheem();
        bheem.kind(); // Output: Bheem is less kind than Arjun
        
        Warrior arjun = new Arjun();
        arjun.kind(); // Output: Arjun is kind
        
        Warrior kaurav = new Kaurav();
        kaurav.fight(); // Output: Kauravs are fighters
        kaurav.obey(); // Output: Kauravs are disobedient
        kaurav.kind(); // Output: Kauravs are cruel
        
        Warrior vikarn = new
      }
}
