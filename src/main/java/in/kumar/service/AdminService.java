package in.kumar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import in.kumar.Entity.AdminEntity;
import in.kumar.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adm;
	
	public void saveAdmin(AdminEntity s) {
		adm.save(s);
		
	}
	public 	Optional<String> findByEmail(String email) {
		return adm.findByEmail(email);
	}

}
