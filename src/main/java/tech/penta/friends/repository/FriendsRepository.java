package tech.penta.friends.repository;


import org.springframework.data.repository.CrudRepository;
import tech.penta.friends.domain.Friend;

public interface FriendsRepository extends CrudRepository<Friend,Integer> {
}
