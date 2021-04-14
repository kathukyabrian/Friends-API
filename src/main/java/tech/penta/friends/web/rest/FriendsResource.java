package tech.penta.friends.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import tech.penta.friends.domain.Friend;
import tech.penta.friends.service.FriendsService;

@RestController
@RequestMapping("/api")

// htpp://localhost:8080/api /
public class FriendsResource {
    // here we just create a response back to the client ->

    // we just the call the service - >FriendsService ---->

    private final FriendsService friendsService;

    private final Logger logger = LoggerFactory.getLogger(FriendsResource.class);

    public FriendsResource(FriendsService friendsService) {
        this.friendsService = friendsService;
    }

    // several HttpMethods -> POST -> insert, PUT -> update, DELETE -> delete, GET -> select

    // http://localhost:8080/api/friends
    @PostMapping("/friends")
    public Friend save(@RequestBody Friend friend){
        // calls the server -> call the service
        logger.debug("REST request from a client to the server to save the frind : {}",friend);

        return friendsService.save(friend);
    }

    @DeleteMapping("friends/{id}")
    public void delete(@PathVariable Integer id){
        // call the server -> service -> deletes by id
        logger.debug("REST request from a client to the server to delete friend with id : {}",id);

        friendsService.deleteById(id);
    }


}
