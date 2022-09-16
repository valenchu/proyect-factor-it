package com.factorit.start.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.factorit.start.utils.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "article")
public class articleEntity {
	
	@Id
	private String uiid;
	
	private LocalDate date;
	
	private BigDecimal amount;
	
	private Double cant;
	
	private String description;

}
