package com.obs.entities.tanim;

import com.obs.entities.core.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 7.06.2017.
 */
@Entity
@Table(name = "ULKE")
public class UlkeImp extends BaseEntity{

    @Column(name = "KODU")
    public String kodu;

    @Column(name = "ADI")
    public String adi;

    @OneToMany(mappedBy = "ulke", fetch = FetchType.EAGER, targetEntity = IlImp.class)
    private List<IlImp> ilList;

    public UlkeImp() {
    }

    public UlkeImp(String kodu, String adi, List<IlImp> ilList) {
        this.kodu = kodu;
        this.adi = adi;
        this.ilList = ilList;
    }

    public String getKodu() {
        return kodu;
    }

    public void setKodu(String kodu) {
        this.kodu = kodu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<IlImp> getIlList() {
        return ilList;
    }

    public void setIlList(List<IlImp> ilList) {
        this.ilList = ilList;
    }
}
