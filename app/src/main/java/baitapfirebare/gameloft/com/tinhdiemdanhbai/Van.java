package baitapfirebare.gameloft.com.tinhdiemdanhbai;

/**
 * Created by Tonqt Thonq on 10/31/2017.
 */

public class Van {
    private int p1, p2, p3, p4;
    public String c1,c2,c3,c4;

    public Van(int p1, int p2, int p3, int p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        if(p1>=3) c1="#0000ff";
        if(p1==2) c1="#00ff00";
        if(p1==1) c1="#ffffff";
        if(p1<1) c1="#ff0000";
        if(p2>=3) c2="#0000ff";
        if(p2==2) c2="#00ff00";
        if(p2==1) c2="#ffffff";
        if(p2<1) c2="#ff0000";
        if(p3>=3) c3="#0000ff";
        if(p3==2) c3="#00ff00";
        if(p3==1) c3="#ffffff";
        if(p3<1) c3="#ff0000";
        if(p4>=3) c4="#0000ff";
        if(p4==2) c4="#00ff00";
        if(p4==1) c4="#ffffff";
        if(p4<1) c4="#ff0000";
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }
}
