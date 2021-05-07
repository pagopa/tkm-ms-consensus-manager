package it.gov.pagopa.tkm.ms.consentmanager.model.entity;

import it.gov.pagopa.tkm.ms.consentmanager.constant.*;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;
import java.time.*;
import java.util.*;

@Entity
@Table(name = "TKM_USER")
@Data
@Accessors(chain = true)
public class TkmUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "TAX_CODE", unique = true, nullable = false, length = 16)
    private String taxCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "CONSENT_TYPE", nullable = false)
    private ConsentEntityEnum consentType;

    @Column(name = "CONSENT_DATE", nullable = false)
    private Instant consentDate;

    @Column(name = "CONSENT_UPDATE_DATE")
    private Instant consentUpdateDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "CONSENT_LAST_CLIENT")
    private ClientEnum consentLastClient;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<TkmCard> cards = new HashSet<>();

}
