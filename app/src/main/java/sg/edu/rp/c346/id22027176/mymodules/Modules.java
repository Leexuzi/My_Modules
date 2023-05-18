package sg.edu.rp.c346.id22027176.mymodules;

import java.io.Serializable;

public class Modules implements Serializable {

    private String code;
    private String name;
    private int year;
    private int sem;
    private int cred;
    private String venue;

    public Modules(String code, String name, int year, int sem, int cred, String venue){
        this.code = code;
        this.name = name;
        this.year = year;
        this.sem = sem;
        this.cred = cred;
        this.venue = venue;
    }

    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getSem(){
        return sem;
    }
    public int getCred(){
        return cred;
    }
    public String getVenue(){
        return venue;
    }
}
