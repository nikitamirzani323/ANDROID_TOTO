package com.toto.sdsb.model;

public class PasaranList {
    Integer idpasaran;
    String nmPasaran;
    String periodePasaran;
    String datePasaran;
    String statusPasaran;



    public PasaranList(Integer idpasaran, String nmPasaran, String periodePasaran, String datePasaran, String statusPasaran) {
        this.idpasaran = idpasaran;
        this.nmPasaran = nmPasaran;
        this.periodePasaran = periodePasaran;
        this.datePasaran = datePasaran;
        this.statusPasaran = statusPasaran;
    }

    public Integer getIdpasaran() {
        return idpasaran;
    }

    public void setIdpasaran(Integer idpasaran) {
        this.idpasaran = idpasaran;
    }

    public String getNmPasaran() {
        return nmPasaran;
    }

    public void setNmPasaran(String nmPasaran) {
        this.nmPasaran = nmPasaran;
    }

    public String getPeriodePasaran() {
        return periodePasaran;
    }

    public void setPeriodePasaran(String periodePasaran) {
        this.periodePasaran = periodePasaran;
    }

    public String getDatePasaran() {
        return datePasaran;
    }

    public void setDatePasaran(String datePasaran) {
        this.datePasaran = datePasaran;
    }
    public String getStatusPasaran() {
        return statusPasaran;
    }

    public void setStatusPasaran(String statusPasaran) {
        this.statusPasaran = statusPasaran;
    }
}
