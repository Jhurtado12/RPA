package co.com.bots.rpa.botsmsrpa.entity.compuest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import co.com.bots.rpa.botsmsrpa.entity.Robot;
import co.com.bots.rpa.botsmsrpa.entity.Usuario;
import lombok.Data;
import lombok.ToString;

@Embeddable
@Data
@ToString
public class RobotUsuarioPK implements Serializable {

	private static final long serialVersionUID = 6717559788587202078L;

	@Column(name = "idRobotUsuario")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "robot_idRobot")
	private Robot robot;
	
	@ManyToOne
	@JoinColumn(name = "usuario_idUsuario")
	private Usuario usuario;
	
}
