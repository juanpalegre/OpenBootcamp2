package entities;

public class SmartWatch extends SmartDevice {

    private String color;

    public SmartWatch(){}

    public SmartWatch(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio);
        this.color = color;
    }

    public String conectar(){
        return "Realizando la conexión con su teléfono";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
