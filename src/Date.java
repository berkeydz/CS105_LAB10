package src;

public class Date {

    private int day;
    private int month;
    private int year;

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int daysInBetween(Date date1, Date date2){

        return (date1.year - date2.year) * 360 + (date1.month - date2.month) * 30 + date1.day - date2.day;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }
}

