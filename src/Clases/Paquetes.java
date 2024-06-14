package Clases;

public class Paquetes {
    private int paqueteID;
    private String clienteID;
    private String fragil;
    private double peso;
    private double altura;
    private double anchura;
    private String ListaDeObjetos;
    private String datosAdicionales;
    private String numeroDePaquete;

    // Getters y Setters
    public int getPaqueteID() {
        return paqueteID;
    }

    public void setPaqueteID(int paqueteID) {
        this.paqueteID = paqueteID;
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public String getFragil() {
        return fragil;
    }

    public void setFragil(String fragil) {
        this.fragil = fragil;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public String getListaDeObjetos() {
        return ListaDeObjetos;
    }

    public void setListaDeObjetos(String listaDeObjetos) {
        this.ListaDeObjetos = listaDeObjetos;
    }

    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public String getNumeroDePaquete() {
        return numeroDePaquete;
    }

    public void setNumeroDePaquete(String numeroDePaquete) {
        this.numeroDePaquete = numeroDePaquete;
    }
}