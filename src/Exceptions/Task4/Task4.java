package Exceptions.Task4;

public class Task4 {
    private static int n = 12;
    private static String methodName;
    public static void main(String[] args) {


        while (n>0){
            try{
                double rand = Math.random()*3+1;
                int choose = (int)rand;
                switch (choose){
                    case 1:
                        methodName = "First";
                        MethodFirst();
                        break;
                    case 2:
                        methodName = "Second";
                        MethodSecond();
                        break;
                    case 3:
                        methodName = "Third";
                        MethodThird();
                        break;

                }

            }
            catch (MyExceptionFirst|MyExceptionSecond|MyExceptionThird e){
                System.out.println(methodName + "Method throws " + e.toString());
                //e.printStackTrace();
            }
            finally {
               // System.out.println("exception was");
                n--;
            }
        }
    }



    public static void MethodFirst() throws MyExceptionFirst{
        throw new MyExceptionFirst("First Exception");
    }
    public static void MethodSecond() throws MyExceptionSecond{
        throw new MyExceptionSecond("Second Exception");
    }
    public static void MethodThird() throws MyExceptionThird{
        throw new MyExceptionThird("Third Exception");
    }


}
