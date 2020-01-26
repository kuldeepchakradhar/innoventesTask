package com.innoventes.org.InnoventesApi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employee_address")
public class EmployeeAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	
	@NotNull
	private Long addr_Id;
	
	@NotNull
	private Long emp_Id;
	
	private String addressType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpId() {
		return emp_Id;
	}

	public void setEmpId(Long empId) {
		this.emp_Id = empId;
	}

	public Long getAddrId() {
		return addr_Id;
	}

	
	public void setAddrId(Long addrId) {
		this.addr_Id = addrId;
	}
	
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
}
