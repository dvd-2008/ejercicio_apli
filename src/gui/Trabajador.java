
package gui;

public class Trabajador {
      // Atributos
    public int codigo;
    public String nombre;
    public int horasTrabajadas;
    public double tarifaHoraria;

    public Trabajador() {
    }

    // Constructor
    public Trabajador(int codigo, String nombre, int horasTrabajadas, double tarifaHoraria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHoraria = tarifaHoraria;
    }

    // Método para calcular el sueldo bruto
    public double calcularSueldoBruto() {
        return horasTrabajadas * tarifaHoraria;
    }

    // Método para calcular el descuento
    public double calcularDescuento() {
        double sueldoBruto = calcularSueldoBruto();
        if (sueldoBruto < 4500) {
            return 0.12 * sueldoBruto;
        } else if (sueldoBruto >= 4500 && sueldoBruto < 6500) {
            return 0.14 * sueldoBruto;
        } else {
            return 0.16 * sueldoBruto;
        }
    }

    // Método para calcular el sueldo neto
    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularDescuento();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHoraria() {
        return tarifaHoraria;
    }

    public void setTarifaHoraria(double tarifaHoraria) {
        this.tarifaHoraria = tarifaHoraria;
    }
}
