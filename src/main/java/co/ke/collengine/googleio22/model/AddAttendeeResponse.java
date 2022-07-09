package co.ke.collengine.googleio22.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddAttendeeResponse {
    private String message;
    private int code;
}
