package shafi.example.randomapp;

public class Boxer implements Fighting {


    @Override
    public String throwJab() {
        return "Throw Harder Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Harder Cross";
    }

    @Override
    public String throwHook() {
        return "Thow Harder Hook";
    }

    @Override
    public String throwUppercut() {
        return "Thow Harder Uppercut";
    }
}
