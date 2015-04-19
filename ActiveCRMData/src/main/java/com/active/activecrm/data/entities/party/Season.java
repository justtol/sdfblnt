package com.active.activecrm.data.entities.party;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.party.Party;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Сезонность бизнеса
 */
@Entity
@SequenceGenerator(name="seasonSeq", sequenceName="SEASON_SEQ")
@Table( name = "SEASON" )
public class Season extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seasonSeq")
    @Column( name = "SEASON_ID" )
    private Long id;

    /**
     * ссылка на юр/физ лицо
     */
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PARTY_ID" )
    private Party party;

    /**
     * начальный месЯц
     */
    @Column( name = "START_MONTH" )
    private int startMonth;

    /**
     * Последний месЯц
     */
    @Column( name = "END_MONTH" )
    private int endMonth;

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

    public Party getParty()
    {
        return party;
    }

    public void setParty( Party party )
    {
        this.party = party;
    }

    public int getStartMonth()
    {
        return startMonth;
    }

    public void setStartMonth( int startMonth )
    {
        this.startMonth = startMonth;
    }

    public int getEndMonth()
    {
        return endMonth;
    }

    public void setEndMonth( int endMonth )
    {
        this.endMonth = endMonth;
    }
}