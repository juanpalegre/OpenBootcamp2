package entities;

public abstract class SmartDevice {

    protected String marca;
    protected String modelo;
    protected double precio;

    public SmartDevice(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    protected SmartDevice() {
    }

    public String darBienvenidaAlUsuario(){
        return "Bienvenido a su nuevo SmartDevice " + marca + " " + modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
