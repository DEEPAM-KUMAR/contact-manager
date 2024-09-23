package com.project.contactManager.contact_manager.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserForm {

    private String name;
    private String email;
    private String password;
    private String phoneNo;
    private String about;

}
