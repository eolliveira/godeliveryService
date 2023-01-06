package com.godelivery.godelivery.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String publicPlace;
    private String district;
    private String number;
    private String complement;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Address() {
    }

    public Address(Long id, String publicPlace, String district, String number, String complement) {
        this.id = id;
        this.publicPlace = publicPlace;
        this.district = district;
        this.number = number;
        this.complement = complement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
