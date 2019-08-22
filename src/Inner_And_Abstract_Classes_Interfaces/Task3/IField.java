package Inner_And_Abstract_Classes_Interfaces.Task3;

import java.lang.reflect.Array;

public interface IField {



    public abstract void firstChoose(int y, int x);
    public abstract void pick(int y, int x);
    public abstract void setField();
    public abstract void setBombs();

    public abstract int openCell(int x, int y);
    public abstract void showPlayersField();
    public abstract void showFullField();
    public abstract char aroundAmountBombs(int y, int x);






}

