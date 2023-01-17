package co.com.bots.rpa.botsmsrpa.entity.compuest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import co.com.bots.rpa.botsmsrpa.entity.Parametro;
import co.com.bots.rpa.botsmsrpa.entity.Robot;
import lombok.Data;

@Embeddable
@Data
public class DetalleParametroPK implements Serializable {

	private static final long serialVersionUID = 3903501749761375329L;

	@Column(name = "idDetalleParametro")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "robot_idRobot")
	private Robot robot;
	
	@ManyToOne
	@JoinColumn(name = "parametro_idParametro")
	private Parametro parametro;
	
}
