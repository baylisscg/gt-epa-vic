
package org.geotools.data.epavic.schema;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Measurement {

  public static final String VALUE = "Value";

  public static final String TIME_BASE_ID = "TimeBaseId";

  public static final String SITE_ID = "SiteId";

  public static final String QUALITY_STATUS = "QualityStatus";

  public static final String MONITOR_TIME_BASIS = "MonitorTimeBasis";

  public static final String MONITOR_SHORT_NAME = "MonitorShortName";

  public static final String MONITOR_NAME = "MonitorName";

  public static final String MONITOR_ID = "MonitorId";

  public static final String LONG = "Longitude";

  public static final String LAT = "Latitude";

  public static final String IS_STATION_OFFLINE = "IsStationOffline";

  public static final String EQUIPMENT_TYPE = "EquipmentType";

  public static final String DATE_TIME_START = "DateTimeStart";

  public static final String DATE_TIME_RECORDED = "DateTimeRecorded";

  public static final String AQI_INDEX = "AQIIndex";

  @JsonUnwrapped
  private AQICategoryThreshold aQICategoryThreshold = new AQICategoryThreshold();

  @JsonProperty(AQI_INDEX)
  private Integer aQIIndex;

  @JsonProperty(DATE_TIME_RECORDED)
  private String dateTimeRecorded;

  @JsonProperty(DATE_TIME_START)
  private String dateTimeStart;

  @JsonProperty(EQUIPMENT_TYPE)
  private EquipmentType equipmentType;

  @JsonUnwrapped
  private HealthCategoryThreshold healthCategoryThreshold = new HealthCategoryThreshold();

  @JsonProperty(IS_STATION_OFFLINE)
  private Boolean isStationOffline;

  @JsonProperty(LAT)
  private Double latitude;

  @JsonProperty(LONG)
  private Double longitude;

  @JsonProperty(MONITOR_ID)
  private String monitorId;

  @JsonProperty(MONITOR_NAME)
  private String monitorName;

  @JsonProperty(MONITOR_SHORT_NAME)
  private String monitorShortName;

  @JsonProperty(MONITOR_TIME_BASIS)
  private MonitorTimeBasis monitorTimeBasis;

  @JsonProperty(QUALITY_STATUS)
  private Integer qualityStatus;

  @JsonProperty(SITE_ID)
  private Integer siteId;

  @JsonProperty(TIME_BASE_ID)
  private String timeBaseId;

  @JsonProperty(VALUE)
  private String value;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty(AQI_INDEX)
  public Integer getAQIIndex() {
    return aQIIndex;
  }

  @JsonProperty(AQI_INDEX)
  public void setAQIIndex(Integer aQIIndex) {
    this.aQIIndex = aQIIndex;
  }

  @JsonProperty(DATE_TIME_RECORDED)
  public String getDateTimeRecorded() {
    return dateTimeRecorded;
  }

  @JsonProperty(DATE_TIME_RECORDED)
  public void setDateTimeRecorded(String dateTimeRecorded) {
    this.dateTimeRecorded = dateTimeRecorded;
  }

  @JsonProperty(DATE_TIME_START)
  public String getDateTimeStart() {
    return dateTimeStart;
  }

  @JsonProperty(DATE_TIME_START)
  public void setDateTimeStart(String dateTimeStart) {
    this.dateTimeStart = dateTimeStart;
  }

  @JsonProperty(EQUIPMENT_TYPE)
  public EquipmentType getEquipmentType() {
    return equipmentType;
  }

  @JsonProperty(EQUIPMENT_TYPE)
  public void setEquipmentType(EquipmentType equipmentType) {
    this.equipmentType = equipmentType;
  }

  @JsonProperty(IS_STATION_OFFLINE)
  public Boolean getIsStationOffline() {
    return isStationOffline;
  }

  @JsonProperty(IS_STATION_OFFLINE)
  public void setIsStationOffline(Boolean isStationOffline) {
    this.isStationOffline = isStationOffline;
  }

  @JsonProperty(LAT)
  public Double getLatitude() {
    return latitude;
  }

  @JsonProperty(LAT)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  @JsonProperty(LONG)
  public Double getLongitude() {
    return longitude;
  }

  @JsonProperty(LONG)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  @JsonProperty(MONITOR_ID)
  public String getMonitorId() {
    return monitorId;
  }

  @JsonProperty(MONITOR_ID)
  public void setMonitorId(String monitorId) {
    this.monitorId = monitorId;
  }

  @JsonProperty(MONITOR_NAME)
  public String getMonitorName() {
    return monitorName;
  }

  @JsonProperty(MONITOR_NAME)
  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }

  @JsonProperty(MONITOR_SHORT_NAME)
  public String getMonitorShortName() {
    return monitorShortName;
  }

  @JsonProperty(MONITOR_SHORT_NAME)
  public void setMonitorShortName(String monitorShortName) {
    this.monitorShortName = monitorShortName;
  }

  @JsonProperty(MONITOR_TIME_BASIS)
  public MonitorTimeBasis getMonitorTimeBasis() {
    return monitorTimeBasis;
  }

  @JsonProperty(MONITOR_TIME_BASIS)
  public void setMonitorTimeBasis(MonitorTimeBasis monitorTimeBasis) {
    this.monitorTimeBasis = monitorTimeBasis;
  }

  @JsonProperty(QUALITY_STATUS)
  public Integer getQualityStatus() {
    return qualityStatus;
  }

  @JsonProperty(QUALITY_STATUS)
  public void setQualityStatus(Integer qualityStatus) {
    this.qualityStatus = qualityStatus;
  }

  @JsonProperty(SITE_ID)
  public Integer getSiteId() {
    return siteId;
  }

  @JsonProperty(SITE_ID)
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  @JsonProperty(TIME_BASE_ID)
  public String getTimeBaseId() {
    return timeBaseId;
  }

  @JsonProperty(TIME_BASE_ID)
  public void setTimeBaseId(String timeBaseId) {
    this.timeBaseId = timeBaseId;
  }

  @JsonProperty(VALUE)
  public String getValue() {
    return value;
  }

  @JsonProperty(VALUE)
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(aQICategoryThreshold.getaQIBackgroundColour())
        .append(aQICategoryThreshold.getaQICategoryAbbreviation())
        .append(aQICategoryThreshold.getaQICategoryDescription()).append(aQICategoryThreshold.getaQIForegroundColour())
        .append(aQIIndex).append(dateTimeRecorded).append(dateTimeStart).append(equipmentType)
        .append(healthCategoryThreshold.getHealthCategoryBackgroundColour())
        .append(healthCategoryThreshold.getHealthCategoryDescription())
        .append(healthCategoryThreshold.getHealthCategoryForegroundColour())
        .append(healthCategoryThreshold.getHealthCategoryLevel())
        .append(healthCategoryThreshold.getHealthCategoryMessage())
        .append(healthCategoryThreshold.getHealthCategoryValueRangeText())
        .append(healthCategoryThreshold.getHealthCategoryVisibilityText()).append(isStationOffline).append(latitude)
        .append(longitude).append(monitorId).append(monitorName).append(monitorShortName).append(monitorTimeBasis)
        .append(qualityStatus).append(siteId).append(timeBaseId).append(value).append(additionalProperties)
        .toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Measurement) == false) {
      return false;
    }
    Measurement rhs = ((Measurement) other);
    return new EqualsBuilder()
        .append(aQICategoryThreshold.getaQIBackgroundColour(), rhs.aQICategoryThreshold.getaQIBackgroundColour())
        .append(aQICategoryThreshold.getaQICategoryAbbreviation(),
            rhs.aQICategoryThreshold.getaQICategoryAbbreviation())
        .append(aQICategoryThreshold.getaQICategoryDescription(), rhs.aQICategoryThreshold.getaQICategoryDescription())
        .append(aQICategoryThreshold.getaQIForegroundColour(), rhs.aQICategoryThreshold.getaQIForegroundColour())
        .append(aQIIndex, rhs.aQIIndex).append(dateTimeRecorded, rhs.dateTimeRecorded)
        .append(dateTimeStart, rhs.dateTimeStart).append(equipmentType, rhs.equipmentType)
        .append(healthCategoryThreshold.getHealthCategoryBackgroundColour(),
            rhs.healthCategoryThreshold.getHealthCategoryBackgroundColour())
        .append(healthCategoryThreshold.getHealthCategoryDescription(),
            rhs.healthCategoryThreshold.getHealthCategoryDescription())
        .append(healthCategoryThreshold.getHealthCategoryForegroundColour(),
            rhs.healthCategoryThreshold.getHealthCategoryForegroundColour())
        .append(healthCategoryThreshold.getHealthCategoryLevel(), rhs.healthCategoryThreshold.getHealthCategoryLevel())
        .append(healthCategoryThreshold.getHealthCategoryMessage(),
            rhs.healthCategoryThreshold.getHealthCategoryMessage())
        .append(healthCategoryThreshold.getHealthCategoryValueRangeText(),
            rhs.healthCategoryThreshold.getHealthCategoryValueRangeText())
        .append(healthCategoryThreshold.getHealthCategoryVisibilityText(),
            rhs.healthCategoryThreshold.getHealthCategoryVisibilityText())
        .append(isStationOffline, rhs.isStationOffline).append(latitude, rhs.latitude).append(longitude, rhs.longitude)
        .append(monitorId, rhs.monitorId).append(monitorName, rhs.monitorName)
        .append(monitorShortName, rhs.monitorShortName).append(monitorTimeBasis, rhs.monitorTimeBasis)
        .append(qualityStatus, rhs.qualityStatus).append(siteId, rhs.siteId).append(timeBaseId, rhs.timeBaseId)
        .append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
  }

}
