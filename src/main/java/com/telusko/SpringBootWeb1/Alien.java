package com.telusko.SpringBootWeb1;

public class Alien {
    private int aid;
    private String aname;
    private int aclass;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAclass() {
        return aclass;
    }

    public void setAclass(int aclass) {
        this.aclass = aclass;
    }


    @Override
    public String toString() {
        return "Alien:" +
                "aid is " + aid +
                ", aname is " + aname + '-' +
                ", aclass is " + aclass +
                '}';
    }
}
