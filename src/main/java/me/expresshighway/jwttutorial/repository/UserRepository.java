package me.expresshighway.jwttutorial.repository;

import me.expresshighway.jwttutorial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRespository를 extends 하여 fingAll, save 등 메소드를 사용할 수 있음
public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities") //Lazy조회가 아닌 Eager조회

    // username을 기준으로 User 정보를 가져올 때 권한 정보도 같이 가져오는 메소드
    Optional<User> findOneWithAuthoritiesByUsername(String username); 
}