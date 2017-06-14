package com.obs.entities.tanim;

import com.obs.entities.core.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 7.06.2017.
 */
@Entity
@Table(name = "IL")
public class IlImp extends BaseEntity {

    @Column(name = "KODU")
    private String kodu;
    @Column(name = "ADI")
    private String adi;

    @OneToMany(mappedBy = "il", fetch = FetchType.EAGER, targetEntity = IlceImp.class)
    private List<IlceImp> ilceList;

    @ManyToOne
    @JoinColumn(name = "ULKE_ID")
    private UlkeImp ulke;

    public IlImp() {
    }

    public IlImp(String kodu, String adi, List<IlceImp> ilceList, UlkeImp ulke) {
        this.kodu = kodu;
        this.adi = adi;
        this.ilceList = ilceList;
        this.ulke = ulke;
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

    public List<IlceImp> getIlceList() {
        return ilceList;
    }

    public void setIlceList(List<IlceImp> ilceList) {
        this.ilceList = ilceList;
    }

    public UlkeImp getUlke() {
        return ulke;
    }

    public void setUlke(UlkeImp ulke) {
        this.ulke = ulke;
    }
}
