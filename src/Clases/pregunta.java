package Clases;

public class pregunta {
   
    int id_pre;
    int id_ca;
    String desc_pre;
    String res1;
    String res2;
    String res3;
    String res4;
    String correcta;

    public pregunta(int id_pre, int id_ca, String desc_pre, String res1, String res2, String res3, String res4, String correcta) {
        this.id_pre = id_pre;
        this.id_ca = id_ca;
        this.desc_pre = desc_pre;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
        this.res4 = res4;
        this.correcta = correcta;
    }

    public int getId_pre() {
        return id_pre;
    }

    public void setId_pre(int id_pre) {
        this.id_pre = id_pre;
    }

    public int getId_ca() {
        return id_ca;
    }

    public void setId_ca(int id_ca) {
        this.id_ca = id_ca;
    }

    public String getDesc_pre() {
        return desc_pre;
    }

    public void setDesc_pre(String desc_pre) {
        this.desc_pre = desc_pre;
    }

    public String getRes1() {
        return res1;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public String getRes2() {
        return res2;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public String getRes3() {
        return res3;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

    public String getRes4() {
        return res4;
    }

    public void setRes4(String res4) {
        this.res4 = res4;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }
}
