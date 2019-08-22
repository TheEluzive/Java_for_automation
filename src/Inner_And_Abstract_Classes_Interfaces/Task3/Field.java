package Inner_And_Abstract_Classes_Interfaces.Task3;

public  class Field implements IField{
    private static int height;
    private static int width;
    private static int amountBombs;
    private static int yFirst;
    private static int xFirst;
    private  char[][] arrayChars;
    private char[][] arrayCharsPlayers; //opened and not
    private char[][] arrayDigitAndBombs;
    private int openedCell;

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

    @Override
    public void firstChoose(int y, int x){
        xFirst = x;
        yFirst = y;
        setField();

        for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                if (arrayDigitAndBombs[i][j]== '0')
                    openCell(i,j);
            }
        }


    }

    @Override
    public void pick(int y, int x) {

    }

    @Override
    public int openCell(int y, int x) {
        arrayCharsPlayers[y][x] = arrayDigitAndBombs[y][x];
        openedCell++;
        if (openedCell == height*width - amountBombs - 1) return 2;
        if(arrayDigitAndBombs[y][x] == 'b') return 0;
        else return 1;

    }


    @Override
    public void setField() {
        arrayChars = new char[height][width];
        arrayCharsPlayers = new char[height][width];
        arrayDigitAndBombs = new char [height][width];
      for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                arrayChars[i][j] = '0';
                arrayCharsPlayers[i][j] = '-';
            }
      }
      setBombs();
      this.showFullField();




        for (int i=0; i<height; i++)
            for (int j = 0; j < width; j++)
                arrayDigitAndBombs[i][j] =  aroundAmountBombs(i,j);




    }

    @Override
    public void setBombs() {
        int amountBombsQueue = amountBombs;
        while (amountBombsQueue > 0){
            double randNBombWidth = Math.random()*width;
            double randNBombHeight = Math.random()*height;
            if ((int)randNBombHeight != yFirst&(int)randNBombWidth!=xFirst) //first pick can`t be with bomb inside
            if (arrayChars[(int)randNBombHeight][(int)randNBombWidth] == '0') {
                arrayChars[(int) randNBombHeight][(int) randNBombWidth] = 'b';
                amountBombsQueue--;
            }
        }


    }



    @Override
    public void showPlayersField() {
        for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arrayCharsPlayers[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void showFullField() {
        for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arrayChars[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public char aroundAmountBombs(int y, int x){
        int bombsAround = 0;
        String forReturn ="";

        for (int i =y-1; i<=y+1; i++)
            for (int j=x-1; j <= x+1; j++){

                if(i<=height-1&i>=0&j<=width-1&j>=0) {
                    if (arrayChars[y][x] != 'b')
                    if (arrayChars[i][j] == 'b') bombsAround++;{
                        forReturn = Integer.toString(bombsAround);

                    }

                }

            }


        return forReturn.charAt(0);
    }

}
