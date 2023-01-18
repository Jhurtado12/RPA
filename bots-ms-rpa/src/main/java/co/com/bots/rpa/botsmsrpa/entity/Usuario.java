package co.com.bots.rpa.botsmsrpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private Long telefono;
	
	@ManyToOne
	@JoinColumn(name = "empresas_idEmpresa")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "rol_idRol", insertable = false, updatable = false)
	private Rol rol;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "area_idArea", insertable = false, updatable = false)
	private Area area;
	
}
