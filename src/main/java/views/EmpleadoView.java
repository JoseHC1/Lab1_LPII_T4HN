package views;
import Controller.EmpleadoController;


public class EmpleadoView {
	public static void main(String[] arg) {
		
		//REGISTRAR EMPLEADO
		//String empleado= new EmpleadoController().crearEmpleado("Cueva", "Stephano", 19,"Masculino", 3500.80);
		//String empleado= new EmpleadoController().crearEmpleado("Cueva", "Renzo", 30,"Masculino", 4692.80);
		//String empleado= new EmpleadoController().crearEmpleado("Carrasco", "Genesis", 18 ,"Femenino", 4000.80);
		//String empleado= new EmpleadoController().crearEmpleado("Mendoza", "Carlos", 20 ,"Masculino", 3500.70);
		//String empleado= new EmpleadoController().crearEmpleado("Fernandez", "Kayleigh", 14 ,"Femenino", 3985.80);
		//System.out.println(empleado);
		
		//BUSCAR EMPLEADO
		//String buscarEmpleado = new EmpleadoController().BuscarEmpleado(10);
		//System.out.println(buscarEmpleado);
		
		//ELIMINAR EMPLEADO
		//String empleado= new EmpleadoController().EliminarEmpleado(4);
		//String empleado= new EmpleadoController().EliminarEmpleado(5);
		//System.out.println(empleado);
		
		//ACTUALIZAR EMPLEADO
		String empleado= new EmpleadoController().ActualizarEmpleado(2, "Jose","Huallpa");
		System.out.println(empleado);
		
	}
	
}
