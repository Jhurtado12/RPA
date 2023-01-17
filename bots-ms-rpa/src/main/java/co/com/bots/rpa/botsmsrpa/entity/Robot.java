package co.com.bots.rpa.botsmsrpa.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "robot")
@Data
@ToString
public class Robot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRobot")
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	private String rutaDocumentacion;
	
	private LocalTime horaEjecucion;
	
	private Character estado;
	
}
