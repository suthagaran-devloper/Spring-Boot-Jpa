package com.suthan.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emp_table")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@Column(name="eid")
	private Integer eno;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="esal")
	private Double esal;
	
	
	
}
