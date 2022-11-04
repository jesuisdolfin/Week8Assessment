package dmacc.beans;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="my_computers")
public class Computer {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="brand")
	private String brand;
	@Column(name="monitors")
	private int monitors;
	@Autowired
	private Specs specs;
	
	// Constructors
	
	public Computer(int id, String type, String brand, int monitors, Specs specs) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.monitors = monitors;
		this.specs = specs;
	}
	public Computer(String type, String brand, int monitors, Specs specs) {
		super();
		this.type = type;
		this.brand = brand;
		this.monitors = monitors;
		this.specs = specs;
	}
	public Computer(String type, String brand, int monitors) {
		super();
		this.type = type;
		this.brand = brand;
		this.monitors = monitors;
	}
	public Computer(String brand, int monitors, Specs specs) {
		super();
		this.brand = brand;
		this.monitors = monitors;
		this.specs = specs;
	}
	public Computer(int monitors, Specs specs) {
		super();
		this.monitors = monitors;
		this.specs = specs;
	}
	public Computer(Specs specs) {
		super();
		this.specs = specs;
	}
	public Computer() {
		super();
		this.brand = "Asus";
	}
	
	// Getters and Setters
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMonitors() {
		return monitors;
	}
	public void setMonitors(int monitors) {
		this.monitors = monitors;
	}
	public Specs getSpecs() {
		return specs;
	}
	public void setSpecs(Specs specs) {
		this.specs = specs;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", type=" + type + ", brand=" + brand + ", monitors=" + monitors + ", specs="
				+ specs + "]";
	}
	
	
	
	
}
