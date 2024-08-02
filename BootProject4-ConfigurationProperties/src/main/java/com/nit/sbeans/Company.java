package com.nit.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix = "org.nit")
public class Company {

	String name;
	String addr;
	Integer pinCode;
	Integer contact;

}
