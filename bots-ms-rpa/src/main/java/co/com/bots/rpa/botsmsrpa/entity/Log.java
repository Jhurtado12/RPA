package co.com.bots.rpa.botsmsrpa.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

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
@Table(name = "logs")
@Data
@ToString
public class Log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRobot")
	private Long id;
	
	private String valor;
	
	private Character estado;
	
	private LocalDateTime fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name = "robot_idRobot")
	private Robot robot;
	
	@ManyToOne
	@JoinColumn(name = "evento_idEvento")
	private Evento evento;
	
	@ManyToOne
	@JoinColumn(name = "usuario_idUsurio")
	private Usuario usuario;

}
