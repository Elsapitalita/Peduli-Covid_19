package hibernate.entity;
// Generated Jul 8, 2020 9:48:47 AM by Hibernate Tools 4.3.1



/**
 * Gejala generated by hbm2java
 */
public class Gejala  implements java.io.Serializable {


     private int idgejala;
     private String nama;
     private String detail;

    public Gejala() {
    }

    public Gejala(int idgejala, String nama, String detail) {
       this.idgejala = idgejala;
       this.nama = nama;
       this.detail = detail;
    }
   
    public int getIdgejala() {
        return this.idgejala;
    }
    
    public void setIdgejala(int idgejala) {
        this.idgejala = idgejala;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }




}


