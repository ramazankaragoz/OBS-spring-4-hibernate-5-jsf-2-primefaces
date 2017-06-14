package com.obs.entities.tanim;

import com.obs.entities.core.BaseEntity;

import javax.persistence.*;

/**
 * Created by Ramazan Karagoz on 7.06.2017.
 */
@Entity
@Table(name = "ILCE")
public class IlceImp extends BaseEntity{

    @Column(name = "KODU")
    private String kodu;

    @Column(name = "ADI")
    private String adi;

    @ManyToOne
    @JoinColumn(name = "IL_ID")
    private IlImp il;

    public IlceImp() {
    }

    public IlceImp(String kodu, String adi, IlImp il) {
        this.kodu = kodu;
        this.adi = adi;
        this.il = il;
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

    public IlImp getIl() {
        return il;
    }

    public void setIl(IlImp il) {
        this.il = il;
    }
}
