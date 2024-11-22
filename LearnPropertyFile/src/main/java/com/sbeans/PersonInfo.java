package com.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="com/property/info.properties")
public class PersonInfo {
	
	@Value("${per.id}")
	private Integer pid; // injecting  property File Value
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.add}")
	private String address;
	
	@Value("${per.email}")
	private String email;
	
	@Value("${per.dob}")
	private String dob;
	
	
	@Value("9944702358")
	private Long mobileNo; // injecting direct value
	
	@Value("${os.name}")
	private String os_name; // injecting system property
	
	@Value("${os.version}")
	private String os_ver;
	
	@Value("${Path}")
	private String path_data; // injecting enviroment  variable value

	@Override
	public String toString() {
		return "PersonInfo [\npid=" + pid + ", \npname=" + pname + ", \naddress=" + address + ", \nemail=" + email + ", \ndob="
				+ dob + ", \nmobileNo=" + mobileNo + ", \nos_name=" + os_name + ", \nos_ver=" + os_ver + ", \npath_data="
				+ path_data + "]";
	}

	
	
	
	

}
