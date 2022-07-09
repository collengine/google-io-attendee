package co.ke.collengine.googleio22.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddAttendeeRequest {
    private String firstName;
    private String lastName;
    private String university;
    private String chapter;
}
