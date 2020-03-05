public class Profesor extends Persona{

	String departamento;
	String asignatura;
	public Profesor(String dni, String nombre, int edad, String departamento, String asignatura) {
		super(dni, nombre, edad);
		this.departamento = departamento;
		this.asignatura = asignatura;
	}
	@Override
	public String toString() {
		return "Profesor: " + super.toString() +"departamento=" + departamento + ", asignatura=" + asignatura ;
	}
	
	
	
	

}
