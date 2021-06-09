Friend Management API

1)	 ADD NEW USER

http://ec2-18-222-233-172.us-east-2.compute.amazonaws.com:8080/addUser

{
 "email": "a@gmail.com"
}


2)	ADD Friends

{
 "userfriends": ["a@gmail.com",
                 "b@gmail.com"
                 ]
}

3)	Delete friends

{
 "email1": "a@gmail.com",
 "email2" :"b@gmail.com"
}

4)	Get FriendList of User

{
 "email": "a@gmail.com"
}


5)	GET ALL CONNECTIONS AT Kth Distance from user.

{
 "email": "a@gmail.com",
 "k":3
}

where k is distance 