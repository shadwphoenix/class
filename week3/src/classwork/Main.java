package classwork;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        try{
            Check(user1,user2);
        }
        catch (DuplicateUser e){
            System.out.println(e);
            user2 = null;
        }
        finally {
            System.gc();
        }
    }

    static void Check(User user1,User user2) throws DuplicateUser {

        if(Objects.equals(user1.name, user2.name))
            if (Objects.equals(user1.family, user2.family))
                if(user1.age == user2.age)
                    throw new DuplicateUser("this user is already registered \ninfo has been cleared");

    }
}

