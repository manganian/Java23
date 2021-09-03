package pl.chojnacki.lesson2.homework;

public class Cinema {
    private int seatNumber;
    private int rowNumber;
    private boolean isFree;

    public Cinema(int seatNumber, int rowNumber, boolean isFree) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isFree = isFree;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
