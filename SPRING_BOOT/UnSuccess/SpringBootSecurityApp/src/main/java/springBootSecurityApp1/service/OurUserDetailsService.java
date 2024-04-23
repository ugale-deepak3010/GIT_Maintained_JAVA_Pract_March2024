package springBootSecurityApp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import springBootSecurityApp1.repository.OurUsersRepo;

@Component
public class OurUserDetailsService implements UserDetailsService {

	@Autowired
	private OurUsersRepo ourUsersRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return ourUsersRepo.findByEmail(username).orElseThrow();
	}

}
