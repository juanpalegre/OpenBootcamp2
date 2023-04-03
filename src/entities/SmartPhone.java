package entities;

public class SmartPhone extends SmartDevice{

    private String proveedorDeServicio;

    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, double precio, String proveedorDeServicio) {
        super(marca, modelo, precio);
        this.proveedorDeServicio = proveedorDeServicio;
    }

    public double calcularCostoMensualDelServicio(){
        //Considerando que el costo mensual del servicio es el 10% del valor del teléfono
        return precio * 1.10;
    }

    public String getProveedorDeServicio() {
        return proveedorDeServicio;
    }

    public void setProveedorDeServicio(String proveedorDeServicio) {
        this.proveedorDeServicio = proveedorDeServicio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", proveedorDeServicio='" + proveedorDeServicio + '\'' +
                '}';
    }
}
