package br.com.Gabriel.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cambio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor; // bigdecimal = mais preciso
	private BigDecimal convertedValue; 
	private String enviroment;
	
	public Cambio(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal convertedValue,
			String enviroment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
		this.enviroment = enviroment;
	}
	
	public Cambio() {
		// TODO Auto-generated constructor stub
	}
	
}
