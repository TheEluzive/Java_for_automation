package Java_Fundamentals;

public class Hello {

        public static void main(String args[]) {
            for(int i=0; i<3; i++) {
                switch( i ) {
                    case 0: break;
                    case 1:
                        System.out.print( "one " );
                        break;
                    case 2:
                        System.out.print( "two " );
                        break;
                    case 3:
                        System.out.print( "three " );
                        break;
                }
            }
            System.out.print( "done" );
        }

}
