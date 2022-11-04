package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Specs {
	private int ram;
	private String gpu;
	private String cpu;
	
	// Constructors
	
	public Specs(int ram, String gpu, String cpu) {
		super();
		this.ram = ram;
		this.gpu = gpu;
		this.cpu = cpu;
	}
	
	public Specs() {
		super();
	}

	// Getters and Setters
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	// toString
	
	@Override
	public String toString() {
		return "Specs [ram=" + ram + ", gpu=" + gpu + ", cpu=" + cpu + "]";
	}
	

}
