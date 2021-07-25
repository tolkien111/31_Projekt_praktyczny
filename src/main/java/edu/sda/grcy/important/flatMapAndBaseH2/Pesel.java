package edu.sda.grcy.important.flatMapAndBaseH2;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pesel")
@NoArgsConstructor
public class Pesel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String peselNumber;
    private Pesel(String peselNumber) {
        this.peselNumber = peselNumber;
    }
    public static Pesel createPesel(String peselNumber) {
        if(peselNumber.matches("[0-9]*")) {
            return new Pesel(peselNumber);
        }
        System.out.println("Not correct number");
        return null;
    }
    public String getPeselNumber() {
        return peselNumber;
    }
}
