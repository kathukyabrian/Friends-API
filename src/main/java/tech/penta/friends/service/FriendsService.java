package tech.penta.friends.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tech.penta.friends.domain.Friend;
import tech.penta.friends.repository.FriendsRepository;

@Service
public class FriendsService {

    private final FriendsRepository friendsRepository;

    private final Logger logger = LoggerFactory.getLogger(FriendsService.class);

    public FriendsService(FriendsRepository friendsRepository) {
        this.friendsRepository = friendsRepository;
    }

    // we do the logic -> why are we doing it here - processing phase of our request ->

    // add a new friend

    // create a method

    // calls the friendsRepository-> an instance of the FriendsRepository to save the friend -> an instance of the Friends class

    // several methods --> create a friend, update a friend, cut off a friend, get a friend  ->

    public Friend save(Friend friend){

        logger.debug("Request to save a friend : {}",friend);

        // call the friendsRepository to save ->

        return friendsRepository.save(friend);
    }

    public void deleteById(Integer id){
        // INPUT -> id
        // PROCESS -> call the repository
        // OUTPUT -> nothing
        logger.debug("Request to cut off a friend with id : {}",id);

        friendsRepository.deleteById(id);
    }


}
