package co.com.bots.rpa.botsmsrpa.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.bots.rpa.botsmsrpa.entity.compuest.RobotUsuarioPK;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "robotUsuario")
@Data
@ToString
public class RobotUsuario {
	
	@EmbeddedId
	private RobotUsuarioPK id;
	
	private Character estado;

}
