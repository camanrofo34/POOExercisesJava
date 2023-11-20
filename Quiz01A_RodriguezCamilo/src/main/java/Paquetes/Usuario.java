/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

/**
 *
 * @author Personal
 */
public class Usuario {
    String IdPrs, NmbCmpl;
    int noCnt;

    public Usuario() {
    }

    public Usuario(String IdPrs, String NmbCmpl, int noCnt) {
        this.IdPrs = IdPrs;
        this.NmbCmpl = NmbCmpl;
        this.noCnt = noCnt;
    }

    public String getIdPrs() {
        return IdPrs;
    }

    public String getNmbCmpl() {
        return NmbCmpl;
    }

    public int getNoCnt() {
        return noCnt;
    }

    public void setIdPrs(String IdPrs) {
        this.IdPrs = IdPrs;
    }

    public void setNmbCmpl(String NmbCmpl) {
        this.NmbCmpl = NmbCmpl;
    }

    public void setNoCnt(int noCnt) {
        this.noCnt = noCnt;
    }
    
    
}
