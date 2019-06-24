package Generics;

public class Pair<S,C>{

    private S s;
    private C c;
    public S getFirst(){
        return s;
    }

    public C getSecond(){
        return c;
    }

    public void setFirst(S s){
        this.s = s;
    }

    public void setSecond(C c){
        this.c = c;
    }

        public static class demoFirst implements Comparable <demoFirst>{
            private int a;
            private double b;
            public demoFirst(int a1, double b2){
                a = a1;
                b = b2;
            }

            public int getA() {
                return a;
            }

            public double getB() {
                return b;
            }

            public void setA(int a) {
                this.a = a;
            }

            public void setB(double b) {
                this.b = b;
            }

            @Override
            public String toString() {
                return "demoFirst{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }

            @Override
            public int compareTo(demoFirst o) {
                if (this.a == o.a&&this.b == o.b) return 1;
                return 0;
            }
        }

    public static class demoSecond implements Comparable <demoSecond> {
        private int a;
        private int b;
        private int c;

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public void setC(int c) {
            this.c = c;
        }

        public demoSecond(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public int compareTo(demoSecond o) {
            if (this.a == o.a&&this.b == o.b&&this.c == o.c) return 1;
            return 0;
        }

        @Override
        public String toString() {
            return "demoSecond{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }
    }

    public static <E extends Comparable> boolean compare(E eFirst, E eSecond){
        return eFirst.compareTo(eSecond) == 1;

    }

    public Pair(S s, C c) {
        this.s = s;
        this.c = c;
    }


}
