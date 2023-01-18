package co.com.bots.rpa.botsmsrpa.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.bots.rpa.botsmsrpa.entity.compuest.DetalleParametroPK;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "detalleparametro")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetalleParametro {

	@EmbeddedId
	private DetalleParametroPK id;
	
	private String valor;
	
	private Character estado;
	
	@Column(name = "observaciones")
	private String observacion;
	
}
