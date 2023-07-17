package dto;

import com.google.gson.Gson;

public class UserEntity {
    private String firstName;
    private String lastName;

    public UserEntity(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
