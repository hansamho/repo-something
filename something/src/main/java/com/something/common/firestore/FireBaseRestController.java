package com.something.common.firestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.auth.FirebaseToken;

@RestController
@RequestMapping("/firestore")
public class FireBaseRestController {

	@Autowired
	FireBaseService service;

    @PostMapping("/verify")
    public FirebaseToken verifyToken(@RequestBody String idToken) throws Exception {
        return service.verifyToken(idToken);
    }
    
    @GetMapping("/users")
    public QuerySnapshot getUsers() throws Exception {
        return service.getUsers();
    }
    
}
