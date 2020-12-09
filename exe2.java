package Exercise;

    abstract class Bank {
        abstract void getBalance();
    }
    class Bank1 extends Bank {
        void getBalance() {
            System.out.println("Balance Bank 1: $100");
        }
    }
    class Bank2 extends Bank {
        void getBalance() {
            System.out.println("Balance Bank 2: $150");
        }
    }
    class Bank3 extends Bank {
        void getBalance() {
            System.out.println("Balance Bank 3: $200");
        }
    }
    public class exe2 {
        public static void main (String[] args) {
            Bank1 a = new Bank1();
            Bank2 b = new Bank2();
            Bank3 c = new Bank3();
            a.getBalance();
            b.getBalance();
            c.getBalance();
        }
    }