package com.active.activecrm.data.entities.party;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.MarketingSegment;
import com.active.activecrm.data.entities.dicts.Okved;
import com.active.activecrm.data.entities.dicts.Opf;
import com.active.activecrm.data.entities.dicts.PartyStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@SequenceGenerator(name="partySeq", sequenceName="PARTY_SEQ")
@Table( name = "PARTY" )
public class Party extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="partySeq")
    @Column( name = "PARTY_ID" )
    private Long id;


    @Column( name = "OPF_CODE" )
    private String opfCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "OPF_CODE", insertable = false, updatable = false )
    private Opf opf;

    /**
     * Название
     */
    @Column( name = "PARTY_NAME" )
    private String name;

    /**
     * Юридическое наименование
     */
    @Column( name = "OFFICIAL_NAME" )
    private String officialName;

    /**
     * ИндустриЯ (fk)
     */
    @Column( name = "INDUsTRY_CODE" )
    private String industryCode;
    /**
     * ИНН
     */
    @Column( name = "TIN" )
    private String tin;

    /**
     * Вид бизнеса (fk)
     */
    @Column( name = "BUSINESS_TYPE_CODE" )
    private String businessTypeCode;


    /**
     * party status id
     */
    @Column( name = "STATUS_CODE" )
    private String statusCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "STATUS_CODE", insertable = false, updatable = false )
    private PartyStatus status;

    /**
     * Дата 1-го контакта с компанией
     */
    @Column( name = "DATE_OF_FIRST_CONTACT" )
    private Date dateOfFirstContact;

    /**
     * Комментарий
     */
    @Column( name = "COMMENT" )
    @Lob
    private String comment;

    /**
     * Количество сотрудников в компании
     */
    @Column( name = "NUMBER_OF_EMPLOYEES" )
    private Integer numberOfEmployees;

    /**
     * Объем годовой выручки, млн. руб.
     */
    @Column( name = "YEAR_REVENUE" )
    private Double yearRevenue;

    /**
     * ЕжемесЯчный доход общий, руб.
     */
    @Column( name = "MONTHLY_SALARY_FUND" )
    private double monthlySalaryFund;

    /**
     * Дата начала ведениЯ бизнеса
     */
    @Column( name = "DATE_FOUNDED" )
    private Date dateFounded;

    /**
     * Дата открытиЯ первого расч.cч. клиента
     */
    @Column( name = "FIRST_ACC_OPEN_DATE" )
    private Date firstAccOpenDate;

    /**
     * Кластер (fk)
     */
    @Column( name = "CLUSTER_CODE" )
    private String clusterCode;

    /**
     * ОКВЕД (fk)
     */
    @Column( name = "OKVED_CODE" )
    private String okvedCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "OKVED_CODE", insertable = false, updatable = false )
    private Okved okved;

    /**
     * Блок клиента
     */
    @Column( name = "BLOCK_CODE" )
    private String blockCode;

    /**
     * код системы источника
     */
    @Column( name = "SOURCE_SYSTEM" )
    private String sourceSystem;

    /**
     * id системы источника
     */
    @Column( name = "SOURCE_CODE" )
    private String sourceCode;

    /**
     * Код Источника контакта, наприме, БД SPARK
    private String contactSourceCode;*/


    /**
     * url компании
     */
    @Column( name = "WEB_ADDRESS" )
    private String webAddress;

    /**
     * ссылка на главную запись , если эта запись дубликат
     */
    @Column( name = "PARENT_PARTY_ID" )
    private Long parentPartyId;

    /**
     * полное имЯ
    @Column( name = "FULL_NAME" )
    private String fullName;*/

    /**
     * ИмЯ физ лица
     */
    @Column( name = "FIRST_NAME" )
    private String firstName;

    /**
     * ФамилиЯ ”из лица
     */
    @Column( name = "LAST_NAME" )
    private String lastName;

    /**
     * отчество длЯ физ лица
     */
    @Column( name = "SECOND_NAME" )
    private String secondName;

    /**
     * код международной межбанковской системы передачи информации и совершениЯ платежей
     */
    @Column( name = "SWIFT" )
    private String swift;


    @Column( name = "BIRTHDAY" )
    private Date birthday;

    @Column( name = "OPEN_DATE" )
    private Date openDate;

    @Column( name = "KPP" )
    private String kpp;

    @Column( name = "BIC" )
    private String bic;

    /**
     * Отделение открытия
     * TODO change to id of branch

    private String inceptionBranchSrcCode;*/

    /**
     * Код филиала обслуживания

    private String serviceBranchSrcCode;*/


    @Column( name = "MARKETING_SEGMENT_CODE" )
    private String marketingSegmentCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "MARKETING_SEGMENT_CODE", insertable = false, updatable = false )
    private MarketingSegment marketingSegment;

    /**
     * Приоритет кластера , который присвоен клиенту

    private double clusterPriority;*/

    /**
     * Признак "отток"
    @Column( name = "IS_OUTFLOW" )
    private String isOutflow;*/


    /*private double outflowTrafficLight;
    private double outflowPosition;*/

    /**
     * признак активна запись или нет, True/False
     */
    @Column( name = "IS_DISABLED" )
    private Boolean isDisabled;

    /**
     * запись является дубликатом другой записи, True/False
     */
    @Column( name = "IS_DUPLICATE" )
    private Boolean isDuplicate;

    /** Вид бизнеса (fk) */
    /**
     * TODO change to a link to dict

    private String businessTypeId;*/

    @Column( name = "DISABLE_REASON_CODE" )
    private String disableReasonCode;

    /**
     * ОГРН (основной государственный регистрационный номер)
     */
    @Column( name = "OGRN" )
    private String ogrn;

    //private List< PartyRoleRel > partyRoleRel;


    @OneToMany( fetch = FetchType.LAZY, mappedBy = "fromParty" )
    private Set<PartyRoleRel> fromPartyRoleRels = new HashSet<PartyRoleRel>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "toParty" )
    private Set<PartyRoleRel> toPartyRoleRels = new HashSet<PartyRoleRel>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "party" )
    private Set<Season> seasons = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "party" )
    private Set<PartyAddress> addresses = new HashSet<>();

    public Set< PartyAddress > getAddresses()
    {
        return addresses;
    }

    public void setAddresses( Set< PartyAddress > addresses )
    {
        this.addresses = addresses;
    }

    public PartyStatus getStatus()
    {
        return status;
    }

    public void setStatus( PartyStatus status )
    {
        this.status = status;
    }

    public Okved getOkved()
    {
        return okved;
    }

    public void setOkved( Okved okved )
    {
        this.okved = okved;
    }

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId( Long id )
    {
        this.id = id;
    }

    public Set< Season > getSeasons()
    {
        return seasons;
    }

    public void setSeasons( Set< Season > seasons )
    {
        this.seasons = seasons;
    }

    public String getMarketingSegmentCode()
    {
        return marketingSegmentCode;
    }

    public void setMarketingSegmentCode( String marketingSegmentCode )
    {
        this.marketingSegmentCode = marketingSegmentCode;
    }

    public MarketingSegment getMarketingSegment()
    {
        return marketingSegment;
    }

    public void setMarketingSegment( MarketingSegment marketingSegment )
    {
        this.marketingSegment = marketingSegment;
    }

    public Opf getOpf()
    {
        return opf;
    }

    public void setOpf( Opf opf )
    {
        this.opf = opf;
    }

    public Boolean isDisabled()
    {
        return isDisabled;
    }

    public Boolean isDuplicate()
    {
        return isDuplicate;
    }

    public Set< PartyRoleRel > getFromPartyRoleRels()
    {
        return fromPartyRoleRels;
    }

    public void setFromPartyRoleRels( Set< PartyRoleRel > fromPartyRoleRels )
    {
        this.fromPartyRoleRels = fromPartyRoleRels;
    }

    public Set< PartyRoleRel > getToPartyRoleRels()
    {
        return toPartyRoleRels;
    }

    public void setToPartyRoleRels( Set< PartyRoleRel > toPartyRoleRels )
    {
        this.toPartyRoleRels = toPartyRoleRels;
    }

    public String getOpfCode()
    {
        return opfCode;
    }

    public void setOpfCode( String opfCode )
    {
        this.opfCode = opfCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getOfficialName()
    {
        return officialName;
    }

    public void setOfficialName( String officialName )
    {
        this.officialName = officialName;
    }

    public String getIndustryCode()
    {
        return industryCode;
    }

    public void setIndustryCode( String industryCode )
    {
        this.industryCode = industryCode;
    }

    public String getTin()
    {
        return tin;
    }

    public void setTin( String tin )
    {
        this.tin = tin;
    }

    public String getBusinessTypeCode()
    {
        return businessTypeCode;
    }

    public void setBusinessTypeCode( String businessTypeCode )
    {
        this.businessTypeCode = businessTypeCode;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode( String statusCode )
    {
        this.statusCode = statusCode;
    }

    public Date getDateOfFirstContact()
    {
        return dateOfFirstContact;
    }

    public void setDateOfFirstContact( Date dateOfFirstContact )
    {
        this.dateOfFirstContact = dateOfFirstContact;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment( String comment )
    {
        this.comment = comment;
    }

    public Integer getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees( Integer numberOfEmployees )
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Double getYearRevenue()
    {
        return yearRevenue;
    }

    public void setYearRevenue( Double yearRevenue )
    {
        this.yearRevenue = yearRevenue;
    }

    public double getMonthlySalaryFund()
    {
        return monthlySalaryFund;
    }

    public void setMonthlySalaryFund( double monthlySalaryFund )
    {
        this.monthlySalaryFund = monthlySalaryFund;
    }

    public Date getDateFounded()
    {
        return dateFounded;
    }

    public void setDateFounded( Date dateFounded )
    {
        this.dateFounded = dateFounded;
    }

    public Date getFirstAccOpenDate()
    {
        return firstAccOpenDate;
    }

    public void setFirstAccOpenDate( Date firstAccOpenDate )
    {
        this.firstAccOpenDate = firstAccOpenDate;
    }

    public String getClusterCode()
    {
        return clusterCode;
    }

    public void setClusterCode( String clusterCode )
    {
        this.clusterCode = clusterCode;
    }

    public String getOkvedCode()
    {
        return okvedCode;
    }

    public void setOkvedCode( String okvedCode )
    {
        this.okvedCode = okvedCode;
    }

    public String getBlockCode()
    {
        return blockCode;
    }

    public void setBlockCode( String blockCode )
    {
        this.blockCode = blockCode;
    }

    public String getSourceSystem()
    {
        return sourceSystem;
    }

    public void setSourceSystem( String sourceSystem )
    {
        this.sourceSystem = sourceSystem;
    }

    public String getSourceCode()
    {
        return sourceCode;
    }

    public void setSourceCode( String sourceCode )
    {
        this.sourceCode = sourceCode;
    }

    public String getWebAddress()
    {
        return webAddress;
    }

    public void setWebAddress( String webAddress )
    {
        this.webAddress = webAddress;
    }

    public Long getParentPartyId()
    {
        return parentPartyId;
    }

    public void setParentPartyId( Long parentPartyId )
    {
        this.parentPartyId = parentPartyId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void setSecondName( String secondName )
    {
        this.secondName = secondName;
    }

    public String getSwift()
    {
        return swift;
    }

    public void setSwift( String swift )
    {
        this.swift = swift;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday( Date birthday )
    {
        this.birthday = birthday;
    }

    public Date getOpenDate()
    {
        return openDate;
    }

    public void setOpenDate( Date openDate )
    {
        this.openDate = openDate;
    }

    public String getKpp()
    {
        return kpp;
    }

    public void setKpp( String kpp )
    {
        this.kpp = kpp;
    }

    public String getBic()
    {
        return bic;
    }

    public void setBic( String bic )
    {
        this.bic = bic;
    }

    public Boolean getIsDisabled()
    {
        return isDisabled;
    }

    public void setIsDisabled( Boolean isDisabled )
    {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsDuplicate()
    {
        return isDuplicate;
    }

    public void setIsDuplicate( Boolean isDuplicate )
    {
        this.isDuplicate = isDuplicate;
    }

    public String getDisableReasonCode()
    {
        return disableReasonCode;
    }

    public void setDisableReasonCode( String disableReasonCode )
    {
        this.disableReasonCode = disableReasonCode;
    }

    public String getOgrn()
    {
        return ogrn;
    }

    public void setOgrn( String ogrn )
    {
        this.ogrn = ogrn;
    }


}