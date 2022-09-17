package com.example.demojpa;

import com.example.demojpa.entity.User;
import com.example.demojpa.repository.UserRepository;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class DemoJpaApplicationTests {

	@Autowired
	private UserRepository userRepository;
//
//	@Test
//	void save_user_to_db () {
//		User user = User.builder()
//				.name("Nguyễn Văn A ")
//				.email("a@gmail.com")
//				.age(25)
//				.birth(LocalDate.now().minusYears(40))
//				.build();
//
//		User user1 = User.builder()
//				.name("Nguyễn Văn B ")
//				.email("b@gmail.com")
//				.age(50)
//				.birth(LocalDate.now().minusYears(50))
//				.build();
//
//		User user2 = User.builder()
//				.name("Nguyễn Văn C ")
//				.email("c@gmail.com")
//				.age(60)
//				.birth(LocalDate.now().minusYears(60))
//				.build();
////		userRepository.save(user);
////		userRepository.save(user1);
////		userRepository.save(user2);
//		userRepository.saveAll(List.of(user,user1,user2));
//	}
//
//	@Test
//	void find_by_age_test(){
//		List<User> users= userRepository.findByAgeGreaterThan(25);
//		//users.forEach(System:out:printn);
//	}
@Autowired
private Faker faker;
	@Test



	void save_faker_user(){
		for (int i=0;i<50;i++){
			int age = faker.number().
			User user = User.builder()
				.name(fa)
				.email("c@gmail.com")
				.age(60)
				.birth(LocalDate.now().minusYears(60))
				.build();
		}
	}

}
