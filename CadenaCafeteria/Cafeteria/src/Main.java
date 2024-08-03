import gt.edu.miumg.cafeteria.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan Perez", "Gerente", 1500);
        System.out.println("empleado = " + empleado);
        Empleado empleado2 = new Empleado("Maria Perez", "Cajera", 1000);
        System.out.println("empleado2 = " + empleado2);

        Equipo equipo = new Equipo("cocina", "apagado");
        System.out.println("equipo = " + equipo);

        Ingrediente ingrediente1 = new Grano("cafe");
        System.out.println("ingrediente1 = " + ingrediente1);
        Ingrediente ingrediente2 = new Leche("entera", 10);
        System.out.println("ingrediente2 = " + ingrediente2);
        Ingrediente ingrediente3 = new Agua(10);
        System.out.println("ingrediente3 = " + ingrediente3);

        Cafe colombiano = new cafeColombiano("Cafe Colombiano", 10 , 5.00);
        System.out.println("cafe = " + colombiano);
        Cafe espresso = new EspressoItaliano(5, 10, 5.00);
        System.out.println("espresso = " + espresso);

        Sucursal sucursalColombia = new Sucursal("Sucursal Colombia", "zona 10");
        System.out.println("sucursal = " + sucursalColombia);
        sucursalColombia.agregarEmpleado(empleado);
        sucursalColombia.agregarEmpleado(empleado2);
        sucursalColombia.agregarEquipo(equipo);
        sucursalColombia.agregarEspecialidad(colombiano);
        System.out.println("sucursal = " + sucursalColombia);

        Sucursal sucursalItalia = new Sucursal("Sucursal Italia", "zona 10");
        System.out.println("sucursal = " + sucursalItalia);
        sucursalItalia.agregarEmpleado(empleado);
        sucursalItalia.agregarEquipo(equipo);
        sucursalItalia.agregarEspecialidad(espresso);
        System.out.println("sucursal = " + sucursalItalia);
    }


}