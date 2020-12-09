package Exercise;

    abstract class Mark {
        abstract void getPercentage();
    }
    class A extends Mark {
        double percentage=0, Mark1, Mark2, Mark3;
        A (double m1, double m2, double m3) {
            this.Mark1 = m1;
            this.Mark2 = m2;
            this.Mark3 = m3;
    }
        void getPercentage(){
            percentage = (Mark1 + Mark2 + Mark3) / 300 * 100;
            System.out.println("Percentage class A: " +percentage+ "%");
        }
    }
    class B extends Mark{
        double percentage=0, Mark1, Mark2, Mark3, Mark4;
        B (double m1, double m2, double m3, double m4){
            this.Mark1 = m1;
            this.Mark2 = m2;
            this.Mark3 = m3;
            this.Mark4 = m4;
    }
        void getPercentage(){
            percentage = (Mark1 + Mark2 + Mark3 + Mark4) / 400 * 100;
            System.out.println("Percentage class B: " +percentage+ "%");
        }
    }
    public class exe3 {
        public static void main(String[] args) {
            A a = new A(80,90,70);
            B b = new B(70,65,90,80);
            a.getPercentage();
            b.getPercentage();
        }
    }

