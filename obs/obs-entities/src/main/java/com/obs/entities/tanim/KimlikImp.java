package com.obs.entities.tanim;

import com.obs.entities.core.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ramazan Karagoz on 7.06.2017.
 */
@Entity
@Table(name = "KIMLIK")
public class KimlikImp extends BaseEntity {

        @Column(name = "DURUM")
        private int durum;

        @Column(name = "KIMLIK_NO")
        private String kimlikNo;

        @Column(name = "AD")
        private String ad;

        @Column(name = "SOYAD")
        private String soyad;

        @Column(name = "BABA_AD")
        private String babaAd;

        @Column(name = "ANA_AD")
        private String anaAd;

        @Column(name = "CINSIYET")
        private int cinsiyet;

        @Column(name = "DOGUM_YER")
        private String dogumYer;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "DOGUM_TARIH")
        private Date dogumTarih;

        @Column(name = "KIMLIK_CUZDAN_SERI_NO")
        private String kimlikCuzdanSeriNo;

        @Column(name = "KIMLIK_CUZDAN_NO")
        private String kimlikCuzdanNo;

        @Column(name = "KIMLIK_MEDENI_HAL")
        private Integer kimlikMedeniHalTur;

        @Column(name = "KIMLIK_DIN")
        private Integer kimlikDin;

        @OneToOne
        @JoinColumn(name = "IL")
        private IlImp kimlikIl;

        @OneToOne
        @JoinColumn(name = "ILCE")
        private IlceImp kimlikIlce;

        @Column(name = "KIMLIK_MAHALLE_KOY")
        private String kimlikMahalleKoy;

        @Column(name = "KIMLIK_CILT_NO")
        private String kimlikCiltNo;

        @Column(name = "KIMLIK_AILE_SIRA_NO")
        private String kimlikAileSiraNo;

        @Column(name = "KIMLIK_SIRA_NO")
        private String kimlikSiraNo;

        @Column(name = "KIMLIK_VERILDIGI_YER")
        private String kimlikVerildigiYer;

        @Column(name = "KIMLIK_VERILIS_NEDEN")
        private String kimlikVerilisNeden;

        @Column(name = "KIMLIK_KAYIT_NO")
        private String kimlikKayitNo;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "KIMLIK_VERILIS_TARIH")
        private Date kimlikVerilisTarih;

    public KimlikImp() {
    }

    public KimlikImp(int durum, String kimlikNo, String ad, String soyad, String babaAd, String anaAd, int cinsiyet, String dogumYer, Date dogumTarih, String kimlikCuzdanSeriNo, String kimlikCuzdanNo, Integer kimlikMedeniHalTur, Integer kimlikDin, IlImp kimlikIl, IlceImp kimlikIlce, String kimlikMahalleKoy, String kimlikCiltNo, String kimlikAileSiraNo, String kimlikSiraNo, String kimlikVerildigiYer, String kimlikVerilisNeden, String kimlikKayitNo, Date kimlikVerilisTarih) {
        this.durum = durum;
        this.kimlikNo = kimlikNo;
        this.ad = ad;
        this.soyad = soyad;
        this.babaAd = babaAd;
        this.anaAd = anaAd;
        this.cinsiyet = cinsiyet;
        this.dogumYer = dogumYer;
        this.dogumTarih = dogumTarih;
        this.kimlikCuzdanSeriNo = kimlikCuzdanSeriNo;
        this.kimlikCuzdanNo = kimlikCuzdanNo;
        this.kimlikMedeniHalTur = kimlikMedeniHalTur;
        this.kimlikDin = kimlikDin;
        this.kimlikIl = kimlikIl;
        this.kimlikIlce = kimlikIlce;
        this.kimlikMahalleKoy = kimlikMahalleKoy;
        this.kimlikCiltNo = kimlikCiltNo;
        this.kimlikAileSiraNo = kimlikAileSiraNo;
        this.kimlikSiraNo = kimlikSiraNo;
        this.kimlikVerildigiYer = kimlikVerildigiYer;
        this.kimlikVerilisNeden = kimlikVerilisNeden;
        this.kimlikKayitNo = kimlikKayitNo;
        this.kimlikVerilisTarih = kimlikVerilisTarih;
    }

    public int getDurum() {
        return durum;
    }

    public void setDurum(int durum) {
        this.durum = durum;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBabaAd() {
        return babaAd;
    }

    public void setBabaAd(String babaAd) {
        this.babaAd = babaAd;
    }

    public String getAnaAd() {
        return anaAd;
    }

    public void setAnaAd(String anaAd) {
        this.anaAd = anaAd;
    }

    public int getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(int cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumYer() {
        return dogumYer;
    }

    public void setDogumYer(String dogumYer) {
        this.dogumYer = dogumYer;
    }

    public Date getDogumTarih() {
        return dogumTarih;
    }

    public void setDogumTarih(Date dogumTarih) {
        this.dogumTarih = dogumTarih;
    }

    public String getKimlikCuzdanSeriNo() {
        return kimlikCuzdanSeriNo;
    }

    public void setKimlikCuzdanSeriNo(String kimlikCuzdanSeriNo) {
        this.kimlikCuzdanSeriNo = kimlikCuzdanSeriNo;
    }

    public String getKimlikCuzdanNo() {
        return kimlikCuzdanNo;
    }

    public void setKimlikCuzdanNo(String kimlikCuzdanNo) {
        this.kimlikCuzdanNo = kimlikCuzdanNo;
    }

    public Integer getKimlikMedeniHalTur() {
        return kimlikMedeniHalTur;
    }

    public void setKimlikMedeniHalTur(Integer kimlikMedeniHalTur) {
        this.kimlikMedeniHalTur = kimlikMedeniHalTur;
    }

    public Integer getKimlikDin() {
        return kimlikDin;
    }

    public void setKimlikDin(Integer kimlikDin) {
        this.kimlikDin = kimlikDin;
    }

    public IlImp getKimlikIl() {
        return kimlikIl;
    }

    public void setKimlikIl(IlImp kimlikIl) {
        this.kimlikIl = kimlikIl;
    }

    public IlceImp getKimlikIlce() {
        return kimlikIlce;
    }

    public void setKimlikIlce(IlceImp kimlikIlce) {
        this.kimlikIlce = kimlikIlce;
    }

    public String getKimlikMahalleKoy() {
        return kimlikMahalleKoy;
    }

    public void setKimlikMahalleKoy(String kimlikMahalleKoy) {
        this.kimlikMahalleKoy = kimlikMahalleKoy;
    }

    public String getKimlikCiltNo() {
        return kimlikCiltNo;
    }

    public void setKimlikCiltNo(String kimlikCiltNo) {
        this.kimlikCiltNo = kimlikCiltNo;
    }

    public String getKimlikAileSiraNo() {
        return kimlikAileSiraNo;
    }

    public void setKimlikAileSiraNo(String kimlikAileSiraNo) {
        this.kimlikAileSiraNo = kimlikAileSiraNo;
    }

    public String getKimlikSiraNo() {
        return kimlikSiraNo;
    }

    public void setKimlikSiraNo(String kimlikSiraNo) {
        this.kimlikSiraNo = kimlikSiraNo;
    }

    public String getKimlikVerildigiYer() {
        return kimlikVerildigiYer;
    }

    public void setKimlikVerildigiYer(String kimlikVerildigiYer) {
        this.kimlikVerildigiYer = kimlikVerildigiYer;
    }

    public String getKimlikVerilisNeden() {
        return kimlikVerilisNeden;
    }

    public void setKimlikVerilisNeden(String kimlikVerilisNeden) {
        this.kimlikVerilisNeden = kimlikVerilisNeden;
    }

    public String getKimlikKayitNo() {
        return kimlikKayitNo;
    }

    public void setKimlikKayitNo(String kimlikKayitNo) {
        this.kimlikKayitNo = kimlikKayitNo;
    }

    public Date getKimlikVerilisTarih() {
        return kimlikVerilisTarih;
    }

    public void setKimlikVerilisTarih(Date kimlikVerilisTarih) {
        this.kimlikVerilisTarih = kimlikVerilisTarih;
    }
}
