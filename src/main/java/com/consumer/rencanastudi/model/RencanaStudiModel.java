package com.consumer.rencanastudi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "rencanaStudi")
public class RencanaStudiModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String daftarMatkul;

    public RencanaStudiModel(String name, String daftarMatkul) {
        this.name = name;
        this.daftarMatkul = daftarMatkul;
    }

    public RencanaStudiModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaftarMatkul() {
        return daftarMatkul;
    }

    public void setDaftarMatkul(String daftarMatkul) {
        this.daftarMatkul = daftarMatkul;
    }
}
