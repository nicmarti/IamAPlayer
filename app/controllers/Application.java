package controllers;

import models.PlayerUser;
import play.mvc.*;

import java.util.Date;
import java.util.List;

public class Application extends Controller {

    public static void index() {
        long playersCount = PlayerUser.count();
        render(playersCount);
    }

    public static void register(String email, String name, Date startedPlay, String location) {
        PlayerUser user = new PlayerUser(email, name, startedPlay, location);
        if (user.validateAndSave() == false) {
            flash.error("Unable to store the new user");
            index();
        }

        flash.success("User created");
        index();
    }

    public static void stats(){
        List<PlayerUser> allUsers=PlayerUser.findAll();
        render(allUsers);
    }
}