package co.com.bots.rpa.botsmsrpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "evento")
@Data
@ToString
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private Long id;
	
	private String nombre;
	
	private String estado;
	
	private LocalDateTime fechaCreacion;
	
	private LocalDateTime fechaModificacion;

}
