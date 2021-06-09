package com.astrotalk.FriendApplication.service;

import com.astrotalk.FriendApplication.userfriendsrequest.*;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;


public interface FriendsService {
    ResponseEntity<Map<String, Object>> getProductDetails(String url);
	ResponseEntity<Map<String, Object>> downloadPdf(String name, String imageURL, String description, String price,String totalReviews); 

	 

}
