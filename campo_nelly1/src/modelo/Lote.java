package modelo;
// Generated 11 dic. 2018 14:13:43 by Hibernate Tools 4.3.1



/**
 * Lote generated by hbm2java
 */
public class Lote  implements java.io.Serializable {


     private int idlote;
     private Campo campo;
     private double superficielote;
     private String tiposuelo;
     private int numerolote;

    public Lote() {
    }

    public Lote(int idlote, Campo campo,  double superficielote, String tiposuelo, int numerolote) {
       this.idlote = idlote;
       this.campo = campo;
       this.superficielote = superficielote;
       this.tiposuelo = tiposuelo;
       this.numerolote = numerolote;
    }
   
    public int getIdlote() {
        return this.idlote;
    }
    
    public void setIdlote(int idlote) {
        this.idlote = idlote;
    }
    public Campo getCampo() {
        return this.campo;
    }
    
    public void setCampo(Campo campo) {
        this.campo = campo;
    }
    public double getSuperficielote() {
        return this.superficielote;
    }
    
    public void setSuperficielote(double superficielote) {
        this.superficielote = superficielote;
    }
    public String getTiposuelo() {
        return this.tiposuelo;
    }
    
    public void setTiposuelo(String tiposuelo) {
        this.tiposuelo = tiposuelo;
    }
    public int getNumerolote() {
        return this.numerolote;
    }
    
    public void setNumerolote(int numerolote) {
        this.numerolote = numerolote;
    }




}


