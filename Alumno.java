public class Alumno extends Persona{

	String asignatura;
	Boolean repetidor;
	
	public Alumno(String dni, String nombre, int edad, String asignatura, boolean repetidor) {
		super(dni, nombre, edad);
		this.asignatura = asignatura;
		this.repetidor = repetidor;
	}
	
	@Override
	public String toString() {
		return "Profesor: " + super.toString() +"asignatura=" + asignatura + ", repetidor=" + repetidor ;
	}
	
}
