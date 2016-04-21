/**
 * Created by Administrator on 2016/4/21.
 */
class User {
    String username
    String password
    int age
    String email
    String toString(){
        "First: "+username+ " email: "+email
    }
    public User(String name,String pw,String em,int a)
    {
        username=name
        password=pw
        email=em
        age=a

    }
}
