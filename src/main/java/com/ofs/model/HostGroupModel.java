package com.ofs.model;

public class HostGroupModel {
	 int id;
	 int parent_id;
	 String name;
	 boolean host_baseline;
	 boolean suppress_excluded_services;
	 boolean inverse_suppression;
	 boolean host_trap;
	 boolean send_to_cta;
	 String description;
	
	String[] ip_address_ranges;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHost_baseline() {
		return host_baseline;
	}
	public void setHost_baseline(boolean host_baseline) {
		this.host_baseline = host_baseline;
	}
	public boolean isSuppress_excluded_services() {
		return suppress_excluded_services;
	}
	public void setSuppress_excluded_services(boolean suppress_excluded_services) {
		this.suppress_excluded_services = suppress_excluded_services;
	}
	public boolean isInverse_suppression() {
		return inverse_suppression;
	}
	public void setInverse_suppression(boolean inverse_suppression) {
		this.inverse_suppression = inverse_suppression;
	}
	public boolean isHost_trap() {
		return host_trap;
	}
	public void setHost_trap(boolean host_trap) {
		this.host_trap = host_trap;
	}
	public boolean isSend_to_cta() {
		return send_to_cta;
	}
	public void setSend_to_cta(boolean send_to_cta) {
		this.send_to_cta = send_to_cta;
	}
	 public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String[] getIp_address_ranges() {
			return ip_address_ranges;
		}
		public void setIp_address_ranges(String[] ip_address_ranges) {
			this.ip_address_ranges = ip_address_ranges;
		}

}
