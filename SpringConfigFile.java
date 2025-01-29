package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	
	@Bean
	public Address createAddrObj() {
		Address addr= new Address(200,"badlapur",222125);
		
		;
		return addr;
		
	}
	@Bean
	public Student CreateStdObj()
	{
		Student std = new Student(102,"Alok maurya",createAddrObj());
		
		return std;
		
	}
}
