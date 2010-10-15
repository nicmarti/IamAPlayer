package models;


import org.hibernate.annotations.GenericGenerator;
import play.db.jpa.GenericModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * This is the main Player entity.
 *
 * @author Nicolas Martignole
 * @since 15 oct. 2010 20:38:11
 */
@Entity
public class PlayerUser extends GenericModel {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    public String id;

    public String email;
    public String name;
    public Date startedPlay;
    public String location;

    public PlayerUser(String email, String name, Date startedPlay, String location) {
        this.email = email;
        this.name = name;
        this.startedPlay = startedPlay;
        this.location = location;
    }

    @Override
    public String toString() {
        return "PlayerUser{" +
                "email='" + email + '\'' +
                '}';
    }
    
}
