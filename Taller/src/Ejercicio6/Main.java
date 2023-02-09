package Ejercicio6;

public class Main {
    public static void main(String args[]) {
        ejercicio6 pagoEmpleado = new ejercicio6();

        pagoEmpleado.codEmpleado = 123456;
        pagoEmpleado.setSalarioBasico(1000);
        pagoEmpleado.horasExtra = 2;
        pagoEmpleado.setNumeroHoras(24);
        pagoEmpleado.setDescuentoPrestamo(5000);

        System.out.println("The value of overtime is: " + pagoEmpleado.calcularValorHE());
        System.out.println("The accrued value is: " + pagoEmpleado.calcularDevengado());
        System.out.println("The value of the deducted is: " + pagoEmpleado.calcularDeducido());
        System.out.println("The net of your payment is: " + pagoEmpleado.calcularNeto());
    }
}
