package edu.gmu.i90.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "application_record")
public class ApplicationRecord 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Applicant Information
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String emailAddress;

    // Address Information
    private String streetAddress;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    // USCIS & Application Details
    private String uscisNumber;
    private String reasonForReplacement;
    private String status;

    // Payment Information
    private String cardHolderName;
    private String billingAddress;
    private String cardType;
    private String cardNumber;
    private String cardExpiration;
    private Integer cvv;
    private Boolean authorizationConfirmed;

    // Workflow Fields
    @Column(columnDefinition = "TEXT")
    private String reviewNotes;

    @Column(columnDefinition = "TEXT")
    private String approvalNotes;

    private String reviewedBy;
    private String approvedBy;
    private LocalDateTime reviewTimestamp;
    private LocalDateTime approvalTimestamp;

    // System Fields
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    public Integer getId() {
        return id;
    }

    // Getters and setters go here
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getUscisNumber() {
        return uscisNumber;
    }
    public void setUscisNumber(String uscisNumber) {
        this.uscisNumber = uscisNumber;
    }
    public String getReasonForReplacement() {
        return reasonForReplacement;
    }
    public void setReasonForReplacement(String reasonForReplacement) {
        this.reasonForReplacement = reasonForReplacement;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    public String getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardExpiration() {
        return cardExpiration;
    }
    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }
    public Integer getCvv() {
        return cvv;
    }
    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }
    public Boolean getAuthorizationConfirmed() {
        return authorizationConfirmed;
    }
    public void setAuthorizationConfirmed(Boolean authorizationConfirmed) {
        this.authorizationConfirmed = authorizationConfirmed;
    }
    public String getReviewNotes() {
        return reviewNotes;
    }
    public void setReviewNotes(String reviewNotes) {
        this.reviewNotes = reviewNotes;
    }
    public String getApprovalNotes() {
        return approvalNotes;
    }
    public void setApprovalNotes(String approvalNotes) {
        this.approvalNotes = approvalNotes;
    }
    public String getReviewedBy() {
        return reviewedBy;
    }
    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }
    public String getApprovedBy() {
        return approvedBy;
    }
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
    public LocalDateTime getReviewTimestamp() {
        return reviewTimestamp;
    }
    public void setReviewTimestamp(LocalDateTime reviewTimestamp) {
        this.reviewTimestamp = reviewTimestamp;
    }
    public LocalDateTime getApprovalTimestamp() {
        return approvalTimestamp;
    }
    public void setApprovalTimestamp(LocalDateTime approvalTimestamp) {
        this.approvalTimestamp = approvalTimestamp;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
