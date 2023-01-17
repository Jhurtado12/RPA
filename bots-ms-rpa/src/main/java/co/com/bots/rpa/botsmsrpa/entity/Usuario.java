package co.com.bots.rpa.botsmsrpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "usuario")
@Data
@ToString
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name = "empresas_idEmpresa")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "rol_idRol")
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name = "area_idArea")
	private Area area;
	
}
