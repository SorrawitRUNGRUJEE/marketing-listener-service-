package dev.marketing.listener.event;

import java.math.BigDecimal;

/**
 * DTO representing the PropertyRegistered event consumed from Kafka.
 *
 * This is the consumer's own representation of the event —
 * it does NOT depend on the producer's internal domain model
 * (Information Hiding / loose coupling between bounded contexts).
 */
public class PropertyRegisteredEvent {

    private String propertyId;
    private String projectName;
    private String unitNumber;
    private String propertyType;
    private String address;
    private BigDecimal settledPrice;
    private double areaSqm;
    private String registeredAt;

    // Default constructor for Jackson
    public PropertyRegisteredEvent() {}

    // --- Getters & Setters ---
    public String getPropertyId()          { return propertyId; }
    public void setPropertyId(String v)    { this.propertyId = v; }

    public String getProjectName()         { return projectName; }
    public void setProjectName(String v)   { this.projectName = v; }

    public String getUnitNumber()          { return unitNumber; }
    public void setUnitNumber(String v)    { this.unitNumber = v; }

    public String getPropertyType()        { return propertyType; }
    public void setPropertyType(String v)  { this.propertyType = v; }

    public String getAddress()             { return address; }
    public void setAddress(String v)       { this.address = v; }

    public BigDecimal getSettledPrice()    { return settledPrice; }
    public void setSettledPrice(BigDecimal v) { this.settledPrice = v; }

    public double getAreaSqm()             { return areaSqm; }
    public void setAreaSqm(double v)       { this.areaSqm = v; }

    public String getRegisteredAt()        { return registeredAt; }
    public void setRegisteredAt(String v)  { this.registeredAt = v; }

    @Override
    public String toString() {
        return "PropertyRegisteredEvent{" +
               "propertyId='" + propertyId + '\'' +
               ", projectName='" + projectName + '\'' +
               ", unitNumber='" + unitNumber + '\'' +
               ", propertyType='" + propertyType + '\'' +
               ", settledPrice=" + settledPrice +
               ", areaSqm=" + areaSqm +
               '}';
    }
}
