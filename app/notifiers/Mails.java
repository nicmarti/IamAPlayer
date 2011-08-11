package notifiers;


import models.*;
import play.*;
import play.mvc.*;
import play.templates.JavaExtensions;

import java.util.*;

public class Mails extends Mailer {

    public static void checkPlayUserEmail(PlayerUser user) {
        setSubject("Please confirm your email address");
        addRecipient(user.email);
        setFrom("noreply@iamaplayer.org");
        send(user);
    }


}