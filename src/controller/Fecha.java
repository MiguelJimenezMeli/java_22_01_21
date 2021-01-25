package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private GregorianCalendar calendar;

    public Fecha() { calendar = new GregorianCalendar(); }

    public Fecha(int year){ this(year, 0);}

    public Fecha(int year, int month){this(year, month, 1);}

    public Fecha(int year, int month, int day){this(year, month, day, 0 );}

    public Fecha(int year, int month, int day, int hour){this(year, month, day, hour, 0 );}

    public Fecha(int year, int month, int day, int hour, int minute){this(year, month, day, hour, minute, 0 );}

    public Fecha(int year, int month, int day, int hour, int minute, int second)
    {calendar = new GregorianCalendar(year, month, day, hour, minute, second);}

    private int getAttr(int field) {return calendar.get(field); }

    public int getYear(){return getAttr(GregorianCalendar.YEAR);}

    public int getMonth(){return getAttr(GregorianCalendar.MONTH) + 1;}

    public int getDay(){return getAttr(GregorianCalendar.DAY_OF_MONTH);}

    public int getHour(){return getAttr(GregorianCalendar.HOUR_OF_DAY);}

    public int getMinute(){return getAttr(GregorianCalendar.MINUTE);}

    public int getSecond(){return getAttr(GregorianCalendar.SECOND);}

    @Override
    public String toString()
    {
        String date;
        date = String.join("-",
                Integer.toString(getYear()), Integer.toString(getMonth()), Integer.toString(getDay()));
        date += " " + String.join(":",
                Integer.toString(getHour()), Integer.toString(getMinute()), Integer.toString(getSecond()));
        return  date;
    }

    public boolean check()
    {
        boolean correct = true;
        correct &= getYear() >= 0;
        correct &= 0 <= getMonth() && getMonth()< 12;
        correct &= 1 <= getDay() && getDay()< 32;
        correct &= 0 <= getHour() && getHour()< 24;
        correct &= 0 <= getMinute() && getMinute()< 60;
        correct &= 0 <= getSecond() && getSecond()< 60;
        return  correct;
    }

    public void addDay() { calendar.add(GregorianCalendar.DAY_OF_MONTH, 1); }

    public  void dedDay() { calendar.add(GregorianCalendar.DAY_OF_MONTH, -1); }
}
