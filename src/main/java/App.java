import dto.UserEntity;

public class App {
    public static void main(String[] args) {
        UserEntity user=new UserEntity("Vladyslav", "Malovanyi");
        System.out.println(user);
    }
}
