package Inner_And_Abstract_Classes_Interfaces.Minesweeper;

public interface IField {
    public abstract void setBoard(int firstX, int firstY);
    public abstract void showPlayerField();
    public abstract void showGameField();
    public abstract void firstPick();
    public abstract void setBombs(int firstX, int firstY);
    public abstract void setPlayerField();


}
