package com.sample;


public class Agency {

  private long idAgency;
  private String name;
  private String address;
  private long phoneNumber;
  private String webSite;
  private long raiting;


  public long getIdAgency() {
    return idAgency;
  }

  public void setIdAgency(long idAgency) {
    this.idAgency = idAgency;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public String getWebSite() {
    return webSite;
  }

  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }


  public long getRaiting() {
    return raiting;
  }

  public void setRaiting(long raiting) {
    this.raiting = raiting;
  }

}
