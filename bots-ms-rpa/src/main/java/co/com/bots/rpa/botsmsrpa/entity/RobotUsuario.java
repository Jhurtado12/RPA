package co.com.bots.rpa.botsmsrpa.entity;

import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.bots.rpa.botsmsrpa.entity.compuest.RobotUsuarioPK;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "robotUsuario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RobotUsuario {
	
	@EmbeddedId
	private RobotUsuarioPK id;
	
	private Character estado;

}
