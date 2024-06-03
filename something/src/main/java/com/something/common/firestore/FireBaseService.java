package com.something.common.firestore;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;

@Service
public class FireBaseService {

	public FirebaseToken verifyToken(String idToken) throws Exception {
        return FirebaseAuth.getInstance().verifyIdToken(idToken);
    }
	
	 private Firestore db;

	    public void FirestoreService() {
	        FirestoreOptions firestoreOptions =
	            FirestoreOptions.getDefaultInstance().toBuilder()
	                .setProjectId("something")
	                .build();
	        this.db = firestoreOptions.getService();
	    }

	    public QuerySnapshot getUsers() throws Exception {
	        ApiFuture<QuerySnapshot> future = db.collection("users").get();
	        return future.get();
	    }
}
