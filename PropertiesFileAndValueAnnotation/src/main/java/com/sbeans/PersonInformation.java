package com.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "com/common/PersonInfo.properties")
public class PersonInformation {

	@Value("${per.id}")
	Integer id;
	@Value("${per.name}")
	String name;
	@Value("${per.addr}")
	String addr;
	@Value("${path}")
	String path;
	@Value("${os.name}")
	String os_name;
	@Value("${os.version}")
	String os_ver;

	@Override
	public String toString() {
		return "PersonInformation [id=" + id + ", name=" + name + ", addr=" + addr + ", os_name="
				+ os_name + ", os_ver=" + os_ver + "]";
	}

}
