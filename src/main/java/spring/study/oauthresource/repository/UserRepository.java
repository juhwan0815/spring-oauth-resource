package spring.study.oauthresource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.study.oauthresource.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
