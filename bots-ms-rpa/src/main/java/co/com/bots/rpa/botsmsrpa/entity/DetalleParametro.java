package co.com.bots.rpa.botsmsrpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.bots.rpa.botsmsrpa.entity.compuest.DetalleParametroPK;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "detalleparametro")
@Data
@ToString
public class DetalleParametro {

	@EmbeddedId
	private DetalleParametroPK id;
	
	private String valor;
	
	private Character estado;
	
	@Column(name = "observaciones")
	private String observacion;
	
}
