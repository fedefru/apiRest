package com.cdainfo.dominio;

import javax.persistence.*;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private  String surname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Alumno: \n" +
                "   id: " + this.id +
                "\n   name: " + this.name +
                "\n   surname: " + this.surname;
    }
}

/*****************************
 CREATE TABLE `restapi`.`alumno` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(45) NULL,
 `surname` VARCHAR(45) NULL,
 PRIMARY KEY (`id`));


 INSERT INTO `restapi`.`alumno` (`name`, `surname`) VALUES ('Juan', 'Perez');
 INSERT INTO `restapi`.`alumno` (`name`, `surname`) VALUES ('Pepe', 'Gonzalez');
 INSERT INTO `restapi`.`alumno` (`name`, `surname`) VALUES ('Jose', 'Fernandez');


 */