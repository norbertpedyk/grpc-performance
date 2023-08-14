package pl.pedyk.userrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pedyk.userrest.model.UserItem;

public interface UserRepository extends JpaRepository<UserItem, Long> {
}