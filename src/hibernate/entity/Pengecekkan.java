package hibernate.entity;
// Generated Jul 8, 2020 9:48:47 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pengecekkan generated by hbm2java
 */
public class Pengecekkan  implements java.io.Serializable {


     private int idpengecekkan;
     private Date waktupengecekkan;
     private String hasilpengecekkan;

    public Pengecekkan() {
    }

	
    public Pengecekkan(int idpengecekkan, Date waktupengecekkan) {
        this.idpengecekkan = idpengecekkan;
        this.waktupengecekkan = waktupengecekkan;
    }
    public Pengecekkan(int idpengecekkan, Date waktupengecekkan, String hasilpengecekkan) {
       this.idpengecekkan = idpengecekkan;
       this.waktupengecekkan = waktupengecekkan;
       this.hasilpengecekkan = hasilpengecekkan;
    }
   
    public int getIdpengecekkan() {
        return this.idpengecekkan;
    }
    
    public void setIdpengecekkan(int idpengecekkan) {
        this.idpengecekkan = idpengecekkan;
    }
    public Date getWaktupengecekkan() {
        return this.waktupengecekkan;
    }
    
    public void setWaktupengecekkan(Date waktupengecekkan) {
        this.waktupengecekkan = waktupengecekkan;
    }
    public String getHasilpengecekkan() {
        return this.hasilpengecekkan;
    }
    
    public void setHasilpengecekkan(String hasilpengecekkan) {
        this.hasilpengecekkan = hasilpengecekkan;
    }




}

