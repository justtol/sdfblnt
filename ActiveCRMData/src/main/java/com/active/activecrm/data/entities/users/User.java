package com.active.activecrm.data.entities.users;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name="userSeq", sequenceName="USER_SEQ")
@Table( name = "USERS" )
public class User extends BaseDictionary implements Serializable
{

   @Column( name = "TIMEZONE" )
   private String timezone;

   @Column( name = "EMAIL" )
   private String email;

   @Column( name = "LAST_SIGN_ON" )
   @Temporal( TemporalType.TIMESTAMP )
   private Date pylastsignon;

   @Column( name = "ORG_DIVISION" )
   private String orgDivision;

   @Column( name = "ORG_UNIT" )
   private String orgUnit;

   @Column( name = "ORGANIZATION" )
   private String organization;

   @Column( name = "POSITION" )
   private String position;

   @Column( name = "REPORT_TO_CODE" )
   private String reportToCode;

   @ManyToOne( fetch = FetchType.LAZY )
   @Column( name = "REPORT_TO_CODE" )
   private User reportTo;

   @Column( name = "PHONE" )
   private String phone;

   @Column( name = "BRANCH_CODE" )
   private String branchCode;

   @Column( name = "CHANNEL_CODE" )
   private String channelCode;

   public String getTimezone()
   {
      return timezone;
   }

   public void setTimezone( String timezone )
   {
      this.timezone = timezone;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail( String email )
   {
      this.email = email;
   }

   public Date getPylastsignon()
   {
      return pylastsignon;
   }

   public void setPylastsignon( Date pylastsignon )
   {
      this.pylastsignon = pylastsignon;
   }

   public String getOrgDivision()
   {
      return orgDivision;
   }

   public void setOrgDivision( String orgDivision )
   {
      this.orgDivision = orgDivision;
   }

   public String getOrgUnit()
   {
      return orgUnit;
   }

   public void setOrgUnit( String orgUnit )
   {
      this.orgUnit = orgUnit;
   }

   public String getOrganization()
   {
      return organization;
   }

   public void setOrganization( String organization )
   {
      this.organization = organization;
   }

   public String getPosition()
   {
      return position;
   }

   public void setPosition( String position )
   {
      this.position = position;
   }

   public String getReportToCode()
   {
      return reportToCode;
   }

   public void setReportToCode( String reportToCode )
   {
      this.reportToCode = reportToCode;
   }

   public User getReportTo()
   {
      return reportTo;
   }

   public void setReportTo( User reportTo )
   {
      this.reportTo = reportTo;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone( String phone )
   {
      this.phone = phone;
   }

   public String getBranchCode()
   {
      return branchCode;
   }

   public void setBranchCode( String branchCode )
   {
      this.branchCode = branchCode;
   }

   public String getChannelCode()
   {
      return channelCode;
   }

   public void setChannelCode( String channelCode )
   {
      this.channelCode = channelCode;
   }
}