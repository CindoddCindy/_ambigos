package ambigoush.bagasee.model;

import ambigoush.bagasee.model.audit.DateAudit;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "user_baggage", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})


public class UserBaggage extends DateAudit {

}
