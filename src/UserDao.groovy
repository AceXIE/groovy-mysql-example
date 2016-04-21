import groovy.sql.Sql

/**
 * Created by Administrator on 2016/4/21.
 */
class UserDao {

    private username,password,email,age;
    ArrayList users
    Sql sql
    public UserDAO(){
        users=new ArrayList()
        println "user db constructor"
        sql = Sql.newInstance("jdbc:mysql://gziot.zjucolourlife.com:3306/parksec", "root","root", "com.mysql.jdbc.Driver")

        sql.eachRow("select * from user") {

            username=it.username
            password=it.password
            email=it.email
            age=it.age
            User p = new User(username,password,email,age)
//    def p=new User("Bob","xyz","email","55")
            users.add(p)
        }
    }//constructor

    ArrayList list() {
        return users
    }
}
