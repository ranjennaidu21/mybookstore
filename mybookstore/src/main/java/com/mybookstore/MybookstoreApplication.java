package com.mybookstore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mybookstore.domain.User;
import com.mybookstore.domain.security.Role;
import com.mybookstore.domain.security.UserRole;
import com.mybookstore.service.UserService;
import com.mybookstore.utility.SecurityUtility;


@SpringBootApplication
public class MybookstoreApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MybookstoreApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("John");
		user.setLastName("Adams");
		user.setUsername("j");
		user.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user.setEmail("JAdams@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role= new Role();
		role.setRoleId(1);
		role.setName("ROLE_USER");
		userRoles.add(new UserRole(user, role));
		
		userService.createUser(user, userRoles);
		
		User user1 = new User();
		user1.setFirstName("User");
		user1.setLastName("1");
		user1.setUsername("user1");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("user1"));
		user1.setEmail("user1@gmail.com");
		Set<UserRole> userRoles1 = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles1);
		
/*		
		User user2 = new User();
		user2.setFirstName("User");
		user2.setLastName("2");
		user2.setUsername("user2");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("user2"));
		user2.setEmail("user2@gmail.com");
		Set<UserRole> userRoles2 = new HashSet<>();
		Role role2= new Role();
		role2.setRoleId(1);
		role2.setName("ROLE_USER");
		userRoles2.add(new UserRole(user2, role2));
		
		userService.createUser(user2, userRoles2);
		
		User user3 = new User();
		user3.setFirstName("User");
		user3.setLastName("3");
		user3.setUsername("user3");
		user3.setPassword(SecurityUtility.passwordEncoder().encode("user3"));
		user3.setEmail("user3@gmail.com");
		Set<UserRole> userRoles3 = new HashSet<>();
		Role role3= new Role();
		role3.setRoleId(1);
		role3.setName("ROLE_USER");
		userRoles3.add(new UserRole(user3, role3));
		
		userService.createUser(user3, userRoles3);
		
		User user4 = new User();
		user4.setFirstName("User");
		user4.setLastName("4");
		user4.setUsername("user4");
		user4.setPassword(SecurityUtility.passwordEncoder().encode("user4"));
		user4.setEmail("user4@gmail.com");
		Set<UserRole> userRoles4 = new HashSet<>();
		Role role4= new Role();
		role4.setRoleId(1);
		role4.setName("ROLE_USER");
		userRoles4.add(new UserRole(user4, role4));
		
		userService.createUser(user4, userRoles4);
		
		User user5 = new User();
		user5.setFirstName("User");
		user5.setLastName("5");
		user5.setUsername("user5");
		user5.setPassword(SecurityUtility.passwordEncoder().encode("user5"));
		user5.setEmail("user5@gmail.com");
		Set<UserRole> userRoles5 = new HashSet<>();
		Role role5= new Role();
		role5.setRoleId(1);
		role5.setName("ROLE_USER");
		userRoles5.add(new UserRole(user5, role5));
		
		userService.createUser(user5, userRoles5);
		
		User user6 = new User();
		user6.setFirstName("User");
		user6.setLastName("6");
		user6.setUsername("user6");
		user6.setPassword(SecurityUtility.passwordEncoder().encode("user6"));
		user6.setEmail("user6@gmail.com");
		Set<UserRole> userRoles6 = new HashSet<>();
		Role role6= new Role();
		role6.setRoleId(1);
		role6.setName("ROLE_USER");
		userRoles6.add(new UserRole(user6, role6));
		
		userService.createUser(user6, userRoles6);
		
		User user7 = new User();
		user7.setFirstName("User");
		user7.setLastName("7");
		user7.setUsername("user7");
		user7.setPassword(SecurityUtility.passwordEncoder().encode("user7"));
		user7.setEmail("user7@gmail.com");
		Set<UserRole> userRoles7 = new HashSet<>();
		Role role7= new Role();
		role7.setRoleId(1);
		role7.setName("ROLE_USER");
		userRoles7.add(new UserRole(user7, role7));
		
		userService.createUser(user7, userRoles7);
		
		User user8 = new User();
		user8.setFirstName("User");
		user8.setLastName("8");
		user8.setUsername("user8");
		user8.setPassword(SecurityUtility.passwordEncoder().encode("user8"));
		user8.setEmail("user8@gmail.com");
		Set<UserRole> userRoles8 = new HashSet<>();
		Role role8= new Role();
		role8.setRoleId(1);
		role8.setName("ROLE_USER");
		userRoles8.add(new UserRole(user8, role8));
		
		userService.createUser(user8, userRoles8);
		
		User user9 = new User();
		user9.setFirstName("User");
		user9.setLastName("9");
		user9.setUsername("user9");
		user9.setPassword(SecurityUtility.passwordEncoder().encode("user9"));
		user9.setEmail("user9@gmail.com");
		Set<UserRole> userRoles9 = new HashSet<>();
		Role role9= new Role();
		role9.setRoleId(1);
		role9.setName("ROLE_USER");
		userRoles9.add(new UserRole(user9, role9));
		
		userService.createUser(user9, userRoles9);
		
		User user10 = new User();
		user10.setFirstName("User");
		user10.setLastName("10");
		user10.setUsername("user10");
		user10.setPassword(SecurityUtility.passwordEncoder().encode("user10"));
		user10.setEmail("user10@gmail.com");
		Set<UserRole> userRoles10 = new HashSet<>();
		Role role10= new Role();
		role10.setRoleId(1);
		role10.setName("ROLE_USER");
		userRoles10.add(new UserRole(user10, role10));
		
		userService.createUser(user10, userRoles10);
		
		User user11 = new User();
		user11.setFirstName("User");
		user11.setLastName("11");
		user11.setUsername("user11");
		user11.setPassword(SecurityUtility.passwordEncoder().encode("user11"));
		user11.setEmail("user11@gmail.com");
		Set<UserRole> userRoles11 = new HashSet<>();
		Role role11= new Role();
		role11.setRoleId(1);
		role11.setName("ROLE_USER");
		userRoles11.add(new UserRole(user11, role11));
		
		userService.createUser(user11, userRoles11);
		
		User user12 = new User();
		user12.setFirstName("User");
		user12.setLastName("12");
		user12.setUsername("user12");
		user12.setPassword(SecurityUtility.passwordEncoder().encode("user12"));
		user12.setEmail("user12@gmail.com");
		Set<UserRole> userRoles12 = new HashSet<>();
		Role role12= new Role();
		role12.setRoleId(1);
		role12.setName("ROLE_USER");
		userRoles12.add(new UserRole(user12, role12));
		
		userService.createUser(user12, userRoles12);
		
		User user13 = new User();
		user13.setFirstName("User");
		user13.setLastName("13");
		user13.setUsername("user13");
		user13.setPassword(SecurityUtility.passwordEncoder().encode("user13"));
		user13.setEmail("user13@gmail.com");
		Set<UserRole> userRoles13 = new HashSet<>();
		Role role13= new Role();
		role13.setRoleId(1);
		role13.setName("ROLE_USER");
		userRoles13.add(new UserRole(user13, role13));
		
		userService.createUser(user13, userRoles13);
		
		User user14 = new User();
		user14.setFirstName("User");
		user14.setLastName("14");
		user14.setUsername("user14");
		user14.setPassword(SecurityUtility.passwordEncoder().encode("user14"));
		user14.setEmail("user14@gmail.com");
		Set<UserRole> userRoles14 = new HashSet<>();
		Role role14= new Role();
		role14.setRoleId(1);
		role14.setName("ROLE_USER");
		userRoles14.add(new UserRole(user14, role14));
		
		userService.createUser(user14, userRoles14);
		
		User user15 = new User();
		user15.setFirstName("User");
		user15.setLastName("15");
		user15.setUsername("user15");
		user15.setPassword(SecurityUtility.passwordEncoder().encode("user15"));
		user15.setEmail("user15@gmail.com");
		Set<UserRole> userRoles15 = new HashSet<>();
		Role role15= new Role();
		role15.setRoleId(1);
		role15.setName("ROLE_USER");
		userRoles15.add(new UserRole(user15, role15));
		
		userService.createUser(user15, userRoles15);
		
		User user16 = new User();
		user16.setFirstName("User");
		user16.setLastName("16");
		user16.setUsername("user16");
		user16.setPassword(SecurityUtility.passwordEncoder().encode("user16"));
		user16.setEmail("user16@gmail.com");
		Set<UserRole> userRoles16 = new HashSet<>();
		Role role16= new Role();
		role16.setRoleId(1);
		role16.setName("ROLE_USER");
		userRoles16.add(new UserRole(user16, role16));
		
		userService.createUser(user16, userRoles16);
		
		User user17 = new User();
		user17.setFirstName("User");
		user17.setLastName("17");
		user17.setUsername("user17");
		user17.setPassword(SecurityUtility.passwordEncoder().encode("user17"));
		user17.setEmail("user17@gmail.com");
		Set<UserRole> userRoles17 = new HashSet<>();
		Role role17= new Role();
		role17.setRoleId(1);
		role17.setName("ROLE_USER");
		userRoles17.add(new UserRole(user17, role17));
		
		userService.createUser(user17, userRoles17);
		
		User user18 = new User();
		user18.setFirstName("User");
		user18.setLastName("18");
		user18.setUsername("user18");
		user18.setPassword(SecurityUtility.passwordEncoder().encode("user18"));
		user18.setEmail("user18@gmail.com");
		Set<UserRole> userRoles18 = new HashSet<>();
		Role role18= new Role();
		role18.setRoleId(1);
		role18.setName("ROLE_USER");
		userRoles18.add(new UserRole(user18, role18));
		
		userService.createUser(user18, userRoles18);
		
		User user19 = new User();
		user19.setFirstName("User");
		user19.setLastName("19");
		user19.setUsername("user19");
		user19.setPassword(SecurityUtility.passwordEncoder().encode("user19"));
		user19.setEmail("user19@gmail.com");
		Set<UserRole> userRoles19 = new HashSet<>();
		Role role19= new Role();
		role19.setRoleId(1);
		role19.setName("ROLE_USER");
		userRoles19.add(new UserRole(user19, role19));
		
		userService.createUser(user19, userRoles19);
		
		User user20 = new User();
		user20.setFirstName("User");
		user20.setLastName("20");
		user20.setUsername("user20");
		user20.setPassword(SecurityUtility.passwordEncoder().encode("user20"));
		user20.setEmail("user20@gmail.com");
		Set<UserRole> userRoles20 = new HashSet<>();
		Role role20= new Role();
		role20.setRoleId(1);
		role20.setName("ROLE_USER");
		userRoles20.add(new UserRole(user20, role20));
		
		userService.createUser(user20, userRoles20);
		
		User user21 = new User();
		user21.setFirstName("User");
		user21.setLastName("21");
		user21.setUsername("user21");
		user21.setPassword(SecurityUtility.passwordEncoder().encode("user21"));
		user21.setEmail("user21@gmail.com");
		Set<UserRole> userRoles21 = new HashSet<>();
		Role role21= new Role();
		role21.setRoleId(1);
		role21.setName("ROLE_USER");
		userRoles21.add(new UserRole(user21, role21));
		
		userService.createUser(user21, userRoles21);
		
		User user22 = new User();
		user22.setFirstName("User");
		user22.setLastName("22");
		user22.setUsername("user22");
		user22.setPassword(SecurityUtility.passwordEncoder().encode("user22"));
		user22.setEmail("user22@gmail.com");
		Set<UserRole> userRoles22 = new HashSet<>();
		Role role22= new Role();
		role22.setRoleId(1);
		role22.setName("ROLE_USER");
		userRoles22.add(new UserRole(user22, role22));
		
		userService.createUser(user22, userRoles22);
		
		User user23 = new User();
		user23.setFirstName("User");
		user23.setLastName("23");
		user23.setUsername("user23");
		user23.setPassword(SecurityUtility.passwordEncoder().encode("user23"));
		user23.setEmail("user23@gmail.com");
		Set<UserRole> userRoles23 = new HashSet<>();
		Role role23= new Role();
		role23.setRoleId(1);
		role23.setName("ROLE_USER");
		userRoles23.add(new UserRole(user23, role23));
		
		userService.createUser(user23, userRoles23);
		
		User user24 = new User();
		user24.setFirstName("User");
		user24.setLastName("24");
		user24.setUsername("user24");
		user24.setPassword(SecurityUtility.passwordEncoder().encode("user24"));
		user24.setEmail("user24@gmail.com");
		Set<UserRole> userRoles24 = new HashSet<>();
		Role role24= new Role();
		role24.setRoleId(1);
		role24.setName("ROLE_USER");
		userRoles24.add(new UserRole(user24, role24));
		
		userService.createUser(user24, userRoles24);
		
		User user25 = new User();
		user25.setFirstName("User");
		user25.setLastName("25");
		user25.setUsername("user25");
		user25.setPassword(SecurityUtility.passwordEncoder().encode("user25"));
		user25.setEmail("user25@gmail.com");
		Set<UserRole> userRoles25 = new HashSet<>();
		Role role25= new Role();
		role25.setRoleId(1);
		role25.setName("ROLE_USER");
		userRoles25.add(new UserRole(user25, role25));
		
		userService.createUser(user25, userRoles25);
		
		User user26 = new User();
		user26.setFirstName("User");
		user26.setLastName("26");
		user26.setUsername("user26");
		user26.setPassword(SecurityUtility.passwordEncoder().encode("user26"));
		user26.setEmail("user26@gmail.com");
		Set<UserRole> userRoles26 = new HashSet<>();
		Role role26= new Role();
		role26.setRoleId(1);
		role26.setName("ROLE_USER");
		userRoles26.add(new UserRole(user26, role26));
		
		userService.createUser(user26, userRoles26);
		
		User user27 = new User();
		user27.setFirstName("User");
		user27.setLastName("27");
		user27.setUsername("user27");
		user27.setPassword(SecurityUtility.passwordEncoder().encode("user27"));
		user27.setEmail("user27@gmail.com");
		Set<UserRole> userRoles27 = new HashSet<>();
		Role role27= new Role();
		role27.setRoleId(1);
		role27.setName("ROLE_USER");
		userRoles27.add(new UserRole(user27, role27));
		
		userService.createUser(user27, userRoles27);
		
		User user28 = new User();
		user28.setFirstName("User");
		user28.setLastName("28");
		user28.setUsername("user28");
		user28.setPassword(SecurityUtility.passwordEncoder().encode("user28"));
		user28.setEmail("user28@gmail.com");
		Set<UserRole> userRoles28 = new HashSet<>();
		Role role28= new Role();
		role28.setRoleId(1);
		role28.setName("ROLE_USER");
		userRoles28.add(new UserRole(user28, role28));
		
		userService.createUser(user28, userRoles28);
		
		User user29 = new User();
		user29.setFirstName("User");
		user29.setLastName("29");
		user29.setUsername("user29");
		user29.setPassword(SecurityUtility.passwordEncoder().encode("user29"));
		user29.setEmail("user29@gmail.com");
		Set<UserRole> userRoles29 = new HashSet<>();
		Role role29= new Role();
		role29.setRoleId(1);
		role29.setName("ROLE_USER");
		userRoles29.add(new UserRole(user29, role29));
		
		userService.createUser(user29, userRoles29);
		
		User user30 = new User();
		user30.setFirstName("User");
		user30.setLastName("30");
		user30.setUsername("user30");
		user30.setPassword(SecurityUtility.passwordEncoder().encode("user30"));
		user30.setEmail("user30@gmail.com");
		Set<UserRole> userRoles30 = new HashSet<>();
		Role role30= new Role();
		role30.setRoleId(1);
		role30.setName("ROLE_USER");
		userRoles30.add(new UserRole(user30, role30));
		
		userService.createUser(user30, userRoles30);*/
	}
}
