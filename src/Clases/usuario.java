package Clases;

public class usuario {

    int id_eus;
    String nom_eus;
    String correo;
    String usuari;
    String contraseña;

    public usuario(int id_eus, String nom_eus, String correo, String usuari, String contraseña) {
        this.id_eus = id_eus;
        this.nom_eus = nom_eus;
        this.correo = correo;
        this.usuari = usuari;
        this.contraseña = contraseña;
    }

    public usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_eus() {
        return id_eus;
    }

    public void setId_eus(int id_eus) {
        this.id_eus = id_eus;
    }

    public String getNom_eus() {
        return nom_eus;
    }

    public void setNom_eus(String nom_eus) {
        this.nom_eus = nom_eus;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

}
