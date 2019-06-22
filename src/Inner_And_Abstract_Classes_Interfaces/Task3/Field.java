package Inner_And_Abstract_Classes_Interfaces.Task3;

public  class Field implements IField{
    private static int height;
    private static int width;
    private static int amountBombs;

    public  int getHeight() {
        return height;
    }

    public static void setHeight(int h) {
        height = h;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int w) {
        width = w;
    }

    public static void setAmountBombs(int b) {
        amountBombs = b;
    }



    static char[][] arrayChars;
    @Override
    public void setField() {
      arrayChars = new char[height][width];
      for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                arrayChars[i][j] = Element.getRandomChar();
                System.out.print(arrayChars[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
