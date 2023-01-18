package co.com.bots.rpa.botsmsrpa.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "logs")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLog")
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
	@JoinColumn(name = "usuario_idUsuario")
	private Usuario usuario;

}
